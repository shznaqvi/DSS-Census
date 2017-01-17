package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionHActivity extends Activity {

    @BindView(R.id.activity_sectionH)
    FrameLayout activitySectionH;
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
    @BindView(R.id.fldGrpdch02)
    LinearLayout fldGrpdch02;
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
    @BindView(R.id.dch04)
    RadioGroup dch04;
    @BindView(R.id.dch0401)
    RadioButton dch0401;
    @BindView(R.id.dch0402)
    RadioButton dch0402;
    @BindView(R.id.dch0499)
    RadioButton dch0499;
    @BindView(R.id.dch05)
    RadioGroup dch05;
    @BindView(R.id.dch0501)
    RadioButton dch0501;
    @BindView(R.id.dch0502)
    RadioButton dch0502;
    @BindView(R.id.dch0503)
    RadioButton dch0503;
    @BindView(R.id.dch06)
    RadioGroup dch06;
    @BindView(R.id.dch0601)
    RadioButton dch0601;
    @BindView(R.id.dch0602)
    RadioButton dch0602;
    @BindView(R.id.dch07)
    RadioGroup dch07;
    @BindView(R.id.dch0701)
    RadioButton dch0701;
    @BindView(R.id.dch0702)
    RadioButton dch0702;
    @BindView(R.id.dch0703)
    RadioButton dch0703;
    @BindView(R.id.dch0799)
    RadioButton dch0799;
    @BindView(R.id.dch08m)
    EditText dch08m;
    @BindView(R.id.dch08y)
    EditText dch08y;
    @BindView(R.id.dch08)
    RadioGroup dch08;
    @BindView(R.id.dch0801)
    RadioButton dch0801;
    @BindView(R.id.dch0802)
    RadioButton dch0802;
    @BindView(R.id.dch0803)
    RadioButton dch0803;
    @BindView(R.id.dch0896)
    RadioButton dch0896;
    @BindView(R.id.dch0899)
    RadioButton dch0899;
    @BindView(R.id.dch0896x)
    EditText dch0896x;
    @BindView(R.id.dch09)
    RadioGroup dch09;
    @BindView(R.id.dch0901)
    RadioButton dch0901;
    @BindView(R.id.dch0902)
    RadioButton dch0902;
    @BindView(R.id.dch0903)
    RadioButton dch0903;
    @BindView(R.id.dch10)
    RadioGroup dch10;
    @BindView(R.id.dch1001)
    RadioButton dch1001;
    @BindView(R.id.dch1002)
    RadioButton dch1002;
    @BindView(R.id.dch1099)
    RadioButton dch1099;
    @BindView(R.id.dch11)
    RadioGroup dch11;
    @BindView(R.id.dch1101)
    RadioButton dch1101;
    @BindView(R.id.dch1102)
    RadioButton dch1102;
    @BindView(R.id.dch1103)
    RadioButton dch1103;
    @BindView(R.id.dch1104)
    RadioButton dch1104;
    @BindView(R.id.dch1105)
    RadioButton dch1105;
    @BindView(R.id.dch1106)
    RadioButton dch1106;
    @BindView(R.id.dch1107)
    RadioButton dch1107;
    @BindView(R.id.dch1108)
    RadioButton dch1108;
    @BindView(R.id.dch1109)
    RadioButton dch1109;
    @BindView(R.id.dch1196)
    RadioButton dch1196;
    @BindView(R.id.dch1199)
    RadioButton dch1199;
    @BindView(R.id.dch1196x)
    EditText dch1196x;
    @BindView(R.id.dch12)
    RadioGroup dch12;
    @BindView(R.id.dch1201)
    RadioButton dch1201;
    @BindView(R.id.dch1202)
    RadioButton dch1202;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section H: UNMET NEED");

        // ================ Q 8 Skip Check =================

        if (dch0801.isChecked() || dch0802.isChecked() || dch0803.isChecked() || dch0899.isChecked() || dch0896.isChecked()) {
            dch08m.setVisibility(View.GONE);
            dch08y.setVisibility(View.GONE);
            dch08m.setText(null);
            dch08y.setText(null);
        } else {
            dch08m.setVisibility(View.VISIBLE);
            dch08y.setVisibility(View.VISIBLE);

        }

        // ================== Q 8 others ============

        dch08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dch0896.getId()) {

                    dch0896x.setVisibility(View.VISIBLE);
                    dch0896x.requestFocus();

                } else {

                    dch0896x.setVisibility(View.GONE);
                    dch0896x.setText(null);
                }
            }
        });

        // ================== Q 11 others ============

        dch11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dch1196.getId()) {

                    dch1196x.setVisibility(View.VISIBLE);
                    dch1196x.requestFocus();

                } else {

                    dch1196x.setVisibility(View.GONE);
                    dch1196x.setText(null);
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
        Intent endSec = new Intent(this, SectionIActivity.class);
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
        //SRCDBHelper db = new SRCDBHelper(this);

        //int updcount = db.updateSh();

        //if (updcount == 1) {
        //Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
        // return true;
        //} //else {
        //Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return true;
        //}

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sh = new JSONObject();

        // Radio Group
        sh.put("dch01", dch0101.isChecked() ? "1" : dch0102.isChecked() ? "2" : "0");
        sh.put("dch02", dch0201.isChecked() ? "1" : dch0202.isChecked() ? "2" : "0");
        sh.put("dch03", dch0301.isChecked() ? "1" : dch0302.isChecked() ? "2" : "0");
        sh.put("dch04", dch0401.isChecked() ? "1" : dch0402.isChecked() ? "2" : dch0499.isChecked() ? "99" : "0");
        sh.put("dch05", dch0501.isChecked() ? "1" : dch0502.isChecked() ? "2" : dch0503.isChecked() ? "3" : "0");
        sh.put("dch06", dch0601.isChecked() ? "1" : dch0602.isChecked() ? "2" : "0");
        sh.put("dch07", dch0701.isChecked() ? "1" : dch0702.isChecked() ? "2" : dch0703.isChecked() ? "3"
                : dch0799.isChecked() ? "99" : "0");
        sh.put("dch08m", dch08m.getText().toString());
        sh.put("dch08y", dch08y.getText().toString());
        sh.put("dch08", dch0801.isChecked() ? "1" : dch0802.isChecked() ? "2" : dch0803.isChecked() ? "3"
                : dch0896.isChecked() ? "96" : dch0899.isChecked() ? "99" : "0");
        sh.put("dch0896x", dch0896x.getText().toString());
        sh.put("dch09", dch0901.isChecked() ? "1" : dch0902.isChecked() ? "2" : dch0903.isChecked() ? "3" : "0");
        sh.put("dch10", dch1001.isChecked() ? "1" : dch1002.isChecked() ? "2" : dch1099.isChecked() ? "99" : "0");
        sh.put("dch11", dch1101.isChecked() ? "1" : dch1102.isChecked() ? "2" : dch1103.isChecked() ? "3"
                : dch1104.isChecked() ? "4" : dch1105.isChecked() ? "5" : dch1106.isChecked() ? "6"
                : dch1107.isChecked() ? "7" : dch1108.isChecked() ? "8" : dch1109.isChecked() ? "9"
                : dch1196.isChecked() ? "96" : dch1199.isChecked() ? "99" : "0");
        sh.put("dch1196x", dch1196x.getText().toString());
        sh.put("dch12", dch1201.isChecked() ? "1" : dch1202.isChecked() ? "2" : "0");


        // DCEApp.fc.setROW_Sh(String.valueOf(sh));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        // ====================== Q 1 ==============
        if (dch01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch01), Toast.LENGTH_SHORT).show();
            dch0102.setError("This data is Required!");
            return false;
        } else {
            dch0102.setError(null);
        }

        // ====================== Q 2 ===================

        if (dch02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch02), Toast.LENGTH_SHORT).show();
            dch0202.setError("This data is Required!");
            return false;
        } else {
            dch0202.setError(null);
        }

        // ==================== Q 3 ==================

        if (dch03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch03), Toast.LENGTH_SHORT).show();
            dch0302.setError("This data is Required!");
            return false;
        } else {
            dch0302.setError(null);
        }

        // ================= Q 4 ========================

        if (dch04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch04), Toast.LENGTH_SHORT).show();
            dch0499.setError("This data is Required!");
            return false;
        } else {
            dch0499.setError(null);
        }

        // ================== Q 5 =============
        if (dch05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch05), Toast.LENGTH_SHORT).show();
            dch0503.setError("This data is Required!");
            return false;
        } else {
            dch0503.setError(null);
        }

        // =================== Q 6 ==================
        if (dch06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch06), Toast.LENGTH_SHORT).show();
            dch0602.setError("This data is Required!");
            return false;
        } else {
            dch0602.setError(null);
        }

        // =================== Q 7 ==================
        if (dch07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch07), Toast.LENGTH_SHORT).show();
            dch0799.setError("This data is Required!");
            return false;
        } else {
            dch0799.setError(null);
        }

        // =================== Q 8 ==================
        if (dch08m.getText().toString().isEmpty() || dch08y.getText().toString().isEmpty() || dch08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch08), Toast.LENGTH_SHORT).show();
            dch0899.setError("This data is Required!");
            return false;
        } else {
            dch0899.setError(null);
        }


        if (dch0896.isChecked() && dch0896x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dch0896x.setError("This data is Required!");
            return false;
        } else {
            dch0896x.setError(null);
        }

        // =================== Q 9 ==================
        if (dch09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch09), Toast.LENGTH_SHORT).show();
            dch0903.setError("This data is Required!");
            return false;
        } else {
            dch0903.setError(null);
        }

        // =================== Q 10 ==================
        if (dch10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch10), Toast.LENGTH_SHORT).show();
            dch1099.setError("This data is Required!");
            return false;
        } else {
            dch1099.setError(null);
        }

        // =================== Q 11 ==================
        if (dch11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch11), Toast.LENGTH_SHORT).show();
            dch1199.setError("This data is Required!");
            return false;
        } else {
            dch1199.setError(null);
        }

        if (dch1196.isChecked() && dch1196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dch1196x.setError("This data is Required!");
            return false;
        } else {
            dch1196x.setError(null);
        }

        // =================== Q 12 ==================

        if (dch12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch12), Toast.LENGTH_SHORT).show();
            dch1202.setError("This data is Required!");
            return false;
        } else {
            dch1202.setError(null);
        }

        return true;
    }


}
