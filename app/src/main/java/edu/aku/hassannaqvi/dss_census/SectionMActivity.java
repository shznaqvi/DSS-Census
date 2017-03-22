package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

public class SectionMActivity extends Activity {

    private static final String TAG = SectionMActivity.class.getSimpleName();

    @BindView(R.id.activity_section_m)
    RelativeLayout activitySectionM;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dcm01)
    RadioGroup dcm01;
    @BindView(R.id.dcm0101)
    RadioButton dcm0101;
    @BindView(R.id.dcm0102)
    RadioButton dcm0102;
    @BindView(R.id.dcm0103)
    RadioButton dcm0103;
    @BindView(R.id.dcm0104)
    RadioButton dcm0104;
    @BindView(R.id.dcm0105)
    RadioButton dcm0105;
    @BindView(R.id.dcm0106)
    RadioButton dcm0106;
    @BindView(R.id.dcm0107)
    RadioButton dcm0107;
    @BindView(R.id.dcm0196)
    RadioButton dcm0196;
    @BindView(R.id.dcm0196x)
    EditText dcm0196x;
    @BindView(R.id.dcm02)
    RadioGroup dcm02;
    @BindView(R.id.dcm0201)
    RadioButton dcm0201;
    @BindView(R.id.dcm0202)
    RadioButton dcm0202;
    @BindView(R.id.dcm03)
    RadioGroup dcm03;
    @BindView(R.id.dcm0301)
    RadioButton dcm0301;
    @BindView(R.id.dcm0302)
    RadioButton dcm0302;
    @BindView(R.id.dcm04)
    RadioGroup dcm04;
    @BindView(R.id.dcm0401)
    RadioButton dcm0401;
    @BindView(R.id.dcm0402)
    RadioButton dcm0402;
    @BindView(R.id.dcm05)
    RadioGroup dcm05;
    @BindView(R.id.dcm0501)
    RadioButton dcm0501;
    @BindView(R.id.dcm0502)
    RadioButton dcm0502;
    @BindView(R.id.dcm06)
    RadioGroup dcm06;
    @BindView(R.id.dcm0601)
    RadioButton dcm0601;
    @BindView(R.id.dcm0602)
    RadioButton dcm0602;
    @BindView(R.id.dcm0603)
    RadioButton dcm0603;
    @BindView(R.id.dcm07)
    EditText dcm07;
    @BindView(R.id.dcm08)
    RadioGroup dcm08;
    @BindView(R.id.dcm0801)
    RadioButton dcm0801;
    @BindView(R.id.dcm0802)
    RadioButton dcm0802;
    @BindView(R.id.dcm0803)
    RadioButton dcm0803;
    @BindView(R.id.dcm09)
    RadioGroup dcm09;
    @BindView(R.id.dcm0901)
    RadioButton dcm0901;
    @BindView(R.id.dcm0902)
    RadioButton dcm0902;
    @BindView(R.id.dcm10)
    RadioGroup dcm10;
    @BindView(R.id.dcm1001)
    RadioButton dcm1001;
    @BindView(R.id.dcm1002)
    RadioButton dcm1002;
    @BindView(R.id.dcm11)
    RadioGroup dcm11;
    @BindView(R.id.dcm1101)
    RadioButton dcm1101;
    @BindView(R.id.dcm1102)
    RadioButton dcm1102;
    @BindView(R.id.dcm12)
    RadioGroup dcm12;
    @BindView(R.id.dcm1201)
    RadioButton dcm1201;
    @BindView(R.id.dcm1202)
    RadioButton dcm1202;
    @BindView(R.id.dcm13)
    RadioGroup dcm13;
    @BindView(R.id.dcm1301)
    RadioButton dcm1301;
    @BindView(R.id.dcm1302)
    RadioButton dcm1302;
    @BindView(R.id.dcm1303)
    RadioButton dcm1303;
    @BindView(R.id.dcm1304)
    RadioButton dcm1304;
    @BindView(R.id.dcm1305)
    RadioButton dcm1305;
    @BindView(R.id.dcm1396)
    RadioButton dcm1396;
    @BindView(R.id.dcm1396x)
    EditText dcm1396x;
    @BindView(R.id.dcm14)
    RadioGroup dcm14;
    @BindView(R.id.dcm1401)
    RadioButton dcm1401;
    @BindView(R.id.dcm1402)
    RadioButton dcm1402;
    @BindView(R.id.dcm1403)
    RadioButton dcm1403;
    @BindView(R.id.dcm1404)
    RadioButton dcm1404;
    @BindView(R.id.dcm1405)
    RadioButton dcm1405;
    @BindView(R.id.dcm1406)
    RadioButton dcm1406;
    @BindView(R.id.dcm15)
    RadioGroup dcm15;
    @BindView(R.id.dcm1501)
    RadioButton dcm1501;
    @BindView(R.id.dcm1502)
    RadioButton dcm1502;
    @BindView(R.id.dcm16)
    RadioGroup dcm16;
    @BindView(R.id.dcm1601)
    RadioButton dcm1601;
    @BindView(R.id.dcm1602)
    RadioButton dcm1602;
    @BindView(R.id.dcm17)
    RadioGroup dcm17;
    @BindView(R.id.dcm1701)
    RadioButton dcm1701;
    @BindView(R.id.dcm1702)
    RadioButton dcm1702;
    @BindView(R.id.dcm1799)
    RadioButton dcm1799;
    @BindView(R.id.dcm17a)
    RadioGroup dcm17a;
    @BindView(R.id.dcm17a01)
    RadioButton dcm17a01;
    @BindView(R.id.dcm17a02)
    RadioButton dcm17a02;
    @BindView(R.id.dcm17a03)
    RadioButton dcm17a03;
    @BindView(R.id.dcm17a04)
    RadioButton dcm17a04;
    @BindView(R.id.dcm18)
    RadioGroup dcm18;
    @BindView(R.id.dcm1801)
    RadioButton dcm1801;
    @BindView(R.id.dcm1802)
    RadioButton dcm1802;
    @BindView(R.id.dcm1899)
    RadioButton dcm1899;
    @BindView(R.id.dcm19)
    RadioGroup dcm19;
    @BindView(R.id.dcm1901)
    RadioButton dcm1901;
    @BindView(R.id.dcm1902)
    RadioButton dcm1902;
    @BindView(R.id.dcm1999)
    RadioButton dcm1999;
    @BindView(R.id.dcm20)
    RadioGroup dcm20;
    @BindView(R.id.dcm2001)
    RadioButton dcm2001;
    @BindView(R.id.dcm2002)
    RadioButton dcm2002;
    @BindView(R.id.dcm2099)
    RadioButton dcm2099;


    @BindView(R.id.fldGrpdcm17a)
    LinearLayout fldGrpdcm17a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section M : Home Environment");

