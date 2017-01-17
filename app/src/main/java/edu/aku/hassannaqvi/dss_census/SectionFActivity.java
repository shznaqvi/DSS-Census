package edu.aku.hassannaqvi.dss_census;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionFActivity extends Activity  {


    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_f) FrameLayout activitySectionF;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcfa) EditText dcfa;
    @BindView(R.id.dcf01) EditText dcf01;
    @BindView(R.id.dcf0201) EditText dcf0201;
    @BindView(R.id.dcf0202) EditText dcf0202;
    @BindView(R.id.dcf0203) EditText dcf0203;
    @BindView(R.id.dcf03) EditText dcf03;
    @BindView(R.id.dcf04dob) DatePicker dcf04dob;
    @BindView(R.id.fldGrpdcf04a) LinearLayout fldGrpdcf04a;
    @BindView(R.id.fldGrpdcf04b) LinearLayout fldGrpdcf04b;
    @BindView(R.id.dcfAgeDob) RadioGroup dcfAgeDob;
    @BindView(R.id.dcfDob) RadioButton dcfDob;
    @BindView(R.id.dcfAge) RadioButton dcfAge;
    @BindView(R.id.dcf0401) EditText dcf0401;
    @BindView(R.id.dcf0402) EditText dcf0402;
    @BindView(R.id.dcf0403) EditText dcf0403;
    @BindView(R.id.dcf05) EditText dcf05;
    @BindView(R.id.dcf06) EditText dcf06;
    @BindView(R.id.dcf07) RadioGroup dcf07;
    @BindView(R.id.dcf0701) RadioButton dcf0701;
    @BindView(R.id.dcf0702) RadioButton dcf0702;
    @BindView(R.id.dcf0799) RadioButton dcf0799;
    @BindView(R.id.fldGrpdcf07) LinearLayout fldGrpdcf07;
    @BindView(R.id.dcf08) EditText dcf08;
    @BindView(R.id.dcf09) RadioGroup dcf09;
    @BindView(R.id.dcf0901) RadioButton dcf0901;
    @BindView(R.id.dcf0902) RadioButton dcf0902;
    @BindView(R.id.dcf0999) RadioButton dcf0999;
    @BindView(R.id.fldGrpdcf09) LinearLayout fldGrpdcf09;
    @BindView(R.id.dcf1001) CheckBox dcf1001;
    @BindView(R.id.dcf1002) CheckBox dcf1002;
    @BindView(R.id.dcf1003) CheckBox dcf1003;
    @BindView(R.id.dcf1004) CheckBox dcf1004;
    @BindView(R.id.dcf1005) CheckBox dcf1005;
    @BindView(R.id.dcf1006) CheckBox dcf1006;
    @BindView(R.id.dcf1007) CheckBox dcf1007;
    @BindView(R.id.dcf1096) CheckBox dcf1096;
    @BindView(R.id.dcf1096x) EditText dcf1096x;
    @BindView(R.id.dcf1101) CheckBox dcf1101;
    @BindView(R.id.dcf1102) CheckBox dcf1102;
    @BindView(R.id.dcf1103) CheckBox dcf1103;
    @BindView(R.id.dcf1104) CheckBox dcf1104;
    @BindView(R.id.dcf1105) CheckBox dcf1105;
    @BindView(R.id.dcf1106) CheckBox dcf1106;
    @BindView(R.id.dcf1196) CheckBox dcf1196;
    @BindView(R.id.dcf1196x) EditText dcf1196x;
    @BindView(R.id.dcf12) EditText dcf12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section F");

        dcfAgeDob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(dcfAge.isChecked()){
                    fldGrpdcf04a.setVisibility(View.GONE);
                    fldGrpdcf04b.setVisibility(View.VISIBLE);

                }
                else {
                    fldGrpdcf04a.setVisibility(View.VISIBLE);
                    fldGrpdcf04b.setVisibility(View.GONE);

                    dcf0401.setText(null);
                    dcf0402.setText(null);
                    dcf0403.setText(null);

                }
            }
        });

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
        //TODO implement

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

                startActivity(new Intent(this, SectionGActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        A
        if (dcfa.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcfa), Toast.LENGTH_SHORT).show();
            dcfa.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcfa: This data is Required!");
            return false;
        } else {
            dcfa.setError(null);
        }

