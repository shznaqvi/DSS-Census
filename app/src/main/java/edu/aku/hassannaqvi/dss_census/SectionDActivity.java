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
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionDActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_d)
    FrameLayout activitySectionD;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dcd01a)
    RadioGroup dcd01a;
    @BindView(R.id.dcd01a01)
    RadioButton dcd01a01;
    @BindView(R.id.dcd01a02)
    RadioButton dcd01a02;
    @BindView(R.id.dcd01a03)
    RadioButton dcd01a03;
    @BindView(R.id.dcd01a04)
    RadioButton dcd01a04;
    @BindView(R.id.dcd01a05)
    RadioButton dcd01a05;
    @BindView(R.id.dcd01a06)
    RadioButton dcd01a06;
    @BindView(R.id.dcd01a96)
    RadioButton dcd01a96;
    @BindView(R.id.dcd01a96x)
    EditText dcd01a96x;
    @BindView(R.id.dcd01b)
    RadioGroup dcd01b;
    @BindView(R.id.dcd01b01)
    RadioButton dcd01b01;
    @BindView(R.id.dcd01b02)
    RadioButton dcd01b02;
    @BindView(R.id.dcd01b03)
    RadioButton dcd01b03;
    @BindView(R.id.dcd01b04)
    RadioButton dcd01b04;
    @BindView(R.id.dcd01b05)
    RadioButton dcd01b05;
    @BindView(R.id.dcd01b06)
    RadioButton dcd01b06;
    @BindView(R.id.dcd01b96)
    RadioButton dcd01b96;
    @BindView(R.id.dcd01b96x)
    EditText dcd01b96x;
    @BindView(R.id.dcd01c)
    RadioGroup dcd01c;
    @BindView(R.id.dcd01c01)
    RadioButton dcd01c01;
    @BindView(R.id.dcd01c02)
    RadioButton dcd01c02;
    @BindView(R.id.dcd01c03)
    RadioButton dcd01c03;
    @BindView(R.id.dcd01c04)
    RadioButton dcd01c04;
    @BindView(R.id.dcd01c96)
    RadioButton dcd01c96;
    @BindView(R.id.dcd01c96x)
    EditText dcd01c96x;
    @BindView(R.id.dcd02)
    EditText dcd02;
    @BindView(R.id.dcd03)
    RadioGroup dcd03;
    @BindView(R.id.dcd0301)
    RadioButton dcd0301;
    @BindView(R.id.dcd0302)
    RadioButton dcd0302;
    @BindView(R.id.dcd04)
    RadioGroup dcd04;
    @BindView(R.id.dcd0401)
    RadioButton dcd0401;
    @BindView(R.id.dcd0402)
    RadioButton dcd0402;
    @BindView(R.id.dcd0403)
    RadioButton dcd0403;
    @BindView(R.id.dcd0404)
    RadioButton dcd0404;
    @BindView(R.id.dcd0405)
    RadioButton dcd0405;
    @BindView(R.id.dcd0406)
    RadioButton dcd0406;
    @BindView(R.id.dcd0407)
    RadioButton dcd0407;
    @BindView(R.id.dcd0496)
    RadioButton dcd0496;
    @BindView(R.id.dcd0496x)
    EditText dcd0496x;
    @BindView(R.id.dcd05)
    RadioGroup dcd05;
    @BindView(R.id.dcd0501)
    RadioButton dcd0501;
    @BindView(R.id.dcd0502)
    RadioButton dcd0502;
    @BindView(R.id.dcd0599)
    RadioButton dcd0599;
    @BindView(R.id.dcd0601)
    CheckBox dcd0601;
    @BindView(R.id.dcd0602)
    CheckBox dcd0602;
    @BindView(R.id.dcd0603)
    CheckBox dcd0603;
    @BindView(R.id.dcd0604)
    CheckBox dcd0604;
    @BindView(R.id.dcd0688)
    CheckBox dcd0688;
    @BindView(R.id.dcd07)
    RadioGroup dcd07;
    @BindView(R.id.dcd0701)
    RadioButton dcd0701;
    @BindView(R.id.dcd0702)
    RadioButton dcd0702;
    @BindView(R.id.dcd0703)
    RadioButton dcd0703;
    @BindView(R.id.dcd0704)
    RadioButton dcd0704;
    @BindView(R.id.dcd0705)
    RadioButton dcd0705;
    @BindView(R.id.dcd0706)
    RadioButton dcd0706;
    @BindView(R.id.dcd0707)
    RadioButton dcd0707;
    @BindView(R.id.dcd0708)
    RadioButton dcd0708;
    @BindView(R.id.dcd0709)
    RadioButton dcd0709;
    @BindView(R.id.dcd0710)
    RadioButton dcd0710;
    @BindView(R.id.dcd0796)
    RadioButton dcd0796;
    @BindView(R.id.dcd0796x)
    EditText dcd0796x;
    @BindView(R.id.dcd08)
    RadioGroup dcd08;
    @BindView(R.id.dcd0801)
    RadioButton dcd0801;
    @BindView(R.id.dcd0802)
    RadioButton dcd0802;
    @BindView(R.id.dcd0899)
    RadioButton dcd0899;
    @BindView(R.id.dcd09)
    RadioGroup dcd09;
    @BindView(R.id.dcd0901)
    RadioButton dcd0901;
    @BindView(R.id.dcd0902)
    RadioButton dcd0902;
    @BindView(R.id.dcd0903)
    RadioButton dcd0903;
    @BindView(R.id.dcd0904)
    RadioButton dcd0904;
    @BindView(R.id.dcd0905)
    RadioButton dcd0905;
    @BindView(R.id.dcd0906)
    RadioButton dcd0906;
    @BindView(R.id.dcd0907)
    RadioButton dcd0907;
    @BindView(R.id.dcd0996)
    RadioButton dcd0996;
    @BindView(R.id.dcd0996x)
    EditText dcd0996x;
    @BindView(R.id.dcd10)
    RadioGroup dcd10;
    @BindView(R.id.dcd1001)
    RadioButton dcd1001;
    @BindView(R.id.dcd1002)
    RadioButton dcd1002;
    @BindView(R.id.dcd1003)
    RadioButton dcd1003;
    @BindView(R.id.dcd1004)
    RadioButton dcd1004;
    @BindView(R.id.dcd1005)
    RadioButton dcd1005;
    @BindView(R.id.dcd1006)
    RadioButton dcd1006;
    @BindView(R.id.dcd1007)
    RadioButton dcd1007;
    @BindView(R.id.dcd1096)
    RadioButton dcd1096;
    @BindView(R.id.dcd1096x)
    EditText dcd1096x;
    @BindView(R.id.dcd11)
    RadioGroup dcd11;
    @BindView(R.id.dcd1101)
    RadioButton dcd1101;
    @BindView(R.id.dcd1102)
    RadioButton dcd1102;
    @BindView(R.id.dcd1199)
    RadioButton dcd1199;
    @BindView(R.id.dcd12)
    RadioGroup dcd12;
    @BindView(R.id.dcd1201)
    RadioButton dcd1201;
    @BindView(R.id.dcd1202)
    RadioButton dcd1202;
    @BindView(R.id.dcd1203)
    RadioButton dcd1203;
    @BindView(R.id.dcd1204)
    RadioButton dcd1204;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section D");

        dcd0688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    dcd0601.setChecked(false);
                    dcd0601.setEnabled(false);
                    dcd0602.setChecked(false);
                    dcd0602.setEnabled(false);
                    dcd0603.setChecked(false);
                    dcd0603.setEnabled(false);
                    dcd0604.setChecked(false);
                    dcd0604.setEnabled(false);
                }else {
                    dcd0601.setEnabled(true);
                    dcd0602.setEnabled(true);
                    dcd0603.setEnabled(true);
                    dcd0604.setEnabled(true);
                }
            }
        });

        // ========================= Q 1.a Others============================
        dcd01a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd01a96.getId()) {

                    dcd01a96x.setVisibility(View.VISIBLE);
                    dcd01a96x.requestFocus();

                } else {

                    dcd01a96x.setVisibility(View.GONE);
                    dcd01a96x.setText(null);
                }
            }
        });

        // ========================= Q 1.b Others============================
        dcd01b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd01b96.getId()) {

                    dcd01b96x.setVisibility(View.VISIBLE);
                    dcd01b96x.requestFocus();

                } else {

                    dcd01b96x.setVisibility(View.GONE);
                    dcd01b96x.setText(null);
                }
            }
        });


        // ========================= Q 1.c Others============================
        dcd01c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd01c96.getId()) {

                    dcd01c96x.setVisibility(View.VISIBLE);
                    dcd01c96x.requestFocus();

                } else {

                    dcd01c96x.setVisibility(View.GONE);
                    dcd01c96x.setText(null);
                }
            }
        });
        // ========================= Q 4 Others============================
        dcd04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd0496.getId()) {

                    dcd0496x.setVisibility(View.VISIBLE);
                    dcd0496x.requestFocus();

                } else {

                    dcd0496x.setVisibility(View.GONE);
                    dcd0496x.setText(null);
                }
            }
        });
        // ========================= Q 7 Others============================
        dcd07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd0796.getId()) {

                    dcd0796x.setVisibility(View.VISIBLE);
                    dcd0796x.requestFocus();

                } else {

                    dcd0796x.setVisibility(View.GONE);
                    dcd0796x.setText(null);
                }
            }
        });
        // ========================= Q 9 Others============================
        dcd09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd0996.getId()) {

                    dcd0996x.setVisibility(View.VISIBLE);
                    dcd0996x.requestFocus();

                } else {

                    dcd0996x.setVisibility(View.GONE);
                    dcd0996x.setText(null);
                }
            }
        });

        // ========================= Q 10 Others============================
        dcd10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd1096.getId()) {

                    dcd1096x.setVisibility(View.VISIBLE);
                    dcd1096x.requestFocus();

                } else {

                    dcd1096x.setVisibility(View.GONE);
                    dcd1096x.setText(null);
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

                Intent secNext = new Intent(this, SectionEActivity.class);
                startActivity(secNext);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

    }

    public boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01

