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

public class SectionDActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getSimpleName();


    @BindView(R.id.dcd01)
    RadioGroup dcd01;
    @BindView(R.id.dcd0101)
    RadioButton dcd0101;
    @BindView(R.id.dcd0102)
    RadioButton dcd0102;
    @BindView(R.id.dcd0103)
    RadioButton dcd0103;
    @BindView(R.id.dcd0104)
    RadioButton dcd0104;
    @BindView(R.id.fldGrpdcd02)
    LinearLayout fldGrpdcd02;
    @BindView(R.id.dcd02)
    EditText dcd02;
    @BindView(R.id.dcd03y)
    EditText dcd03y;
    @BindView(R.id.dcd03m)
    EditText dcd03m;
    @BindView(R.id.dcd04a)
    RadioGroup dcd04a;
    @BindView(R.id.dcd04a01)
    RadioButton dcd04a01;
    @BindView(R.id.dcd04a02)
    RadioButton dcd04a02;
    @BindView(R.id.dcd04a03)
    RadioButton dcd04a03;
    @BindView(R.id.dcd04a04)
    RadioButton dcd04a04;
    @BindView(R.id.dcd04a05)
    RadioButton dcd04a05;
    @BindView(R.id.dcd04a06)
    RadioButton dcd04a06;
    @BindView(R.id.dcd04a96)
    RadioButton dcd04a96;
    @BindView(R.id.dcd04a96x)
    EditText dcd04a96x;
    @BindView(R.id.dcd04b)
    RadioGroup dcd04b;
    @BindView(R.id.dcd04b01)
    RadioButton dcd04b01;
    @BindView(R.id.dcd04b02)
    RadioButton dcd04b02;
    @BindView(R.id.dcd04b03)
    RadioButton dcd04b03;
    @BindView(R.id.dcd04b04)
    RadioButton dcd04b04;
    @BindView(R.id.dcd04b05)
    RadioButton dcd04b05;
    @BindView(R.id.dcd04b06)
    RadioButton dcd04b06;
    @BindView(R.id.dcd04b96)
    RadioButton dcd04b96;
    @BindView(R.id.dcd04b96x)
    EditText dcd04b96x;
    @BindView(R.id.dcd04c)
    RadioGroup dcd04c;
    @BindView(R.id.dcd04c01)
    RadioButton dcd04c01;
    @BindView(R.id.dcd04c02)
    RadioButton dcd04c02;
    @BindView(R.id.dcd04c03)
    RadioButton dcd04c03;
    @BindView(R.id.dcd04c04)
    RadioButton dcd04c04;
    @BindView(R.id.dcd04c96)
    RadioButton dcd04c96;
    @BindView(R.id.dcd04c96x)
    EditText dcd04c96x;
    @BindView(R.id.dcd05)
    EditText dcd05;
    @BindView(R.id.dcd06)
    RadioGroup dcd06;
    @BindView(R.id.dcd0601)
    RadioButton dcd0601;
    @BindView(R.id.dcd0602)
    RadioButton dcd0602;
    @BindView(R.id.dcd0603)
    RadioButton dcd0603;
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
    @BindView(R.id.fldGrpdcd09)
    LinearLayout fldGrpdcd09;
    @BindView(R.id.dcd0901)
    CheckBox dcd0901;
    @BindView(R.id.dcd0902)
    CheckBox dcd0902;
    @BindView(R.id.dcd0903)
    CheckBox dcd0903;
    @BindView(R.id.dcd0904)
    CheckBox dcd0904;
    @BindView(R.id.dcd0988)
    CheckBox dcd0988;
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
    @BindView(R.id.dcd1008)
    RadioButton dcd1008;
    @BindView(R.id.dcd1009)
    RadioButton dcd1009;
    @BindView(R.id.dcd1010)
    RadioButton dcd1010;
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
    @BindView(R.id.dcd1205)
    RadioButton dcd1205;
    @BindView(R.id.dcd1206)
    RadioButton dcd1206;
    @BindView(R.id.dcd1207)
    RadioButton dcd1207;
    @BindView(R.id.dcd1296)
    RadioButton dcd1296;
    @BindView(R.id.dcd1296x)
    EditText dcd1296x;
    @BindView(R.id.dcd13)
    RadioGroup dcd13;
    @BindView(R.id.dcd1301)
    RadioButton dcd1301;
    @BindView(R.id.dcd1302)
    RadioButton dcd1302;
    @BindView(R.id.dcd1303)
    RadioButton dcd1303;
    @BindView(R.id.dcd1304)
    RadioButton dcd1304;
    @BindView(R.id.dcd1305)
    RadioButton dcd1305;
    @BindView(R.id.dcd1306)
    RadioButton dcd1306;
    @BindView(R.id.dcd1307)
    RadioButton dcd1307;
    @BindView(R.id.dcd1396)
    RadioButton dcd1396;
    @BindView(R.id.dcd1396x)
    EditText dcd1396x;
    @BindView(R.id.dcd14)
    RadioGroup dcd14;
    @BindView(R.id.dcd1401)
    RadioButton dcd1401;
    @BindView(R.id.dcd1402)
    RadioButton dcd1402;
    @BindView(R.id.dcd1499)
    RadioButton dcd1499;
    @BindView(R.id.dcd15)
    RadioGroup dcd15;
    @BindView(R.id.dcd1501)
    RadioButton dcd1501;
    @BindView(R.id.dcd1502)
    RadioButton dcd1502;
    @BindView(R.id.dcd1503)
    RadioButton dcd1503;
    @BindView(R.id.dcd1504)
    RadioButton dcd1504;
    @BindView(R.id.dcd16)
    RadioGroup dcd16;
    @BindView(R.id.dcd1601)
    RadioButton dcd1601;
    @BindView(R.id.dcd1602)
    RadioButton dcd1602;
    @BindView(R.id.dcd1699)
    RadioButton dcd1699;
    @BindView(R.id.fldGrpdcd16)
    LinearLayout fldGrpdcd16;
    @BindView(R.id.dcd17)
    RadioGroup dcd17;
    @BindView(R.id.dcd1701)
    RadioButton dcd1701;
    @BindView(R.id.dcd1702)
    RadioButton dcd1702;
    @BindView(R.id.dcd1799)
    RadioButton dcd1799;
    @BindView(R.id.fldGrpdcd17)
    LinearLayout fldGrpdcd17;
    @BindView(R.id.dcd18)
    RadioGroup dcd18;
    @BindView(R.id.dcd1801)
    RadioButton dcd1801;
    @BindView(R.id.dcd1802)
    RadioButton dcd1802;
    @BindView(R.id.dcd1803)
    RadioButton dcd1803;
    @BindView(R.id.dcd1804)
    RadioButton dcd1804;
    @BindView(R.id.dcd1805)
    RadioButton dcd1805;
    @BindView(R.id.dcd1806)
    RadioButton dcd1806;
    @BindView(R.id.dcd1899)
    RadioButton dcd1899;
    @BindView(R.id.dcd1896)
    RadioButton dcd1896;
    @BindView(R.id.dcd1896x)
    EditText dcd1896x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

        dcd0988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    dcd0901.setChecked(false);
                    dcd0901.setEnabled(false);
                    dcd0902.setChecked(false);
                    dcd0902.setEnabled(false);
                    dcd0903.setChecked(false);
                    dcd0903.setEnabled(false);
                    dcd0904.setChecked(false);
                    dcd0904.setEnabled(false);
                } else {
                    dcd0901.setEnabled(true);
                    dcd0902.setEnabled(true);
                    dcd0903.setEnabled(true);
                    dcd0904.setEnabled(true);
                }
            }
        });

        // ========================= Q 1.a Others============================
        dcd04a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd04a96.getId()) {

                    dcd04a96x.setVisibility(View.VISIBLE);
                    dcd04a96x.requestFocus();

                } else {

                    dcd04a96x.setVisibility(View.GONE);
                    dcd04a96x.setText(null);
                }
            }
        });

        // ========================= Q 1.b Others============================
        dcd04b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd04b96.getId()) {

                    dcd04b96x.setVisibility(View.VISIBLE);
                    dcd04b96x.requestFocus();

                } else {

                    dcd04b96x.setVisibility(View.GONE);
                    dcd04b96x.setText(null);
                }
            }
        });


        // ========================= Q 1.c Others============================
        dcd04c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd04c96.getId()) {

                    dcd04c96x.setVisibility(View.VISIBLE);
                    dcd04c96x.requestFocus();

                } else {

                    dcd04c96x.setVisibility(View.GONE);
                    dcd04c96x.setText(null);
                }
            }
        });
        // ========================= Q 4 Others============================
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
        // ========================= Q 7 Others============================
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
        // ========================= Q 9 Others============================
        dcd12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd1296.getId()) {

                    dcd1296x.setVisibility(View.VISIBLE);
                    dcd1296x.requestFocus();

                } else {

                    dcd1296x.setVisibility(View.GONE);
                    dcd1296x.setText(null);
                }
            }
        });

        // ========================= Q 10 Others============================
        dcd13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd1396.getId()) {

                    dcd1396x.setVisibility(View.VISIBLE);
                    dcd1396x.requestFocus();

                } else {

                    dcd1396x.setVisibility(View.GONE);
                    dcd1396x.setText(null);
                }
            }
        });

        //============ Q 5 Skip Pattern =============
        dcd08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dcd0801.isChecked()) {
                    fldGrpdcd09.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcd09.setVisibility(View.GONE);
                    dcd0901.setChecked(false);
                    dcd0902.setChecked(false);
                    dcd0903.setChecked(false);
                    dcd0904.setChecked(false);
                    dcd0988.setChecked(false);


                }
            }
        });

        //=================== Q 1 Skip Pattern =============

        dcd01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dcd0101.isChecked()) {
                    fldGrpdcd02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcd02.setVisibility(View.GONE);
                    dcd02.setText(null);
                    dcd03m.setText(null);
                    dcd03y.setText(null);
                }
            }
        });

        // ========================= Q 18 Others============================
        dcd18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dcd1896.getId()) {

                    dcd1896x.setVisibility(View.VISIBLE);
                    dcd1896x.requestFocus();

                } else {

                    dcd1896x.setVisibility(View.GONE);
                    dcd1896x.setText(null);
                }
            }
        });


        //============ Skip Pattern Q16 ===================

        dcd16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcd1601.isChecked()) {
                    fldGrpdcd16.setVisibility(View.VISIBLE);
                    fldGrpdcd17.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcd16.setVisibility(View.GONE);
                    fldGrpdcd17.setVisibility(View.GONE);
                    dcd17.clearCheck();
                    dcd18.clearCheck();
                    dcd1896x.setText(null);

                }
            }
        });

        //============ Skip Pattern Q17 ===================

        dcd17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcd1701.isChecked()) {
                    fldGrpdcd17.setVisibility(View.GONE);
                    dcd18.clearCheck();
                    dcd1896x.setText(null);
                } else {
                    fldGrpdcd17.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
//        Intent end_intent = new Intent(this, EndingActivity.class);
//        end_intent.putExtra("check", false);
//        startActivity(end_intent);

        MainApp.endActivity(this,this);
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

                Intent secNext = new Intent(this, SectionEActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (dcd01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd01), Toast.LENGTH_SHORT).show();
            dcd0104.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd01: This data is Required!");
            return false;
        } else {
            dcd0104.setError(null);
        }

        if (dcd0101.isChecked()) {
            if (dcd02.getText().toString().isEmpty() || Integer.parseInt(dcd02.getText().toString().isEmpty() ? "0" : dcd02.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd02), Toast.LENGTH_SHORT).show();
                dcd02.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "dcd02: This data is Required!");
                return false;
            } else {
                dcd02.setError(null);
            }

            if ((Integer.parseInt(dcd03m.getText().toString().isEmpty() ? "0" : dcd03m.getText().toString()) == 0
                    && Integer.parseInt(dcd03y.getText().toString().isEmpty() ? "0" : dcd03y.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd03), Toast.LENGTH_SHORT).show();
                dcd03m.setError("Can not be zero");
                Log.i(TAG, "dcd03m: Can not be zero");
                return false;
            } else {
                dcd03m.setError(null);
            }

            if (dcd03y.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccey), Toast.LENGTH_SHORT).show();
                dcd03y.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dcd03y: This data is Required!");
                return false;
            } else {
                dcd03y.setError(null);
            }

            if (dcd03m.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccem), Toast.LENGTH_SHORT).show();
                dcd03m.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dcd03m: This data is Required!");
                return false;
            } else {
                dcd03m.setError(null);
            }

        }

