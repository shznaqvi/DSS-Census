package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.core.MainApp;

public class SectionJActivity extends Activity {

    private static final String TAG = SectionJActivity.class.getSimpleName();


    @BindView(R.id.dcj01)
    RadioGroup dcj01;
    @BindView(R.id.dcj0101)
    RadioButton dcj0101;
    @BindView(R.id.dcj0102)
    RadioButton dcj0102;
    @BindView(R.id.dcj0199)
    RadioButton dcj0199;
    @BindView(R.id.dcj02)
    RadioGroup dcj02;
    @BindView(R.id.dcj0201)
    RadioButton dcj0201;
    @BindView(R.id.dcj0202)
    RadioButton dcj0202;
    @BindView(R.id.dcj0299)
    RadioButton dcj0299;
    @BindView(R.id.dcj03)
    RadioGroup dcj03;
    @BindView(R.id.dcj0301)
    RadioButton dcj0301;
    @BindView(R.id.dcj0302)
    RadioButton dcj0302;
    @BindView(R.id.dcj0399)
    RadioButton dcj0399;
    @BindView(R.id.dcj04)
    RadioGroup dcj04;
    @BindView(R.id.dcj0401)
    RadioButton dcj0401;
    @BindView(R.id.dcj0402)
    RadioButton dcj0402;
    @BindView(R.id.dcj0499)
    RadioButton dcj0499;
    @BindView(R.id.dcj05)
    RadioGroup dcj05;
    @BindView(R.id.dcj0501)
    RadioButton dcj0501;
    @BindView(R.id.dcj0502)
    RadioButton dcj0502;
    @BindView(R.id.fldGrpdcj06)
    LinearLayout fldGrpdcj06;
    @BindView(R.id.dcj0601)
    CheckBox dcj0601;
    @BindView(R.id.dcj0602)
    CheckBox dcj0602;
    @BindView(R.id.dcj0603)
    CheckBox dcj0603;
    @BindView(R.id.dcj0604)
    CheckBox dcj0604;
    @BindView(R.id.dcj0605)
    CheckBox dcj0605;
    @BindView(R.id.dcj0606)
    CheckBox dcj0606;
    @BindView(R.id.dcj0607)
    CheckBox dcj0607;
    @BindView(R.id.dcj0608)
    CheckBox dcj0608;
    @BindView(R.id.dcj0609)
    CheckBox dcj0609;
    @BindView(R.id.dcj0677)
    CheckBox dcj0677;
    @BindView(R.id.dcj0696)
    CheckBox dcj0696;
    @BindView(R.id.dcj0696x)
    EditText dcj0696x;
    @BindView(R.id.dcj07)
    RadioGroup dcj07;
    @BindView(R.id.dcj0701)
    RadioButton dcj0701;
    @BindView(R.id.dcj0702)
    RadioButton dcj0702;
    @BindView(R.id.dcj0799)
    RadioButton dcj0799;
    @BindView(R.id.dcj08)
    RadioGroup dcj08;
    @BindView(R.id.dcj0801)
    RadioButton dcj0801;
    @BindView(R.id.dcj0802)
    RadioButton dcj0802;
    @BindView(R.id.dcj0899)
    RadioButton dcj0899;
    @BindView(R.id.dcj0901)
    EditText dcj0901;
    @BindView(R.id.dcj0902)
    EditText dcj0902;
    @BindView(R.id.dcj0903)
    EditText dcj0903;
    @BindView(R.id.dcj10)
    RadioGroup dcj10;
    @BindView(R.id.dcj1001)
    RadioButton dcj1001;
    @BindView(R.id.dcj1002)
    RadioButton dcj1002;
    @BindView(R.id.dcj1099)
    RadioButton dcj1099;
    @BindView(R.id.dcj11)
    RadioGroup dcj11;
    @BindView(R.id.dcj1101)
    RadioButton dcj1101;
    @BindView(R.id.dcj1102)
    RadioButton dcj1102;
    @BindView(R.id.dcj1199)
    RadioButton dcj1199;
    @BindView(R.id.dcj12)
    RadioGroup dcj12;
    @BindView(R.id.dcj1201)
    RadioButton dcj1201;
    @BindView(R.id.dcj1202)
    RadioButton dcj1202;
    @BindView(R.id.dcj1299)
    RadioButton dcj1299;
    @BindView(R.id.fldGrpdcj09)
    LinearLayout fldGrpdcj09;
    @BindView(R.id.fldGrpdcj12)
    LinearLayout fldGrpdcj12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_j);
        ButterKnife.bind(this);


        dcj0677.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcj0601.setChecked(false);
                    dcj0601.setEnabled(false);
                    dcj0602.setChecked(false);
                    dcj0602.setEnabled(false);
                    dcj0603.setChecked(false);
                    dcj0603.setEnabled(false);
                    dcj0604.setChecked(false);
                    dcj0604.setEnabled(false);
                    dcj0605.setChecked(false);
                    dcj0605.setEnabled(false);
                    dcj0606.setChecked(false);
                    dcj0606.setEnabled(false);
                    dcj0607.setChecked(false);
                    dcj0607.setEnabled(false);
                    dcj0608.setChecked(false);
                    dcj0608.setEnabled(false);
                    dcj0609.setChecked(false);
                    dcj0609.setEnabled(false);
                    dcj0696.setChecked(false);
                    dcj0696.setEnabled(false);
                } else {
                    dcj0601.setEnabled(true);
                    dcj0602.setEnabled(true);
                    dcj0603.setEnabled(true);
                    dcj0604.setEnabled(true);
                    dcj0605.setEnabled(true);
                    dcj0606.setEnabled(true);
                    dcj0607.setEnabled(true);
                    dcj0608.setEnabled(true);
                    dcj0609.setEnabled(true);
                    dcj0696.setEnabled(true);

                }
            }
        });

        dcj05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dcj0501.isChecked()) {
                    fldGrpdcj06.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcj06.setVisibility(View.GONE);
                    dcj0601.setChecked(false);
                    dcj0602.setChecked(false);
                    dcj0603.setChecked(false);
                    dcj0604.setChecked(false);
                    dcj0605.setChecked(false);
                    dcj0606.setChecked(false);
                    dcj0607.setChecked(false);
                    dcj0608.setChecked(false);
                    dcj0609.setChecked(false);
                    dcj0696.setChecked(false);
                    dcj0696x.setText(null);
                    dcj0677.setChecked(false);
                }
            }
        });

        dcj08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dcj0801.isChecked()) {
                    fldGrpdcj09.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcj09.setVisibility(View.GONE);
                    dcj0901.setText(null);
                    dcj0902.setText(null);
                    dcj0903.setText(null);
                }
            }
        });

        dcj11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dcj1101.isChecked()) {
                    fldGrpdcj12.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcj12.setVisibility(View.GONE);
                    dcj12.clearCheck();
                }
            }
        });

        dcj0696.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcj0696x.setVisibility(View.VISIBLE);

                } else {
                    dcj0696x.setVisibility(View.GONE);
                    dcj0696x.setText(null);
                }
            }
        });
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
//        finish();
        MainApp.finishActivity(this,this);
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

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
                finish();

                if (MainApp.totalChild > 0) {
                    startActivity(new Intent(this, SectionKActivity.class));
                } else {
                    startActivity(new Intent(this, SectionLActivity.class));
                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01
        if (dcj01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj01), Toast.LENGTH_SHORT).show();
            dcj0199.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg01: This data is Required!");
            return false;
        } else {
            dcj0199.setError(null);
        }

