package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
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

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionIActivity extends Activity {

    @BindView(R.id.activity_section_i)
    FrameLayout activitySectionI;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dci01)
    EditText dci01;
    @BindView(R.id.dci02)
    RadioGroup dci02;
    @BindView(R.id.dci0201)
    RadioButton dci0201;
    @BindView(R.id.dci0202)
    RadioButton dci0202;
    @BindView(R.id.dci03)
    EditText dci03;
    @BindView(R.id.dci04)
    EditText dci04;
    @BindView(R.id.dci05)
    DatePicker dci05;
    @BindView(R.id.dci06)
    RadioGroup dci06;
    @BindView(R.id.dci0601)
    RadioButton dci0601;
    @BindView(R.id.dci0602)
    RadioButton dci0602;
    @BindView(R.id.dci0699)
    RadioButton dci0699;
    @BindView(R.id.dci07d)
    EditText dci07d;
    @BindView(R.id.dci07m)
    EditText dci07m;
    @BindView(R.id.dci07y)
    EditText dci07y;
    @BindView(R.id.dci08)
    RadioGroup dci08;
    @BindView(R.id.dci0801)
    RadioButton dci0801;
    @BindView(R.id.dci0802)
    RadioButton dci0802;
    @BindView(R.id.dci0803)
    RadioButton dci0803;
    @BindView(R.id.dci09)
    EditText dci09;
    @BindView(R.id.dci10a)
    RadioGroup dci10a;
    @BindView(R.id.dci10a01)
    RadioButton dci10a01;
    @BindView(R.id.dci10a02)
    RadioButton dci10a02;
    @BindView(R.id.dci10b)
    RadioGroup dci10b;
    @BindView(R.id.dci10b01)
    RadioButton dci10b01;
    @BindView(R.id.dci10b02)
    RadioButton dci10b02;
    @BindView(R.id.dci11)
    RadioGroup dci11;
    @BindView(R.id.dci1101)
    RadioButton dci1101;
    @BindView(R.id.dci1102)
    RadioButton dci1102;
    @BindView(R.id.dci1199)
    RadioButton dci1199;
    @BindView(R.id.dci12)
    RadioGroup dci12;
    @BindView(R.id.dci1201)
    RadioButton dci1201;
    @BindView(R.id.dci1202)
    RadioButton dci1202;
    @BindView(R.id.dci1299)
    RadioButton dci1299;
    @BindView(R.id.dci13)
    RadioGroup dci13;
    @BindView(R.id.dci1301)
    RadioButton dci1301;
    @BindView(R.id.dci1302)
    RadioButton dci1302;
    @BindView(R.id.dci1399)
    RadioButton dci1399;
    @BindView(R.id.dci14)
    RadioGroup dci14;
    @BindView(R.id.dci1401)
    RadioButton dci1401;
    @BindView(R.id.dci1402)
    RadioButton dci1402;
    @BindView(R.id.dci1499)
    RadioButton dci1499;
    @BindView(R.id.dci15)
    RadioGroup dci15;
    @BindView(R.id.dci1501)
    RadioButton dci1501;
    @BindView(R.id.dci1502)
    RadioButton dci1502;
    @BindView(R.id.dci1599)
    RadioButton dci1599;
    @BindView(R.id.dci16)
    RadioGroup dci16;
    @BindView(R.id.dci1601)
    RadioButton dci1601;
    @BindView(R.id.dci1602)
    RadioButton dci1602;
    @BindView(R.id.dci1699)
    RadioButton dci1699;
    @BindView(R.id.dci17)
    RadioGroup dci17;
    @BindView(R.id.dci1701)
    RadioButton dci1701;
    @BindView(R.id.dci1702)
    RadioButton dci1702;
    @BindView(R.id.dci1799)
    RadioButton dci1799;
    @BindView(R.id.dci18a)
    RadioGroup dci18a;
    @BindView(R.id.dci18a01)
    RadioButton dci18a01;
    @BindView(R.id.dci18a02)
    RadioButton dci18a02;
    @BindView(R.id.dci18a99)
    RadioButton dci18a99;
    @BindView(R.id.dci18b)
    RadioGroup dci18b;
    @BindView(R.id.dci18b01)
    RadioButton dci18b01;
    @BindView(R.id.dci18b02)
    RadioButton dci18b02;
    @BindView(R.id.dci18b99)
    RadioButton dci18b99;
    @BindView(R.id.dci18btimes)
    EditText dci18btimes;
    @BindView(R.id.dci18c)
    RadioGroup dci18c;
    @BindView(R.id.dci18c01)
    RadioButton dci18c01;
    @BindView(R.id.dci18c02)
    RadioButton dci18c02;
    @BindView(R.id.dci18c99)
    RadioButton dci18c99;
    @BindView(R.id.dci18ctimes)
    EditText dci18ctimes;
    @BindView(R.id.dci18d)
    RadioGroup dci18d;
    @BindView(R.id.dci18d01)
    RadioButton dci18d01;
    @BindView(R.id.dci18d02)
    RadioButton dci18d02;
    @BindView(R.id.dci18d99)
    RadioButton dci18d99;
    @BindView(R.id.dci18e)
    RadioGroup dci18e;
    @BindView(R.id.dci18e01)
    RadioButton dci18e01;
    @BindView(R.id.dci18e02)
    RadioButton dci18e02;
    @BindView(R.id.dci18e99)
    RadioButton dci18e99;
    @BindView(R.id.dci18f)
    RadioGroup dci18f;
    @BindView(R.id.dci18f01)
    RadioButton dci18f01;
    @BindView(R.id.dci18f02)
    RadioButton dci18f02;
    @BindView(R.id.dci18f99)
    RadioButton dci18f99;
    @BindView(R.id.dci18ftimes)
    EditText dci18ftimes;
    @BindView(R.id.dci18g)
    RadioGroup dci18g;
    @BindView(R.id.dci18g01)
    RadioButton dci18g01;
    @BindView(R.id.dci18g02)
    RadioButton dci18g02;
    @BindView(R.id.dci18g99)
    RadioButton dci18g99;
    @BindView(R.id.dci18h)
    RadioGroup dci18h;
    @BindView(R.id.dci18h01)
    RadioButton dci18h01;
    @BindView(R.id.dci18h02)
    RadioButton dci18h02;
    @BindView(R.id.dci18h99)
    RadioButton dci18h99;
    @BindView(R.id.dci19a)
    RadioGroup dci19a;
    @BindView(R.id.dci19a01)
    RadioButton dci19a01;
    @BindView(R.id.dci19a02)
    RadioButton dci19a02;
    @BindView(R.id.dci19b)
    RadioGroup dci19b;
    @BindView(R.id.dci19b01)
    RadioButton dci19b01;
    @BindView(R.id.dci19b02)
    RadioButton dci19b02;
    @BindView(R.id.dci19c)
    RadioGroup dci19c;
    @BindView(R.id.dci19c01)
    RadioButton dci19c01;
    @BindView(R.id.dci19c02)
    RadioButton dci19c02;
    @BindView(R.id.dci19d)
    RadioGroup dci19d;
    @BindView(R.id.dci19d01)
    RadioButton dci19d01;
    @BindView(R.id.dci19d02)
    RadioButton dci19d02;
    @BindView(R.id.dci19e)
    RadioGroup dci19e;
    @BindView(R.id.dci19e01)
    RadioButton dci19e01;
    @BindView(R.id.dci19e02)
    RadioButton dci19e02;
    @BindView(R.id.dci19f)
    RadioGroup dci19f;
    @BindView(R.id.dci19f01)
    RadioButton dci19f01;
    @BindView(R.id.dci19f02)
    RadioButton dci19f02;
    @BindView(R.id.dci19g)
    RadioGroup dci19g;
    @BindView(R.id.dci19g01)
    RadioButton dci19g01;
    @BindView(R.id.dci19g02)
    RadioButton dci19g02;
    @BindView(R.id.dci19h)
    RadioGroup dci19h;
    @BindView(R.id.dci19h01)
    RadioButton dci19h01;
    @BindView(R.id.dci19h02)
    RadioButton dci19h02;
    @BindView(R.id.dci19i)
    RadioGroup dci19i;
    @BindView(R.id.dci19i01)
    RadioButton dci19i01;
    @BindView(R.id.dci19i02)
    RadioButton dci19i02;
    @BindView(R.id.dci19j)
    RadioGroup dci19j;
    @BindView(R.id.dci19j01)
    RadioButton dci19j01;
    @BindView(R.id.dci19j02)
    RadioButton dci19j02;
    @BindView(R.id.dci19k)
    RadioGroup dci19k;
    @BindView(R.id.dci19k01)
    RadioButton dci19k01;
    @BindView(R.id.dci19k02)
    RadioButton dci19k02;
    @BindView(R.id.dci19l)
    RadioGroup dci19l;
    @BindView(R.id.dci19l01)
    RadioButton dci19l01;
    @BindView(R.id.dci19l02)
    RadioButton dci19l02;
    @BindView(R.id.dci19m)
    RadioGroup dci19m;
    @BindView(R.id.dci19m01)
    RadioButton dci19m01;
    @BindView(R.id.dci19m02)
    RadioButton dci19m02;
    @BindView(R.id.dci19n)
    RadioGroup dci19n;
    @BindView(R.id.dci19n01)
    RadioButton dci19n01;
    @BindView(R.id.dci19n02)
    RadioButton dci19n02;
    @BindView(R.id.dci19o)
    RadioGroup dci19o;
    @BindView(R.id.dci19o01)
    RadioButton dci19o01;
    @BindView(R.id.dci19o02)
    RadioButton dci19o02;
    @BindView(R.id.dci19p)
    RadioGroup dci19p;
    @BindView(R.id.dci19p01)
    RadioButton dci19p01;
    @BindView(R.id.dci19p02)
    RadioButton dci19p02;
    @BindView(R.id.dci19q)
    RadioGroup dci19q;
    @BindView(R.id.dci19q01)
    RadioButton dci19q01;
    @BindView(R.id.dci19q02)
    RadioButton dci19q02;
    @BindView(R.id.dci20)
    RadioGroup dci20;
    @BindView(R.id.dci2001)
    RadioButton dci2001;
    @BindView(R.id.dci2002)
    RadioButton dci2002;
    @BindView(R.id.dci2099)
    RadioButton dci2099;
    @BindView(R.id.fldGrpdci20)
    LinearLayout fldGrpdci20;
    @BindView(R.id.dci2101)
    EditText dci2101;
    @BindView(R.id.dci2199)
    CheckBox dci2199;
    @BindView(R.id.dci22)
    RadioGroup dci22;
    @BindView(R.id.dci2201)
    RadioButton dci2201;
    @BindView(R.id.dci2202)
    RadioButton dci2202;
    @BindView(R.id.dci2299)
    RadioButton dci2299;
    String dob = null;
    @BindView(R.id.dci18i)
    RadioGroup dci18i;
    @BindView(R.id.dci18i01)
    RadioButton dci18i01;
    @BindView(R.id.dci18i02)
    RadioButton dci18i02;
    @BindView(R.id.dci18i99)
    RadioButton dci18i99;
    @BindView(R.id.dci18ix)
    EditText dci18ix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section I: IYCF (0-23 Month)");
        dci05.setMaxDate(new Date().getTime());
        dob = new SimpleDateFormat("dd-MM-yyyy").format(dci05.getCalendarView().getDate());

        // ============= Q 18 B =============
        if (dci18b01.isChecked()) {
            dci18btimes.setVisibility(View.VISIBLE);
        } else {
            dci18btimes.setVisibility(View.GONE);
            dci18btimes.setText(null);
        }

        // ============= Q 18 C =============
        if (dci18c01.isChecked()) {
            dci18ctimes.setVisibility(View.VISIBLE);
        } else {
            dci18ctimes.setVisibility(View.GONE);
            dci18ctimes.setText(null);
        }

        // ============= Q 18 F =============
        if (dci18f01.isChecked()) {
            dci18ftimes.setVisibility(View.VISIBLE);
        } else {
            dci18ftimes.setVisibility(View.GONE);
            dci18ftimes.setText(null);
        }

        dci2101.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                dci2199.setEnabled(false);
                dci2199.setChecked(false);
            }

            @Override
            public void afterTextChanged(Editable s) {

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

                Intent secNext = new Intent(this, SectionJActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        //SRCDBHelper db = new SRCDBHelper(this);

        //int updcount = db.updateSi();

//        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        //      } else {
        //        Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        //      return false;
        // }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject si = new JSONObject();

        si.put("dci01", dci01.getText().toString());
        si.put("dci02", dci0201.isChecked() ? "1" : dci0202.isChecked() ? "2" : "0");
        si.put("dci03", dci03.getText().toString());
        si.put("dci04", dci04.getText().toString());
        si.put("dci05", dob);
        si.put("dci06", dci0601.isChecked() ? "1" : dci0602.isChecked() ? "2" : dci0699.isChecked() ? "99" : "0");
        si.put("dci07d", dci07d.getText().toString());
        si.put("dci07m", dci07m.getText().toString());
        si.put("dci07y", dci07y.getText().toString());
        si.put("dci08", dci0801.isChecked() ? "1" : dci0802.isChecked() ? "2" : dci0803.isChecked() ? "3" : "0");
        si.put("dci09", dci09.getText().toString());
        si.put("dci10a", dci10a01.isChecked() ? "1" : dci10a02.isChecked() ? "2" : "0");
        si.put("dci10b", dci10b01.isChecked() ? "1" : dci10b02.isChecked() ? "2" : "0");
        si.put("dci11", dci1101.isChecked() ? "1" : dci1102.isChecked() ? "2" : dci1199.isChecked() ? "99" : "0");
        si.put("dci12", dci1201.isChecked() ? "1" : dci1202.isChecked() ? "2" : dci1299.isChecked() ? "99" : "0");
        si.put("dci13", dci1301.isChecked() ? "1" : dci1302.isChecked() ? "2" : dci1399.isChecked() ? "99" : "0");
        si.put("dci14", dci1401.isChecked() ? "1" : dci1402.isChecked() ? "2" : dci1499.isChecked() ? "99" : "0");
        si.put("dci15", dci1501.isChecked() ? "1" : dci1502.isChecked() ? "2" : dci1599.isChecked() ? "99" : "0");
        si.put("dci11", dci1101.isChecked() ? "1" : dci1102.isChecked() ? "2" : dci1199.isChecked() ? "99" : "0");
        si.put("dci16", dci1601.isChecked() ? "1" : dci1602.isChecked() ? "2" : dci1699.isChecked() ? "99" : "0");
        si.put("dci17", dci1701.isChecked() ? "1" : dci1702.isChecked() ? "2" : dci1799.isChecked() ? "99" : "0");
        si.put("dci18a", dci18a01.isChecked() ? "1" : dci18a02.isChecked() ? "2" : dci18a99.isChecked() ? "99" : "0");
        si.put("dci18b", dci18b01.isChecked() ? "1" : dci18b02.isChecked() ? "2" : dci18b99.isChecked() ? "99" : "0");
        si.put("dci18c", dci18c01.isChecked() ? "1" : dci18c02.isChecked() ? "2" : dci18c99.isChecked() ? "99" : "0");
        si.put("dci18d", dci18d01.isChecked() ? "1" : dci18d02.isChecked() ? "2" : dci18d99.isChecked() ? "99" : "0");
        si.put("dci18e", dci18e01.isChecked() ? "1" : dci18e02.isChecked() ? "2" : dci18e99.isChecked() ? "99" : "0");
        si.put("dci18f", dci18f01.isChecked() ? "1" : dci18f02.isChecked() ? "2" : dci18f99.isChecked() ? "99" : "0");
        si.put("dci18g", dci18g01.isChecked() ? "1" : dci18g02.isChecked() ? "2" : dci18g99.isChecked() ? "99" : "0");
        si.put("dci18h", dci18h01.isChecked() ? "1" : dci18h02.isChecked() ? "2" : dci18h99.isChecked() ? "99" : "0");
        si.put("dci19a", dci19a01.isChecked() ? "1" : dci19a02.isChecked() ? "2" : "0");
        si.put("dci19b", dci19b01.isChecked() ? "1" : dci19b02.isChecked() ? "2" : "0");
        si.put("dci19c", dci19c01.isChecked() ? "1" : dci19c02.isChecked() ? "2" : "0");
        si.put("dci19d", dci19d01.isChecked() ? "1" : dci19d02.isChecked() ? "2" : "0");
        si.put("dci19e", dci19e01.isChecked() ? "1" : dci19e02.isChecked() ? "2" : "0");
        si.put("dci19f", dci19f01.isChecked() ? "1" : dci19f02.isChecked() ? "2" : "0");
        si.put("dci19g", dci19g01.isChecked() ? "1" : dci19g02.isChecked() ? "2" : "0");
        si.put("dci19h", dci19h01.isChecked() ? "1" : dci19h02.isChecked() ? "2" : "0");
        si.put("dci19i", dci19i01.isChecked() ? "1" : dci19i02.isChecked() ? "2" : "0");
        si.put("dci19j", dci19j01.isChecked() ? "1" : dci19j02.isChecked() ? "2" : "0");
        si.put("dci19k", dci19k01.isChecked() ? "1" : dci19k02.isChecked() ? "2" : "0");
        si.put("dci19l", dci19l01.isChecked() ? "1" : dci19l02.isChecked() ? "2" : "0");
        si.put("dci19m", dci19m01.isChecked() ? "1" : dci19m02.isChecked() ? "2" : "0");
        si.put("dci19n", dci19n01.isChecked() ? "1" : dci19n02.isChecked() ? "2" : "0");
        si.put("dci19o", dci19o01.isChecked() ? "1" : dci19o02.isChecked() ? "2" : "0");
        si.put("dci19p", dci19p01.isChecked() ? "1" : dci19p02.isChecked() ? "2" : "0");
        si.put("dci19q", dci19q01.isChecked() ? "1" : dci19q02.isChecked() ? "2" : "0");
        si.put("dci20", dci2001.isChecked() ? "1" : dci2002.isChecked() ? "2" : dci2099.isChecked() ? "99" : "0");
        si.put("dci2101", dci2101.getText().toString());
        si.put("dci21", dci2199.isChecked() ? "99" : "0");
        si.put("dci22", dci2201.isChecked() ? "1" : dci2202.isChecked() ? "2" : dci2299.isChecked() ? "99" : "0");

        // DCEApp.fc.setROW_Si(String.valueOf(si));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();


    }

    public boolean ValidateForm() {

        // ====================== Q 1 ==============
        if (dci01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci01), Toast.LENGTH_SHORT).show();
            dci01.setError("This data is Required!");
            return false;
        } else {
            dci01.setError(null);
        }

        // ====================== Q 2 ==============
        if (dci02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci02), Toast.LENGTH_SHORT).show();
            dci0202.setError("This data is Required!");
            return false;
        } else {
            dci0202.setError(null);
        }

        // ====================== Q 3 ==============
        if (dci03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci03), Toast.LENGTH_SHORT).show();
            dci03.setError("This data is Required!");
            return false;
        } else {
            dci03.setError(null);
        }

        // ====================== Q 4 ==============
        if (dci04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci04), Toast.LENGTH_SHORT).show();
            dci04.setError("This data is Required!");
            return false;
        } else {
            dci04.setError(null);
        }

        // ====================== Q 6 ==============
        if (dci06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci06), Toast.LENGTH_SHORT).show();
            dci0699.setError("This data is Required!");
            return false;
        } else {
            dci0699.setError(null);
        }

        // ====================== Q 7 ==============
        if (dci07d.getText().toString().isEmpty() && dci07m.getText().toString().isEmpty() && dci07y.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci07), Toast.LENGTH_SHORT).show();
            dci07y.setError("This data is Required!");
            dci07y.requestFocus();
            return false;
        } else {
            dci07y.setError(null);
        }

        // ====================== Q 8 ==============
        if (dci08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci08), Toast.LENGTH_SHORT).show();
            dci0803.setError("This data is Required!");
            return false;
        } else {
            dci0803.setError(null);
        }

        // ====================== Q 9 ==============
        if (dci09.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci09), Toast.LENGTH_SHORT).show();
            dci09.setError("This data is Required!");
            return false;
        } else {
            dci09.setError(null);
        }

        // ====================== Q 10a ==============
        if (dci10a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci10a), Toast.LENGTH_SHORT).show();
            dci10a02.setError("This data is Required!");
            return false;
        } else {
            dci10a02.setError(null);
        }

        // ====================== Q 10b ==============
        if (dci10b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci10b), Toast.LENGTH_SHORT).show();
            dci10b02.setError("This data is Required!");
            return false;
        } else {
            dci10b02.setError(null);
        }

        // ====================== Q 11 ==============
        if (dci11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci11), Toast.LENGTH_SHORT).show();
            dci1199.setError("This data is Required!");
            return false;
        } else {
            dci1199.setError(null);
        }
        // ====================== Q 12 ==============
        if (dci12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci12), Toast.LENGTH_SHORT).show();
            dci1299.setError("This data is Required!");
            return false;
        } else {
            dci1299.setError(null);
        }
        // ====================== Q 13 ==============
        if (dci13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci13), Toast.LENGTH_SHORT).show();
            dci1399.setError("This data is Required!");
            return false;
        } else {
            dci1399.setError(null);
        }
        // ====================== Q 14 ==============
        if (dci14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci12), Toast.LENGTH_SHORT).show();
            dci1499.setError("This data is Required!");
            return false;
        } else {
            dci1499.setError(null);
        }
        // ====================== Q 15 ==============
        if (dci15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci12), Toast.LENGTH_SHORT).show();
            dci1599.setError("This data is Required!");
            return false;
        } else {
            dci1599.setError(null);
        }
        // ====================== Q 16 ==============
        if (dci16.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci16), Toast.LENGTH_SHORT).show();
            dci1699.setError("This data is Required!");
            return false;
        } else {
            dci1699.setError(null);
        }

        // ====================== Q 17 ==============
        if (dci17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci17), Toast.LENGTH_SHORT).show();
            dci1799.setError("This data is Required!");
            return false;
        } else {
            dci1799.setError(null);
        }

        // ====================== Q 18A ==============
        if (dci18a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18a), Toast.LENGTH_SHORT).show();
            dci18a99.setError("This data is Required!");
            return false;
        } else {
            dci18a99.setError(null);
        }
        // ====================== Q 18B ==============
        if (dci18b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18b), Toast.LENGTH_SHORT).show();
            dci18b99.setError("This data is Required!");
            return false;
        } else {
            dci18b99.setError(null);
        }

        if (dci18b01.isChecked() && dci18btimes.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dci18btimes.setError("This data is Required!");
            dci18btimes.requestFocus();
            return false;
        } else {
            dci18btimes.setError(null);
        }


        // ====================== Q 18C ==============
        if (dci18c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18c), Toast.LENGTH_SHORT).show();
            dci18c99.setError("This data is Required!");
            return false;
        } else {
            dci18c99.setError(null);
        }

        if (dci18c01.isChecked() && dci18ctimes.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dci18ctimes.setError("This data is Required!");
            dci18ctimes.requestFocus();
            return false;
        } else {
            dci18ctimes.setError(null);
        }

        // ====================== Q 18D ==============
        if (dci18d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18d), Toast.LENGTH_SHORT).show();
            dci18d99.setError("This data is Required!");
            return false;
        } else {
            dci18d99.setError(null);
        }
        // ====================== Q 18E ==============
        if (dci18e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18e), Toast.LENGTH_SHORT).show();
            dci18e99.setError("This data is Required!");
            return false;
        } else {
            dci18e99.setError(null);
        }
        // ====================== Q 18F ==============
        if (dci18f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18f), Toast.LENGTH_SHORT).show();
            dci18f99.setError("This data is Required!");
            return false;
        } else {
            dci18f99.setError(null);
        }

        if (dci18f01.isChecked() && dci18ftimes.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dci18ftimes.setError("This data is Required!");
            dci18ftimes.requestFocus();
            return false;
        } else {
            dci18ftimes.setError(null);
        }

        // ====================== Q 18G ==============
        if (dci18g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18g), Toast.LENGTH_SHORT).show();
            dci18g99.setError("This data is Required!");
            return false;
        } else {
            dci18g99.setError(null);
        }
        // ====================== Q 18H ==============
        if (dci18h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18h), Toast.LENGTH_SHORT).show();
            dci18h99.setError("This data is Required!");
            return false;
        } else {
            dci18h99.setError(null);
        }
        // ====================== Q 18I ==============
        if (dci18i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci18i), Toast.LENGTH_SHORT).show();
            dci18i99.setError("This data is Required!");
            return false;
        } else {
            dci18i99.setError(null);
        }
        // ====================== Q 19A ==============
        if (dci19a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19a), Toast.LENGTH_SHORT).show();
            dci19a02.setError("This data is Required!");
            return false;
        } else {
            dci19a02.setError(null);
        }
        // ====================== Q 19B ==============
        if (dci19b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19b), Toast.LENGTH_SHORT).show();
            dci19b02.setError("This data is Required!");
            return false;
        } else {
            dci19b02.setError(null);
        }
        // ====================== Q 19C ==============
        if (dci19c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19c), Toast.LENGTH_SHORT).show();
            dci19c02.setError("This data is Required!");
            return false;
        } else {
            dci19c02.setError(null);
        }
        // ====================== Q 19D ==============
        if (dci19d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19d), Toast.LENGTH_SHORT).show();
            dci19d02.setError("This data is Required!");
            return false;
        } else {
            dci19d02.setError(null);
        }
        // ====================== Q 19E ==============
        if (dci19e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19e), Toast.LENGTH_SHORT).show();
            dci19e02.setError("This data is Required!");
            return false;
        } else {
            dci19e02.setError(null);
        }
        // ====================== Q 19F ==============
        if (dci19f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19f), Toast.LENGTH_SHORT).show();
            dci19f02.setError("This data is Required!");
            return false;
        } else {
            dci19f02.setError(null);
        }

        // ====================== Q 19G ==============
        if (dci19g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19g), Toast.LENGTH_SHORT).show();
            dci19g02.setError("This data is Required!");
            return false;
        } else {
            dci19g02.setError(null);
        }
        // ====================== Q 19H ==============
        if (dci19h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19h), Toast.LENGTH_SHORT).show();
            dci19h02.setError("This data is Required!");
            return false;
        } else {
            dci19h02.setError(null);
        }
        // ====================== Q 19I ==============
        if (dci19i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19i), Toast.LENGTH_SHORT).show();
            dci19i02.setError("This data is Required!");
            return false;
        } else {
            dci19i02.setError(null);
        }
        // ====================== Q 19J ==============
        if (dci19j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19j), Toast.LENGTH_SHORT).show();
            dci19j02.setError("This data is Required!");
            return false;
        } else {
            dci19j02.setError(null);
        }
        // ====================== Q 19K ==============
        if (dci19k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19k), Toast.LENGTH_SHORT).show();
            dci19k02.setError("This data is Required!");
            return false;
        } else {
            dci19k02.setError(null);
        }
        // ====================== Q 19L ==============
        if (dci19l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19l), Toast.LENGTH_SHORT).show();
            dci19l02.setError("This data is Required!");
            return false;
        } else {
            dci19l02.setError(null);
        }
        // ====================== Q 19M ==============
        if (dci19m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19m), Toast.LENGTH_SHORT).show();
            dci19m02.setError("This data is Required!");
            return false;
        } else {
            dci19m02.setError(null);
        }
        // ====================== Q 19N ==============
        if (dci19n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19n), Toast.LENGTH_SHORT).show();
            dci19n02.setError("This data is Required!");
            return false;
        } else {
            dci19n02.setError(null);
        }
        // ====================== Q 19O ==============
        if (dci19o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19o), Toast.LENGTH_SHORT).show();
            dci19o02.setError("This data is Required!");
            return false;
        } else {
            dci19o02.setError(null);
        }
        // ====================== Q 19P ==============
        if (dci19p.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19p), Toast.LENGTH_SHORT).show();
            dci19p02.setError("This data is Required!");
            return false;
        } else {
            dci19p02.setError(null);
        }
        // ====================== Q 19Q ==============
        if (dci19q.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci19q), Toast.LENGTH_SHORT).show();
            dci19q02.setError("This data is Required!");
            return false;
        } else {
            dci19q02.setError(null);
        }

        // ====================== Q 20 ==============
        if (dci20.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci20), Toast.LENGTH_SHORT).show();
            dci2099.setError("This data is Required!");
            return false;
        } else {
            dci2099.setError(null);
        }

        // ====================== Q 21 ==============
        if (dci2101.getText().toString().isEmpty() && (!(dci2199.isChecked()))) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci21), Toast.LENGTH_SHORT).show();
            dci2199.setError("This data is Required!");
            return false;
        } else {
            dci2199.setError(null);
        }

        if (dci2199.isChecked()) {
            dci2101.setEnabled(false);
            dci2101.setText(null);
        } else {
            dci2101.setEnabled(true);
        }

        // ====================== Q 21 ==============
        if (dci22.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dci22), Toast.LENGTH_SHORT).show();
            dci2299.setError("This data is Required!");
            return false;
        } else {
            dci2299.setError(null);
        }
































        return true;
    }

}