//        01
        if (dcf01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf01), Toast.LENGTH_SHORT).show();
            dcf01.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf01: This data is Required!");
            return false;
        } else {
            dcf01.setError(null);
        }

//        02-01
        if (dcf0201.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf0201), Toast.LENGTH_SHORT).show();
            dcf0201.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf0201: This data is Required!");
            return false;
        } else {
            dcf0201.setError(null);
        }

//        02-02
        if (dcf0202.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf0202), Toast.LENGTH_SHORT).show();
            dcf0202.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf0202: This data is Required!");
            return false;
        } else {
            dcf0202.setError(null);
        }

//        02-03
        if (dcf0203.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf0203), Toast.LENGTH_SHORT).show();
            dcf0203.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf0203: This data is Required!");
            return false;
        } else {
            dcf0203.setError(null);
        }

//        03
        if (dcf03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf03), Toast.LENGTH_SHORT).show();
            dcf03.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf03: This data is Required!");
            return false;
        } else {
            dcf03.setError(null);
        }

//        04

        if (dcfAge.isChecked()){

//          Days
            if (dcf0401.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf04d), Toast.LENGTH_SHORT).show();
                dcf0401.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcf0401: This data is Required!");
                return false;
            } else {
                dcf0401.setError(null);
            }

            if (Integer.parseInt(dcf0401.getText().toString()) > MainApp.DAYS_LIMIT ||
                    Integer.parseInt(dcf0401.getText().toString()) < 0) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dcf04d), Toast.LENGTH_SHORT).show();
                dcf0401.setError("Invalid Data!");    // Set Error on last radio button

                Log.i(TAG, "dcf0401: Invalid Data!");
                return false;
            } else {
                dcf0401.setError(null);
            }

//            Months

            if (dcf0402.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf04m), Toast.LENGTH_SHORT).show();
                dcf0402.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcf0402: This data is Required!");
                return false;
            } else {
                dcf0402.setError(null);
            }

            if (Integer.parseInt(dcf0402.getText().toString()) > MainApp.MONTHS_LIMIT ||
                    Integer.parseInt(dcf0402.getText().toString()) < 0) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dcf04m), Toast.LENGTH_SHORT).show();
                dcf0402.setError("Invalid Data!");    // Set Error on last radio button

                Log.i(TAG, "dcf0402: Invalid Data!");
                return false;
            } else {
                dcf0402.setError(null);
            }

//              Year

            if (dcf0403.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf04y), Toast.LENGTH_SHORT).show();
                dcf0403.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcf0403: This data is Required!");
                return false;
            } else {
                dcf0403.setError(null);
            }

            if (Integer.parseInt(dcf0403.getText().toString()) < -1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dcf04y), Toast.LENGTH_SHORT).show();
                dcf0403.setError("Invalid Data!");    // Set Error on last radio button

                Log.i(TAG, "dcf0403: Invalid Data!");
                return false;
            } else {
                dcf0403.setError(null);
            }
        }

//          05
        if (dcf05.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf05), Toast.LENGTH_SHORT).show();
            dcf05.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf05: This data is Required!");
            return false;
        } else {
            dcf05.setError(null);
        }

//          06
        if (dcf06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf06), Toast.LENGTH_SHORT).show();
            dcf06.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf06: This data is Required!");
            return false;
        } else {
            dcf06.setError(null);
        }

//        07
        if (dcf07.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf07), Toast.LENGTH_SHORT).show();
            dcf0799.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf07: This data is Required!");
            return false;
        } else {
            dcf0799.setError(null);
        }

//        08
        if (dcf08.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf08), Toast.LENGTH_SHORT).show();
            dcf08.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf08: This data is Required!");
            return false;
        } else {
            dcf08.setError(null);
        }

//        09
        if (dcf09.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf09), Toast.LENGTH_SHORT).show();
            dcf0999.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf09: This data is Required!");
            return false;
        } else {
            dcf0799.setError(null);
        }

