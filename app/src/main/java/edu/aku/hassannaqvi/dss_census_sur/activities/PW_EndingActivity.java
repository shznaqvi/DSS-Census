package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

public class PW_EndingActivity extends Activity {

    private static final String TAG = PW_EndingActivity.class.getSimpleName();
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.dcstatus)
    RadioGroup dcstatus;
    @BindView(R.id.dcstatus01)
    RadioButton dcstatus01;
    @BindView(R.id.dcstatus02)
    RadioButton dcstatus02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pw_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("check");

        if (check) {
            dcstatus01.setEnabled(true);
            dcstatus02.setEnabled(false);

        } else {
            dcstatus01.setEnabled(false);
            dcstatus02.setEnabled(true);
        }
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

//        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {

                finish();
                Intent endSec = new Intent(this, NB_PWMembersActivity.class);
                endSec.putExtra("check", false);
                startActivity(endSec);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void SaveDraft() {
//        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        MainApp.pw.setIstatus(dcstatus01.isChecked() ? "1" : dcstatus02.isChecked() ? "2" : "0");

//        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatePW();

        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean formValidation() {
//        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (dcstatus.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Not Selected): " + getString(R.string.dcstatus), Toast.LENGTH_LONG).show();
            dcstatus02.setError("Please Select One");    // Set Error on last radio button
            Log.i(TAG, "dcstatus: This data is Required!");
            return false;
        } else {
            dcstatus02.setError(null);
        }


        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}