//        01

//        A

        if (dcd04a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04a), Toast.LENGTH_SHORT).show();
            dcd04a96.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd04a: This data is Required!");
            return false;
        } else {
            dcd04a96.setError(null);
        }

        if (dcd04a96.isChecked() && dcd04a96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04a), Toast.LENGTH_SHORT).show();
            dcd04a96x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd04a96: This data is Required!");
            return false;
        } else {
            dcd04a96x.setError(null);
        }

//        B

        if (dcd04b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04b), Toast.LENGTH_SHORT).show();
            dcd04b96.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd04b: This data is Required!");
            return false;
        } else {
            dcd04b96.setError(null);
        }

        if (dcd04b96.isChecked() && dcd04b96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04b), Toast.LENGTH_SHORT).show();
            dcd04b96x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd04b96: This data is Required!");
            return false;
        } else {
            dcd04a96x.setError(null);
        }

//        C

        if (dcd04c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04c), Toast.LENGTH_SHORT).show();
            dcd04c96.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd04c96: This data is Required!");
            return false;
        } else {
            dcd04c96.setError(null);
        }

        if (dcd04c96.isChecked() && dcd04c96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd04c), Toast.LENGTH_SHORT).show();
            dcd04c96x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd04c96: This data is Required!");
            return false;
        } else {
            dcd04a96x.setError(null);
        }

