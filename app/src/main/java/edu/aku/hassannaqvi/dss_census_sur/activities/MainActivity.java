package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.DownloadManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.databinding.DataBindingUtil;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.dss_census_sur.FormsList;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.CensusContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.FormsContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.NewBornContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.PWContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.StillBirthContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.VersionAppContract;
import edu.aku.hassannaqvi.dss_census_sur.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.dss_census_sur.get.GetEvents;
import edu.aku.hassannaqvi.dss_census_sur.get.GetMembers;
import edu.aku.hassannaqvi.dss_census_sur.get.GetSurFollowUps;
import edu.aku.hassannaqvi.dss_census_sur.sync.SyncAllData;

public class MainActivity extends Activity {

    private final String TAG = "MainActivity";

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.lblheader)
    TextView lblheader;
    @BindView(R.id.recordSummary)
    TextView recordSummary;

    @BindView(R.id.syncDevice)
    Button syncDevice;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";
    private ProgressDialog pd;
    private Boolean exit = false;
    private String rSumText = "";

    ActivityMainBinding bi;

    static File file;
    DatabaseHelper db;
    VersionAppContract versionAppContract;
    String preVer = "", newVer = "";
    DownloadManager downloadManager;
    Long refID;
    SharedPreferences sharedPrefDownload;
    SharedPreferences.Editor editorDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);

        db = new DatabaseHelper(this);


        bi.lblheader.setText("Welcome! You're assigned to block ' " + MainApp.regionDss + " '");

        if (MainApp.admin) {
            bi.adminsec.setVisibility(View.VISIBLE);
        } else {
            bi.adminsec.setVisibility(View.GONE);
        }

        // Reset working variables
        MainApp.child_name = "Test";

        /*TagID Start*/
        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();

        /*Download File*/
        sharedPrefDownload = getSharedPreferences("appDownload", MODE_PRIVATE);
        editorDownload = sharedPrefDownload.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        ImageView img = new ImageView(getApplicationContext());
        img.setImageResource(R.drawable.tagimg);
        img.setPadding(0, 15, 0, 15);
        builder.setCustomTitle(img);

        final EditText input = new EditText(MainActivity.this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                if (!m_Text.equals("")) {
                    editor.putString("tagName", m_Text);
                    editor.commit();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        if (sharedPref.getString("tagName", null) == "" || sharedPref.getString("tagName", null) == null) {
            builder.show();
        }
        /*TagID End*/


        DatabaseHelper db = new DatabaseHelper(this);
        Collection<FormsContract> todaysForms = db.getTodayForms();
        Collection<FormsContract> unsyncedForms = db.getUnsyncedForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";

        rSumText += "=======================\r\n";
        rSumText += "\r\n";
        rSumText += "Total Forms Today: " + todaysForms.size() + "\r\n";
        rSumText += "\r\n";
        if (todaysForms.size() > 0) {
            rSumText += "\tFORMS' LIST: \r\n";
            String iStatus;
            rSumText += "--------------------------------------------------\r\n";
            rSumText += "[ DSS_ID ] \t[Form Status] \t[Sync Status]----------\r\n";
            rSumText += "--------------------------------------------------\r\n";

            for (FormsContract fc : todaysForms) {
                if (fc.getIstatus() != null) {
                    switch (fc.getIstatus()) {
                        case "1":
                            iStatus = "\tComplete";
                            break;
                        case "2":
                            iStatus = "\tIncomplete";
                            break;
                        case "3":
                            iStatus = "\tRefused";
                            break;
                        case "4":
                            iStatus = "\tRefused";
                            break;
                        default:
                            iStatus = "\tN/A";
                    }
                } else {
                    iStatus = "\tN/A";
                }

                rSumText += fc.getDSSID();

                rSumText += " " + iStatus + " ";

                rSumText += (fc.getSynced() == null ? "\t\tNot Synced" : "\t\tSynced");
                rSumText += "\r\n";
                rSumText += "--------------------------------------------------\r\n";
            }
        }


        if (MainApp.admin) {
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Data Download: \t" + syncPref.getString("LastDownSyncServer", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Data Upload: \t" + syncPref.getString("LastUpSyncServer", "Never Synced");
            rSumText += "\r\n";
            rSumText += "\r\n";
            rSumText += "Unsynced Forms: \t" + unsyncedForms.size();
            rSumText += "\r\n";
        }
        Log.d(TAG, "onCreate: " + rSumText);
        bi.recordSummary.setText(rSumText);


//        Version Checking
        versionAppContract = db.getVersionApp();
        if (versionAppContract.getVersioncode() != null) {

            preVer = MainApp.versionName + "." + MainApp.versionCode;
            newVer = versionAppContract.getVersionname() + "." + versionAppContract.getVersioncode();

            if (MainApp.versionCode < Integer.valueOf(versionAppContract.getVersioncode())) {
                bi.lblAppVersion.setVisibility(View.VISIBLE);

                String fileName = DatabaseHelper.DATABASE_NAME.replace(".db", "-New-Apps");
                file = new File(Environment.getExternalStorageDirectory() + File.separator + fileName, versionAppContract.getPathname());

                if (file.exists()) {
                    bi.lblAppVersion.setText("DSS APP New Version " + newVer + "  Downloaded.");
//                    InstallNewApp(newVer, preVer);
                    showDialog(newVer, preVer);
                } else {
                    NetworkInfo networkInfo = ((ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
                    if (networkInfo != null && networkInfo.isConnected()) {

                        bi.lblAppVersion.setText("DSS APP New Version " + newVer + " Downloading..");
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse(MainApp._UPDATE_URL + versionAppContract.getPathname());
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setDestinationInExternalPublicDir(fileName, versionAppContract.getPathname())
                                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                                .setTitle("Downloading DSS new App ver." + newVer);
                        refID = downloadManager.enqueue(request);

                        editorDownload.putLong("refID", refID);
                        editorDownload.putBoolean("flag", false);
                        editorDownload.commit();

                    } else {
                        bi.lblAppVersion.setText("DSS APP New Version " + newVer + "  Available..\n(Can't download.. Internet connectivity issue!!)");
                    }
                }
            } else {
                bi.lblAppVersion.setVisibility(View.GONE);
                bi.lblAppVersion.setText(null);
            }
        }

        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(intent.getAction())) {

                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(sharedPrefDownload.getLong("refID", 0));

                    downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Cursor cursor = downloadManager.query(query);
                    if (cursor.moveToFirst()) {
                        int colIndex = cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
                        if (DownloadManager.STATUS_SUCCESSFUL == cursor.getInt(colIndex)) {

                            editorDownload.putBoolean("flag", true);
                            editorDownload.commit();

                            Toast.makeText(context, "New App downloaded!!", Toast.LENGTH_SHORT).show();
                            bi.lblAppVersion.setText("DSS APP New Version " + newVer + "  Downloaded.");

                            ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
                            List<ActivityManager.RunningTaskInfo> taskInfo = am.getRunningTasks(1);

                            if (taskInfo.get(0).topActivity.getClassName().equals(MainActivity.class.getName())) {
//                                InstallNewApp(newVer, preVer);
                                showDialog(newVer, preVer);
                            }
                        }
                    }
                }
            }
        };
        registerReceiver(broadcastReceiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));

    }


    void showDialog(String newVer, String preVer) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        DialogFragment newFragment = MyDialogFragment.newInstance(newVer, preVer);
        newFragment.show(ft, "dialog");

    }

    public void openForm(final int i) {

        if (versionAppContract.getVersioncode() != null) {
            if (MainApp.versionCode < Integer.valueOf(versionAppContract.getVersioncode())) {
                if (sharedPrefDownload.getBoolean("flag", false) && file.exists()) {
//                    InstallNewApp(newVer, preVer);
                    showDialog(newVer, preVer);
                } else {
                    OpenFormFun(i);
                }
            } else {
                OpenFormFun(i);
            }
        } else {
            Toast.makeText(this, "Sync data!!", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean openFormGpsCheck() {

        /*SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
        try {
            String acc = GPSPref.getString("Accuracy", "0");
            String date = DateFormat.format("HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();
            String curdate = DateFormat.format("HH:mm", new Date()).toString();

            long secs = (new Date().getTime() - Long.parseLong(GPSPref.getString("Time", "0"))) / 1000;
            secs = secs % 3600;
            int mins = (int) secs / 60;


            if (Double.parseDouble(acc) > MainApp.gpsAccuracy || mins > MainApp.timeAccuracyMin) {
                return false;
            }
        } catch (Exception e) {
            Log.e(TAG, "setGPS: " + e.getMessage());

            return false;
        }*/

        return true;
    }

    public void OpenFormFun(final int i) {
        if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null && !MainApp.userName.equals("0000")) {
            startActivity(i);
        } else {

            builder = new AlertDialog.Builder(MainActivity.this);
            ImageView img = new ImageView(getApplicationContext());
            img.setImageResource(R.drawable.tagimg);
            img.setPadding(0, 15, 0, 15);
            builder.setCustomTitle(img);

            final EditText input = new EditText(MainActivity.this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    m_Text = input.getText().toString();
                    if (!m_Text.equals("")) {
                        editor.putString("tagName", m_Text);
                        editor.commit();

                        if (!MainApp.userName.equals("0000")) {
                            startActivity(i);
                        }
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
        }
    }

    public void syncServer(View view) {

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncAllData(
                    this,
                    "Forms",
                    "updateSyncedForms",
                    FormsContract.class,
                    MainApp._HOST_URL + FormsContract.FormsTable._URL,
                    db.getUnsyncedForms()
            ).execute();

            Toast.makeText(getApplicationContext(), "Syncing Census", Toast.LENGTH_SHORT).show();
            new SyncAllData(
                    this,
                    "Census",
                    "updateCensus",
                    CensusContract.class,
                    MainApp._HOST_URL + CensusContract.censusMember._URL,
                    db.getUnsyncedCensus()
            ).execute();

            Toast.makeText(getApplicationContext(), "Syncing Still Birth", Toast.LENGTH_SHORT).show();
            new SyncAllData(
                    this,
                    "Still Birth",
                    "updateSBirth",
                    StillBirthContract.class,
                    MainApp._HOST_URL + StillBirthContract.sBFup._URL,
                    db.getUnsyncedStillBirth()
            ).execute();

            Toast.makeText(getApplicationContext(), "Syncing New Born", Toast.LENGTH_SHORT).show();
            new SyncAllData(
                    this,
                    "New Born",
                    "updatenewBornFup",
                    NewBornContract.class,
                    MainApp._HOST_URL + NewBornContract.newBornFup._URL,
                    db.getUnsyncedNewBorn()
            ).execute();

            Toast.makeText(getApplicationContext(), "Syncing PW", Toast.LENGTH_SHORT).show();
            new SyncAllData(
                    this,
                    "PW",
                    "updatePWomen",
                    PWContract.class,
                    MainApp._HOST_URL + PWContract.pWFup._URL,
                    db.getUnsyncedPW()
            ).execute();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void startActivity(int i) {
        if (openFormGpsCheck() && !MainApp.regionDss.equals("")) {
            Intent oF = null;
            switch (i) {
                case 1:
                    oF = new Intent(MainActivity.this, HouseholdListActivity.class);
                    break;
                case 2:
                    oF = new Intent(MainActivity.this, HouseholdListActivity.class)
                            .putExtra("visit", 2);
                    break;
                case 3:
                    oF = new Intent(MainActivity.this, EventsListActivity.class)
                            .putExtra("type", 2);
                    break;
                case 4:
                    oF = new Intent(MainActivity.this, EventsListActivity.class)
                            .putExtra("type", 1);
                    break;
            }
            startActivity(oF);
        } else {
            Toast.makeText(getApplicationContext(), "Please re-login app!", Toast.LENGTH_SHORT).show();
        }
    }

    public void openADR(View v) {
        Intent iMem = new Intent(this, AdultDeathReportActivity.class);
        startActivity(iMem);
    }

    public void openSBR(View v) {
        Intent iMem = new Intent(this, StillBirthReportActivity.class);
        startActivity(iMem);
    }

    /*
        public void openUCR(View v) {
            Intent iMem = new Intent(this, PWAssessmentActivity.class);
            startActivity(iMem);
        }*/
    public void openUCR() {
        Intent iMem = new Intent(this, PWAssessmentActivity.class);
        startActivity(iMem);
    }

    public void openCBA(View v) {
        Intent iMem = new Intent(this, ChildDeathRegActivity.class);
        iMem.putExtra("type", 1);
        startActivity(iMem);
    }

    public void openCBB(View v) {
        Intent iMem = new Intent(this, ChildDeathRegActivity.class);
        iMem.putExtra("type", 2);
        startActivity(iMem);
    }

    public void openMembers(View v) {
        Intent iMem = new Intent(this, MotherListActivity.class);
        startActivity(iMem);
    }

    public void openA(View v) {
        Intent iA = new Intent(this, SectionAActivity.class);
        startActivity(iA);
    }

    public void openB(View v) {
        Intent iB = new Intent(this, SectionBActivity.class);
        startActivity(iB);
    }

    public void openC(View v) {
        Intent iC = new Intent(this, SectionCActivity.class);
        startActivity(iC);
    }

    public void openD(View v) {
        Intent iD = new Intent(this, SectionDActivity.class);
        startActivity(iD);
    }

    public void openE(View v) {
        Intent iD = new Intent(this, SectionEActivity.class);
        startActivity(iD);
    }

    public void openF(View v) {
        Intent iD = new Intent(this, SectionFActivity.class);
        startActivity(iD);
    }

    public void openG(View v) {
        Intent iG = new Intent(this, SectionGActivity.class);
        startActivity(iG);
    }

    public void openH(View v) {
        Intent iEnd = new Intent(this, SectionHActivity.class);
        startActivity(iEnd);
    }

    public void openI(View v) {
        Intent iEnd = new Intent(this, SectionIActivity.class);
        startActivity(iEnd);
    }

    public void openJ(View v) {
        Intent iEnd = new Intent(this, SectionJActivity.class);
        startActivity(iEnd);
    }

    public void openK(View v) {
        Intent iEnd = new Intent(this, SectionKActivity.class);
        startActivity(iEnd);
    }

    public void openL(View v) {
        Intent iEnd = new Intent(this, SectionLActivity.class);
        startActivity(iEnd);
    }

    public void openM(View v) {
        Intent iEnd = new Intent(this, SectionMActivity.class);
        startActivity(iEnd);
    }

    public void testGPS(View v) {

        SharedPreferences sharedPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
        Log.d("MAP", "testGPS: " + sharedPref.getAll().toString());
        Map<String, ?> allEntries = sharedPref.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            Log.d("Map", entry.getKey() + ": " + entry.getValue().toString());
        }

    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void CheckCluster(View v) {
        Intent cluster_list = new Intent(getApplicationContext(), FormsList.class);
        cluster_list.putExtra("dssid", MainApp.regionDss);
        startActivity(cluster_list);

    }

    public static class MyDialogFragment extends DialogFragment {

        String newVer, preVer;

        static MyDialogFragment newInstance(String newVer, String preVer) {
            MyDialogFragment f = new MyDialogFragment();

            Bundle args = new Bundle();
            args.putString("newVer", newVer);
            args.putString("preVer", preVer);
            f.setArguments(args);

            return f;
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            newVer = getArguments().getString("newVer");
            preVer = getArguments().getString("preVer");

            return new AlertDialog.Builder(getActivity())
                    .setIcon(R.drawable.exclamation)
                    .setTitle("DSS APP is available!")
                    .setMessage("DSS App " + newVer + " is now available. Your are currently using older version " + preVer + ".\nInstall new version to use this app.")
                    .setPositiveButton("INSTALL!!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton) {
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(intent);
                                }
                            }
                    )
                    .create();
        }

    }

    public void syncDevice(View view) {

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            // Sync Users
           /* BackgroundDrawable bg = new BackgroundDrawable();
            syncDevice.setBackground(bg);
            bg.start();*/
            new GetMembers(this).execute();
            new GetSurFollowUps(this).execute();
            new GetEvents(this).execute();
            //bg.stop();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastDownSyncServer", dtToday);

            editor.apply();
        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity

            startActivity(new Intent(this, LoginActivity.class));

        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }

}