package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionJActivity extends Activity  {

    private static final String TAG = SectionJActivity.class.getSimpleName();

    @BindView(R.id.activity_section_j) RelativeLayout activitySectionJ;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcj01) RadioGroup dcj01;
    @BindView(R.id.dcj0101) RadioButton dcj0101;
    @BindView(R.id.dcj0102) RadioButton dcj0102;
    @BindView(R.id.dcj0199) RadioButton dcj0199;
    @BindView(R.id.dcj02) RadioGroup dcj02;
    @BindView(R.id.dcj0201) RadioButton dcj0201;
    @BindView(R.id.dcj0202) RadioButton dcj0202;
    @BindView(R.id.dcj0299) RadioButton dcj0299;
    @BindView(R.id.dcj03) RadioGroup dcj03;
    @BindView(R.id.dcj0301) RadioButton dcj0301;
    @BindView(R.id.dcj0302) RadioButton dcj0302;
    @BindView(R.id.dcj0399) RadioButton dcj0399;
    @BindView(R.id.dcj04) RadioGroup dcj04;
    @BindView(R.id.dcj0401) RadioButton dcj0401;
    @BindView(R.id.dcj0402) RadioButton dcj0402;
    @BindView(R.id.dcj0499) RadioButton dcj0499;
    @BindView(R.id.dcj0501) CheckBox dcj0501;
    @BindView(R.id.dcj0502) CheckBox dcj0502;
    @BindView(R.id.dcj0503) CheckBox dcj0503;
    @BindView(R.id.dcj0504) CheckBox dcj0504;
    @BindView(R.id.dcj0505) CheckBox dcj0505;
    @BindView(R.id.dcj0506) CheckBox dcj0506;
    @BindView(R.id.dcj0507) CheckBox dcj0507;
    @BindView(R.id.dcj0508) CheckBox dcj0508;
    @BindView(R.id.dcj0509) CheckBox dcj0509;
    @BindView(R.id.dcj0577) CheckBox dcj0577;
    @BindView(R.id.dcj0596) CheckBox dcj0596;
    @BindView(R.id.dcj0596x) EditText dcj0596x;
    @BindView(R.id.dcj06) RadioGroup dcj06;
    @BindView(R.id.dcj0601) RadioButton dcj0601;
    @BindView(R.id.dcj0602) RadioButton dcj0602;
    @BindView(R.id.dcj0699) RadioButton dcj0699;
    @BindView(R.id.dcj07) RadioGroup dcj07;
    @BindView(R.id.dcj0701) RadioButton dcj0701;
    @BindView(R.id.dcj0702) RadioButton dcj0702;
    @BindView(R.id.dcj0799) RadioButton dcj0799;
    @BindView(R.id.dcj0801) EditText dcj0801;
    @BindView(R.id.dcj0802) EditText dcj0802;
    @BindView(R.id.dcj0803) EditText dcj0803;
    @BindView(R.id.dcj09) RadioGroup dcj09;
    @BindView(R.id.dcj0901) RadioButton dcj0901;
    @BindView(R.id.dcj0902) RadioButton dcj0902;
    @BindView(R.id.dcj0999) RadioButton dcj0999;
    @BindView(R.id.dcj10) RadioGroup dcj10;
    @BindView(R.id.dcj1001) RadioButton dcj1001;
    @BindView(R.id.dcj1002) RadioButton dcj1002;
    @BindView(R.id.dcj1099) RadioButton dcj1099;
    @BindView(R.id.dcj11) RadioGroup dcj11;
    @BindView(R.id.dcj1101) RadioButton dcj1101;
    @BindView(R.id.dcj1102) RadioButton dcj1102;
    @BindView(R.id.dcj1199) RadioButton dcj1199;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_j);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section J: Child Health Status (Index Child)");
    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        //TODO implement

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
       /* if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, MainActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */
    }

    @OnClick(R.id.btn_Continue) void onBtnContinueClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
