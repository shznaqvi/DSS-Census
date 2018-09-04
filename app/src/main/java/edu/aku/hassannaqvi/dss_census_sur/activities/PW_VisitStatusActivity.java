package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.EventsContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.FollowUpsContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.MembersContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.PWContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

public class PW_VisitStatusActivity extends AppCompatActivity {
    private static final String TAG = PW_VisitStatusActivity.class.getSimpleName();
    public static FollowUpsContract fp;
    public static int memFlag = 0;
    public static int sbCount = 0, livCount = 0;
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    /*@BindView(R.id.pwdca03)
    EditText dca03;
    @BindView(R.id.pwmembersExists)
    LinearLayout membersExists;*/
    @BindView(R.id.pwdca04)
    RadioGroup dca04;
    @BindView(R.id.pwdca0402)
    RadioButton dca0402;
    @BindView(R.id.pwdca0401)
    RadioButton dca0401;
    @BindView(R.id.pwdca0403)
    RadioButton dca0403;
    @BindView(R.id.pwdca0404)
    RadioButton dca0404;
    @BindView(R.id.pwdca0405)
    RadioButton dca0405;

    /* @BindView(R.id.pwmp02_count)
     TextView mp02_count;

     @BindView(R.id.pwcheckDSSID)
     Button checkDSSID;*/
    @BindView(R.id.btn_Continue)
    Button btn_Continue;
    @BindView(R.id.btn_End)
    Button btn_End;
    Collection<MembersContract> members;
    DatabaseHelper db;
    Boolean isNew = false;
    boolean checked = false;
    EventsContract followUpData;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pw__visit_status);
        ButterKnife.bind(this);

        this.setTitle("D S S");

        memFlag = 0;
        Intent intent = getIntent();
        if (intent.hasExtra("followUpData")) {
            followUpData = (EventsContract) getIntent().getSerializableExtra("followUpData");
        }
        if (intent.hasExtra("position")) {
            position = getIntent().getIntExtra("position", -1);
        }
        // Disable internal movement for previous families
//        dca0405.setEnabled(getIntent().getBooleanExtra("intMovFlag", false));

        MainApp.familyMembersList = new ArrayList<>();

        MainApp.memClicked = new ArrayList<>();


//        Log.d(TAG, "onCreate: " + MainApp.familyMembersList.size());
        db = new DatabaseHelper(this);

        //==================== Permission Skip Check =================


        dca04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.pwdca0401 || i == R.id.pwdca0405) {
//                    fldGrpdca05.setVisibility(View.VISIBLE);

                    btn_Continue.setEnabled(true);
                    btn_End.setEnabled(false);
                } else {
                    /*fldGrpdca05.setVisibility(View.GONE);

                    dca05.setText(null);
                    dca0501.clearCheck();
                    //dca0502.clearCheck();
                    dca0503.setText(null);
                    dca0504.clearCheck();
                    dca050496x.setText(null);
                    dca0505.clearCheck();
                    dca050596x.setText(null);
                    dca06.setText(null);
                    dca0601.clearCheck();
                    dca0602.setText(null);
                    dca0603.clearCheck();
                    dca060396x.setText(null);
                    dca0604.clearCheck();
                    dca060496x.setText(null);
                    dca0701.setText(null);
                    dca0702.setText(null);
                    dca0703.setText(null);
                    dca0801.setText(null);
                    dca0802.setText(null);
                    dca0803.setText(null);
                    dca09.clearCheck();
                    dca09m.setText(null);
                    dca09y.setText(null);
                    dca10a.setText(null);
                    dca10b.setText(null);
                    dca11.clearCheck();*/

                    btn_Continue.setEnabled(false);
                    btn_End.setEnabled(true);
                }
            }
        });
//        dca03.setText(getIntent().getExtras().getString("dssHH"));
//        onBtnDSSIDClick();
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