//        Skip
        dcm17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcm1701.isChecked()) {
                    fldGrpdcm17a.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcm17a.setVisibility(View.GONE);
                    dcm17a.clearCheck();
                }
            }
        });

//        01
        dcm0196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    dcm0196x.setVisibility(View.VISIBLE);
                } else {
                    dcm0196x.setVisibility(View.GONE);
                    dcm0196x.setText(null);
                }
            }
        });

//        13
        dcm1396.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    dcm1396x.setVisibility(View.VISIBLE);
                } else {
                    dcm1396x.setVisibility(View.GONE);
                    dcm1396x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {


        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, MainActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


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

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01
        if (dcm01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm01), Toast.LENGTH_SHORT).show();
            dcm0196.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm01: This data is Required!");
            return false;
        } else {
            dcm0196.setError(null);
        }
        if (dcm0196.isChecked() && dcm0196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm01), Toast.LENGTH_SHORT).show();
            dcm0196x.setError("This data is Required! Please enter some value or zero");

            Log.i(TAG, "dcm0196x: This data is Required!");
            return false;
        } else {
            dcm0196x.setError(null);
        }


//        02
        if (dcm02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm02), Toast.LENGTH_SHORT).show();
            dcm0202.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm02: This data is Required!");
            return false;
        } else {
            dcm0202.setError(null);
        }