//        02
        if (dcj02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj02), Toast.LENGTH_SHORT).show();
            dcj0299.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg02: This data is Required!");
            return false;
        } else {
            dcj0299.setError(null);
        }

//        03
        if (dcj03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj03), Toast.LENGTH_SHORT).show();
            dcj0399.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg03: This data is Required!");
            return false;
        } else {
            dcj0399.setError(null);
        }

//        04
        if (dcj04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj04), Toast.LENGTH_SHORT).show();
            dcj0499.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg04: This data is Required!");
            return false;
        } else {
            dcj0499.setError(null);
        }

//        05

        if (dcj05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj05), Toast.LENGTH_SHORT).show();
            dcj0502.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg05: This data is Required!");
            return false;
        } else {
            dcj0502.setError(null);
        }

        if (dcj0501.isChecked()) {

            if (!dcj0601.isChecked() && !dcj0602.isChecked() && !dcj0603.isChecked() && !dcj0604.isChecked() && !dcj0605.isChecked()
                    && !dcj0606.isChecked() && !dcj0607.isChecked() && !dcj0608.isChecked() && !dcj0609.isChecked() && !dcj0696.isChecked()
                    && !dcj0677.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj06), Toast.LENGTH_SHORT).show();
                dcj0677.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcg06: This data is Required!");
                return false;
            } else {
                dcj0677.setError(null);
            }

            if (dcj0696.isChecked() && dcj0696x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj06), Toast.LENGTH_SHORT).show();
                dcj0696x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcj06: This data is Required!");
                return false;
            } else {
                dcj0696x.setError(null);
            }
        }


