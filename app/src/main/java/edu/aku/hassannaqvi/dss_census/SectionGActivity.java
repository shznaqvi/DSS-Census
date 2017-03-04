package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
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

public class SectionGActivity extends Activity {

    private static final String TAG = SectionGActivity.class.getSimpleName();

    @BindView(R.id.activity_sectionG)
    RelativeLayout activitySectionG;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dcg01)
    RadioGroup dcg01;
    @BindView(R.id.dcg0101)
    RadioButton dcg0101;
    @BindView(R.id.dcg0102)
    RadioButton dcg0102;
    @BindView(R.id.dcg02)
    RadioGroup dcg02;
    @BindView(R.id.dcg0201)
    RadioButton dcg0201;
    @BindView(R.id.dcg0202)
    RadioButton dcg0202;
    @BindView(R.id.fldGrpdcg03)
    LinearLayout fldGrpdcg03;
    @BindView(R.id.dcg0301)
    CheckBox dcg0301;
    @BindView(R.id.dcg0302)
    CheckBox dcg0302;
    @BindView(R.id.dcg0303)
    CheckBox dcg0303;
    @BindView(R.id.dcg0304)
    CheckBox dcg0304;
    @BindView(R.id.dcg0305)
    CheckBox dcg0305;
    @BindView(R.id.dcg0306)
    CheckBox dcg0306;
    @BindView(R.id.dcg0307)
    CheckBox dcg0307;
    @BindView(R.id.dcg0308)
    CheckBox dcg0308;
    @BindView(R.id.dcg0309)
    CheckBox dcg0309;
    @BindView(R.id.dcg0310)
    CheckBox dcg0310;
    @BindView(R.id.dcg0311)
    CheckBox dcg0311;
    @BindView(R.id.dcg0312)
    CheckBox dcg0312;
    @BindView(R.id.dcg0313)
    CheckBox dcg0313;
    @BindView(R.id.dcg04)
    RadioGroup dcg04;
    @BindView(R.id.dcg0401)
    RadioButton dcg0401;
    @BindView(R.id.dcg0402)
    RadioButton dcg0402;
    @BindView(R.id.fldGrpdcg05)
    LinearLayout fldGrpdcg05;
    @BindView(R.id.dcg0501)
    CheckBox dcg0501;
    @BindView(R.id.dcg0502)
    CheckBox dcg0502;
    @BindView(R.id.dcg0503)
    CheckBox dcg0503;
    @BindView(R.id.dcg0504)
    CheckBox dcg0504;
    @BindView(R.id.dcg0505)
    CheckBox dcg0505;
    @BindView(R.id.dcg0506)
    CheckBox dcg0506;
    @BindView(R.id.dcg0507)
    CheckBox dcg0507;
    @BindView(R.id.dcg0508)
    CheckBox dcg0508;
    @BindView(R.id.dcg0509)
    CheckBox dcg0509;
    @BindView(R.id.dcg0510)
    CheckBox dcg0510;
    @BindView(R.id.dcg0511)
    CheckBox dcg0511;
    @BindView(R.id.dcg0512)
    CheckBox dcg0512;
    @BindView(R.id.dcg0513)
    CheckBox dcg0513;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section G: Family Planning");

        //================= Q2  Skip Pattern==================

        dcg02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcg0201.isChecked()) {
                    fldGrpdcg03.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcg03.setVisibility(View.GONE);
                    dcg0301.setChecked(false);
                    dcg0302.setChecked(false);
                    dcg0303.setChecked(false);
                    dcg0304.setChecked(false);
                    dcg0305.setChecked(false);
                    dcg0306.setChecked(false);
                    dcg0307.setChecked(false);
                    dcg0308.setChecked(false);
                    dcg0309.setChecked(false);
                    dcg0310.setChecked(false);
                    dcg0311.setChecked(false);
                    dcg0312.setChecked(false);
                    dcg0313.setChecked(false);
                }
            }
        });

        //================= Q 4 Skip pattern ==============

        dcg04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcg0401.isChecked()) {
                    fldGrpdcg05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcg05.setVisibility(View.GONE);
                    dcg0501.setChecked(false);
                    dcg0502.setChecked(false);
                    dcg0503.setChecked(false);
                    dcg0504.setChecked(false);
                    dcg0505.setChecked(false);
                    dcg0506.setChecked(false);
                    dcg0507.setChecked(false);
                    dcg0508.setChecked(false);
                    dcg0509.setChecked(false);
                    dcg0510.setChecked(false);
                    dcg0511.setChecked(false);
                    dcg0512.setChecked(false);
                    dcg0513.setChecked(false);

                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
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

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
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

                startActivity(new Intent(this, SectionHActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01
        if (dcg01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcg01), Toast.LENGTH_SHORT).show();
            dcg0102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg01: This data is Required!");
            return false;
        } else {
            dcg0102.setError(null);
        }

//        02
        if (dcg02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcg02), Toast.LENGTH_SHORT).show();
            dcg0202.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg02: This data is Required!");
            return false;
        } else {
            dcg0202.setError(null);
        }

