package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.PWContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityPwAssessmentBinding;
import edu.aku.hassannaqvi.dss_census_sur.validation.ClearClass;

public class PWAssessmentActivity extends AppCompatActivity {
    ActivityPwAssessmentBinding bi;

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_pw_assessment);
        bi.setCallback(this);

        db = new DatabaseHelper(this);

        setContentsUI();
    }

    public void setContentsUI() {

        bi.dsa01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa01a) {
                    bi.fldGrpPwdsa02.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa02, false);
                    bi.fldGrpPwdsa04.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa04, false);
                    bi.fldGrpPwdsa05.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa05, false);

                    bi.fldGrpPwdsa03.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, true);
                    bi.fldGrpPwdsa06.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, true);
                } else {
                    //bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    // ClearClass.ClearAllFields(bi.fldGrpPwdsa02, true);
                    //bi.fldGrpPwdsa04.setVisibility(View.VISIBLE);
                    //ClearClass.ClearAllFields(bi.fldGrpPwdsa04, true);
                    // bi.fldGrpPwdsa05.setVisibility(View.VISIBLE);
                    //ClearClass.ClearAllFields(bi.fldGrpPwdsa05, true);

                }

                if (i == R.id.dsa0198) {
                    bi.fldGrpPwdsa02.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa02, false);
                    bi.fldGrpPwdsa03.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, false);
                    bi.fldGrpPwdsa06.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, false);
                } else {
                    // bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    //ClearClass.ClearAllFields(bi.fldGrpPwdsa02, true);
                }

                if (i == R.id.dsa01b) {
                    bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa02, true);
                }

            }
        });

        bi.dsa02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa02e) {
                    bi.fldGrpPwdsa03.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, false);
                    bi.fldGrpPwdsa04.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa04, false);
                    bi.fldGrpPwdsa05.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa05, false);
                    bi.fldGrpPwdsa06.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, false);
                    bi.fldGrpPwdsa07.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, false);
                    bi.fldGrpPwdsa08.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa08, false);
                    bi.fldGrpPwdsa09.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa09, false);
                    bi.fldGrpPwdsa10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, false);
                    bi.fldGrpPwdsa11.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa11, false);
                    bi.fldGrpPwdsa12.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, false);
                    bi.fldGrpPwdsa13.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa13, false);
                    bi.fldGrpPwdsa14.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, false);
                    bi.fldGrpPwdsa15.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa15, false);
                    bi.fldGrpPwdsa16.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, false);
                    bi.fldGrpPwdsa17.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa17, false);
                    bi.fldGrpPwdsa18.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa18, false);
                    bi.fldGrpPwdsa19.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa19, false);
                    bi.fldGrpPwdsa20.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa20, false);
                    bi.dsaHeading03.setVisibility(View.GONE);


                } else {

                    bi.fldGrpPwdsa03.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, true);
                    bi.fldGrpPwdsa04.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa04, true);
                    bi.fldGrpPwdsa05.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa05, true);
                    bi.fldGrpPwdsa06.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, true);
                    bi.fldGrpPwdsa07.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, true);
                    bi.fldGrpPwdsa08.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa08, true);
                    bi.fldGrpPwdsa09.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa09, true);
                    bi.fldGrpPwdsa10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, true);
                    bi.fldGrpPwdsa11.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa11, true);
                    bi.fldGrpPwdsa12.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, true);
                    bi.fldGrpPwdsa13.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa13, true);
                    bi.fldGrpPwdsa14.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, true);
                    bi.fldGrpPwdsa15.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa15, true);
                    bi.fldGrpPwdsa16.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, true);
                    bi.fldGrpPwdsa17.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa17, true);
                    bi.fldGrpPwdsa18.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa18, true);
                    bi.fldGrpPwdsa19.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa19, true);
                    bi.fldGrpPwdsa20.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa20, true);
                    bi.dsaHeading03.setVisibility(View.VISIBLE);


                }
            }
        });

        bi.dsa06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa06b || i == R.id.dsa06c) {
                    bi.fldGrpPwdsa07.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, false);
                } else {
                    bi.fldGrpPwdsa07.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, true);
                }
            }
        });

        bi.dsa09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa09b) {
                    bi.fldGrpPwdsa10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, false);
                } else {
                    bi.fldGrpPwdsa10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, true);
                }
            }
        });

        bi.dsa11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa1197) {

                    bi.fldGrpPwdsa12.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, false);
                } else {
                    bi.fldGrpPwdsa12.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, true);
                }
            }
        });

        bi.dsa13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa1397) {
                    bi.fldGrpPwdsa14.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, false);
                } else {
                    bi.fldGrpPwdsa14.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, true);
                }
            }
        });

        bi.dsa15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa1597) {

                    bi.fldGrpPwdsa16.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, false);
                } else {
                    bi.fldGrpPwdsa16.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, true);
                }
            }
        });


    }

    public void BtnEnd() {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        /*finish();
        startActivity(new Intent(this, NB_EndingActivity.class)
                .putExtra("check", false));*/
    }

    public void BtnContinue() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (formValidation()) {

            Toast.makeText(this, "validated", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
        /*if (formValidation()) {
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
        }*/
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();
//        if (!validatorClass.EmptyRadioButton(this, bi.dsa01, bi.dsa0198, getString(R.string.dsa01))) {
//            return false;
//        }
//        if (bi.dsa01a.isChecked()) {
//            if (!validatorClass.EmptyTextBox(this, bi.dsa03d, getString(R.string.dsa03))) {
//                return false;
//            }
//            if (!validatorClass.EmptyTextBox(this, bi.dsa03m, getString(R.string.dsa03))) {
//                return false;
//            }
//            if (!validatorClass.EmptyTextBox(this, bi.dsa03y, getString(R.string.dsa03))) {
//                return false;
//            }
////
//            if (!validatorClass.EmptyRadioButton(this, bi.dsa06, bi.dsa0698, getString(R.string.dsa06))) {
//                return false;
//            }
//            if (!bi.dsa06b.isChecked() || !bi.dsa06c.isChecked()) {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa08, bi.dsa0898x, getString(R.string.dsa08))) {
//                    return false;
//                }
//            }
//        }
//        if (bi.dsa01b.isChecked()) {
//
//            if (!validatorClass.EmptyRadioButton(this, bi.dsa02, bi.dsa0298, getString(R.string.dsa02))) {
//
//                return false;
//            } else if (bi.dsa02e.isChecked()) {
//                return true;
//            }
//        }
//        if (bi.dsa0198.isChecked()) {
//            if (!validatorClass.EmptyTextBox(this, bi.dsa04a, getString(R.string.dsa04))) {
//                return false;
//            }
//
//            if (!validatorClass.EmptyTextBox(this, bi.dsa05a, getString(R.string.dsa05))) {
//                return false;
//            }
//        }


//        if (bi.dsa02e.isChecked()) {
//
//            return true;
//        } else {
//
//            if (bi.dsa01a.isChecked()) {
//
//                if (!validatorClass.EmptyTextBox(this, bi.dsa03d, getString(R.string.dsa03))) {
//
//                    return false;
//                }
//                if (!validatorClass.EmptyTextBox(this, bi.dsa03m, getString(R.string.dsa03))) {
//
//                    return false;
//                }
//                if (!validatorClass.EmptyTextBox(this, bi.dsa03y, getString(R.string.dsa03))) {
//
//                    return false;
//                }
//            } else if (bi.dsa01b.isChecked() || bi.dsa0198.isChecked()) {
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa02, bi.dsa0298, getString(R.string.dsa02))) {
//
//                    return false;
//                }
//
//                if (!validatorClass.EmptyTextBox(this, bi.dsa04a, getString(R.string.dsa04))) {
//                    return false;
//                }
//
//                if (!validatorClass.EmptyTextBox(this, bi.dsa05a, getString(R.string.dsa05))) {
//                    return false;
//                }
//
//                if (!validatorClass.EmptyTextBox(this, bi.dsa07a, getString(R.string.dsa07))) {
//
//                    return false;
//                }
//
//                if (bi.dsa06b.isChecked() || bi.dsa06c.isChecked()) {
//
//                    if (!validatorClass.EmptyRadioButton(this, bi.dsa08, bi.dsa0898x, getString(R.string.dsa08))) {
//
//                        return false;
//                    }
//                } else {
//                    if (!validatorClass.EmptyTextBox(this, bi.dsa07a, getString(R.string.dsa07))) {
//
//                        return false;
//                    }
//                }
//
//                if (bi.dsa09a.isChecked() || bi.dsa0998.isChecked()) {
//
//                    if (!validatorClass.EmptyRadioButton(this, bi.dsa10, bi.dsa1096x, getString(R.string.dsa10))) {
//
//                        return false;
//                    }
//
//                } else {
//                    if (!validatorClass.EmptyRadioButton(this, bi.dsa11, bi.dsa1197, getString(R.string.dsa11))) {
//
//                        return false;
//                    }
//                }
//
//
//                if (bi.dsa1197.isChecked()) {
//
//                    if (!validatorClass.EmptyRadioButton(this, bi.dsa13, bi.dsa1397, getString(R.string.dsa13))) {
//
//                        return false;
//                    }
//                } else {
//
//                    if (bi.dsa12a.getText().toString().isEmpty() || !bi.dsa12b.isChecked() || !bi.dsa1298.isChecked()) {
//
//                        return false;
//                    }
//                }
//
//                if (bi.dsa1397.isChecked()) {
//                    if (!validatorClass.EmptyRadioButton(this, bi.dsa15, bi.dsa1597, getString(R.string.dsa15))) {
//
//                        return false;
//                    }
//                } else {
//                    if (bi.dsa14a.getText().toString().isEmpty() || !bi.dsa14b.isChecked() || !bi.dsa1498.isChecked()) {
//
//                        return false;
//                    }
//                }
//
//                if (bi.dsa1597.isChecked()) {
//
//                    if (!validatorClass.EmptyRadioButton(this, bi.dsa17, bi.dsa1797, getString(R.string.dsa17))) {
//
//                        return false;
//                    }
//                } else {
//                    if (bi.dsa16a.getText().toString().isEmpty() || !bi.dsa16b.isChecked() || !bi.dsa1698.isChecked()) {
//
//                        return false;
//                    }
//
//                }
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa17, bi.dsa1797, getString(R.string.dsa17))) {
//
//                    return false;
//                }
//
//                if (bi.dsa18w.getText().toString().isEmpty() || !bi.dsa1899.isChecked()) {
////
//                    Toast.makeText(this, getString(R.string.dsa18), Toast.LENGTH_SHORT).show();
//                    return false;
//                }
//
//                if (bi.dsa19m.getText().toString().isEmpty() || !bi.dsa1999.isChecked()) {
//
//                    Toast.makeText(this, getString(R.string.dsa19), Toast.LENGTH_SHORT).show();
//                    return false;
//                }
//
//                if (bi.dsa20h.getText().toString().isEmpty() || !bi.dsa2099.isChecked()) {
//                    {
//                        Toast.makeText(this, getString(R.string.dsa20), Toast.LENGTH_SHORT).show();
//                        return false;
//                    }
//
//                }
//
//
//            }
//
//
//        }

        return true;
    }

    public void SaveDraft() {

        try {
            SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
            MainApp.pw = new PWContract();
            MainApp.pw.setFormDate(dtToday);
            MainApp.pw.setUser(MainApp.userName);
            MainApp.pw.setDeviceId(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                    Settings.Secure.ANDROID_ID));
            MainApp.pw.setDss_id_member(MainApp.fc.getDSSID().toUpperCase());
            MainApp.pw.setDevicetagID(sharedPref.getString("tagName", null));
            JSONObject sPW = new JSONObject();
            sPW.put("dsa01", bi.dsa01a.isChecked() ? "1" : bi.dsa01b.isChecked() ? "2" : "0");
            sPW.put("dsa02", bi.dsa02a.isChecked() ? "1" : bi.dsa02b.isChecked() ? "2" : bi.dsa02c.isChecked() ? "3" : bi.dsa02d.isChecked() ? "4" : bi.dsa02e.isChecked() ? "5" : bi.dsa02f.isChecked() ? "6" : bi.dsa0298.isChecked() ? "98" : "0");
            sPW.put("dsa03", bi.dsa03d.getText().toString());
            sPW.put("dsa03", bi.dsa03m.getText().toString());
            sPW.put("dsa03", bi.dsa03y.getText().toString());
            sPW.put("dsa04", bi.dsa04a.getText().toString());
            sPW.put("dsa05", bi.dsa05a.getText().toString());
            sPW.put("dsa06", bi.dsa06a.isChecked() ? "1" : bi.dsa06b.isChecked() ? "2" : bi.dsa06c.isChecked() ? "3" : bi.dsa0698.isChecked() ? "98" : "0");
            sPW.put("dsa07", bi.dsa07a.getText().toString());
            sPW.put("dsa0801", bi.dsa0801a.isChecked() ? "1" : bi.dsa0801b.isChecked() ? "2" : "0");
            sPW.put("dsa0802", bi.dsa0802a.isChecked() ? "1" : bi.dsa0802b.isChecked() ? "2" : "0");
            sPW.put("dsa0803", bi.dsa0803a.isChecked() ? "1" : bi.dsa0803b.isChecked() ? "2" : "0");
            sPW.put("dsa0804", bi.dsa0804a.isChecked() ? "1" : bi.dsa0804b.isChecked() ? "2" : "0");
            sPW.put("dsa0805", bi.dsa0805a.isChecked() ? "1" : bi.dsa0805b.isChecked() ? "2" : "0");
            sPW.put("dsa0806", bi.dsa0806a.isChecked() ? "1" : bi.dsa0806b.isChecked() ? "2" : "0");
            sPW.put("dsa0807", bi.dsa0807a.isChecked() ? "1" : bi.dsa0807b.isChecked() ? "2" : "0");
            sPW.put("dsa0808", bi.dsa0808a.isChecked() ? "1" : bi.dsa0808b.isChecked() ? "2" : "0");
            sPW.put("dsa0809", bi.dsa0809a.isChecked() ? "1" : bi.dsa0809b.isChecked() ? "2" : "0");
            sPW.put("dsa0810", bi.dsa0810a.isChecked() ? "1" : bi.dsa0810b.isChecked() ? "2" : "0");
            sPW.put("dsa0811", bi.dsa0811a.isChecked() ? "1" : bi.dsa0811b.isChecked() ? "2" : "0");
            sPW.put("dsa0812", bi.dsa0812a.isChecked() ? "1" : bi.dsa0812b.isChecked() ? "2" : "0");
            sPW.put("dsa0898x", bi.dsa0898x.getText().toString());
            sPW.put("dsa09", bi.dsa09a.isChecked() ? "1" : bi.dsa09b.isChecked() ? "2" : bi.dsa0998.isChecked() ? "8" : "0");
            sPW.put("dsa1001", bi.dsa101a.isChecked() ? "1" : bi.dsa101b.isChecked() ? "2" : bi.dsa10198.isChecked() ? "98" : "0");
            sPW.put("dsa1002", bi.dsa102a.isChecked() ? "1" : bi.dsa102b.isChecked() ? "2" : bi.dsa10298.isChecked() ? "98" : "0");
            sPW.put("dsa1003", bi.dsa103a.isChecked() ? "1" : bi.dsa103b.isChecked() ? "2" : bi.dsa10398.isChecked() ? "98" : "0");
            sPW.put("dsa1004", bi.dsa104a.isChecked() ? "1" : bi.dsa104b.isChecked() ? "2" : bi.dsa10498.isChecked() ? "98" : "0");
            sPW.put("dsa1005", bi.dsa105a.isChecked() ? "1" : bi.dsa105b.isChecked() ? "2" : bi.dsa10598.isChecked() ? "98" : "0");
            sPW.put("dsa1006", bi.dsa106a.isChecked() ? "1" : bi.dsa106b.isChecked() ? "2" : bi.dsa10698.isChecked() ? "98" : "0");
            sPW.put("dsa1007", bi.dsa107a.isChecked() ? "1" : bi.dsa107b.isChecked() ? "2" : bi.dsa10798.isChecked() ? "98" : "0");
            sPW.put("dsa1096x", bi.dsa1096x.getText().toString());
            sPW.put("dsa11", bi.dsa11a.isChecked() ? "2" : bi.dsa11b.isChecked() ? "3" : bi.dsa11c.isChecked() ? "4" : bi.dsa1197.isChecked() ? "1" : "0");
            sPW.put("dsa12", bi.dsa12a.getText().toString());
            sPW.put("dsa12", bi.dsa12b.isChecked() ? "2" : bi.dsa1298.isChecked() ? "98" : "0");
            sPW.put("dsa13", bi.dsa13a.isChecked() ? "2" : bi.dsa13b.isChecked() ? "3" : bi.dsa13c.isChecked() ? "4" : bi.dsa1397.isChecked() ? "1" : "0");
            sPW.put("dsa14", bi.dsa14a.getText().toString());
            sPW.put("dsa14", bi.dsa14b.isChecked() ? "2" : bi.dsa1498.isChecked() ? "98" : "0");
            sPW.put("dsa15", bi.dsa15a.isChecked() ? "2" : bi.dsa15b.isChecked() ? "3" : bi.dsa15c.isChecked() ? "4" : bi.dsa1597.isChecked() ? "1" : "0");
            sPW.put("dsa16", bi.dsa16a.getText().toString());
            sPW.put("dsa16", bi.dsa16b.isChecked() ? "2" : bi.dsa1698.isChecked() ? "98" : "0");
            sPW.put("dsa17", bi.dsa17a.isChecked() ? "2" : bi.dsa17b.isChecked() ? "3" : bi.dsa17c.isChecked() ? "4" : bi.dsa1797.isChecked() ? "1" : "0");
            sPW.put("dsa18", bi.dsa18w.getText().toString());
            sPW.put("dsa18", bi.dsa1899.isChecked() ? "99" : "0");
            sPW.put("dsa19", bi.dsa19m.getText().toString());
            sPW.put("dsa19", bi.dsa1999.isChecked() ? "99" : "0");
            sPW.put("dsa20", bi.dsa2099.isChecked() ? "99" : bi.dsa20h.getText().toString());


        } catch (Exception e) {

            e.printStackTrace();
        }


    }

    // 8 - GONE
    // 0 - visible
    // 4 - Invisible
    public int settingUI() {
        if (bi.dsa01b.isChecked()) {
            return View.VISIBLE;

        } else {
            return View.GONE;
        }
    }


    private boolean UpdateDB() {
        return true;
    }


}
