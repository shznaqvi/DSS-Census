package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
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
                /*startActivity(new Intent(this, NB_EndingActivity.class)
                        .putExtra("check", true));*/

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

    }

    private boolean UpdateDB() {
        /*Long updcount = db.addNewBorn(MainApp.nb);
        MainApp.nb.set_ID(String.valueOf(updcount));

        if (updcount != 0) {

            MainApp.nb.set_UID(
                    (MainApp.nb.getDeviceId() + MainApp.nb.get_ID()));
            db.updateNewBornID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;
    }

}
