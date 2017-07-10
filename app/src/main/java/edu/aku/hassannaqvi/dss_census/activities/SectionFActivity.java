package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.contracts.MotherContract;
import edu.aku.hassannaqvi.dss_census.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.core.MainApp;

public class SectionFActivity extends Activity {


    private static final String TAG = SectionFActivity.class.getSimpleName();

    //    @BindView(R.id.dcfa)
//    EditText dcfa;
    @BindView(R.id.dcf01)
    EditText dcf01;
    @BindView(R.id.dcf0201)
    EditText dcf0201;
    @BindView(R.id.dcf0202)
    EditText dcf0202;
    @BindView(R.id.dcf0203)
    EditText dcf0203;
    @BindView(R.id.dcf03)
    EditText dcf03;
    @BindView(R.id.dcf04dob)
    DatePicker dcf04dob;
    @BindView(R.id.fldGrpdcf04a)
    LinearLayout fldGrpdcf04a;
    @BindView(R.id.fldGrpdcf04b)
    LinearLayout fldGrpdcf04b;
    @BindView(R.id.dcfAgeDob)
    RadioGroup dcfAgeDob;
    @BindView(R.id.dcfDob)
    RadioButton dcfDob;
    @BindView(R.id.dcfAge)
    RadioButton dcfAge;
    @BindView(R.id.dcf0401)
    EditText dcf0401;
    @BindView(R.id.dcf0402)
    EditText dcf0402;
    @BindView(R.id.dcf0403)
    EditText dcf0403;
    @BindView(R.id.dcf05)
    EditText dcf05;
    @BindView(R.id.dcf06)
    EditText dcf06;
    @BindView(R.id.dcf07)
    RadioGroup dcf07;
    @BindView(R.id.dcf0701)
    RadioButton dcf0701;
    @BindView(R.id.dcf0702)
    RadioButton dcf0702;
    @BindView(R.id.dcf0799)
    RadioButton dcf0799;
    @BindView(R.id.fldGrpdcf07)
    LinearLayout fldGrpdcf07;
    @BindView(R.id.dcf08)
    EditText dcf08;
    @BindView(R.id.dcf09)
    RadioGroup dcf09;
    @BindView(R.id.dcf0901)
    RadioButton dcf0901;
    @BindView(R.id.dcf0902)
    RadioButton dcf0902;
    @BindView(R.id.dcf0999)
    RadioButton dcf0999;
    @BindView(R.id.fldGrpdcf09)
    LinearLayout fldGrpdcf09;
    @BindView(R.id.dcf1001)
    CheckBox dcf1001;
    @BindView(R.id.dcf1002)
    CheckBox dcf1002;
    @BindView(R.id.dcf1003)
    CheckBox dcf1003;
    @BindView(R.id.dcf1004)
    CheckBox dcf1004;
    @BindView(R.id.dcf1005)
    CheckBox dcf1005;
    @BindView(R.id.dcf1006)
    CheckBox dcf1006;
    @BindView(R.id.dcf1007)
    CheckBox dcf1007;
    @BindView(R.id.dcf1096)
    CheckBox dcf1096;
    @BindView(R.id.dcf1096x)
    EditText dcf1096x;
    @BindView(R.id.dcf1101)
    CheckBox dcf1101;
    @BindView(R.id.dcf1102)
    CheckBox dcf1102;
    @BindView(R.id.dcf1103)
    CheckBox dcf1103;
    @BindView(R.id.dcf1104)
    CheckBox dcf1104;
    @BindView(R.id.dcf1105)
    CheckBox dcf1105;
    @BindView(R.id.dcf1106)
    CheckBox dcf1106;
    @BindView(R.id.dcf1196)
    CheckBox dcf1196;
    @BindView(R.id.dcf1196x)
    EditText dcf1196x;
    @BindView(R.id.dcf12)
    EditText dcf12;
    @BindView(R.id.dcf0888)
    CheckBox dcf0888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
        ButterKnife.bind(this);

//        appHeader.setText("DSS - > Section F: Reproductive History of Selected MotherTB");