//        if (formValidation()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionKActivity.class));
//
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }


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

        if (!dcj0501.isChecked() && !dcj0502.isChecked() && !dcj0503.isChecked() && !dcj0504.isChecked() && !dcj0505.isChecked()
                && !dcj0506.isChecked() && !dcj0507.isChecked() && !dcj0508.isChecked() && !dcj0509.isChecked() && !dcj0596.isChecked()
                && !dcj0577.isChecked()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcg05), Toast.LENGTH_SHORT).show();
            dcj0577.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg05: This data is Required!");
            return false;
        } else {
            dcj0577.setError(null);
        }

        if (dcj0596.isChecked() && dcj0596x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj05), Toast.LENGTH_SHORT).show();
            dcj0596x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcj05: This data is Required!");
            return false;
        } else {
            dcj0596x.setError(null);
        }


//        06
        if (dcj06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj06), Toast.LENGTH_SHORT).show();
            dcj0699.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg06: This data is Required!");
            return false;
        } else {
            dcj0699.setError(null);
        }

//        07
        if (dcj07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj07), Toast.LENGTH_SHORT).show();
            dcj0799.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg07: This data is Required!");
            return false;
        } else {
            dcj0799.setError(null);
        }

//        08

        if (dcj06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj06), Toast.LENGTH_SHORT).show();
            dcj0699.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg01: This data is Required!");
            return false;
        } else {
            dcj0699.setError(null);
        }

//        09

        if (dcj09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj09), Toast.LENGTH_SHORT).show();
            dcj0999.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg09: This data is Required!");
            return false;
        } else {
            dcj0999.setError(null);
        }

//        10
        if (dcj10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj10), Toast.LENGTH_SHORT).show();
            dcj1099.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg10: This data is Required!");
            return false;
        } else {
            dcj1099.setError(null);
        }

//        11
        if (dcj11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcj11), Toast.LENGTH_SHORT).show();
            dcj1199.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg11: This data is Required!");
            return false;
        } else {
            dcj1199.setError(null);
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

//        05
// Checkbox
        sJ.put("dcj0501", dcj0501.isChecked() ? "1" : "0");
        sJ.put("dcj0502", dcj0502.isChecked() ? "2" : "0");
        sJ.put("dcj0503", dcj0503.isChecked() ? "3" : "0");
        sJ.put("dcj0504", dcj0504.isChecked() ? "4" : "0");
        sJ.put("dcj0505", dcj0505.isChecked() ? "5" : "0");
        sJ.put("dcj0506", dcj0506.isChecked() ? "6" : "0");
        sJ.put("dcj0507", dcj0507.isChecked() ? "7" : "0");
        sJ.put("dcj0508", dcj0508.isChecked() ? "8" : "0");
        sJ.put("dcj0509", dcj0509.isChecked() ? "9" : "0");
        sJ.put("dcj0577", dcj0577.isChecked() ? "77" : "0");
        sJ.put("dcj0596", dcj0596.isChecked() ? "96" : "0");
//      Edit Text
        sJ.put("dcj0596x", dcj0596x.getText().toString());


//        06
        sJ.put("dcj06", dcj0601.isChecked() ? "1" : dcj0602.isChecked() ? "2"
                : dcj0699.isChecked() ? "99" : "0");
//        07
        sJ.put("dcj07", dcj0701.isChecked() ? "1" : dcj0702.isChecked() ? "2"
                : dcj0799.isChecked() ? "99" : "0");
//        08



//        09
        sJ.put("dcj09", dcj0901.isChecked() ? "1" : dcj0902.isChecked() ? "2"
                : dcj0999.isChecked() ? "99" : "0");
//        10
        sJ.put("dcj10", dcj1001.isChecked() ? "1" : dcj1002.isChecked() ? "2"
                : dcj1099.isChecked() ? "99" : "0");
//        11
        sJ.put("dcj11", dcj1101.isChecked() ? "1" : dcj1102.isChecked() ? "2"
                : dcj1199.isChecked() ? "99" : "0");

//        MainApp.fc.setROW_sE(String.valueOf(sF));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
//        DatabaseHelper db = new DatabaseHelper(this);
//
//        int updcount = db.updatesE();
//
//        if (updcount == 1) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
//            return true;
//        } else {
//            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
//            return false;
//        }

        return true;
    }

}