//        03
        if (dcm03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm03), Toast.LENGTH_SHORT).show();
            dcm0302.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm03: This data is Required!");
            return false;
        } else {
            dcm0302.setError(null);
        }

//        04
        if (dcm04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm04), Toast.LENGTH_SHORT).show();
            dcm0402.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm04: This data is Required!");
            return false;
        } else {
            dcm0402.setError(null);
        }

//        05
        if (dcm05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm05), Toast.LENGTH_SHORT).show();
            dcm0502.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm05: This data is Required!");
            return false;
        } else {
            dcm0502.setError(null);
        }

//        06
        if (dcm06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm06), Toast.LENGTH_SHORT).show();
            dcm0603.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm06: This data is Required!");
            return false;
        } else {
            dcm0603.setError(null);
        }

//        07
        if (dcm07.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm07), Toast.LENGTH_SHORT).show();
            dcm07.setError("This data is Required! Please enter some value or zero");    // Set Error on last radio button

            Log.i(TAG, "dcm07: This data is Required!");
            return false;
        } else {
            dcm07.setError(null);
        }

//        08
        if (dcm08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm08), Toast.LENGTH_SHORT).show();
            dcm0803.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm08: This data is Required!");
            return false;
        } else {
            dcm0803.setError(null);
        }


//        09
        if (dcm09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm09), Toast.LENGTH_SHORT).show();
            dcm0902.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm09: This data is Required!");
            return false;
        } else {
            dcm0902.setError(null);
        }

//        10
        if (dcm10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm10), Toast.LENGTH_SHORT).show();
            dcm1002.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm10: This data is Required!");
            return false;
        } else {
            dcm1002.setError(null);
        }

//        11
        if (dcm11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm11), Toast.LENGTH_SHORT).show();
            dcm1102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm11: This data is Required!");
            return false;
        } else {
            dcm1102.setError(null);
        }

//        12
        if (dcm12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm12), Toast.LENGTH_SHORT).show();
            dcm1202.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm12: This data is Required!");
            return false;
        } else {
            dcm1202.setError(null);
        }

//        13
        if (dcm13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm13), Toast.LENGTH_SHORT).show();
            dcm1396.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm13: This data is Required!");
            return false;
        } else {
            dcm1396.setError(null);
        }
        if (dcm1396.isChecked() && dcm1396x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm13), Toast.LENGTH_SHORT).show();
            dcm1396x.setError("This data is Required! Please enter some value or zero");

            Log.i(TAG, "dcm1396x: This data is Required!");
            return false;
        } else {
            dcm1396x.setError(null);
        }

//        14
        if (dcm14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm14), Toast.LENGTH_SHORT).show();
            dcm1406.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm14: This data is Required!");
            return false;
        } else {
            dcm1406.setError(null);
        }


//        15
        if (dcm15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm15), Toast.LENGTH_SHORT).show();
            dcm1502.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm15: This data is Required!");
            return false;
        } else {
            dcm1502.setError(null);
        }

//        16
        if (dcm16.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm16), Toast.LENGTH_SHORT).show();
            dcm1602.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm16: This data is Required!");
            return false;
        } else {
            dcm1602.setError(null);
        }

//        17
        if (dcm17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm17), Toast.LENGTH_SHORT).show();
            dcm1799.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm17: This data is Required!");
            return false;
        } else {
            dcm1799.setError(null);
        }

//        Skip
        if (dcm1701.isChecked()) {
//            17a
            if (dcm17a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm17a), Toast.LENGTH_SHORT).show();
                dcm17a04.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcm17a: This data is Required!");
                return false;
            } else {
                dcm17a04.setError(null);
            }
        }

//        18
        if (dcm18.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm18), Toast.LENGTH_SHORT).show();
            dcm1899.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm18: This data is Required!");
            return false;
        } else {
            dcm1899.setError(null);
        }

//        19
        if (dcm19.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm19), Toast.LENGTH_SHORT).show();
            dcm1999.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm19: This data is Required!");
            return false;
        } else {
            dcm1999.setError(null);
        }

