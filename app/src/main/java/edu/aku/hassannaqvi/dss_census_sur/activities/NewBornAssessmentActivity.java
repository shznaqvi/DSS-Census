package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.EventsContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.NewBornContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityNewBornAssessmentBinding;
import edu.aku.hassannaqvi.dss_census_sur.validation.validatorClass;

public class NewBornAssessmentActivity extends AppCompatActivity {
    ActivityNewBornAssessmentBinding bi;

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    DatabaseHelper db;
    EventsContract followUpData;
    JSONObject sNB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_new_born_assessment);
        bi.setCallback(this);

        db = new DatabaseHelper(this);

        setContentsUI();
        setFollowUpData();

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

    public void setFollowUpData() {

        followUpData = (EventsContract) getIntent().getSerializableExtra("followUpData");

        if (followUpData.getRound().equals("1")) {
            bi.fldGrpdnbStatus02a.setVisibility(View.GONE);
        }

        bi.dcbid.setText(followUpData.getDss_id_member());
        bi.dnb03.setText(followUpData.getName());
        bi.dnb04.check(followUpData.getGender().equals("1") ? bi.dnb04a.getId() : bi.dnb04b.getId());
        bi.dnb05.setText(followUpData.getDss_id_m());

    }

    public void BtnEnd() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                NewBornAssessmentActivity.this);
        alertDialogBuilder
                .setMessage("Are you sure to end this section?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {

                                try {
                                    SaveDraft(true);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                                finish();
                                startActivity(new Intent(getApplicationContext(), NB_EndingActivity.class).putExtra("check", false));
                            }
                        });
        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();

    }

    public void BtnContinue() {

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                startActivity(new Intent(this, NB_EndingActivity.class)
                        .putExtra("check", true));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();
        if (!validatorClass.EmptyTextBox(this, bi.dnb03, getString(R.string.dnb03))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, bi.dnb04, bi.dnb04a, getString(R.string.dnb04))) {
            return false;
        }

        /*if (!validatorClass.EmptyTextBox(this, bi.dnb06, getString(R.string.dnb06))) {
            return false;
        }*/
        if (!validatorClass.EmptyRadioButton(this, bi.dnbStatus, bi.dnbStatusa, getString(R.string.dnbStatus))) {
            return false;
        }
        if (bi.dnbStatusa.isChecked()) {

            if (followUpData.getRound().equals("1")) {

                if (!validatorClass.EmptyTextBox(this, bi.dnb09, getString(R.string.dnb09))) {
                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.dnb10, getString(R.string.dnb10))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dnb11, bi.dnb1196, bi.dnb1196x, getString(R.string.dnb11))) {
                    return false;
                }
                if (bi.dnb11a.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, bi.dnb11ax, getString(R.string.dnb11ax))) {
                        return false;
                    }
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dnb12, bi.dnb1296, bi.dnb1296x, getString(R.string.dnb12))) {
                    return false;
                }

            }

            if (!validatorClass.EmptyTextBox(this, bi.dnb13, getString(R.string.dnb13))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.dnb1401, getString(R.string.dnb14m))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.dnb1402, getString(R.string.dnb14m))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb15, bi.dnb15b, getString(R.string.dnb15))) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.dnb1601, "C")) {
                return false;
            }
            if (!validatorClass.EmptyTextBox(this, bi.dnb1602, "C")) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb17, bi.dnb17c, getString(R.string.dnb17))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb18, bi.dnb18c, getString(R.string.dnb18))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb19, bi.dnb19b, getString(R.string.dnb19))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb1901a, bi.dnb1901ab, getString(R.string.dnb1901a))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb1901b, bi.dnb1901bb, getString(R.string.dnb1901b))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb1902a, bi.dnb1902ab, getString(R.string.dnb1902a))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb1902b, bi.dnb1902bb, getString(R.string.dnb1902b))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb20, bi.dnb20b, getString(R.string.dnb20))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb21, bi.dnb21b, getString(R.string.dnb21))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb22, bi.dnb22b, getString(R.string.dnb22))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb23, bi.dnb23a, bi.dnb23x, getString(R.string.dnb23))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb24, bi.dnb24a, bi.dnb24x, getString(R.string.dnb24))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dnb25, bi.dnb25a, bi.dnb25x, getString(R.string.dnb25))) {
                return false;
            }

            if (bi.dnb25a.isChecked()) {
                if (!validatorClass.EmptyRadioButton(this, bi.dnb26, bi.dnb26b, bi.dnb26x, getString(R.string.dnb26))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dnb27, bi.dnb27b, getString(R.string.dnb27))) {
                    return false;
                }
                return validatorClass.EmptyTextBox(this, bi.dnb28, getString(R.string.dnb28));
            }

        } else {
            if (!validatorClass.EmptyTextBox(this, bi.dnb07, getString(R.string.dnb07))) {
                return false;
            }

            return validatorClass.EmptyTextBox(this, bi.dnb08, getString(R.string.dnb08));
        }

        return true;
    }

    public void SaveDraft(boolean type) throws JSONException {
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.nb = new NewBornContract();

        MainApp.nb.setFormDate(dtToday);
        MainApp.nb.setUser(MainApp.userName);
        MainApp.nb.setDeviceId(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.nb.setDss_id_hh(followUpData.getDss_id_h().toUpperCase());
        MainApp.nb.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.nb.setDss_id_member(bi.dcbid.getText().toString().toUpperCase());
        MainApp.nb.setName(bi.dnb03.getText().toString());
        MainApp.nb.setDss_id_m(bi.dnb05.getText().toString());

        sNB = new JSONObject();
        sNB.put("prv_euid", followUpData.getEuid());
        sNB.put("prv_formdate", followUpData.getFormdate());
        sNB.put("prv_status", followUpData.getStatus());
        sNB.put("prv_status_date", followUpData.getStatus_date());
        sNB.put("prv_birth_time", followUpData.getBirth_time());
        sNB.put("prv_round", followUpData.getRound());

        if (type) {
            MainApp.nb.setsNB(String.valueOf(sNB));
        }
    }

    public void SaveDraft() throws JSONException {

        SaveDraft(false);

//        sNB.put("studyid", bi.dstudyid.getText().toString());
        sNB.put("dnb04", bi.dnb04a.isChecked() ? "1" : bi.dnb04b.isChecked() ? "2" : "0");
        sNB.put("dnb05", bi.dnb05.getText().toString());
//        sNB.put("dnb06", bi.dnb06.getText().toString());
        sNB.put("dnbStatus", bi.dnbStatusa.isChecked() ? "1" : bi.dnbStatusb.isChecked() ? "2" : "0");
        sNB.put("dnb09", bi.dnb09.getText().toString());
        sNB.put("dnb10", bi.dnb10.getText().toString());
        sNB.put("dnb11", bi.dnb11a.isChecked() ? "1" : bi.dnb11b.isChecked() ? "2" : bi.dnb11c.isChecked() ? "3"
                : bi.dnb1196.isChecked() ? "96" : "0");
        sNB.put("dnb11ax", bi.dnb11ax.getText().toString());
        sNB.put("dnb1196x", bi.dnb1196x.getText().toString());
        sNB.put("dnb12", bi.dnb12a.isChecked() ? "1" : bi.dnb12b.isChecked() ? "2" : bi.dnb12c.isChecked() ? "3"
                : bi.dnb12d.isChecked() ? "4" : bi.dnb12e.isChecked() ? "5" : bi.dnb1296.isChecked() ? "96" : "0");
        sNB.put("dnb1296x", bi.dnb1296x.getText().toString());
        sNB.put("dnb13", bi.dnb13.getText().toString());
        sNB.put("dnb1401", bi.dnb1401.getText().toString());
        sNB.put("dnb1402", bi.dnb1402.getText().toString());
        sNB.put("dnb15", bi.dnb15a.isChecked() ? "1" : bi.dnb15b.isChecked() ? "2" : "0");
        sNB.put("dnb1601", bi.dnb1601.getText().toString());
        sNB.put("dnb1602", bi.dnb1602.getText().toString());
        sNB.put("dnb17", bi.dnb17a.isChecked() ? "1" : bi.dnb17b.isChecked() ? "2" : bi.dnb17c.isChecked() ? "3" : "0");
        sNB.put("dnb18", bi.dnb18a.isChecked() ? "1" : bi.dnb18b.isChecked() ? "2" : bi.dnb18c.isChecked() ? "3" : "0");
        sNB.put("dnb19", bi.dnb19a.isChecked() ? "1" : bi.dnb19b.isChecked() ? "2" : "0");
        sNB.put("dnb1901a", bi.dnb1901aa.isChecked() ? "1" : bi.dnb1901ab.isChecked() ? "2" : "0");
        sNB.put("dnb1901b", bi.dnb1901ba.isChecked() ? "1" : bi.dnb1901bb.isChecked() ? "2" : "0");
        sNB.put("dnb1902a", bi.dnb1902aa.isChecked() ? "1" : bi.dnb1902ab.isChecked() ? "2" : "0");
        sNB.put("dnb1902b", bi.dnb1902ba.isChecked() ? "1" : bi.dnb1902bb.isChecked() ? "2" : "0");
        sNB.put("dnb20", bi.dnb20a.isChecked() ? "1" : bi.dnb20b.isChecked() ? "2" : "0");
        sNB.put("dnb21", bi.dnb21a.isChecked() ? "1" : bi.dnb21b.isChecked() ? "2" : bi.dnb21c.isChecked() ? "3"
                : bi.dnb21d.isChecked() ? "4" : "0");
        sNB.put("dnb22", bi.dnb22a.isChecked() ? "1" : bi.dnb22b.isChecked() ? "2" : bi.dnb22c.isChecked() ? "3" : "0");
        sNB.put("dnb23", bi.dnb23a.isChecked() ? "1" : bi.dnb23b.isChecked() ? "2" : "0");
        sNB.put("dnb23x", bi.dnb23x.getText().toString());
        sNB.put("dnb24", bi.dnb24a.isChecked() ? "1" : bi.dnb24b.isChecked() ? "2" : "0");
        sNB.put("dnb24x", bi.dnb24x.getText().toString());
        sNB.put("dnb25", bi.dnb25a.isChecked() ? "1" : bi.dnb25b.isChecked() ? "2" : "0");
        sNB.put("dnb25x", bi.dnb25x.getText().toString());
        sNB.put("dnb26", bi.dnb26a.isChecked() ? "1" : bi.dnb26b.isChecked() ? "2" : "0");
        sNB.put("dnb26x", bi.dnb26x.getText().toString());
        sNB.put("dnb27", bi.dnb27a.isChecked() ? "1" : bi.dnb27b.isChecked() ? "2" : "0");
        sNB.put("dnb28", bi.dnb28.getText().toString());

        MainApp.nb.setsNB(String.valueOf(sNB));

    }


    private boolean UpdateDB() {
        db = new DatabaseHelper(this);
        Long updcount = db.addNewBorn(MainApp.nb);
        MainApp.nb.set_ID(String.valueOf(updcount));

        if (updcount != 0) {

            MainApp.nb.set_UID(
                    (MainApp.nb.getDeviceId() + MainApp.nb.get_ID()));
            db.updateNewBornID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


}