        MainApp.position = getIntent().getExtras().getInt("position");

        dcf04dob.setMaxDate(new Date().getTime());

        if (MainApp.lstMothers.get(MainApp.position).getAgey().equals("")) {
            dcfDob.setChecked(true);

            fldGrpdcf04a.setVisibility(View.VISIBLE);

//            dcf04dob.setMaxDate(new Date().getTime());

            String[] dt = MainApp.lstMothers.get(MainApp.position).getDate_of_birth().split("-");

            dcf04dob.updateDate(Integer.parseInt(dt[2]), Integer.parseInt(dt[1]) - 1, Integer.parseInt(dt[0]));
        }else {
            dcfAge.setChecked(true);

            fldGrpdcf04b.setVisibility(View.VISIBLE);

            dcf0403.setText(MainApp.lstMothers.get(MainApp.position).getAgey());
            dcf0402.setText(MainApp.lstMothers.get(MainApp.position).getAgem());
            dcf0401.setText(MainApp.lstMothers.get(MainApp.position).getAged());
        }

//        dcfa.setText(MainApp.lstMothers.get(MainApp.position).getSerialm());
//        dcfa.setEnabled(false);

        dcfAgeDob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcfAge.isChecked()) {
                    fldGrpdcf04a.setVisibility(View.GONE);
                    fldGrpdcf04b.setVisibility(View.VISIBLE);

                } else {
                    fldGrpdcf04a.setVisibility(View.VISIBLE);
                    fldGrpdcf04b.setVisibility(View.GONE);

                    dcf0401.setText(null);
                    dcf0402.setText(null);
                    dcf0403.setText(null);

                }
            }
        });

        // ===================== Q 7 Skip Pattern =================

        dcf07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcf0701.isChecked() || dcf0799.isChecked()) {
                    fldGrpdcf07.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcf07.setVisibility(View.GONE);
                    dcf08.setText(null);
                    dcf09.clearCheck();
                    dcf1001.setChecked(false);
                    dcf1002.setChecked(false);
                    dcf1003.setChecked(false);
                    dcf1004.setChecked(false);
                    dcf1005.setChecked(false);
                    dcf1006.setChecked(false);
                    dcf1007.setChecked(false);
                    dcf1096.setChecked(false);
                    dcf1096x.setText(null);
                    dcf1101.setChecked(false);
                    dcf1102.setChecked(false);
                    dcf1103.setChecked(false);
                    dcf1104.setChecked(false);
                    dcf1105.setChecked(false);
                    dcf1106.setChecked(false);
                    dcf1196.setChecked(false);
                    dcf1196x.setText(null);
                    dcf12.setText(null);
                }

            }
        });

        dcf0888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcf08.setVisibility(View.GONE);
                    dcf08.setText(null);
                } else {
                    dcf08.setVisibility(View.VISIBLE);
                }
            }
        });


        // ================== Q 9 Skip pattern =======================

        dcf09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (dcf0901.isChecked()) {
                    fldGrpdcf09.setVisibility(View.VISIBLE);

                } else {
                    fldGrpdcf09.setVisibility(View.GONE);
                    dcf1001.setChecked(false);
                    dcf1002.setChecked(false);
                    dcf1003.setChecked(false);
                    dcf1004.setChecked(false);
                    dcf1005.setChecked(false);
                    dcf1006.setChecked(false);
                    dcf1007.setChecked(false);
                    dcf1096.setChecked(false);
                    dcf1096x.setText(null);
                    dcf1101.setChecked(false);
                    dcf1102.setChecked(false);
                    dcf1103.setChecked(false);
                    dcf1104.setChecked(false);
                    dcf1105.setChecked(false);
                    dcf1106.setChecked(false);
                    dcf1196.setChecked(false);
                    dcf1196x.setText(null);
                    dcf12.setText(null);

                }

            }
        });

        dcf1096.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcf1096x.setVisibility(View.VISIBLE);
                } else {
                    dcf1096x.setVisibility(View.GONE);
                    dcf1096x.setText(null);
                }
            }
        });

        dcf1196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcf1196x.setVisibility(View.VISIBLE);
                } else {
                    dcf1196x.setVisibility(View.GONE);
                    dcf1196x.setText(null);
                }
            }
        });
        dcf12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (dcf0901.isChecked() && Integer.parseInt(dcf12.getText().toString().isEmpty() ? "0" : dcf12.getText().toString()) == 0) {
                    dcf12.setError("Can not be zero..");
                } else {
                    dcf12.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

//        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.finishActivity(this, this);
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


                MainApp.currentMotherCheck = 1;

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
//        if (dcfa.getText().toString().isEmpty()) {
//            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcfa), Toast.LENGTH_SHORT).show();
//            dcfa.setError("This data is Required!");    // Set Error on last radio button
//
//            Log.i(TAG, "dcfa: This data is Required!");
//            return false;
//        } else {
//            dcfa.setError(null);
//        }

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

        if ((Integer.parseInt(dcf0201.getText().toString().isEmpty() ? "0" : dcf0201.getText().toString()))
                > (Integer.parseInt(dcf01.getText().toString().isEmpty() ? "0" : dcf01.getText().toString()))) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf0201), Toast.LENGTH_SHORT).show();
            dcf0201.setError("Can not be greater than total pregnancies");    // Set Error on last radio button

            Log.i(TAG, "dcf0201: Can not be greater than total pregnancies");
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

        if ((Integer.parseInt(dcf0202.getText().toString().isEmpty() ? "0" : dcf0202.getText().toString()))
                > (Integer.parseInt(dcf01.getText().toString().isEmpty() ? "0" : dcf01.getText().toString()))) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf0202), Toast.LENGTH_SHORT).show();
            dcf0202.setError("Can not be greater than total pregnancies");    // Set Error on last radio button

            Log.i(TAG, "dcf0202: Can not be greater than total pregnancies");
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

        if ((Integer.parseInt(dcf0203.getText().toString().isEmpty() ? "0" : dcf0203.getText().toString()))
                > (Integer.parseInt(dcf01.getText().toString().isEmpty() ? "0" : dcf01.getText().toString()))) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf0203), Toast.LENGTH_SHORT).show();
            dcf0203.setError("Can not be greater than total pregnancies");    // Set Error on last radio button

            Log.i(TAG, "dcf0203: Can not be greater than total pregnancies");
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

        if ((Integer.parseInt(dcf03.getText().toString().isEmpty() ? "0" : dcf03.getText().toString()))
                > (Integer.parseInt(dcf0201.getText().toString().isEmpty() ? "0" : dcf0201.getText().toString()))) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf03), Toast.LENGTH_SHORT).show();
            dcf03.setError("Can not be greater than total pregnancies");    // Set Error on last radio button

            Log.i(TAG, "dcf03: Can not be greater than total pregnancies");
            return false;
        } else {
            dcf03.setError(null);
        }