//        03
        if (dcg0201.isChecked()) {
            if (!(dcg0301.isChecked() || dcg0302.isChecked() || dcg0303.isChecked() || dcg0304.isChecked() || dcg0305.isChecked()
                    || dcg0306.isChecked() || dcg0307.isChecked() || dcg0308.isChecked() || dcg0309.isChecked() || dcg0310.isChecked()
                    || dcg0311.isChecked() || dcg0312.isChecked() || dcg0313.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcg03), Toast.LENGTH_SHORT).show();
                dcg0313.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcg03: This data is Required!");
                return false;
            } else {
                dcg0313.setError(null);
            }
        }

//        04
        if (dcg04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcg04), Toast.LENGTH_SHORT).show();
            dcg0402.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg04: This data is Required!");
            return false;
        } else {
            dcg0402.setError(null);
        }

//        05
        if (dcg0401.isChecked()) {
            if (!(dcg0501.isChecked() || dcg0502.isChecked() || dcg0503.isChecked() || dcg0504.isChecked() || dcg0505.isChecked()
                    || dcg0506.isChecked() || dcg0507.isChecked() || dcg0508.isChecked() || dcg0509.isChecked() || dcg0510.isChecked()
                    || dcg0511.isChecked() || dcg0512.isChecked() || dcg0513.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcg05), Toast.LENGTH_SHORT).show();
                dcg0513.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcg05: This data is Required!");
                return false;
            } else {
                dcg0513.setError(null);
            }
        }

        return true;
    }

    private boolean UpdateDB() {
//        DatabaseHelper db = new DatabaseHelper(this);
//
//        int updcount = db.updatesE();
//
//        if (updcount == 1) {
//            Toast.makeText(this, "Updating Database... SuccessGul!", Toast.LENGTH_SHORT).show();
//            return true;
//        } else {
//            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
//            return false;
//        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sG = new JSONObject();

        // Edit Text

//        01
        sG.put("dcg01", dcg0101.isChecked() ? "1" : dcg0102.isChecked() ? "2" : "0");

//        02
        sG.put("dcg02", dcg0201.isChecked() ? "1" : dcg0202.isChecked() ? "2" : "0");

//        03
        // Checkbox
        sG.put("dcg0301", dcg0301.isChecked() ? "1" : "0");
        sG.put("dcg0302", dcg0302.isChecked() ? "2" : "0");
        sG.put("dcg0303", dcg0303.isChecked() ? "3" : "0");
        sG.put("dcg0304", dcg0304.isChecked() ? "4" : "0");
        sG.put("dcg0305", dcg0305.isChecked() ? "5" : "0");
        sG.put("dcg0306", dcg0306.isChecked() ? "6" : "0");
        sG.put("dcg0307", dcg0307.isChecked() ? "7" : "0");
        sG.put("dcg0308", dcg0308.isChecked() ? "8" : "0");
        sG.put("dcg0309", dcg0309.isChecked() ? "9" : "0");
        sG.put("dcg0310", dcg0310.isChecked() ? "10" : "0");
        sG.put("dcg0311", dcg0311.isChecked() ? "11" : "0");
        sG.put("dcg0312", dcg0312.isChecked() ? "12" : "0");
        sG.put("dcg0313", dcg0313.isChecked() ? "13" : "0");

//        04
        sG.put("dcg04", dcg0401.isChecked() ? "1" : dcg0402.isChecked() ? "2" : "0");

//        05
        // Checkbox
        sG.put("dcg0501", dcg0501.isChecked() ? "1" : "0");
        sG.put("dcg0502", dcg0502.isChecked() ? "2" : "0");
        sG.put("dcg0503", dcg0503.isChecked() ? "3" : "0");
        sG.put("dcg0504", dcg0504.isChecked() ? "4" : "0");
        sG.put("dcg0505", dcg0505.isChecked() ? "5" : "0");
        sG.put("dcg0506", dcg0506.isChecked() ? "6" : "0");
        sG.put("dcg0507", dcg0507.isChecked() ? "7" : "0");
        sG.put("dcg0508", dcg0508.isChecked() ? "8" : "0");
        sG.put("dcg0509", dcg0509.isChecked() ? "9" : "0");
        sG.put("dcg0510", dcg0510.isChecked() ? "10" : "0");
        sG.put("dcg0511", dcg0511.isChecked() ? "11" : "0");
        sG.put("dcg0512", dcg0512.isChecked() ? "12" : "0");
        sG.put("dcg0513", dcg0513.isChecked() ? "13" : "0");

//        MainApp.fc.setROW_sE(String.valueOf(sG));

        Toast.makeText(this, "Validation SuccessGul! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }
}
