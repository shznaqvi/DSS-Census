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
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.core.MainApp;

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
    //@BindView(R.id.dce07)
    /*RadioGroup dce07;
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
    */
    @BindView(R.id.dce0701)
    EditText dce0701;
    @BindView(R.id.dce0702)
    EditText dce0702;
    @BindView(R.id.dce0703)
    EditText dce0703;
    @BindView(R.id.dce0704)
    EditText dce0704;
    @BindView(R.id.dce0705)
    EditText dce0705;
    @BindView(R.id.dce0706)
    EditText dce0706;
    @BindView(R.id.dce0707)
    EditText dce0707;
    @BindView(R.id.dce0708)
    EditText dce0708;
    @BindView(R.id.dce0709)
    EditText dce0709;
    @BindView(R.id.dce0710)
    EditText dce0710;
    @BindView(R.id.dce0711)
    EditText dce0711;
    @BindView(R.id.dce0712)
    EditText dce0712;
    @BindView(R.id.dce0713)
    EditText dce0713;
    @BindView(R.id.dce0714)
    EditText dce0714;
    @BindView(R.id.dce0715)
    EditText dce0715;
    @BindView(R.id.dce0716)
    EditText dce0716;
    @BindView(R.id.dce0717)
    EditText dce0717;
    @BindView(R.id.dce0718)
    EditText dce0718;
    @BindView(R.id.dce0719)
    EditText dce0719;
    @BindView(R.id.dce0720)
    EditText dce0720;
    @BindView(R.id.dce0721)
    EditText dce0721;
    @BindView(R.id.dce0722)
    EditText dce0722;
    @BindView(R.id.fldGrpdce05)
    LinearLayout fldGrpdce05;

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


        /*// ========================= Q 9 Others============================
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
*/
        dce04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dce0401.isChecked()) {
                    fldGrpdce05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdce05.setVisibility(View.GONE);
                    dce05.clearCheck();
                    dce0596x.setText(null);
                }
            }
        });


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("check", false);
        startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

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

                Intent secNext = new Intent(this, SectionFActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSE();

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

        JSONObject sE = new JSONObject();

        // Radio Group
        sE.put("dce01", dce0101.isChecked() ? "1" : dce0102.isChecked() ? "2" : dce0103.isChecked() ? "3"
                : dce0196.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dce0196x", dce0196x.getText().toString());
        // Radio Group
        sE.put("dce02", dce0201.isChecked() ? "1" : dce0202.isChecked() ? "2" : "0");
        // Radio Group
        sE.put("dce03", dce0301.isChecked() ? "1" : dce0302.isChecked() ? "2" : dce0303.isChecked() ? "3"
                : dce0304.isChecked() ? "4" : dce0396.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dce0396x", dce0396x.getText().toString());
        sE.put("dce03", dce0301.isChecked() ? "1" : dce0302.isChecked() ? "2" : "0");
        sE.put("dce04", dce0401.isChecked() ? "1" : dce0402.isChecked() ? "2" : "0");
        sE.put("dce05", dce0501.isChecked() ? "1" : dce0502.isChecked() ? "2" : dce0503.isChecked() ? "3"
                : dce0504.isChecked() ? "4" : dce0596.isChecked() ? "96" : "0");
        // Edit Text
        sE.put("dce0496x", dce0596x.getText().toString());
        // Checkbox
        sE.put("dce0601", dce0601.isChecked() ? "1" : "0");
        sE.put("dce0602", dce0602.isChecked() ? "1" : "0");
        sE.put("dce0603", dce0603.isChecked() ? "1" : "0");
        sE.put("dce0604", dce0604.isChecked() ? "1" : "0");
        sE.put("dce0605", dce0605.isChecked() ? "1" : "0");
        sE.put("dce0606", dce0606.isChecked() ? "1" : "0");
        sE.put("dce0607", dce0607.isChecked() ? "1" : "0");
        sE.put("dce0608", dce0608.isChecked() ? "1" : "0");
        sE.put("dce0609", dce0609.isChecked() ? "1" : "0");
        sE.put("dce0610", dce0610.isChecked() ? "1" : "0");
        sE.put("dce0696", dce0696.isChecked() ? "1" : "0");
        // Edit Text
        sE.put("dce0696x", dce0696x.getText().toString());
        // Radio Group
        /*se.put("dce07", dce0701.isChecked() ? "1" : dce0702.isChecked() ? "2" : dce0799.isChecked() ? "99" : "0");
        // Radio Group
        se.put("dce08", dce0801.isChecked() ? "1" : dce0802.isChecked() ? "2" : dce0899.isChecked() ? "99" : "0");
        // Radio Group
        se.put("dce09", dce0901.isChecked() ? "1" : dce0902.isChecked() ? "2" : dce0903.isChecked() ? "3"
                : dce0904.isChecked() ? "4" : dce0905.isChecked() ? "5" : dce0906.isChecked() ? "6"
                : dce0996.isChecked() ? "96" : dce0999.isChecked() ? "99" : "0");
        // Edit Text
        se.put("dce0996x", dce0996x.getText().toString());*/
        // Edit Text
        sE.put("dce0701", dce0701.getText().toString());
        sE.put("dce0702", dce0702.getText().toString());
        sE.put("dce0703", dce0703.getText().toString());
        sE.put("dce0704", dce0704.getText().toString());
        sE.put("dce0705", dce0705.getText().toString());
        sE.put("dce0706", dce0706.getText().toString());
        sE.put("dce0707", dce0707.getText().toString());
        sE.put("dce0708", dce0708.getText().toString());
        sE.put("dce0709", dce0709.getText().toString());
        sE.put("dce0710", dce0710.getText().toString());
        sE.put("dce0711", dce0711.getText().toString());
        sE.put("dce0712", dce0712.getText().toString());
        sE.put("dce0713", dce0713.getText().toString());
        sE.put("dce1011", dce0711.getText().toString());
        sE.put("dce0712", dce0712.getText().toString());
        sE.put("dce0713", dce0713.getText().toString());
        sE.put("dce0714", dce0714.getText().toString());
        sE.put("dce0715", dce0715.getText().toString());
        sE.put("dce0716", dce0716.getText().toString());
        sE.put("dce0717", dce0717.getText().toString());
        sE.put("dce0718", dce0718.getText().toString());
        sE.put("dce0719", dce0719.getText().toString());
        sE.put("dce0720", dce0720.getText().toString());
        sE.put("dce0721", dce0721.getText().toString());
        sE.put("dce0722", dce0722.getText().toString());

        MainApp.fc.setsE(String.valueOf(sE));

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

        if (dce04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce04), Toast.LENGTH_SHORT).show();
            dce0402.setError("This data is Required!");
            Log.i(TAG, "dce04: This data is Required!");
            return false;
        } else {
            dce0402.setError(null);
        }

        if (dce0401.isChecked()) {
            if (dce05.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce05), Toast.LENGTH_SHORT).show();
                dce0596.setError("This data is Required!");
                Log.i(TAG, "dce05: This data is Required!");
                return false;
            } else {
                dce0596.setError(null);
            }

            if (dce0596.isChecked() && dce0596x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce05) + " - " + getString(R.string.dcother), Toast.LENGTH_LONG).show();
                dce0596x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "dce0596x: This data is Required!");
                return false;
            } else {
                dce0596x.setError(null);
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
            dce0696.setError(null);
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

        /*// ======================  Q 7 =================

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
            if (dce0802.isChecked() || dce0899.isChecked()) {
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
*/
        // ======================  Q 10 =================

        if (dce0701.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0701), Toast.LENGTH_LONG).show();
            dce0701.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0701: This data is Required!");
            return false;
        } else {
            dce0701.setError(null);
        }

        if (dce0702.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0702), Toast.LENGTH_LONG).show();
            dce0702.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0702: This data is Required!");
            return false;
        } else {
            dce0702.setError(null);
        }

        if (dce0703.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0703), Toast.LENGTH_LONG).show();
            dce0703.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0703: This data is Required!");
            return false;
        } else {
            dce0703.setError(null);
        }

        if (dce0704.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0704), Toast.LENGTH_LONG).show();
            dce0704.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0704: This data is Required!");
            return false;
        } else {
            dce0704.setError(null);
        }

        if (dce0705.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0705), Toast.LENGTH_LONG).show();
            dce0705.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0705: This data is Required!");
            return false;
        } else {
            dce0705.setError(null);
        }

        if (dce0706.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0706), Toast.LENGTH_LONG).show();
            dce0706.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0706: This data is Required!");
            return false;
        } else {
            dce0706.setError(null);
        }

        if (dce0707.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0707), Toast.LENGTH_LONG).show();
            dce0707.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0707: This data is Required!");
            return false;
        } else {
            dce0707.setError(null);
        }

        if (dce0708.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0708), Toast.LENGTH_LONG).show();
            dce0708.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0708: This data is Required!");
            return false;
        } else {
            dce0708.setError(null);
        }

        if (dce0709.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0709), Toast.LENGTH_LONG).show();
            dce0709.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0709: This data is Required!");
            return false;
        } else {
            dce0709.setError(null);
        }

        if (dce0710.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0710), Toast.LENGTH_LONG).show();
            dce0710.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0710: This data is Required!");
            return false;
        } else {
            dce0710.setError(null);
        }

        if (dce0711.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0711), Toast.LENGTH_LONG).show();
            dce0711.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0711: This data is Required!");
            return false;
        } else {
            dce0711.setError(null);
        }

        if (dce0712.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0712), Toast.LENGTH_LONG).show();
            dce0712.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0712: This data is Required!");
            return false;
        } else {
            dce0712.setError(null);
        }

        if (dce0713.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0713), Toast.LENGTH_LONG).show();
            dce0713.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0713: This data is Required!");
            return false;
        } else {
            dce0713.setError(null);
        }

        if (dce0714.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0714), Toast.LENGTH_LONG).show();
            dce0714.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0714: This data is Required!");
            return false;
        } else {
            dce0714.setError(null);
        }

        if (dce0715.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0715), Toast.LENGTH_LONG).show();
            dce0715.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0715: This data is Required!");
            return false;
        } else {
            dce0715.setError(null);
        }

        if (dce0716.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0716), Toast.LENGTH_LONG).show();
            dce0716.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0716: This data is Required!");
            return false;
        } else {
            dce0716.setError(null);
        }

        if (dce0717.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0717), Toast.LENGTH_LONG).show();
            dce0717.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0717: This data is Required!");
            return false;
        } else {
            dce0717.setError(null);
        }

        if (dce0718.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0718), Toast.LENGTH_LONG).show();
            dce0718.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0718: This data is Required!");
            return false;
        } else {
            dce0718.setError(null);
        }

        if (dce0719.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0719), Toast.LENGTH_LONG).show();
            dce0719.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0719: This data is Required!");
            return false;
        } else {
            dce0719.setError(null);
        }

        if (dce0720.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0720), Toast.LENGTH_LONG).show();
            dce0720.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0720: This data is Required!");
            return false;
        } else {
            dce0720.setError(null);
        }

        if (dce0721.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0721), Toast.LENGTH_LONG).show();
            dce0721.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0721: This data is Required!");
            return false;
        } else {
            dce0721.setError(null);
        }

        if (dce0722.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dce0722), Toast.LENGTH_LONG).show();
            dce0722.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "dce0722: This data is Required!");
            return false;
        } else {
            dce0722.setError(null);
        }


        return true;
    }

//    @Override
//    public void onBackPressed() {
//        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
//    }

}

