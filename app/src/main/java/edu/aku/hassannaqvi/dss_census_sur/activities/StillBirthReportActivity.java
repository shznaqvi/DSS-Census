package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.FollowUpsContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.StillBirthContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityStillBirthReportBinding;
import edu.aku.hassannaqvi.dss_census_sur.validation.validatorClass;

public class StillBirthReportActivity extends Activity {
    ActivityStillBirthReportBinding bi;

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_still_birth_report);
        bi.setCallback(this);

        db = new DatabaseHelper(this);

    }

    public void BtnEnd() {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(new Intent(this, NB_EndingActivity.class)
                .putExtra("check", false));
    }

    public void BtnContinue() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.dsb01, bi.dsb01c, getString(R.string.dsb01))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.dsb02, getString(R.string.dsb02))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.dsb03, bi.dsb0398, getString(R.string.dsb03))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.dsb04, bi.dsb0498, getString(R.string.dsb04))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.dsb05, bi.dsb0598, getString(R.string.dsb05))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.dsb06, bi.dsb0698, getString(R.string.dsb06))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.dsb07, bi.dsb0798, getString(R.string.dsb07))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.dsb08, getString(R.string.dsb08))) {
            return false;
        }

        return true;
    }

    public void SaveDraft() throws JSONException {

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.sb = new StillBirthContract();

        MainApp.sb.setUUID(MainApp.fc.getUID());
        MainApp.sb.setMUID(MainApp.cc.get_UID());
        MainApp.sb.setFormDate(MainApp.fc.getFormDate());
        MainApp.sb.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.sb.setDss_id_hh(MainApp.fc.getDSSID().toUpperCase());
        MainApp.sb.setUser(MainApp.fc.getUser());
        MainApp.sb.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.sb.setdss_id_m(MainApp.cc.getDss_id_member());

        FollowUpsContract fp = (FollowUpsContract) getIntent().getSerializableExtra("followUpData");

        JSONObject sSB = new JSONObject();

        sSB.put("dss_id_st", fp.getHhID());
        sSB.put("visitdt", fp.getFollowUpDt());
        sSB.put("surround", fp.getFollowUpRound());
        sSB.put("appVer", MainApp.versionName + "." + MainApp.versionCode);

        sSB.put("dsb01", bi.dsb01a.isChecked() ? "1" : bi.dsb01b.isChecked() ? "2" : bi.dsb01c.isChecked() ? "3" : "0");
        sSB.put("dsb02", bi.dsb02.getText().toString());
        sSB.put("dsb03", bi.dsb03a.isChecked() ? "1" : bi.dsb03b.isChecked() ? "2" : bi.dsb0398.isChecked() ? "98" : "0");
        sSB.put("dsb04", bi.dsb04a.isChecked() ? "1" : bi.dsb04b.isChecked() ? "2" : bi.dsb0498.isChecked() ? "98" : "0");
        sSB.put("dsb05", bi.dsb05a.isChecked() ? "1" : bi.dsb05b.isChecked() ? "2" : bi.dsb0598.isChecked() ? "98" : "0");
        sSB.put("dsb06", bi.dsb06a.isChecked() ? "1" : bi.dsb06b.isChecked() ? "2" : bi.dsb0698.isChecked() ? "98" : "0");
        sSB.put("dsb07", bi.dsb07a.isChecked() ? "1" : bi.dsb07b.isChecked() ? "2" : bi.dsb0798.isChecked() ? "98" : "0");
        sSB.put("dsb08", bi.dsb08.getText().toString());

        MainApp.sb.setsSB(String.valueOf(sSB));

    }

    private boolean UpdateDB() {
        Long updcount = db.addSBirth(MainApp.sb);
        MainApp.sb.setID(String.valueOf(updcount));

        if (updcount != 0) {

            MainApp.sb.setUID(
                    (MainApp.sb.getDeviceId() + MainApp.sb.getID()));
            db.updateNewBornID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}