//        02

        if (dcd05.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd05), Toast.LENGTH_SHORT).show();
            dcd05.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd05: This data is Required!");
            return false;
        } else {
            dcd05.setError(null);
        }

        if (Integer.parseInt(dcd05.getText().toString().isEmpty() ? "0" : dcd05.getText().toString()) < 1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd05), Toast.LENGTH_SHORT).show();
            dcd05.setError("Can not be zero");    // Set Error on last radio button

            Log.i(TAG, "dcd05: Can not be zero");
            return false;
        } else {
            dcd05.setError(null);
        }


//        03

        if (dcd06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd06), Toast.LENGTH_SHORT).show();
            dcd0601.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd06: This data is Required!");
            return false;
        } else {
            dcd0601.setError(null);
        }

//        04

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

//        05

        if (dcd08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd08), Toast.LENGTH_SHORT).show();
            dcd0899.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd08: This data is Required!");
            return false;
        } else {
            dcd0899.setError(null);
        }

//        06
        if (dcd0801.isChecked()) {
            if (!dcd0901.isChecked() && !dcd0902.isChecked() && !dcd0903.isChecked() && !dcd0904.isChecked()
                    && !dcd0988.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd09), Toast.LENGTH_LONG).show();
                dcd0988.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "dcd09: This data is Required!");
                return false;
            } else {
                dcd0988.setError(null);
            }
        }

