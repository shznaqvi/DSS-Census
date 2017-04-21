package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.dss_census.AndroidDatabaseManager;
import edu.aku.hassannaqvi.dss_census.MainApp;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.get.GetMembers;
import edu.aku.hassannaqvi.dss_census.get.GetUsers;
import edu.aku.hassannaqvi.dss_census.sync.SyncForms;

public class MainActivity extends Activity {

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.recordSummary)
    TextView recordSummary;
    @BindView(R.id.areaCode)
    EditText areaCode;
    private Boolean exit = false;
    private String rSumText = "";

    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;

    String m_Text= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // Reset working variables
        MainApp.child_name = "Test";

        sharedPref = getSharedPreferences("tagName",MODE_PRIVATE);
        editor = sharedPref.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Tag Name");

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

        if (sharedPref.getString("tagName",null) == "" || sharedPref.getString("tagName",null) == null){
            builder.show();
        }


//        if (MainApp.admin) {
//            adminsec.setVisibility(View.VISIBLE);
//        } else {
//            adminsec.setVisibility(View.GONE);
//        }


//        DatabaseHelper db = new DatabaseHelper(this);
//        Collection<FormsContract> todaysForms = new ArrayList<>();
//
//        todaysForms = db.getTodayForms();
//
//        rSumText += "TODAY'S RECORDS SUMMARY\r\n";
//        rSumText += "=======================";
//        rSumText += "\r\n\r\n";
//        rSumText += "Total Forms Today: " + todaysForms.size();
//        rSumText += "\r\n";
//        rSumText += "    Forms List: \r\n";
//        String iStatus = "";
//        for (FormsContract fc : todaysForms) {
//
//            switch (fc.getIstatus()) {
//                case "1":
//                    iStatus = "Complete";
//                    break;
//                case "2":
//                    iStatus = "House Locked";
//                    break;
//                case "3":
//                    iStatus = "Refused";
//                    break;
//                case "4":
//                    iStatus = "Refused";
//                    break;
//            }
//
//            rSumText += fc.getSubareacode() + " " + fc.getHousehold() + " " + iStatus;
//            rSumText += "\r\n";
//
//        }
//
//        rSumText += "--------------------------------------------------\r\n";
//        if (MainApp.admin) {
//            adminsec.setVisibility(View.VISIBLE);
//            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
//            rSumText += "Last Update: " + syncPref.getString("LastUpdate", "Never Updated");
//            rSumText += "\r\n";
//            rSumText += "Last Synced(DB): " + syncPref.getString("LastSyncDB", "Never Synced");
//            rSumText += "\r\n";
//        }
//        recordSummary.setText(rSumText);


    }

    public void openForm(View v) {
        if (sharedPref.getString("tagName",null) != "" && sharedPref.getString("tagName",null) != null){
            Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
            startActivity(oF);
        }else {

            builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Tag Name");

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

                        Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
                        startActivity(oF);
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

    public void openMembers(View v) {
        Intent iMem = new Intent(this, FamilyMembersActivity.class);
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

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    /*public void CheckCluster(View v) {
        Intent cluster_list = new Intent(getApplicationContext(), FormsList.class);
        cluster_list.putExtra("areaCode", areaCode.getText().toString());
        startActivity(cluster_list);

    }*/
    public void syncServer(View view) {

        String formsUrl = MainApp._HOST_URL + "virband/api/forms.php";
        String imsUrl = MainApp._HOST_URL + "virband/api/ims.php";

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute(formsUrl);

            /*Toast.makeText(getApplicationContext(), "Syncing IMs", Toast.LENGTH_SHORT).show();
            new SyncIMs(this).execute(imsUrl);*/

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            // Sync Users
            Toast.makeText(getApplicationContext(), "Syncing Members", Toast.LENGTH_SHORT).show();
            new GetMembers(this).execute();


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