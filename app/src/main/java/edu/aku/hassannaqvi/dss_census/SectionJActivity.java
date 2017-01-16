package edu.aku.hassannaqvi.dss_census;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionJActivity extends Activity  {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_j) RelativeLayout activitySectionJ;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcj01) RadioGroup dcj01;
    @BindView(R.id.dcj0101) RadioButton dcj0101;
    @BindView(R.id.dcj0102) RadioButton dcj0102;
    @BindView(R.id.dcj0199) RadioButton dcj0199;
    @BindView(R.id.dcj02) RadioGroup dcj02;
    @BindView(R.id.dcj0201) RadioButton dcj0201;
    @BindView(R.id.dcj0202) RadioButton dcj0202;
    @BindView(R.id.dcj0299) RadioButton dcj0299;
    @BindView(R.id.dcj03) RadioGroup dcj03;
    @BindView(R.id.dcj0301) RadioButton dcj0301;
    @BindView(R.id.dcj0302) RadioButton dcj0302;
    @BindView(R.id.dcj0399) RadioButton dcj0399;
    @BindView(R.id.dcj04) RadioGroup dcj04;
    @BindView(R.id.dcj0401) RadioButton dcj0401;
    @BindView(R.id.dcj0402) RadioButton dcj0402;
    @BindView(R.id.dcj0499) RadioButton dcj0499;
    @BindView(R.id.dcj0501) CheckBox dcj0501;
    @BindView(R.id.dcj0502) CheckBox dcj0502;
    @BindView(R.id.dcj0503) CheckBox dcj0503;
    @BindView(R.id.dcj0504) CheckBox dcj0504;
    @BindView(R.id.dcj0505) CheckBox dcj0505;
    @BindView(R.id.dcj0506) CheckBox dcj0506;
    @BindView(R.id.dcj0507) CheckBox dcj0507;
    @BindView(R.id.dcj0508) CheckBox dcj0508;
    @BindView(R.id.dcj0509) CheckBox dcj0509;
    @BindView(R.id.dcj0577) CheckBox dcj0577;
    @BindView(R.id.dcj0596) CheckBox dcj0596;
    @BindView(R.id.dcj0596x) EditText dcj0596x;
    @BindView(R.id.dcj06) RadioGroup dcj06;
    @BindView(R.id.dcj0601) RadioButton dcj0601;
    @BindView(R.id.dcj0602) RadioButton dcj0602;
    @BindView(R.id.dcj0699) RadioButton dcj0699;
    @BindView(R.id.dcj07) RadioGroup dcj07;
    @BindView(R.id.dcj0701) RadioButton dcj0701;
    @BindView(R.id.dcj0702) RadioButton dcj0702;
    @BindView(R.id.dcj0799) RadioButton dcj0799;
    @BindView(R.id.dcj0801) EditText dcj0801;
    @BindView(R.id.dcj0802) EditText dcj0802;
    @BindView(R.id.dcj0803) EditText dcj0803;
    @BindView(R.id.dcj09) RadioGroup dcj09;
    @BindView(R.id.dcj0901) RadioButton dcj0901;
    @BindView(R.id.dcj0902) RadioButton dcj0902;
    @BindView(R.id.dcj0999) RadioButton dcj0999;
    @BindView(R.id.dcj10) RadioGroup dcj10;
    @BindView(R.id.dcj1001) RadioButton dcj1001;
    @BindView(R.id.dcj1002) RadioButton dcj1002;
    @BindView(R.id.dcj1099) RadioButton dcj1099;
    @BindView(R.id.dcj11) RadioGroup dcj11;
    @BindView(R.id.dcj1101) RadioButton dcj1101;
    @BindView(R.id.dcj1102) RadioButton dcj1102;
    @BindView(R.id.dcj1199) RadioButton dcj1199;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_j);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        //TODO implement
    }

    @OnClick(R.id.btn_Continue) void onBtnContinueClick() {
        //TODO implement
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        //        01
        if (dcj01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcg01), Toast.LENGTH_SHORT).show();
            dcj0102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcg01: This data is Required!");
            return false;
        } else {
            dcj0102.setError(null);
        }

        return true;
    }

}