//        A

        if (dcd01a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd01a), Toast.LENGTH_SHORT).show();
            dcd01a96.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd01a: This data is Required!");
            return false;
        } else {
            dcd01a96.setError(null);
        }

        if (dcd01a96.isChecked() && dcd01a96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd01a), Toast.LENGTH_SHORT).show();
            dcd01a96x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd01a96: This data is Required!");
            return false;
        } else {
            dcd01a96x.setError(null);
        }

//        B

        if (dcd01b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd01b), Toast.LENGTH_SHORT).show();
            dcd01b96.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd01b: This data is Required!");
            return false;
        } else {
            dcd01b96.setError(null);
        }

        if (dcd01b96.isChecked() && dcd01b96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd01b), Toast.LENGTH_SHORT).show();
            dcd01b96x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd01b96: This data is Required!");
            return false;
        } else {
            dcd01a96x.setError(null);
        }

//        C

        if (dcd01c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd01c), Toast.LENGTH_SHORT).show();
            dcd01c96.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd01c96: This data is Required!");
            return false;
        } else {
            dcd01c96.setError(null);
        }

        if (dcd01c96.isChecked() && dcd01c96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd01c), Toast.LENGTH_SHORT).show();
            dcd01c96x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd01c96: This data is Required!");
            return false;
        } else {
            dcd01a96x.setError(null);
        }