//        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
//                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                MainApp.memClicked.add(getIntent().getIntExtra("position", -1));
                EventsListActivity.memFlag++;
                finish();

                Intent endSec = new Intent(this, PW_EndingActivity.class);
                endSec.putExtra("check", false);
                startActivity(endSec);


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    /*
        @OnClick(R.id.pwcheckMembers)
        void onBtnCheckMemberClick() {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

            String member = "";
            if (dca03.getText().toString().length() > 9) {
                members = db.getMembersByDSS(dca03.getText().toString().toUpperCase());
                if (members.size() > 0) {
                    int count = 0;
                    for (MembersContract m : members) {
                        member += (++count) + ")\t " + m.getName() + " \t- \t" +
                                (m.getMember_type().equals("mw") ? "(Married Women)" :
                                        m.getMember_type().equals("h") ? "(Husband)" : m.getMember_type().equals("ot") ? "(Other)"
                                                : "(Child)") + "\n";
                    }
                } else {
                    member = "No member registered for this DSSID \r\n\r\n\t\"" + dca03.getText().toString() + "\"";
                }
            } else {
                member = "Invalid DSS ID: " + dca03.getText().toString().toString();
            }

            alertDialogBuilder.setIcon(R.drawable.ic_warning_black_24dp)
                    .setTitle("Members Name")
                    .setMessage(member)
                    .setCancelable(false);

            alertDialogBuilder.setNegativeButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = alertDialogBuilder.create();
            alert.show();

        }

        @OnClick(R.id.pwcheckDSSID)
        void onBtnDSSIDClick() {

            membersExists.setVisibility(View.VISIBLE);
            MainApp.familyMembersList = new ArrayList<>();
            MainApp.insertMem = new ArrayList<>();
    /*
            if (!dca03.getText().toString().isEmpty()) {
                dca03.setError(null);
                members = db.getMembersByDSS(dca03.getText().toString().toUpperCase());
                mp02_count.setText(members.size() + " members found.");

                if (members.size() != 0) {

                    MainApp.MotherChildList = new HashMap<>();

                    for (MembersContract ec : members) {

                        MainApp.familyMembersList.add(new MembersContract(ec));

                        MainApp.insertMem.add(ec.getDss_id_member());

                        if (ec.getMember_type().equals("ot")) {
                            if (ec.getDss_id_member().length() > 13) // setting for members that currently not lying in their respective type and come in 'OT'
                            {
                                String[] st = ec.getDss_id_member().split(String.valueOf(ec.getDss_id_member().charAt(11)));
                                if (st.length > 2) {
                                    MainApp.randID = Integer.valueOf(st[st.length - 1]) + 1;
                                } else
                                    MainApp.randID = Integer.valueOf(st[1]) + 1;
                            }
                        } else if (ec.getMember_type().equals("mw")) {

                            MembersContract mc = db.getMaxChildByDSS(dca03.getText().toString().toUpperCase(),
                                    ec.getDss_id_member().toUpperCase());

                            if (mc != null) {
                                MainApp.MotherChildList.put(ec.getDss_id_member().toUpperCase(), mc.getDss_id_member().toUpperCase());
                            }
                        }
                    }

                    Toast.makeText(this, "Members Found", Toast.LENGTH_LONG).show();
                    MainApp.currentStatusCount = MainApp.familyMembersList.size();

                    MainApp.TotalMembersCount = MainApp.familyMembersList.size() - 1;

                    isNew = false;

                } else {

                    isNew = true;

                    MainApp.TotalMembersCount = -1;

                    Toast.makeText(this, "No Members Found", Toast.LENGTH_LONG).show();
                }
            } else {
                dca03.setError("This data is Required!");
            }
            checked = true;

        }
    */
    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
//                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();
                finish();
                startActivity(new Intent(this, PWAssessmentActivity.class).putExtra("position", position)
                        .putExtra("followUpData", followUpData));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean formValidation() {

//        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01
        /*
        if (dca03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca03), Toast.LENGTH_SHORT).show();
            dca03.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca03.setError(null);
        }
        if (dca03.getText().toString().length() < MainApp.regionDss.length() + 5) {
            Toast.makeText(this, dca03.getText().toString().substring(0, MainApp.regionDss.length()).toUpperCase() + "-" + MainApp.regionDss, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dca03), Toast.LENGTH_LONG).show();
            dca03.setError("This ID is Invalid!");    // Set Error on last radio button
            return false;
        } else {
            dca03.setError(null);
        }

        if (!dca03.getText().toString().substring(0, MainApp.regionDss.length() - 4).toUpperCase().equals(MainApp.regionDss.substring(0, 2)) &&
                !dca03.getText().toString().substring(5, MainApp.regionDss.length()).toUpperCase().equals(MainApp.regionDss.substring(5, 6))) {
            Toast.makeText(this, dca03.getText().toString().substring(0, MainApp.regionDss.length()).toUpperCase() + "-" + MainApp.regionDss, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "ERROR(not matched): " + getString(R.string.dca03), Toast.LENGTH_LONG).show();
            dca03.setError("Did not match your block!");    // Set Error on last radio button
            return false;
        } else {
            dca03.setError(null);
        }
*/
//        02
        if (dca04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca04), Toast.LENGTH_SHORT).show();
            dca0402.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca04: This data is Required!");
            return false;
        } else {
            dca0402.setError(null);
        }
        return true;
    }

    private void SaveDraft() throws JSONException {
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();
        MainApp.pw = new PWContract();

        MainApp.pw.setFormDate(dtToday);
        MainApp.pw.setUser(MainApp.userName);
        MainApp.pw.setDeviceId(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
//        MainApp.pw.setDss_id_member(MainApp.fc.getDSSID().toUpperCase());
        MainApp.pw.setDss_id_member(followUpData.getDss_id_member());
        MainApp.pw.setDevicetagID(sharedPref.getString("tagName", null));

        JSONObject svs = new JSONObject();
        svs.put("pwdca04", dca0401.isChecked() ? "1" : dca0402.isChecked() ? "2" : dca0403.isChecked() ? "3" : dca0404.isChecked() ? "4" : dca0405.isChecked() ? "5" : "0");
        MainApp.pw.setsvisitstatus(String.valueOf(svs));

//        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        db = new DatabaseHelper(this);
        Long updcount = db.addPWomen(MainApp.pw);
        MainApp.pw.setID(String.valueOf(updcount));

        if (updcount != 0) {

            MainApp.pw.setUID(
                    (MainApp.pw.getDeviceId() + MainApp.pw.getID()));
            db.updatePWID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Sorry you can't go back..", Toast.LENGTH_SHORT).show();
    }

}
