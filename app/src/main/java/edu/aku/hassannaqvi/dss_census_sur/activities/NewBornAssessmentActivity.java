package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import java.text.SimpleDateFormat;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityNewBornAssessmentBinding;
import edu.aku.hassannaqvi.dss_census_sur.validation.validatorClass;

public class NewBornAssessmentActivity extends AppCompatActivity {
    ActivityNewBornAssessmentBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_new_born_assessment);
        bi.setCallback(this);

        setContentsUI();

    }

    public void setContentsUI() {

        bi.dnb07.setManager(getSupportFragmentManager());
        bi.dnb08.setManager(getSupportFragmentManager());
        bi.dnb09.setManager(getSupportFragmentManager());
        bi.dnb10.setManager(getSupportFragmentManager());
        bi.dnb07.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()));
        bi.dnb09.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()));

        bi.dnbStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.dnbStatusb) {
                    bi.dnb11.clearCheck();
                    bi.dnb12.clearCheck();
                    bi.dnb15.clearCheck();
                    bi.dnb17.clearCheck();
                    bi.dnb18.clearCheck();
                    bi.dnb19.clearCheck();
                    bi.dnb1901a.clearCheck();
                    bi.dnb1901b.clearCheck();
                    bi.dnb1902a.clearCheck();
                    bi.dnb1902b.clearCheck();
                    bi.dnb20.clearCheck();
                    bi.dnb21.clearCheck();
                    bi.dnb22.clearCheck();
                    bi.dnb23.clearCheck();
                    bi.dnb24.clearCheck();
                    bi.dnb25.clearCheck();
                }
            }
        });

        bi.dnb25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.dnb25b) {
                    bi.dnb26.clearCheck();
                    bi.dnb27.clearCheck();
                }
            }
        });
    }

    public void BtnEnd() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
//        Intent end_intent = new Intent(this, EndingActivity.class);
//        end_intent.putExtra("check", false);
//        startActivity(end_intent);

        MainApp.endActivity(this, this);
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

                Intent secNext = new Intent(this, SectionEActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();
        if (!validatorClass.EmptyTextBox(this, bi.dstudyid, getString(R.string.dstudyid))) {
            return false;
        }

        return true;
    }

    public void SaveDraft() throws JSONException {

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSD();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


}
