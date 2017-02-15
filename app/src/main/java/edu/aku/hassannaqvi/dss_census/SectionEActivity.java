package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
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

public class SectionEActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getSimpleName();
    @BindView(R.id.activity_section_e)
    RelativeLayout activitySectionE;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dce01)
    RadioGroup dce01;
    @BindView(R.id.dce0101)
    RadioButton dce0101;
    @BindView(R.id.dce0102)
    RadioButton dce0102;
    @BindView(R.id.dce0103)
    RadioButton dce0103;
    @BindView(R.id.dce0196)
    RadioButton dce0196;
    @BindView(R.id.dce0196x)
    EditText dce0196x;
    @BindView(R.id.dce02)
    RadioGroup dce02;
    @BindView(R.id.dce0201)
    RadioButton dce0201;
    @BindView(R.id.dce0202)
    RadioButton dce0202;
    @BindView(R.id.dce03)
    RadioGroup dce03;
    @BindView(R.id.dce0301)
    RadioButton dce0301;
    @BindView(R.id.dce0302)
    RadioButton dce0302;
    @BindView(R.id.dce0303)
    RadioButton dce0303;
    @BindView(R.id.dce0304)
    RadioButton dce0304;
    @BindView(R.id.dce0396)
    RadioButton dce0396;
    @BindView(R.id.dce0396x)
    EditText dce0396x;
    @BindView(R.id.dce04)
    RadioGroup dce04;
    @BindView(R.id.dce0401)
    RadioButton dce0401;
    @BindView(R.id.dce0402)
    RadioButton dce0402;
    @BindView(R.id.dce05)
    RadioGroup dce05;
    @BindView(R.id.dce0501)
    RadioButton dce0501;
    @BindView(R.id.dce0502)
    RadioButton dce0502;
    @BindView(R.id.dce0503)
    RadioButton dce0503;
    @BindView(R.id.dce0504)
    RadioButton dce0504;
    @BindView(R.id.dce0596)
    RadioButton dce0596;
    @BindView(R.id.dce0596x)
    EditText dce0596x;
    @BindView(R.id.dce0601)
    CheckBox dce0601;
    @BindView(R.id.dce0602)
    CheckBox dce0602;
    @BindView(R.id.dce0603)
    CheckBox dce0603;
    @BindView(R.id.dce0604)
    CheckBox dce0604;
    @BindView(R.id.dce0605)
    CheckBox dce0605;
    @BindView(R.id.dce0606)
    CheckBox dce0606;
    @BindView(R.id.dce0607)
    CheckBox dce0607;
    @BindView(R.id.dce0608)
    CheckBox dce0608;
    @BindView(R.id.dce0609)
    CheckBox dce0609;
    @BindView(R.id.dce0610)
    CheckBox dce0610;
    @BindView(R.id.dce0696)
    CheckBox dce0696;
    @BindView(R.id.dce0696x)
    EditText dce0696x;
    @BindView(R.id.dce07)
    RadioGroup dce07;
    @BindView(R.id.dce0701)
    RadioButton dce0701;
    @BindView(R.id.dce0702)
    RadioButton dce0702;
    @BindView(R.id.dce0799)
    RadioButton dce0799;
    @BindView(R.id.fldGrpdce07)
    LinearLayout fldGrpdce07;
    @BindView(R.id.dce08)
    RadioGroup dce08;
    @BindView(R.id.dce0801)
    RadioButton dce0801;
    @BindView(R.id.dce0802)
    RadioButton dce0802;
    @BindView(R.id.dce0899)
    RadioButton dce0899;
    @BindView(R.id.fldGrpdce08)
    LinearLayout fldGrpdce08;
    @BindView(R.id.dce09)
    RadioGroup dce09;
    @BindView(R.id.dce0901)
    RadioButton dce0901;
    @BindView(R.id.dce0902)
    RadioButton dce0902;
    @BindView(R.id.dce0903)
    RadioButton dce0903;
    @BindView(R.id.dce0904)
    RadioButton dce0904;
    @BindView(R.id.dce0905)
    RadioButton dce0905;
    @BindView(R.id.dce0906)
    RadioButton dce0906;
    @BindView(R.id.dce0999)
    RadioButton dce0999;
    @BindView(R.id.dce0996)
    RadioButton dce0996;
    @BindView(R.id.dce0996x)
    EditText dce0996x;
    @BindView(R.id.dce1001)
    EditText dce1001;
    @BindView(R.id.dce1002)
    EditText dce1002;
    @BindView(R.id.dce1003)
    EditText dce1003;
    @BindView(R.id.dce1004)
    EditText dce1004;
    @BindView(R.id.dce1005)
    EditText dce1005;
    @BindView(R.id.dce1006)
    EditText dce1006;
    @BindView(R.id.dce1007)
    EditText dce1007;
    @BindView(R.id.dce1008)
    EditText dce1008;
    @BindView(R.id.dce1009)
    EditText dce1009;
    @BindView(R.id.dce1010)
    EditText dce1010;
    @BindView(R.id.dce1011)
    EditText dce1011;
    @BindView(R.id.dce1012)
    EditText dce1012;
    @BindView(R.id.dce1013)
    EditText dce1013;
    @BindView(R.id.dce1014)
    EditText dce1014;
    @BindView(R.id.dce1015)
    EditText dce1015;
    @BindView(R.id.dce1016)
    EditText dce1016;
    @BindView(R.id.dce1017)
    EditText dce1017;
    @BindView(R.id.dce1018)
    EditText dce1018;
    @BindView(R.id.dce1019)
    EditText dce1019;
    @BindView(R.id.dce1020)
    EditText dce1020;
    @BindView(R.id.dce1021)
    EditText dce1021;
    @BindView(R.id.dce1022)
    EditText dce1022;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section E: Hand Washing");

        // ========================= Q 1 Others============================
        dce01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dce0196.getId()) {

                    dce0196x.setVisibility(View.VISIBLE);
                    dce0196x.requestFocus();

                } else {

                    dce0196x.setVisibility(View.GONE);
                    dce0196x.setText(null);
                }
            }
        });

        // ========================= Q 3 Others============================
        dce03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dce0396.getId()) {

                    dce0396x.setVisibility(View.VISIBLE);
                    dce0396x.requestFocus();

                } else {

                    dce0396x.setVisibility(View.GONE);
                    dce0396x.setText(null);
                }
            }
        });

        // ========================= Q 5 Others============================
        dce05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dce0596.getId()) {

                    dce0596x.setVisibility(View.VISIBLE);
                    dce0596x.requestFocus();

                } else {

                    dce0596x.setVisibility(View.GONE);
                    dce0596x.setText(null);
                }
            }
        });

        //==================================== Q 6 others ==============================
        dce0696.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dce0696x.setVisibility(View.VISIBLE);
                    dce0696x.requestFocus();
                } else {
                    dce0696x.setVisibility(View.GONE);
                    dce0696x.setText(null);

                }
            }
        });


        // ========================= Q 9 Others============================
        dce09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dce0996.getId()) {

                    dce0996x.setVisibility(View.VISIBLE);
                    dce0996x.requestFocus();

                } else {

                    dce0996x.setVisibility(View.GONE);
                    dce0996x.setText(null);
                }
            }
        });


        //============ Skip Pattern Q7 ===================

        dce07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dce0701.isChecked()) {
                    fldGrpdce07.setVisibility(View.VISIBLE);
                    fldGrpdce08.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdce07.setVisibility(View.GONE);
                    fldGrpdce08.setVisibility(View.GONE);
                    dce08.clearCheck();
                    dce09.clearCheck();
                    dce0996x.setText(null);

                }
            }
        });

        //============ Skip Pattern Q8 ===================

        dce08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dce0801.isChecked()) {
                    fldGrpdce08.setVisibility(View.GONE);
                    dce09.clearCheck();
                    dce0996x.setText(null);
                } else {
                    fldGrpdce08.setVisibility(View.VISIBLE);
                }
            }
        });



    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

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

                Intent secNext = new Intent(this, SectionFActivity.class);
                startActivity(secNext);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

    }


    private boolean UpdateDB() {
        //SRCDBHelper db = new SRCDBHelper(this);

        //int updcount = db.updateSe();

//        if (updcount == 1) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
//            return true;
//        } else {
//            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
//            return false;
//        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject se = new JSONObject();

        // Radio Group
        se.put("dce01", dce0101.isChecked() ? "1" : dce0102.isChecked() ? "2" : dce0103.isChecked() ? "3"
                : dce0196.isChecked() ? "96" : "0");
        // Edit Text
        se.put("dce0196x", dce0196x.getText().toString());
        // Radio Group
        se.put("dce02", dce0201.isChecked() ? "1" : dce0202.isChecked() ? "2" : "0");
        // Radio Group
        se.put("dce03", dce0301.isChecked() ? "1" : dce0302.isChecked() ? "2" : dce0303.isChecked() ? "3"
                : dce0304.isChecked() ? "4" : dce0396.isChecked() ? "96" : "0");
        // Edit Text
        se.put("dce0396x", dce0396x.getText().toString());
        se.put("dce03", dce0301.isChecked() ? "1" : dce0302.isChecked() ? "2" : "0");
        se.put("dce04", dce0401.isChecked() ? "1" : dce0402.isChecked() ? "2" : "0");
        se.put("dce05", dce0501.isChecked() ? "1" : dce0502.isChecked() ? "2" : dce0503.isChecked() ? "3"
                : dce0504.isChecked() ? "4" : dce0596.isChecked() ? "96" : "0");
        // Edit Text
        se.put("dce0496x", dce0596x.getText().toString());
        // Checkbox
        se.put("dce0601", dce0601.isChecked() ? "1" : "0");
        se.put("dce0602", dce0602.isChecked() ? "1" : "0");
        se.put("dce0603", dce0603.isChecked() ? "1" : "0");
        se.put("dce0604", dce0604.isChecked() ? "1" : "0");
        se.put("dce0605", dce0605.isChecked() ? "1" : "0");
        se.put("dce0606", dce0606.isChecked() ? "1" : "0");
        se.put("dce0607", dce0607.isChecked() ? "1" : "0");
        se.put("dce0608", dce0608.isChecked() ? "1" : "0");
        se.put("dce0609", dce0609.isChecked() ? "1" : "0");
        se.put("dce0610", dce0610.isChecked() ? "1" : "0");
        se.put("dce0696", dce0696.isChecked() ? "1" : "0");
        // Edit Text
        se.put("dce0696x", dce0696x.getText().toString());
        // Radio Group
        se.put("dce07", dce0701.isChecked() ? "1" : dce0702.isChecked() ? "2" : dce0799.isChecked() ? "99" : "0");
        // Radio Group
        se.put("dce08", dce0801.isChecked() ? "1" : dce0802.isChecked() ? "2" : dce0899.isChecked() ? "99" : "0");
        // Radio Group
        se.put("dce09", dce0901.isChecked() ? "1" : dce0902.isChecked() ? "2" : dce0903.isChecked() ? "3"
                : dce0904.isChecked() ? "4" : dce0905.isChecked() ? "5" : dce0906.isChecked() ? "6"
                : dce0996.isChecked() ? "96" : dce0999.isChecked() ? "99" : "0");
        // Edit Text
        se.put("dce0996x", dce0996x.getText().toString());
        // Edit Text
        se.put("dce1001", dce1001.getText().toString());
        se.put("dce1002", dce1002.getText().toString());
        se.put("dce1003", dce1003.getText().toString());
        se.put("dce1004", dce1004.getText().toString());
        se.put("dce1005", dce1005.getText().toString());
        se.put("dce1006", dce1006.getText().toString());
        se.put("dce1007", dce1007.getText().toString());
        se.put("dce1008", dce1008.getText().toString());
        se.put("dce1009", dce1009.getText().toString());
        se.put("dce1010", dce1010.getText().toString());
        se.put("dce1011", dce1011.getText().toString());
        se.put("dce1012", dce1012.getText().toString());
        se.put("dce1013", dce1013.getText().toString());
        se.put("dce1011", dce1011.getText().toString());
        se.put("dce1012", dce1012.getText().toString());
        se.put("dce1013", dce1013.getText().toString());
        se.put("dce1014", dce1014.getText().toString());
        se.put("dce1015", dce1015.getText().toString());
        se.put("dce1016", dce1016.getText().toString());
        se.put("dce1017", dce1017.getText().toString());
        se.put("dce1018", dce1018.getText().toString());
        se.put("dce1019", dce1019.getText().toString());
        se.put("dce1020", dce1020.getText().toString());
        se.put("dce1021", dce1021.getText().toString());
        se.put("dce1022", dce1022.getText().toString());

        //DCEApp.fc.setROW_Se(String.valueOf(se));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();


    }

    public boolean formValidation() {

        // ====================== Q 1 ==============

        if (dce0196.isChecked()) {
            if (dce0196x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce01), Toast.LENGTH_SHORT).show();
                dce0196x.setError("This data is Required!");
                Log.i(TAG, "dce0196x: This data is Required!");
                return false;
            } else {
                dce0196x.setError(null);
            }
        }

        if (dce01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce01), Toast.LENGTH_SHORT).show();
            dce0196.setError("This data is Required!");
            Log.i(TAG, "dce01: This data is Required!");
            return false;
        } else {
            dce0196.setError(null);
        }

        // ======================  Q 2 =================

        if (dce02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce02), Toast.LENGTH_SHORT).show();
            dce0202.setError("This data is Required!");
            Log.i(TAG, "dce02: This data is Required!");
            return false;
        } else {
            dce0202.setError(null);
        }

        // ======================  Q 3 =================

        if (dce03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce03), Toast.LENGTH_SHORT).show();
            dce0396.setError("This data is Required!");
            Log.i(TAG, "dce03: This data is Required!");
            return false;
        } else {
            dce0396.setError(null);
        }

        if (dce0396.isChecked()) {
            if (dce0396x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce03), Toast.LENGTH_SHORT).show();
                dce0396x.setError("This data is Required!");
                Log.i(TAG, "dce0396x: This data is Required!");
                return false;
            } else {
                dce0396x.setError(null);
            }
        }

        // ============== Q 6 ===============

        //  CheckBox
        if (!(dce0601.isChecked() || dce0602.isChecked() || dce0603.isChecked() || dce0604.isChecked()
                || dce0605.isChecked() || dce0606.isChecked() || dce0607.isChecked() || dce0608.isChecked()
                || dce0609.isChecked() || dce0610.isChecked() || dce0696.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce06), Toast.LENGTH_LONG).show();
            dce0696.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dce06: This data is Required!");

            return false;
        } else {
            dce0196.setError(null);
        }

        // Others
        if (dce0696.isChecked() && dce0696x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce06) + " - " + getString(R.string.dcother), Toast.LENGTH_LONG).show();
            dce0696x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dce0696x: This data is Required!");
            return false;
        } else {
            dce0696x.setError(null);
        }

        // ======================  Q 7 =================

        if (dce07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce07), Toast.LENGTH_SHORT).show();
            dce0799.setError("This data is Required!");
            Log.i(TAG, "dce07: This data is Required!");
            return false;
        } else {
            dce0799.setError(null);
        }

        // ======================  Q 8 =================
        if (dce0701.isChecked()) {
            if (dce08.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce08), Toast.LENGTH_SHORT).show();
                dce0899.setError("This data is Required!");
                Log.i(TAG, "dce08: This data is Required!");
                return false;
            } else {
                dce0899.setError(null);
            }

            // ======================  Q 9 =================
            if (dce0801.isChecked() || dce0899.isChecked()) {
                if (dce09.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce09), Toast.LENGTH_SHORT).show();
                    dce0999.setError("This data is Required!");
                    Log.i(TAG, "dce09: This data is Required!");
                    return false;
                } else {
                    dce0999.setError(null);
                }

                // Others
                if (dce0996.isChecked() && dce0996x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce09) + " - " + getString(R.string.dcother), Toast.LENGTH_LONG).show();
                    dce0996x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "dce0996x: This data is Required!");
                    return false;
                } else {
                    dce0996x.setError(null);
                }
            }
        }

        // ======================  Q 10 =================

        if (dce1001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1001), Toast.LENGTH_LONG).show();
            dce1001.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1001: This data is Required!");
            return false;
        } else {
            dce1001.setError(null);
        }

        if (dce1002.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1002), Toast.LENGTH_LONG).show();
            dce1002.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1002: This data is Required!");
            return false;
        } else {
            dce1002.setError(null);
        }

        if (dce1003.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1003), Toast.LENGTH_LONG).show();
            dce1003.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1003: This data is Required!");
            return false;
        } else {
            dce1003.setError(null);
        }

        if (dce1004.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1004), Toast.LENGTH_LONG).show();
            dce1004.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1004: This data is Required!");
            return false;
        } else {
            dce1004.setError(null);
        }

        if (dce1005.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1005), Toast.LENGTH_LONG).show();
            dce1005.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1005: This data is Required!");
            return false;
        } else {
            dce1005.setError(null);
        }

        if (dce1006.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1006), Toast.LENGTH_LONG).show();
            dce1006.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1006: This data is Required!");
            return false;
        } else {
            dce1006.setError(null);
        }

        if (dce1007.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1007), Toast.LENGTH_LONG).show();
            dce1007.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1007: This data is Required!");
            return false;
        } else {
            dce1007.setError(null);
        }

        if (dce1008.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1008), Toast.LENGTH_LONG).show();
            dce1008.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1008: This data is Required!");
            return false;
        } else {
            dce1008.setError(null);
        }

        if (dce1009.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1009), Toast.LENGTH_LONG).show();
            dce1009.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1009: This data is Required!");
            return false;
        } else {
            dce1009.setError(null);
        }

        if (dce1010.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1010), Toast.LENGTH_LONG).show();
            dce1010.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1010: This data is Required!");
            return false;
        } else {
            dce1010.setError(null);
        }

        if (dce1011.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1011), Toast.LENGTH_LONG).show();
            dce1011.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1011: This data is Required!");
            return false;
        } else {
            dce1011.setError(null);
        }

        if (dce1012.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1012), Toast.LENGTH_LONG).show();
            dce1012.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1012: This data is Required!");
            return false;
        } else {
            dce1012.setError(null);
        }

        if (dce1013.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1013), Toast.LENGTH_LONG).show();
            dce1013.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1013: This data is Required!");
            return false;
        } else {
            dce1013.setError(null);
        }

        if (dce1014.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1014), Toast.LENGTH_LONG).show();
            dce1014.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1014: This data is Required!");
            return false;
        } else {
            dce1014.setError(null);
        }

        if (dce1015.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1015), Toast.LENGTH_LONG).show();
            dce1015.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1015: This data is Required!");
            return false;
        } else {
            dce1015.setError(null);
        }

        if (dce1016.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1016), Toast.LENGTH_LONG).show();
            dce1016.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1016: This data is Required!");
            return false;
        } else {
            dce1016.setError(null);
        }

        if (dce1017.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1017), Toast.LENGTH_LONG).show();
            dce1017.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1017: This data is Required!");
            return false;
        } else {
            dce1017.setError(null);
        }

        if (dce1018.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1018), Toast.LENGTH_LONG).show();
            dce1018.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1018: This data is Required!");
            return false;
        } else {
            dce1018.setError(null);
        }

        if (dce1019.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1019), Toast.LENGTH_LONG).show();
            dce1019.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1019: This data is Required!");
            return false;
        } else {
            dce1019.setError(null);
        }

        if (dce1020.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1020), Toast.LENGTH_LONG).show();
            dce1020.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1020: This data is Required!");
            return false;
        } else {
            dce1020.setError(null);
        }

        if (dce1021.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1021), Toast.LENGTH_LONG).show();
            dce1021.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1021: This data is Required!");
            return false;
        } else {
            dce1021.setError(null);
        }

        if (dce1022.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce1022), Toast.LENGTH_LONG).show();
            dce1022.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce1022: This data is Required!");
            return false;
        } else {
            dce1022.setError(null);
        }


        return true;
    }

//    @Override
//    public void onBackPressed() {
//        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
//    }

}