//        02

        if (dcd02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd02), Toast.LENGTH_SHORT).show();
            dcd02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd02: This data is Required!");
            return false;
        } else {
            dcd02.setError(null);
        }

//        03

        if (dcd03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd03), Toast.LENGTH_SHORT).show();
            dcd0301.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd03: This data is Required!");
            return false;
        } else {
            dcd0301.setError(null);
        }

//        04

        if (dcd04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04), Toast.LENGTH_SHORT).show();
            dcd0496.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd04: This data is Required!");
            return false;
        } else {
            dcd0496.setError(null);
        }

        if (dcd0496.isChecked() && dcd0496x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04), Toast.LENGTH_SHORT).show();
            dcd0496x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd0496: This data is Required!");
            return false;
        } else {
            dcd0496x.setError(null);
        }

//        05

        if (dcd05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd05), Toast.LENGTH_SHORT).show();
            dcd0599.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd04: This data is Required!");
            return false;
        } else {
            dcd0599.setError(null);
        }

//        06
        if (!dcd0601.isChecked() && !dcd0602.isChecked() && !dcd0603.isChecked() && !dcd0604.isChecked()
                && !dcd0688.isChecked()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd06), Toast.LENGTH_LONG).show();
            dcd0688.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0531: This data is Required!");
            return false;
        } else {
            dcd0688.setError(null);
        }

//        07
        if (dcd07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd07), Toast.LENGTH_SHORT).show();
            dcd0796.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd07: This data is Required!");
            return false;
        } else {
            dcd0796.setError(null);
        }

        if (dcd0796.isChecked() && dcd0796x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd07), Toast.LENGTH_SHORT).show();
            dcd0796x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd0796: This data is Required!");
            return false;
        } else {
            dcd0796x.setError(null);
        }

//        08
        if (dcd08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd08), Toast.LENGTH_SHORT).show();
            dcd0899.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd08: This data is Required!");
            return false;
        } else {
            dcd0899.setError(null);
        }

//        09

        if (dcd09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd09), Toast.LENGTH_SHORT).show();
            dcd0996.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd09: This data is Required!");
            return false;
        } else {
            dcd0996.setError(null);
        }

        if (dcd0996.isChecked() && dcd0996x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd09), Toast.LENGTH_SHORT).show();
            dcd0996x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd0996: This data is Required!");
            return false;
        } else {
            dcd0996x.setError(null);
        }

//        10

        if (dcd10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd10), Toast.LENGTH_SHORT).show();
            dcd1096.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd10: This data is Required!");
            return false;
        } else {
            dcd1096.setError(null);
        }

        if (dcd1096.isChecked() && dcd1096x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd10), Toast.LENGTH_SHORT).show();
            dcd1096x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd0996: This data is Required!");
            return false;
        } else {
            dcd1096x.setError(null);
        }