//        20
        if (dcm20.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcm20), Toast.LENGTH_SHORT).show();
            dcm2099.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcm20: This data is Required!");
            return false;
        } else {
            dcm2099.setError(null);
        }

        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sM = new JSONObject();

        sM.put("dcm01", dcm0101.isChecked() ? "1" : dcm0102.isChecked() ? "2" : dcm0103.isChecked() ? "3"
                : dcm0104.isChecked() ? "4" : dcm0105.isChecked() ? "5" : dcm0106.isChecked() ? "6"
                : dcm0107.isChecked() ? "7" : dcm0196.isChecked() ? "96" : "0");
        sM.put("dcm0196x", dcm0196x.getText().toString());

        sM.put("dcm02", dcm0201.isChecked() ? "1" : dcm0202.isChecked() ? "2" : "0");
        sM.put("dcm03", dcm0301.isChecked() ? "1" : dcm0302.isChecked() ? "2" : "0");
        sM.put("dcm04", dcm0401.isChecked() ? "1" : dcm0402.isChecked() ? "2" : "0");
        sM.put("dcm05", dcm0501.isChecked() ? "1" : dcm0502.isChecked() ? "2" : "0");

        sM.put("dcm06", dcm0601.isChecked() ? "1" : dcm0602.isChecked() ? "2" : dcm0603.isChecked() ? "3" : "0");

        sM.put("dcm0107", dcm0107.getText().toString());

        sM.put("dcm08", dcm0801.isChecked() ? "1" : dcm0802.isChecked() ? "2" : dcm0803.isChecked() ? "3" : "0");

        sM.put("dcm09", dcm0901.isChecked() ? "1" : dcm0902.isChecked() ? "2" : "0");
        sM.put("dcm10", dcm1001.isChecked() ? "1" : dcm1002.isChecked() ? "2" : "0");
        sM.put("dcm11", dcm1101.isChecked() ? "1" : dcm1102.isChecked() ? "2" : "0");
        sM.put("dcm12", dcm1201.isChecked() ? "1" : dcm1202.isChecked() ? "2" : "0");

        sM.put("dcm13", dcm1301.isChecked() ? "1" : dcm1302.isChecked() ? "2" : dcm1303.isChecked() ? "3"
                : dcm1304.isChecked() ? "4" : dcm1305.isChecked() ? "5" : dcm1396.isChecked() ? "96" : "0");
        sM.put("dcm1396x", dcm1396x.getText().toString());

        sM.put("dcm14", dcm1401.isChecked() ? "1" : dcm1402.isChecked() ? "2" : dcm1403.isChecked() ? "3"
                : dcm1404.isChecked() ? "4" : dcm1405.isChecked() ? "5" : dcm1406.isChecked() ? "6" : "0");

        sM.put("dcm15", dcm1501.isChecked() ? "1" : dcm1502.isChecked() ? "2" : "0");
        sM.put("dcm16", dcm1601.isChecked() ? "1" : dcm1602.isChecked() ? "2" : "0");

        sM.put("dcm17", dcm1701.isChecked() ? "1" : dcm1702.isChecked() ? "2" : dcm1799.isChecked() ? "99" : "0");

        sM.put("dcm17a", dcm17a01.isChecked() ? "1" : dcm17a02.isChecked() ? "2" : dcm17a03.isChecked() ? "3"
                : dcm17a04.isChecked() ? "4" : "0");

        sM.put("dcm18", dcm1801.isChecked() ? "1" : dcm1802.isChecked() ? "2" : dcm1899.isChecked() ? "99" : "0");
        sM.put("dcm19", dcm1901.isChecked() ? "1" : dcm1902.isChecked() ? "2" : dcm1999.isChecked() ? "99" : "0");
        sM.put("dcm20", dcm2001.isChecked() ? "1" : dcm2002.isChecked() ? "2" : dcm2099.isChecked() ? "99" : "0");

        //DCEApp.fc.setROW_Se(String.valueOf(se));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


}
