package edu.aku.hassannaqvi.dss_census;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class SectionEActivity extends Activity  {

    @BindView(R.id.activity_section_e) FrameLayout activitySectionE;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dce01) RadioGroup dce01;
    @BindView(R.id.dce0101) RadioButton dce0101;
    @BindView(R.id.dce0102) RadioButton dce0102;
    @BindView(R.id.dce0103) RadioButton dce0103;
    @BindView(R.id.dce0196) RadioButton dce0196;
    @BindView(R.id.dce0196x) EditText dce0196x;
    @BindView(R.id.dce02) RadioGroup dce02;
    @BindView(R.id.dce0201) RadioButton dce0201;
    @BindView(R.id.dce0202) RadioButton dce0202;
    @BindView(R.id.dce03) RadioGroup dce03;
    @BindView(R.id.dce0301) RadioButton dce0301;
    @BindView(R.id.dce0302) RadioButton dce0302;
    @BindView(R.id.dce0303) RadioButton dce0303;
    @BindView(R.id.dce0304) RadioButton dce0304;
    @BindView(R.id.dce0396) RadioButton dce0396;
    @BindView(R.id.dce0396x) EditText dce0396x;
    @BindView(R.id.dce04) RadioGroup dce04;
    @BindView(R.id.dce0401) RadioButton dce0401;
    @BindView(R.id.dce0402) RadioButton dce0402;
    @BindView(R.id.dce05) RadioGroup dce05;
    @BindView(R.id.dce0501) RadioButton dce0501;
    @BindView(R.id.dce0502) RadioButton dce0502;
    @BindView(R.id.dce0503) RadioButton dce0503;
    @BindView(R.id.dce0504) RadioButton dce0504;
    @BindView(R.id.dce0596) RadioButton dce0596;
    @BindView(R.id.dce0596x) EditText dce0596x;
    @BindView(R.id.dce0601) CheckBox dce0601;
    @BindView(R.id.dce0602) CheckBox dce0602;
    @BindView(R.id.dce0603) CheckBox dce0603;
    @BindView(R.id.dce0604) CheckBox dce0604;
    @BindView(R.id.dce0605) CheckBox dce0605;
    @BindView(R.id.dce0606) CheckBox dce0606;
    @BindView(R.id.dce0607) CheckBox dce0607;
    @BindView(R.id.dce0608) CheckBox dce0608;
    @BindView(R.id.dce0609) CheckBox dce0609;
    @BindView(R.id.dce0610) CheckBox dce0610;
    @BindView(R.id.dce0696) CheckBox dce0696;
    @BindView(R.id.dce0696x) EditText dce0696x;
    @BindView(R.id.dce07) RadioGroup dce07;
    @BindView(R.id.dce0701) RadioButton dce0701;
    @BindView(R.id.dce0702) RadioButton dce0702;
    @BindView(R.id.dce0799) RadioButton dce0799;
    @BindView(R.id.fldGrpdce07) LinearLayout fldGrpdce07;
    @BindView(R.id.dce08) RadioGroup dce08;
    @BindView(R.id.dce0801) RadioButton dce0801;
    @BindView(R.id.dce0802) RadioButton dce0802;
    @BindView(R.id.dce0899) RadioButton dce0899;
    @BindView(R.id.fldGrpdce08) LinearLayout fldGrpdce08;
    @BindView(R.id.dce09) RadioGroup dce09;
    @BindView(R.id.dce0901) RadioButton dce0901;
    @BindView(R.id.dce0902) RadioButton dce0902;
    @BindView(R.id.dce0903) RadioButton dce0903;
    @BindView(R.id.dce0904) RadioButton dce0904;
    @BindView(R.id.dce0905) RadioButton dce0905;
    @BindView(R.id.dce0906) RadioButton dce0906;
    @BindView(R.id.dce0999) RadioButton dce0999;
    @BindView(R.id.dce0996) RadioButton dce0996;
    @BindView(R.id.dce0996x) EditText dce0996x;
    @BindView(R.id.dce1001) EditText dce1001;
    @BindView(R.id.dce1002) EditText dce1002;
    @BindView(R.id.dce1003) EditText dce1003;
    @BindView(R.id.dce1004) EditText dce1004;
    @BindView(R.id.dce1005) EditText dce1005;
    @BindView(R.id.dce1006) EditText dce1006;
    @BindView(R.id.dce1007) EditText dce1007;
    @BindView(R.id.dce1008) EditText dce1008;
    @BindView(R.id.dce1009) EditText dce1009;
    @BindView(R.id.dce1010) EditText dce1010;
    @BindView(R.id.dce1011) EditText dce1011;
    @BindView(R.id.dce1012) EditText dce1012;
    @BindView(R.id.dce1013) EditText dce1013;
    @BindView(R.id.dce1014) EditText dce1014;
    @BindView(R.id.dce1015) EditText dce1015;
    @BindView(R.id.dce1016) EditText dce1016;
    @BindView(R.id.dce1017) EditText dce1017;
    @BindView(R.id.dce1018) EditText dce1018;
    @BindView(R.id.dce1019) EditText dce1019;
    @BindView(R.id.dce1020) EditText dce1020;
    @BindView(R.id.dce1021) EditText dce1021;
    @BindView(R.id.dce1022) EditText dce1022;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

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


        // ========================= Q 9 Others============================
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




    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {
        //TODO implement
    }

    @OnLongClick(R.id.btn_End) boolean onBtnEndLongClick() {
        //TODO implement
        return true;
    }

    @OnClick(R.id.btn_Continue) void onBtnContinueClick() {
        //TODO implement
    }

    @OnLongClick(R.id.btn_Continue) boolean onBtnContinueLongClick() {
        //TODO implement
        return true;
    }
}