//        06
        if (dcj07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj07), Toast.LENGTH_SHORT).show();
            dcj0799.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg07: This data is Required!");
            return false;
        } else {
            dcj0799.setError(null);
        }

//        07
        if (dcj08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj08), Toast.LENGTH_SHORT).show();
            dcj0899.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg08: This data is Required!");
            return false;
        } else {
            dcj0899.setError(null);
        }


//        09

        if (dcj10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj10), Toast.LENGTH_SHORT).show();
            dcj1099.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg10: This data is Required!");
            return false;
        } else {
            dcj1099.setError(null);
        }

//        10
        if (dcj11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj11), Toast.LENGTH_SHORT).show();
            dcj1199.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg11: This data is Required!");
            return false;
        } else {
            dcj1199.setError(null);
        }

//        11
        if (dcj1101.isChecked()) {
            if (dcj12.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj12), Toast.LENGTH_SHORT).show();
                dcj1299.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcg12: This data is Required!");
                return false;
            } else {
                dcj1299.setError(null);
            }
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sJ = new JSONObject();

//        01
        sJ.put("dcj01", dcj0101.isChecked() ? "1" : dcj0102.isChecked() ? "2"
                : dcj0199.isChecked() ? "99" : "0");
//        02
        sJ.put("dcj02", dcj0201.isChecked() ? "1" : dcj0202.isChecked() ? "2"
                : dcj0299.isChecked() ? "99" : "0");
//        03
        sJ.put("dcj03", dcj0301.isChecked() ? "1" : dcj0302.isChecked() ? "2"
                : dcj0399.isChecked() ? "99" : "0");
//        04
        sJ.put("dcj04", dcj0401.isChecked() ? "1" : dcj0402.isChecked() ? "2"
                : dcj0499.isChecked() ? "99" : "0");

        sJ.put("dcj05", dcj0501.isChecked() ? "1" : dcj0502.isChecked() ? "2" : "0");

//        05
// Checkbox
        sJ.put("dcj0601", dcj0601.isChecked() ? "1" : "0");
        sJ.put("dcj0602", dcj0602.isChecked() ? "2" : "0");
        sJ.put("dcj0603", dcj0603.isChecked() ? "3" : "0");
        sJ.put("dcj0604", dcj0604.isChecked() ? "4" : "0");
        sJ.put("dcj0605", dcj0605.isChecked() ? "5" : "0");
        sJ.put("dcj0606", dcj0606.isChecked() ? "6" : "0");
        sJ.put("dcj0607", dcj0607.isChecked() ? "7" : "0");
        sJ.put("dcj0608", dcj0608.isChecked() ? "8" : "0");
        sJ.put("dcj0609", dcj0609.isChecked() ? "9" : "0");
        sJ.put("dcj0677", dcj0677.isChecked() ? "77" : "0");
        sJ.put("dcj0696", dcj0696.isChecked() ? "96" : "0");
//      Edit Text
        sJ.put("dcj0696x", dcj0696x.getText().toString());


//        06
        sJ.put("dcj07", dcj0701.isChecked() ? "1" : dcj0702.isChecked() ? "2"
                : dcj0799.isChecked() ? "99" : "0");
//        07
        sJ.put("dcj08", dcj0801.isChecked() ? "1" : dcj0802.isChecked() ? "2"
                : dcj0899.isChecked() ? "99" : "0");
//        08

        sJ.put("dcj0901", dcj0901.getText().toString());
        sJ.put("dcj0902", dcj0902.getText().toString());
        sJ.put("dcj0903", dcj0903.getText().toString());

//        09
        sJ.put("dcj10", dcj1001.isChecked() ? "1" : dcj1002.isChecked() ? "2"
                : dcj1099.isChecked() ? "99" : "0");
//        10
        sJ.put("dcj11", dcj1101.isChecked() ? "1" : dcj1102.isChecked() ? "2"
                : dcj1199.isChecked() ? "99" : "0");
//        11
        sJ.put("dcj12", dcj1201.isChecked() ? "1" : dcj1202.isChecked() ? "2"
                : dcj1299.isChecked() ? "99" : "0");

        MainApp.mc.setsJ(String.valueOf(sJ));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSJ();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