//        07
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
            Log.i(TAG, "dcd1096: This data is Required!");
            return false;
        } else {
            dcd1096x.setError(null);
        }

//        08
        if (dcd11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd11), Toast.LENGTH_SHORT).show();
            dcd1199.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd11: This data is Required!");
            return false;
        } else {
            dcd1199.setError(null);
        }

//        09

        if (dcd12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd12), Toast.LENGTH_SHORT).show();
            dcd1296.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd12: This data is Required!");
            return false;
        } else {
            dcd1296.setError(null);
        }

        if (dcd1296.isChecked() && dcd1296x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd12), Toast.LENGTH_SHORT).show();
            dcd1296x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd1296: This data is Required!");
            return false;
        } else {
            dcd1296x.setError(null);
        }

//        10

        if (dcd13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd13), Toast.LENGTH_SHORT).show();
            dcd1396.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd13: This data is Required!");
            return false;
        } else {
            dcd1396.setError(null);
        }

        if (dcd1396.isChecked() && dcd1396x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd13), Toast.LENGTH_SHORT).show();
            dcd1396x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcd1396x: This data is Required!");
            return false;
        } else {
            dcd1396x.setError(null);
        }

//        11
        if (dcd14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd14), Toast.LENGTH_SHORT).show();
            dcd1499.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd14: This data is Required!");
            return false;
        } else {
            dcd1499.setError(null);
        }

