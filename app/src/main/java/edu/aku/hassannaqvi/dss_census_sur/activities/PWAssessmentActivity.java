package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityPwAssessmentBinding;
import edu.aku.hassannaqvi.dss_census_sur.validation.ClearClass;
import edu.aku.hassannaqvi.dss_census_sur.validation.validatorClass;

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
                    bi.fldGrpPwdsa04.setVisibility(View.GONE);
                    bi.fldGrpPwdsa05.setVisibility(View.GONE);
                } else {
                    bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa04.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa05.setVisibility(View.VISIBLE);

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
        if (bi.dsa02e.isChecked()) {

            return true;
        } else {

            if (bi.dsa01a.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, bi.dsa03d, getString(R.string.dsa03))) {

                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.dsa03m, getString(R.string.dsa03))) {

                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.dsa03y, getString(R.string.dsa03))) {

                    return false;
                }

                return validatorClass.EmptyRadioButton(this, bi.dsa06, bi.dsa0698, getString(R.string.dsa06));
            } else if (bi.dsa01b.isChecked() || bi.dsa0198.isChecked()) {
                if (!validatorClass.EmptyRadioButton(this, bi.dsa02, bi.dsa0298, getString(R.string.dsa02))) {

                    return false;
                }

                if (!validatorClass.EmptyTextBox(this, bi.dsa04a, getString(R.string.dsa04))) {
                    return false;
                }

                if (!validatorClass.EmptyTextBox(this, bi.dsa05a, getString(R.string.dsa05))) {
                    return false;
                }

                if (!validatorClass.EmptyTextBox(this, bi.dsa07a, getString(R.string.dsa07))) {

                    return false;
                }

                if (bi.dsa06b.isChecked() || bi.dsa06c.isChecked()) {

                    if (!validatorClass.EmptyRadioButton(this, bi.dsa08, bi.dsa0898x, getString(R.string.dsa08))) {

                        return false;
                    }
                } else {
                    if (!validatorClass.EmptyTextBox(this, bi.dsa07a, getString(R.string.dsa07))) {

                        return false;
                    }
                }

                if (bi.dsa09a.isChecked() || bi.dsa0998.isChecked()) {

                    if (!validatorClass.EmptyRadioButton(this, bi.dsa10, bi.dsa1096x, getString(R.string.dsa10))) {

                        return false;
                    }

                } else {
                    if (!validatorClass.EmptyRadioButton(this, bi.dsa11, bi.dsa1197, getString(R.string.dsa11))) {

                        return false;
                    }
                }


                if (bi.dsa1197.isChecked()) {

                    if (!validatorClass.EmptyRadioButton(this, bi.dsa13, bi.dsa1397, getString(R.string.dsa13))) {

                        return false;
                    }
                } else {

                    if (bi.dsa12a.getText().toString().isEmpty() || !bi.dsa12b.isChecked() || !bi.dsa1298.isChecked()) {

                        return false;
                    }
                }

                if (bi.dsa1397.isChecked()) {
                    if (!validatorClass.EmptyRadioButton(this, bi.dsa15, bi.dsa1597, getString(R.string.dsa15))) {

                        return false;
                    }
                } else {
                    if (bi.dsa14a.getText().toString().isEmpty() || !bi.dsa14b.isChecked() || !bi.dsa1498.isChecked()) {

                        return false;
                    }
                }

                if (bi.dsa1597.isChecked()) {

                    if (!validatorClass.EmptyRadioButton(this, bi.dsa17, bi.dsa1797, getString(R.string.dsa17))) {

                        return false;
                    }
                } else {
                    if (bi.dsa16a.getText().toString().isEmpty() || !bi.dsa16b.isChecked() || !bi.dsa1698.isChecked()) {

                        return false;
                    }

                }

                if (!validatorClass.EmptyRadioButton(this, bi.dsa17, bi.dsa1797, getString(R.string.dsa17))) {

                    return false;
                }

                if (bi.dsa18w.getText().toString().isEmpty() || !bi.dsa1899.isChecked()) {
//
                    Toast.makeText(this, getString(R.string.dsa18), Toast.LENGTH_SHORT).show();
                    return false;
                }

                if (bi.dsa19m.getText().toString().isEmpty() || !bi.dsa1999.isChecked()) {

                    Toast.makeText(this, getString(R.string.dsa19), Toast.LENGTH_SHORT).show();
                    return false;
                }

                if (bi.dsa20h.getText().toString().isEmpty() || !bi.dsa2099.isChecked()) {
                    {
                        Toast.makeText(this, getString(R.string.dsa20), Toast.LENGTH_SHORT).show();
                        return false;
                    }

                }


            }