//        04

        if (dcfAge.isChecked()) {

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

        if ((Integer.parseInt(dcf06.getText().toString().isEmpty() ? "0" : dcf06.getText().toString()))
                < (Integer.parseInt(dcf05.getText().toString().isEmpty() ? "0" : dcf05.getText().toString()))) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf06), Toast.LENGTH_SHORT).show();
            dcf06.setError("Can not be less than age at marriage");    // Set Error on last radio button

            Log.i(TAG, "dcf06: Can not be less than age at marriage");
            return false;
        } else {
            dcf06.setError(null);
        }

//        07
        if (dcf07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf07), Toast.LENGTH_SHORT).show();
            dcf0799.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcf07: This data is Required!");
            return false;
        } else {
            dcf0799.setError(null);
        }

//        08

        if (dcf0701.isChecked() || dcf0799.isChecked()) {
            if (dcf08.getText().toString().isEmpty() && !dcf0888.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf08), Toast.LENGTH_SHORT).show();
                dcf08.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcf08: This data is Required!");
                return false;
            } else {
                dcf08.setError(null);
            }


            if (!dcf0888.isChecked()) {
                if ((Integer.parseInt(dcf08.getText().toString().isEmpty() ? "0" : dcf08.getText().toString())) < 1
                        || (Integer.parseInt(dcf08.getText().toString().isEmpty() ? "0" : dcf08.getText().toString())) > 10) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf08), Toast.LENGTH_SHORT).show();
                    dcf08.setError("Range is 1 - 10 months");    // Set Error on last radio button

                    Log.i(TAG, "dcf08: Range is 1 - 10 months");
                    return false;
                } else {
                    dcf08.setError(null);
                }
            }