//        10
        if (dcf1001.isChecked() && dcf1002.isChecked() && dcf1003.isChecked() && dcf1004.isChecked() && dcf1005.isChecked()
                && dcf1006.isChecked() && dcf1007.isChecked() && dcf1096.isChecked()){
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf10), Toast.LENGTH_SHORT).show();
            dcf1096.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf10: This data is Required!");
            return false;
        } else {
            dcf1096.setError(null);
        }

        if (dcf1096.isChecked() && dcf1096x.getText().toString().isEmpty()){
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf10), Toast.LENGTH_SHORT).show();
            dcf1096x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf10: This data is Required!");
            return false;
        } else {
            dcf1096x.setError(null);
        }

//        11
        if (dcf1101.isChecked() && dcf1102.isChecked() && dcf1103.isChecked() && dcf1104.isChecked() && dcf1105.isChecked()
                && dcf1106.isChecked() && dcf1196.isChecked()){
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf11), Toast.LENGTH_SHORT).show();
            dcf1196.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf11: This data is Required!");
            return false;
        } else {
            dcf1196.setError(null);
        }

        if (dcf1196.isChecked() && dcf1196x.getText().toString().isEmpty()){
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf11), Toast.LENGTH_SHORT).show();
            dcf1196x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf11: This data is Required!");
            return false;
        } else {
            dcf1196x.setError(null);
        }

//        12
        if (dcf12.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf12), Toast.LENGTH_SHORT).show();
            dcf12.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf12: This data is Required!");
            return false;
        } else {
            dcf12.setError(null);
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sF = new JSONObject();

        // Edit Text

//        A
        sF.put("dcfa", dcfa.getText().toString());
//        01
        sF.put("dcf01", dcf01.getText().toString());

//        02
//        A
        sF.put("dcf0201", dcf0201.getText().toString());
//        B
        sF.put("dcf0202", dcf0202.getText().toString());
//        C
        sF.put("dcf0203", dcf0203.getText().toString());

//        03
        sF.put("dcf03", dcf03.getText().toString());

//        04
        sF.put("dcf04", new SimpleDateFormat("dd-MM-yyyy").format(dcf04dob.getCalendarView().getDate()));
        sF.put("dcf04d", dcf0401.getText().toString());
        sF.put("dcf04m", dcf0402.getText().toString());
        sF.put("dcf04y", dcf0403.getText().toString());

//        05
        sF.put("dcf05", dcf05.getText().toString());

//        06
        sF.put("dcf06", dcf06.getText().toString());

        // Radio Group

//        07
        sF.put("dcf07", dcf0701.isChecked() ? "1" : dcf0702.isChecked() ? "2"
                : dcf0799.isChecked() ? "99" : "0");

//        Edit Text

//        08
        sF.put("dcf08", dcf08.getText().toString());

//        09
        sF.put("dcf09", dcf0901.isChecked() ? "1" : dcf0902.isChecked() ? "2"
                : dcf0999.isChecked() ? "99" : "0");

//        10
        // Checkbox
        sF.put("dcf1001", dcf1001.isChecked() ? "1" : "0");
        sF.put("dcf1002", dcf1002.isChecked() ? "2" : "0");
        sF.put("dcf1003", dcf1003.isChecked() ? "3" : "0");
        sF.put("dcf1004", dcf1004.isChecked() ? "4" : "0");
        sF.put("dcf1005", dcf1005.isChecked() ? "5" : "0");
        sF.put("dcf1006", dcf1006.isChecked() ? "6" : "0");
        sF.put("dcf1007", dcf1007.isChecked() ? "7" : "0");
        sF.put("dcf1096", dcf1096.isChecked() ? "96" : "0");
//      Edit Text
        sF.put("dcf1096x", dcf1096x.getText().toString());

//        11
        // Checkbox
        sF.put("dcf1101", dcf1101.isChecked() ? "1" : "0");
        sF.put("dcf1102", dcf1102.isChecked() ? "2" : "0");
        sF.put("dcf1103", dcf1103.isChecked() ? "3" : "0");
        sF.put("dcf1104", dcf1104.isChecked() ? "4" : "0");
        sF.put("dcf1105", dcf1105.isChecked() ? "5" : "0");
        sF.put("dcf1106", dcf1106.isChecked() ? "6" : "0");
        sF.put("dcf1196", dcf1196.isChecked() ? "96" : "0");
//      Edit Text
        sF.put("dcf1196x", dcf1196x.getText().toString());

//        12
        // Edit Text
        sF.put("dcf12", dcf12.getText().toString());

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