//        12
        if (dcd15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd15), Toast.LENGTH_SHORT).show();
            dcd1504.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcd15: This data is Required!");
            return false;
        } else {
            dcd1504.setError(null);
        }

        // ======================  Q 16 =================

        if (dcd16.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd16), Toast.LENGTH_SHORT).show();
            dcd1699.setError("This data is Required!");
            Log.i(TAG, "dcd16: This data is Required!");
            return false;
        } else {
            dcd1699.setError(null);
        }

        // ======================  Q 17 =================

//        if (dcd17.getCheckedRadioButtonId() == -1) {
//            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd17), Toast.LENGTH_SHORT).show();
//            dcd1799.setError("This data is Required!");
//            Log.i(TAG, "dcd17: This data is Required!");
//            return false;
//        } else {
//            dcd1799.setError(null);
//        }

        // ======================  Q 17 =================
        if (dcd1601.isChecked()) {
            if (dcd17.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd17), Toast.LENGTH_SHORT).show();
                dcd1799.setError("This data is Required!");
                Log.i(TAG, "dcd17: This data is Required!");
                return false;
            } else {
                dcd1799.setError(null);
            }


            if (!dcd1701.isChecked()) {

                // ======================  Q 18 =================

                if (dcd18.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd18), Toast.LENGTH_SHORT).show();
                    dcd1899.setError("This data is Required!");
                    Log.i(TAG, "dcd18: This data is Required!");
                    return false;
                } else {
                    dcd1899.setError(null);
                }

                // ======================  Q 18 =================
//                if (dcd1802.isChecked() || dcd1899.isChecked()) {
//                    if (dcd18.getCheckedRadioButtonId() == -1) {
//                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd18), Toast.LENGTH_SHORT).show();
//                        dcd1899.setError("This data is Required!");
//                        Log.i(TAG, "dcd18: This data is Required!");
//                        return false;
//                    } else {
//                        dcd1899.setError(null);
//                    }

                // Others
                if (dcd1896.isChecked() && dcd1896x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcd18) + " - " + getString(R.string.dcother), Toast.LENGTH_LONG).show();
                    dcd1896x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "dcd1896x: This data is Required!");
                    return false;
                } else {
                    dcd1896x.setError(null);
                }
//                }
            }
        }

        return true;
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

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sD = new JSONObject();

        // Radio Group


        sD.put("dcd01", dcd0101.isChecked() ? "1" : dcd0102.isChecked() ? "2" : dcd0103.isChecked() ? "3" : dcd0104.isChecked() ? "4" : "0");
        sD.put("dcd02", dcd02.getText().toString());
        sD.put("dcd03y", dcd03y.getText().toString());
        sD.put("dcd03m", dcd03m.getText().toString());
//        01 A
        sD.put("dcd04a", dcd04a01.isChecked() ? "1" : dcd04a02.isChecked() ? "2" : dcd04a03.isChecked() ? "3"
                : dcd04a04.isChecked() ? "4" : dcd04a05.isChecked() ? "5" : dcd04a06.isChecked() ? "6"
                : dcd04a96.isChecked() ? "96" : "0");
        // Edit Text
        sD.put("dcd04a96x", dcd04a96x.getText().toString());

//        01 B
        sD.put("dcd04b", dcd04b01.isChecked() ? "1" : dcd04b02.isChecked() ? "2" : dcd04b03.isChecked() ? "3"
                : dcd04b04.isChecked() ? "4" : dcd04b05.isChecked() ? "5" : dcd04b06.isChecked() ? "6"
                : dcd04b96.isChecked() ? "96" : "0");
        // Edit Text
        sD.put("dcd04b96x", dcd04b96x.getText().toString());

//        01 C
        sD.put("dcd04c", dcd04c01.isChecked() ? "1" : dcd04c02.isChecked() ? "2" : dcd04c03.isChecked() ? "3"
                : dcd04c04.isChecked() ? "4" : dcd04c96.isChecked() ? "96" : "0");
        // Edit Text
        sD.put("dcd04c96x", dcd04c96x.getText().toString());

//        02
        sD.put("dcd05", dcd05.getText().toString());

//        03
        sD.put("dcd06", dcd0601.isChecked() ? "1" : dcd0602.isChecked() ? "2" : dcd0603.isChecked() ? "3" : "0");

