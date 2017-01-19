package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionMActivity extends Activity  {

    @BindView(R.id.activity_section_m) FrameLayout activitySectionM;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcm01) RadioGroup dcm01;
    @BindView(R.id.dcm0101) RadioButton dcm0101;
    @BindView(R.id.dcm0102) RadioButton dcm0102;
    @BindView(R.id.dcm0103) RadioButton dcm0103;
    @BindView(R.id.dcm0104) RadioButton dcm0104;
    @BindView(R.id.dcm0105) RadioButton dcm0105;
    @BindView(R.id.dcm0106) RadioButton dcm0106;
    @BindView(R.id.dcm0107) RadioButton dcm0107;
    @BindView(R.id.dcm0196) RadioButton dcm0196;
    @BindView(R.id.dcm96x) EditText dcm96x;
    @BindView(R.id.dcm02) RadioGroup dcm02;
    @BindView(R.id.dcm0201) RadioButton dcm0201;
    @BindView(R.id.dcm0202) RadioButton dcm0202;
    @BindView(R.id.dcm03) RadioGroup dcm03;
    @BindView(R.id.dcm0301) RadioButton dcm0301;
    @BindView(R.id.dcm0302) RadioButton dcm0302;
    @BindView(R.id.dcm04) RadioGroup dcm04;
    @BindView(R.id.dcm0401) RadioButton dcm0401;
    @BindView(R.id.dcm0402) RadioButton dcm0402;
    @BindView(R.id.dcm05) RadioGroup dcm05;
    @BindView(R.id.dcm0501) RadioButton dcm0501;
    @BindView(R.id.dcm0502) RadioButton dcm0502;
    @BindView(R.id.dcm06) RadioGroup dcm06;
    @BindView(R.id.dcm0601) RadioButton dcm0601;
    @BindView(R.id.dcm0602) RadioButton dcm0602;
    @BindView(R.id.dcm0603) RadioButton dcm0603;
    @BindView(R.id.dcm07) EditText dcm07;
    @BindView(R.id.dcm08) RadioGroup dcm08;
    @BindView(R.id.dcm0801) RadioButton dcm0801;
    @BindView(R.id.dcm0802) RadioButton dcm0802;
    @BindView(R.id.dcm0803) RadioButton dcm0803;
    @BindView(R.id.dcm09) RadioGroup dcm09;
    @BindView(R.id.dcm0901) RadioButton dcm0901;
    @BindView(R.id.dcm0902) RadioButton dcm0902;
    @BindView(R.id.dcm10) RadioGroup dcm10;
    @BindView(R.id.dcm1001) RadioButton dcm1001;
    @BindView(R.id.dcm1002) RadioButton dcm1002;
    @BindView(R.id.dcm11) RadioGroup dcm11;
    @BindView(R.id.dcm1101) RadioButton dcm1101;
    @BindView(R.id.dcm1102) RadioButton dcm1102;
    @BindView(R.id.dcm12) RadioGroup dcm12;
    @BindView(R.id.dcm1201) RadioButton dcm1201;
    @BindView(R.id.dcm1202) RadioButton dcm1202;
    @BindView(R.id.dcm13) RadioGroup dcm13;
    @BindView(R.id.dcm1301) RadioButton dcm1301;
    @BindView(R.id.dcm1302) RadioButton dcm1302;
    @BindView(R.id.dcm1303) RadioButton dcm1303;
    @BindView(R.id.dcm1304) RadioButton dcm1304;
    @BindView(R.id.dcm1305) RadioButton dcm1305;
    @BindView(R.id.dcm1396) RadioButton dcm1396;
    @BindView(R.id.dcm1396x) EditText dcm1396x;
    @BindView(R.id.dcm14) RadioGroup dcm14;
    @BindView(R.id.dcm1401) RadioButton dcm1401;
    @BindView(R.id.dcm1402) RadioButton dcm1402;
    @BindView(R.id.dcm1403) RadioButton dcm1403;
    @BindView(R.id.dcm1404) RadioButton dcm1404;
    @BindView(R.id.dcm1405) RadioButton dcm1405;
    @BindView(R.id.dcm1406) RadioButton dcm1406;
    @BindView(R.id.dcm15) RadioGroup dcm15;
    @BindView(R.id.dcm1501) RadioButton dcm1501;
    @BindView(R.id.dcm1502) RadioButton dcm1502;
    @BindView(R.id.dcm16) RadioGroup dcm16;
    @BindView(R.id.dcm1601) RadioButton dcm1601;
    @BindView(R.id.dcm1602) RadioButton dcm1602;
    @BindView(R.id.dcm17) RadioGroup dcm17;
    @BindView(R.id.dcm1701) RadioButton dcm1701;
    @BindView(R.id.dcm1702) RadioButton dcm1702;
    @BindView(R.id.dcm1799) RadioButton dcm1799;
    @BindView(R.id.dcm17a) RadioGroup dcm17a;
    @BindView(R.id.dcm17a01) RadioButton dcm17a01;
    @BindView(R.id.dcm17a02) RadioButton dcm17a02;
    @BindView(R.id.dcm17a03) RadioButton dcm17a03;
    @BindView(R.id.dcm17a04) RadioButton dcm17a04;
    @BindView(R.id.dcm18) RadioGroup dcm18;
    @BindView(R.id.dcm1801) RadioButton dcm1801;
    @BindView(R.id.dcm1802) RadioButton dcm1802;
    @BindView(R.id.dcm1899) RadioButton dcm1899;
    @BindView(R.id.dcm19) RadioGroup dcm19;
    @BindView(R.id.dcm1901) RadioButton dcm1901;
    @BindView(R.id.dcm1902) RadioButton dcm1902;
    @BindView(R.id.dcm1999) RadioButton dcm1999;
    @BindView(R.id.dcm20) RadioGroup dcm20;
    @BindView(R.id.dcm2001) RadioButton dcm2001;
    @BindView(R.id.dcm2002) RadioButton dcm2002;
    @BindView(R.id.dcm2099) RadioButton dcm2099;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section M: Home Environment");
    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        //TODO implement

        Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, MainActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
    }

}
