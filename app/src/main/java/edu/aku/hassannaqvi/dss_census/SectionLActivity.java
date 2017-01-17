package edu.aku.hassannaqvi.dss_census;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionLActivity extends Activity  {

    @BindView(R.id.activity_section_l) RelativeLayout activitySectionL;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcl01am) CheckBox dcl01am;
    @BindView(R.id.dcl01a1) RadioGroup dcl01a1;
    @BindView(R.id.dcl01a101) RadioButton dcl01a101;
    @BindView(R.id.dcl01a102) RadioButton dcl01a102;
    @BindView(R.id.dcl01a1fr) EditText dcl01a1fr;
    @BindView(R.id.dcl01ac) CheckBox dcl01ac;
    @BindView(R.id.dcl01a2) RadioGroup dcl01a2;
    @BindView(R.id.dcl01a201) RadioButton dcl01a201;
    @BindView(R.id.dcl01a202) RadioButton dcl01a202;
    @BindView(R.id.dcl01a2fr) EditText dcl01a2fr;
    @BindView(R.id.dcl01bm) CheckBox dcl01bm;
    @BindView(R.id.dcl01b1) RadioGroup dcl01b1;
    @BindView(R.id.dcl01b101) RadioButton dcl01b101;
    @BindView(R.id.dcl01b102) RadioButton dcl01b102;
    @BindView(R.id.dcl01b1fr) EditText dcl01b1fr;
    @BindView(R.id.dcl01bc) CheckBox dcl01bc;
    @BindView(R.id.dcl01b2) RadioGroup dcl01b2;
    @BindView(R.id.dcl01b201) RadioButton dcl01b201;
    @BindView(R.id.dcl01b202) RadioButton dcl01b202;
    @BindView(R.id.dcl01b2fr) EditText dcl01b2fr;
    @BindView(R.id.dcl01cm) CheckBox dcl01cm;
    @BindView(R.id.dcl01c1) RadioGroup dcl01c1;
    @BindView(R.id.dcl01c101) RadioButton dcl01c101;
    @BindView(R.id.dcl01c102) RadioButton dcl01c102;
    @BindView(R.id.dcl01c1fr) EditText dcl01c1fr;
    @BindView(R.id.dcl01cc) CheckBox dcl01cc;
    @BindView(R.id.dcl01c2) RadioGroup dcl01c2;
    @BindView(R.id.dcl01c201) RadioButton dcl01c201;
    @BindView(R.id.dcl01c202) RadioButton dcl01c202;
    @BindView(R.id.dcl01c2fr) EditText dcl01c2fr;
    @BindView(R.id.dcl01dm) CheckBox dcl01dm;
    @BindView(R.id.dcl01d1) RadioGroup dcl01d1;
    @BindView(R.id.dcl01d101) RadioButton dcl01d101;
    @BindView(R.id.dcl01d102) RadioButton dcl01d102;
    @BindView(R.id.dcl01d1fr) EditText dcl01d1fr;
    @BindView(R.id.dcl01dc) CheckBox dcl01dc;
    @BindView(R.id.dcl01d2) RadioGroup dcl01d2;
    @BindView(R.id.dcl01d201) RadioButton dcl01d201;
    @BindView(R.id.dcl01d202) RadioButton dcl01d202;
    @BindView(R.id.dcl01d2fr) EditText dcl01d2fr;
    @BindView(R.id.dcl01em) CheckBox dcl01em;
    @BindView(R.id.dcl01e1) RadioGroup dcl01e1;
    @BindView(R.id.dcl01e101) RadioButton dcl01e101;
    @BindView(R.id.dcl01e102) RadioButton dcl01e102;
    @BindView(R.id.dcl01e1fr) EditText dcl01e1fr;
    @BindView(R.id.dcl01ec) CheckBox dcl01ec;
    @BindView(R.id.dcl01e2) RadioGroup dcl01e2;
    @BindView(R.id.dcl01e201) RadioButton dcl01e201;
    @BindView(R.id.dcl01e202) RadioButton dcl01e202;
    @BindView(R.id.dcl01e2fr) EditText dcl01e2fr;
    @BindView(R.id.dcl01fm) CheckBox dcl01fm;
    @BindView(R.id.dcl01f1) RadioGroup dcl01f1;
    @BindView(R.id.dcl01f101) RadioButton dcl01f101;
    @BindView(R.id.dcl01f102) RadioButton dcl01f102;
    @BindView(R.id.dcl01f1fr) EditText dcl01f1fr;
    @BindView(R.id.dcl01fc) CheckBox dcl01fc;
    @BindView(R.id.dcl01f2) RadioGroup dcl01f2;
    @BindView(R.id.dcl01f201) RadioButton dcl01f201;
    @BindView(R.id.dcl01f202) RadioButton dcl01f202;
    @BindView(R.id.dcl01f2fr) EditText dcl01f2fr;
    @BindView(R.id.dcl01gm) CheckBox dcl01gm;
    @BindView(R.id.dcl01g1) RadioGroup dcl01g1;
    @BindView(R.id.dcl01g101) RadioButton dcl01g101;
    @BindView(R.id.dcl01g102) RadioButton dcl01g102;
    @BindView(R.id.dcl01g1fr) EditText dcl01g1fr;
    @BindView(R.id.dcl01gc) CheckBox dcl01gc;
    @BindView(R.id.dcl01g2) RadioGroup dcl01g2;
    @BindView(R.id.dcl01g201) RadioButton dcl01g201;
    @BindView(R.id.dcl01g202) RadioButton dcl01g202;
    @BindView(R.id.dcl01g2fr) EditText dcl01g2fr;
    @BindView(R.id.dcl01hm) CheckBox dcl01hm;
    @BindView(R.id.dcl01h1) RadioGroup dcl01h1;
    @BindView(R.id.dcl01h101) RadioButton dcl01h101;
    @BindView(R.id.dcl01h102) RadioButton dcl01h102;
    @BindView(R.id.dcl01h1fr) EditText dcl01h1fr;
    @BindView(R.id.dcl01hc) CheckBox dcl01hc;
    @BindView(R.id.dcl01h2) RadioGroup dcl01h2;
    @BindView(R.id.dcl01h201) RadioButton dcl01h201;
    @BindView(R.id.dcl01h202) RadioButton dcl01h202;
    @BindView(R.id.dcl01h2fr) EditText dcl01h2fr;
    @BindView(R.id.dcl01im) CheckBox dcl01im;
    @BindView(R.id.dcl01i1) RadioGroup dcl01i1;
    @BindView(R.id.dcl01i101) RadioButton dcl01i101;
    @BindView(R.id.dcl01i102) RadioButton dcl01i102;
    @BindView(R.id.dcl01i1fr) EditText dcl01i1fr;
    @BindView(R.id.dcl01ic) CheckBox dcl01ic;
    @BindView(R.id.dcl01i2) RadioGroup dcl01i2;
    @BindView(R.id.dcl01i201) RadioButton dcl01i201;
    @BindView(R.id.dcl01i202) RadioButton dcl01i202;
    @BindView(R.id.dcl01i2fr) EditText dcl01i2fr;
    @BindView(R.id.dc102a) EditText dc102a;
    @BindView(R.id.dc102b) EditText dc102b;
    @BindView(R.id.dc102c) EditText dc102c;
    @BindView(R.id.dc102d) EditText dc102d;
    @BindView(R.id.dc102e) EditText dc102e;
    @BindView(R.id.dcl03) RadioGroup dcl03;
    @BindView(R.id.dcl0388) RadioButton dcl0388;
    @BindView(R.id.dcl0301) RadioButton dcl0301;
    @BindView(R.id.dcl0302) RadioButton dcl0302;
    @BindView(R.id.dcl0303) RadioButton dcl0303;
    @BindView(R.id.dcl04) RadioGroup dcl04;
    @BindView(R.id.dcl0488) RadioButton dcl0488;
    @BindView(R.id.dcl0401) RadioButton dcl0401;
    @BindView(R.id.dcl0402) RadioButton dcl0402;
    @BindView(R.id.dcl0403) RadioButton dcl0403;
    @BindView(R.id.dcl05) RadioGroup dcl05;
    @BindView(R.id.dcl0588) RadioButton dcl0588;
    @BindView(R.id.dcl0501) RadioButton dcl0501;
    @BindView(R.id.dcl0502) RadioButton dcl0502;
    @BindView(R.id.dcl0503) RadioButton dcl0503;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section L");

    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
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

    @OnClick(R.id.btn_Continue) void onBtnContinueClick() {
        //TODO implement

        startActivity(new Intent(this,SectionMActivity.class));
    }

}