//        04
        sD.put("dcd07", dcd0701.isChecked() ? "1" : dcd0702.isChecked() ? "2" : dcd0703.isChecked() ? "3"
                : dcd0704.isChecked() ? "4" : dcd0705.isChecked() ? "5" : dcd0706.isChecked() ? "6" :
                dcd0707.isChecked() ? "7" : dcd0796.isChecked() ? "96" : "0");
        // Edit Text
        sD.put("dcd0796x", dcd0796x.getText().toString());

//        05
        sD.put("dcd08", dcd0801.isChecked() ? "1" : dcd0802.isChecked() ? "2" : dcd0899.isChecked() ? "99" : "0");

//        06
        // Checkbox
        sD.put("dcd0901", dcd0901.isChecked() ? "1" : "0");
        sD.put("dcd0902", dcd0902.isChecked() ? "2" : "0");
        sD.put("dcd0903", dcd0903.isChecked() ? "3" : "0");
        sD.put("dcd0904", dcd0904.isChecked() ? "4" : "0");
        sD.put("dcd0988", dcd0988.isChecked() ? "88" : "0");

//        07
        sD.put("dcd10", dcd1001.isChecked() ? "1" : dcd1002.isChecked() ? "2" : dcd1003.isChecked() ? "3"
                : dcd1004.isChecked() ? "4" : dcd1005.isChecked() ? "5" : dcd1006.isChecked() ? "6" :
                dcd1007.isChecked() ? "7" : dcd1008.isChecked() ? "8" : dcd1009.isChecked() ? "9"
                        : dcd1010.isChecked() ? "10" : dcd1096.isChecked() ? "96" : "0");
        // Edit Text
        sD.put("dcd1096x", dcd1096x.getText().toString());

//        08
        sD.put("dcd11", dcd1101.isChecked() ? "1" : dcd1102.isChecked() ? "2" : dcd1199.isChecked() ? "99" : "0");

//        09
        sD.put("dcd12", dcd1201.isChecked() ? "1" : dcd1202.isChecked() ? "2" : dcd1203.isChecked() ? "3"
                : dcd1204.isChecked() ? "4" : dcd1205.isChecked() ? "5" : dcd1206.isChecked() ? "6" :
                dcd1207.isChecked() ? "7" : dcd1296.isChecked() ? "96" : "0");
        // Edit Text
        sD.put("dcd1296x", dcd1296x.getText().toString());

//        10
        sD.put("dcd13", dcd1301.isChecked() ? "1" : dcd1302.isChecked() ? "2" : dcd1303.isChecked() ? "3"
                : dcd1304.isChecked() ? "4" : dcd1305.isChecked() ? "5" : dcd1306.isChecked() ? "6" :
                dcd1307.isChecked() ? "7" : dcd1396.isChecked() ? "96" : "0");
        // Edit Text
        sD.put("dcd1396x", dcd1396x.getText().toString());

//        11
        sD.put("dcd14", dcd1401.isChecked() ? "1" : dcd1402.isChecked() ? "2" : dcd1499.isChecked() ? "99" : "0");

//        12
        sD.put("dcd15", dcd1501.isChecked() ? "1" : dcd1502.isChecked() ? "2" : dcd1503.isChecked() ? "3"
                : dcd1504.isChecked() ? "4" : "0");

        sD.put("dcd16", dcd1601.isChecked() ? "1" : dcd1602.isChecked() ? "2" : dcd1699.isChecked() ? "99" : "0");
        // Radio Group
        sD.put("dcd17", dcd1701.isChecked() ? "1" : dcd1702.isChecked() ? "2" : dcd1799.isChecked() ? "99" : "0");
        // Radio Group
        sD.put("dcd18", dcd1801.isChecked() ? "1" : dcd1802.isChecked() ? "2" : dcd1803.isChecked() ? "3"
                : dcd1804.isChecked() ? "4" : dcd1805.isChecked() ? "5" : dcd1806.isChecked() ? "6"
                : dcd1896.isChecked() ? "96" : dcd1899.isChecked() ? "99" : "0");
        // Edit Text
        sD.put("dcd1896x", dcd1896x.getText().toString());

        MainApp.fc.setsD(String.valueOf(sD));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