//        11
        if (dcd11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd11), Toast.LENGTH_SHORT).show();
            dcd1199.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd11: This data is Required!");
            return false;
        } else {
            dcd1199.setError(null);
        }

//        12
        if (dcd12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd12), Toast.LENGTH_SHORT).show();
            dcd1204.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd12: This data is Required!");
            return false;
        } else {
            dcd1204.setError(null);
        }

        return true;
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

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sE = new JSONObject();

        // Radio Group

//        01 A
        sE.put("dcd01a", dcd01a01.isChecked() ? "1" : dcd01a02.isChecked() ? "2" : dcd01a03.isChecked() ? "3"
                : dcd01a04.isChecked() ? "4" : dcd01a05.isChecked() ? "5" : dcd01a06.isChecked() ? "6"
                : dcd01a96.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dcd01a96x", dcd01a96x.getText().toString());

//        01 B
        sE.put("dcd01b", dcd01b01.isChecked() ? "1" : dcd01b02.isChecked() ? "2" : dcd01b03.isChecked() ? "3"
                : dcd01b04.isChecked() ? "4" : dcd01b05.isChecked() ? "5" : dcd01b06.isChecked() ? "6"
                : dcd01b96.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dcd01b96x", dcd01b96x.getText().toString());

//        01 C
        sE.put("dcd01c", dcd01c01.isChecked() ? "1" : dcd01c02.isChecked() ? "2" : dcd01c03.isChecked() ? "3"
                : dcd01c04.isChecked() ? "4" : dcd01c96.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dcd01c96x", dcd01c96x.getText().toString());

//        02
        sE.put("dcd02", dcd02.getText().toString());

//        03
        sE.put("dcd03", dcd0301.isChecked() ? "1" : dcd0302.isChecked() ? "2" : "0");

//        04
        sE.put("dcd04", dcd0401.isChecked() ? "1" : dcd0402.isChecked() ? "2" : dcd0403.isChecked() ? "3"
                : dcd0404.isChecked() ? "4" : dcd0405.isChecked() ? "4" : dcd0406.isChecked() ? "4" :
                dcd0407.isChecked() ? "4" : dcd0496.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dcd0496x", dcd0496x.getText().toString());

//        05
        sE.put("dcd05", dcd0501.isChecked() ? "1" : dcd0502.isChecked() ? "2" : dcd0599.isChecked() ? "99" : "0");

//        06
        // Checkbox
        sE.put("dcd0601", dcd0601.isChecked() ? "1" : "0");
        sE.put("dcd0602", dcd0602.isChecked() ? "2" : "0");
        sE.put("dcd0603", dcd0603.isChecked() ? "3" : "0");
        sE.put("dcd0604", dcd0604.isChecked() ? "4" : "0");
        sE.put("dcd0688", dcd0688.isChecked() ? "88" : "0");

//        07
        sE.put("dcd07", dcd0701.isChecked() ? "1" : dcd0702.isChecked() ? "2" : dcd0703.isChecked() ? "3"
                : dcd0704.isChecked() ? "4" : dcd0705.isChecked() ? "5" : dcd0706.isChecked() ? "6" :
                dcd0707.isChecked() ? "7" : dcd0708.isChecked() ? "8" : dcd0709.isChecked() ? "9"
                        : dcd0710.isChecked() ? "10" : dcd0496.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dcd0796x", dcd0796x.getText().toString());

//        08
        sE.put("dcd08", dcd0801.isChecked() ? "1" : dcd0802.isChecked() ? "2" : dcd0899.isChecked() ? "99" : "0");

//        09
        sE.put("dcd09", dcd0901.isChecked() ? "1" : dcd0902.isChecked() ? "2" : dcd0903.isChecked() ? "3"
                : dcd0904.isChecked() ? "4" : dcd0905.isChecked() ? "5" : dcd0906.isChecked() ? "6" :
                dcd0907.isChecked() ? "7" : dcd0996.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dcd0996x", dcd0996x.getText().toString());

//        10
        sE.put("dcd10", dcd1001.isChecked() ? "1" : dcd1002.isChecked() ? "2" : dcd1003.isChecked() ? "3"
                : dcd1004.isChecked() ? "4" : dcd1005.isChecked() ? "5" : dcd1006.isChecked() ? "6" :
                dcd1007.isChecked() ? "7" : dcd1096.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dcd1096x", dcd1096x.getText().toString());

//        11
        sE.put("dcd11", dcd1101.isChecked() ? "1" : dcd1102.isChecked() ? "2" : dcd1199.isChecked() ? "99" : "0");

//        12
        sE.put("dcd12", dcd1201.isChecked() ? "1" : dcd1202.isChecked() ? "2" : dcd1203.isChecked() ? "3"
                : dcd1204.isChecked() ? "4" : "0");

//        MainApp.fc.setROW_sE(String.valueOf(sE));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

}
