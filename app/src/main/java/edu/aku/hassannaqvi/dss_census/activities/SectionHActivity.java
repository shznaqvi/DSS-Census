package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
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
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.core.MainApp;

public class SectionHActivity extends Activity {

    private static final String TAG = SectionHActivity.class.getSimpleName();

    @BindView(R.id.activity_sectionH)
    RelativeLayout activitySectionH;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dch01)
    RadioGroup dch01;
    @BindView(R.id.dch0101)
    RadioButton dch0101;
    @BindView(R.id.dch0102)
    RadioButton dch0102;
    @BindView(R.id.dch02)
    RadioGroup dch02;
    @BindView(R.id.dch0201)
    RadioButton dch0201;
    @BindView(R.id.dch0202)
    RadioButton dch0202;
    @BindView(R.id.dch03)
    RadioGroup dch03;
    @BindView(R.id.dch0301)
    RadioButton dch0301;
    @BindView(R.id.dch0302)
    RadioButton dch0302;
    @BindView(R.id.dch0303)
    RadioButton dch0303;
    @BindView(R.id.dch04)
    RadioGroup dch04;
    @BindView(R.id.dch0401)
    RadioButton dch0401;
    @BindView(R.id.dch0402)
    RadioButton dch0402;
    @BindView(R.id.dch0403)
    RadioButton dch0403;
    @BindView(R.id.dch05)
    EditText dch05;
    @BindView(R.id.dch06)
    EditText dch06;
    @BindView(R.id.dch07)
    EditText dch07;
    @BindView(R.id.dch08)
    RadioGroup dch08;
    @BindView(R.id.dch0801)
    RadioButton dch0801;
    @BindView(R.id.dch0802)
    RadioButton dch0802;
    @BindView(R.id.dch09m)
    EditText dch09m;
    @BindView(R.id.dch09y)
    EditText dch09y;
    @BindView(R.id.dch09)
    RadioGroup dch09;
    @BindView(R.id.dch0901)
    RadioButton dch0901;
    @BindView(R.id.dch0902)
    RadioButton dch0902;
    @BindView(R.id.dch0903)
    RadioButton dch0903;
    @BindView(R.id.dch0996)
    RadioButton dch0996;
    @BindView(R.id.dch0999)
    RadioButton dch0999;
    @BindView(R.id.dch0996x)
    EditText dch0996x;
    @BindView(R.id.dch10)
    RadioGroup dch10;
    @BindView(R.id.dch1001)
    RadioButton dch1001;
    @BindView(R.id.dch1002)
    RadioButton dch1002;
    @BindView(R.id.dch1003)
    RadioButton dch1003;
    @BindView(R.id.dch1004)
    RadioButton dch1004;
    @BindView(R.id.dch11)
    RadioGroup dch11;
    @BindView(R.id.dch1101)
    RadioButton dch1101;
    @BindView(R.id.dch1102)
    RadioButton dch1102;
    @BindView(R.id.dch1199)
    RadioButton dch1199;
    @BindView(R.id.dch12)
    RadioGroup dch12;
    @BindView(R.id.dch1201)
    RadioButton dch1201;
    @BindView(R.id.dch1202)
    RadioButton dch1202;
    @BindView(R.id.dch1203)
    RadioButton dch1203;
    @BindView(R.id.dch1204)
    RadioButton dch1204;
    @BindView(R.id.dch1205)
    RadioButton dch1205;
    @BindView(R.id.dch1206)
    RadioButton dch1206;
    @BindView(R.id.dch1207)
    RadioButton dch1207;
    @BindView(R.id.dch1208)
    RadioButton dch1208;
    @BindView(R.id.dch1209)
    RadioButton dch1209;
    @BindView(R.id.dch1296)
    RadioButton dch1296;
    @BindView(R.id.dch1299)
    RadioButton dch1299;
    @BindView(R.id.dch1296x)
    EditText dch1296x;
    /*@BindView(R.id.dch13)
    RadioGroup dch13;
    @BindView(R.id.dch1301)*/
    /*RadioButton dch1301;
    @BindView(R.id.dch1302)
    RadioButton dch1302;*/
    @BindView(R.id.fldGrpdch02)
    LinearLayout fldGrpdch02;
    @BindView(R.id.fldGrpdch04)
    LinearLayout fldGrpdch04;
    @BindView(R.id.fldGrpdch05)
    LinearLayout fldGrpdch05;
    @BindView(R.id.fldGrpdch12)
    LinearLayout fldGrpdch12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section H: UNMET NEED");

        // ================ Q 9 Skip Check =================

        if (dch0901.isChecked() || dch0902.isChecked() || dch0903.isChecked() || dch0999.isChecked() || dch0996.isChecked()) {
            dch09m.setVisibility(View.GONE);
            dch09y.setVisibility(View.GONE);
            dch09m.setText(null);
            dch09y.setText(null);
        } else {
            dch09m.setVisibility(View.VISIBLE);
            dch09y.setVisibility(View.VISIBLE);

        }

        // ================== Q 9 others ============

        dch09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dch0996.getId()) {

                    dch0996x.setVisibility(View.VISIBLE);
                    dch0996x.requestFocus();

                } else {

                    dch0996x.setVisibility(View.GONE);
                    dch0996x.setText(null);
                }
            }
        });

        // ================== Q 12 others ============

        dch12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dch1296.getId()) {

                    dch1296x.setVisibility(View.VISIBLE);
                    dch1296x.requestFocus();

                } else {

                    dch1296x.setVisibility(View.GONE);
                    dch1296x.setText(null);
                }
            }
        });


        // ================== Q1 Skip Pattern ===============

        dch01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dch0101.isChecked()) {
                    fldGrpdch02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch02.setVisibility(View.GONE);
                    dch02.clearCheck();
                }
            }
        });

        dch0302.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpdch04.setVisibility(View.GONE);
                    fldGrpdch05.setVisibility(View.VISIBLE);
                    dch04.clearCheck();
                } else {
                    fldGrpdch04.setVisibility(View.VISIBLE);
                    fldGrpdch05.setVisibility(View.GONE);
                    dch05.setText(null);
                }
            }
        });

        dch0402.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //dch04.clearCheck();
                    fldGrpdch05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch05.setVisibility(View.GONE);
                    dch05.setText(null);
                }
            }
        });


       /* //============== Q4 Skip Pattern ==================
        dch04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dch0402.isChecked()) {
                    fldGrpdch05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch05.setVisibility(View.GONE);
                    dch05.setText(null);
                }
            }
        });*/

        dch11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dch1102.isChecked()) {
                    fldGrpdch12.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch12.setVisibility(View.GONE);
                    dch12.clearCheck();
                    dch1296x.setText(null);
                }
            }
        });



    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        /*if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("check", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/


    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, SectionIActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSH();

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

        JSONObject sH = new JSONObject();

        // Radio Group
        sH.put("dch01", dch0101.isChecked() ? "1" : dch0102.isChecked() ? "2" : "0");
        sH.put("dch02", dch0201.isChecked() ? "1" : dch0202.isChecked() ? "2" : "0");
        sH.put("dch03", dch0301.isChecked() ? "1" : dch0302.isChecked() ? "2" : dch0303.isChecked() ? "3" : "0");
        sH.put("dch04", dch0401.isChecked() ? "1" : dch0402.isChecked() ? "2" : dch0403.isChecked() ? "2" : "0");
        sH.put("dch05", dch05.getText().toString());
        sH.put("dch06", dch06.getText().toString());
        sH.put("dch07", dch07.getText().toString());
        sH.put("dch08", dch0801.isChecked() ? "1" : dch0802.isChecked() ? "2" : "0");
        sH.put("dch09m", dch09m.getText().toString());
        sH.put("dch09y", dch09y.getText().toString());
        sH.put("dch09", dch0901.isChecked() ? "1" : dch0902.isChecked() ? "2" : dch0903.isChecked() ? "3"
                : dch0996.isChecked() ? "96" : dch0999.isChecked() ? "99" : "0");
        sH.put("dch0996x", dch0996x.getText().toString());
        sH.put("dch10", dch1001.isChecked() ? "1" : dch1002.isChecked() ? "2" : dch1003.isChecked() ? "3" : "0");
        sH.put("dch11", dch1101.isChecked() ? "1" : dch1102.isChecked() ? "2" : dch1199.isChecked() ? "99" : "0");
        sH.put("dch12", dch1201.isChecked() ? "1" : dch1202.isChecked() ? "2" : dch1203.isChecked() ? "3"
                : dch1204.isChecked() ? "4" : dch1205.isChecked() ? "5" : dch1206.isChecked() ? "6"
                : dch1207.isChecked() ? "7" : dch1208.isChecked() ? "8" : dch1209.isChecked() ? "9"
                : dch1296.isChecked() ? "96" : dch1299.isChecked() ? "99" : "0");
        sH.put("dch1296x", dch1296x.getText().toString());
        //sh.put("dch13", dch1301.isChecked() ? "1" : dch1302.isChecked() ? "2" : "0");


        MainApp.fc.setsH(String.valueOf(sH));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        // ====================== Q 1 ==============
        if (dch01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch01), Toast.LENGTH_SHORT).show();
            dch0102.setError("This data is Required!");
            Log.i(TAG, "dch01: This data is Required!");
            return false;
        } else {
            dch0102.setError(null);
        }

        // ====================== Q 2 ===================

        if (dch0101.isChecked()) {
            if (dch02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch02), Toast.LENGTH_SHORT).show();
                dch0202.setError("This data is Required!");
                Log.i(TAG, "dch02: This data is Required!");
                return false;
            } else {
                dch0202.setError(null);
            }
        }

        // ==================== Q 3 ==================

        if (dch03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch03), Toast.LENGTH_SHORT).show();
            dch0302.setError("This data is Required!");
            Log.i(TAG, "dch03: This data is Required!");
            return false;
        } else {
            dch0302.setError(null);
        }


        // ================= Q 4 ========================
        if (dch0301.isChecked() || dch0302.isChecked()) {
            if (dch04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch04), Toast.LENGTH_SHORT).show();
                dch0402.setError("This data is Required!");
                Log.i(TAG, "dch04: This data is Required!");
                return false;
            } else {
                dch0402.setError(null);
            }
        }
        if (dch0303.isChecked() || dch0402.isChecked())
            if (dch05.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch05), Toast.LENGTH_SHORT).show();
                dch05.setError("This data is Required!");
                Log.i(TAG, "dch05: This data is Required!");
                return false;
            } else {
                dch05.setError(null);
            }


        //==================== Q 6 ==============

        if (dch06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch06), Toast.LENGTH_SHORT).show();
            dch06.setError("This data is Required!");
            Log.i(TAG, "dch06: This data is Required!");
            return false;
        } else {
            dch06.setError(null);
        }

        //==================== Q 7 ==============

        if (dch07.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch07), Toast.LENGTH_SHORT).show();
            dch07.setError("This data is Required!");
            Log.i(TAG, "dch07: This data is Required!");
            return false;
        } else {
            dch07.setError(null);
        }

        // =================== Q 8 ==================
        if (dch08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch08), Toast.LENGTH_SHORT).show();
            dch0802.setError("This data is Required!");
            Log.i(TAG, "dch08: This data is Required!");
            return false;
        } else {
            dch0802.setError(null);
        }


        // =================== Q 9 ==================
        if (dch09m.getText().toString().isEmpty() || dch09y.getText().toString().isEmpty() || dch09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch09), Toast.LENGTH_SHORT).show();
            dch0999.setError("This data is Required!");
            Log.i(TAG, "dch09: This data is Required!");
            return false;
        } else {
            dch0999.setError(null);
        }


        if (dch0996.isChecked() && dch0996x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch09) + "- " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dch0996x.setError("This data is Required!");
            Log.i(TAG, "dch0996x: This data is Required!");
            return false;
        } else {
            dch0996x.setError(null);
        }

        // =================== Q 10 ==================
        if (dch10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch10), Toast.LENGTH_SHORT).show();
            dch1004.setError("This data is Required!");
            Log.i(TAG, "dch10: This data is Required!");
            return false;
        } else {
            dch1004.setError(null);
        }

        // =================== Q 11 ==================
        if (dch11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch11), Toast.LENGTH_SHORT).show();
            dch1199.setError("This data is Required!");
            Log.i(TAG, "dch11: This data is Required!");
            return false;
        } else {
            dch1199.setError(null);
        }

        if (dch1101.isChecked()) {

            // =================== Q 12 ==================
            if (dch12.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch12), Toast.LENGTH_SHORT).show();
                dch1299.setError("This data is Required!");
                Log.i(TAG, "dch12: This data is Required!");
                return false;
            } else {
                dch1299.setError(null);
            }

            if (dch1296.isChecked() && dch1296x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch12) + "-" + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
                dch1296x.setError("This data is Required!");
                Log.i(TAG, "dch1296x: This data is Required!");
                return false;
            } else {
                dch1296x.setError(null);
            }
        }

        // =================== Q 13 ==================

        /*if (dch13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch13), Toast.LENGTH_SHORT).show();
            dch1302.setError("This data is Required!");
            Log.i(TAG, "dch13: This data is Required!");
            return false;
        } else {
            dch1302.setError(null);
        }*/

        return true;
    }


}