//            if (!validatorClass.EmptyRadioButton(this, bi.dsa01, bi.dsa01a, getString(R.string.dsa01))) {
//                Toast.makeText(this, getString(R.string.dsa01), Toast.LENGTH_SHORT).show();
//                return false;
//            }
//
//            if (bi.dsa01a.isChecked()) {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa06, bi.dsa0698, getString(R.string.dsa06))) {
//
//                    return false;
//                }
//            }
//
//            if (bi.dsa01b.isChecked()) {
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa02, bi.dsa0298, getString(R.string.dsa02))) {
//                    Toast.makeText(this, getString(R.string.dsa02), Toast.LENGTH_SHORT).show();
//                    return false;
//                }
//
//                if (!validatorClass.EmptyTextBox(this, bi.dsa04a, getString(R.string.dsa04))) {
//                    return false;
//                }
//                if (!validatorClass.EmptyTextBox(this, bi.dsa05a, getString(R.string.dsa05))) {
//
//                    return false;
//                }
//            }
//
//            if (!validatorClass.EmptyTextBox(this, bi.dsa03d, getString(R.string.dsa03))
//                    || !validatorClass.EmptyTextBox(this, bi.dsa03m, getString(R.string.dsa03))
//                    || !validatorClass.EmptyTextBox(this, bi.dsa03y, getString(R.string.dsa03))) {
//                return false;
//            }
//
//            if (!bi.dsa01a.isChecked()) {
//
//                if (!validatorClass.EmptyTextBox(this, bi.dsa04a, getString(R.string.dsa04))) {
//                    return false;
//                }
//                if (!validatorClass.EmptyTextBox(this, bi.dsa05a, getString(R.string.dsa05))) {
//                    return false;
//                }
//            }
//
//            if (bi.dsa06b.isChecked() || bi.dsa06c.isChecked()) {
//
//                if (validatorClass.EmptyRadioButton(this, bi.dsa08, bi.dsa0898x, getString(R.string.dsa08))) {
//                    return false;
//                }
//            } else {
//
//                if (!validatorClass.EmptyTextBox(this, bi.dsa07a, getString(R.string.dsa07))) {
//                    return false;
//                }
//            }
//
//            if (bi.dsa09b.isChecked()) {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa11, bi.dsa11c, getString(R.string.dsa11))) {
//                    return false;
//                }
//            } else if (bi.dsa09a.isChecked()) {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa10, bi.dsa1096x, getString(R.string.dsa10))) {
//                    return false;
//                }
//            }
//
//            if (bi.dsa1197.isChecked()) {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa13, bi.dsa1397, getString(R.string.dsa13))) {
//                    return false;
//                }
//            } else {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa12, bi.dsa1298, getString(R.string.dsa12))) {
//
//                    return false;
//                }
//            }
//
//            if (bi.dsa1397.isChecked()) {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa15, bi.dsa1597, getString(R.string.dsa15))) {
//
//                    return false;
//                }
//            } else {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa14, bi.dsa1498, getString(R.string.dsa14))) {
//
//                    return false;
//                }
//            }
//
//            if (bi.dsa1597.isChecked()) {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa17, bi.dsa1797, getString(R.string.dsa17))) {
//
//                    return false;
//                }
//
//            } else {
//
//                if (!validatorClass.EmptyRadioButton(this, bi.dsa16, bi.dsa1698, getString(R.string.dsa16))) {
//
//                    return false;
//                }
//            }
//
//            if (bi.dsa18w.getText().toString().isEmpty() || !bi.dsa1899.isChecked()) {
//
//                Toast.makeText(this, getString(R.string.dsa18), Toast.LENGTH_SHORT).show();
//                return false;
//            }
//
//            if (bi.dsa19m.getText().toString().isEmpty() || !bi.dsa1999.isChecked()) {
//
//                Toast.makeText(this, getString(R.string.dsa19), Toast.LENGTH_SHORT).show();
//                return false;
//            }
//
//            if (bi.dsa20h.getText().toString().isEmpty() || !bi.dsa2099.isChecked()) {
//                {
//                    Toast.makeText(this, getString(R.string.dsa20), Toast.LENGTH_SHORT).show();
//                    return false;
//                }
//
//            }
        }

        return true;
    }

    public void SaveDraft() {


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