//        09
            if (dcf09.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf09), Toast.LENGTH_SHORT).show();
                dcf0999.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcf09: This data is Required!");
                return false;
            } else {
                dcf0999.setError(null);
            }

//        10
            if (dcf0901.isChecked()) {
                if (dcf1001.isChecked() && dcf1002.isChecked() && dcf1003.isChecked() && dcf1004.isChecked() && dcf1005.isChecked()
                        && dcf1006.isChecked() && dcf1007.isChecked() && dcf1096.isChecked()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf10), Toast.LENGTH_SHORT).show();
                    dcf1096.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "dcf10: This data is Required!");
                    return false;
                } else {
                    dcf1096.setError(null);
                }

                if (dcf1096.isChecked() && dcf1096x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf10), Toast.LENGTH_SHORT).show();
                    dcf1096x.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "dcf10: This data is Required!");
                    return false;
                } else {
                    dcf1096x.setError(null);
                }

//        11
                if (dcf1101.isChecked() && dcf1102.isChecked() && dcf1103.isChecked() && dcf1104.isChecked() && dcf1105.isChecked()
                        && dcf1106.isChecked() && dcf1196.isChecked()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcf11), Toast.LENGTH_SHORT).show();
                    dcf1196.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "dcf11: This data is Required!");
                    return false;
                } else {
                    dcf1196.setError(null);
                }

                if (dcf1196.isChecked() && dcf1196x.getText().toString().isEmpty()) {
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
            }
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.mc = new MotherContract();

        MainApp.mc.set_UUID(MainApp.fc.getUID());
        MainApp.mc.setFormDate(MainApp.fc.getFormDate());
        MainApp.mc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.mc.setUser(MainApp.fc.getUser());
        MainApp.mc.setChildID(MainApp.lstMothers.get(MainApp.position).getChild_id());
        MainApp.mc.setMotherID(MainApp.lstMothers.get(MainApp.position).getMother_id());
        MainApp.mc.setDssID(MainApp.fc.getDSSID());

        JSONObject sF = new JSONObject();

        // Edit Text

//        A
        sF.put("dcfa", MainApp.lstMothers.get(MainApp.position).getSerialm());
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
        if (dcfDob.isChecked()) {
            sF.put("dcf04", new SimpleDateFormat("dd-MM-yyyy").format(dcf04dob.getCalendarView().getDate()));

            sF.put("dcf04d", "");
            sF.put("dcf04m", "");
            sF.put("dcf04y", "");
        }else {

            sF.put("dcf04", "");

            sF.put("dcf04d", dcf0401.getText().toString());
            sF.put("dcf04m", dcf0402.getText().toString());
            sF.put("dcf04y", dcf0403.getText().toString());
        }
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
        sF.put("dcf0888", dcf0888.isChecked() ? "88" : "0");

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

        MainApp.mc.setsF(String.valueOf(sF));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        Long rowcount = db.addMother(MainApp.mc);
        MainApp.mc.set_ID(String.valueOf(rowcount));
        db.close();
        if (rowcount != -1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.mc.setUID(
                    (MainApp.fc.getDeviceID() + MainApp.mc.get_ID()));
            db.updateMotherID();
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
