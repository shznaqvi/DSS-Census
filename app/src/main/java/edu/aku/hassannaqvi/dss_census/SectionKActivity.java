package edu.aku.hassannaqvi.dss_census;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.sax.StartElementListener;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.DatePicker;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionKActivity extends Activity  {

    @BindView(R.id.activity_section_k) FrameLayout activitySectionK;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcka) EditText dcka;
    @BindView(R.id.dckb) RadioGroup dckb;
    @BindView(R.id.dckb01) RadioButton dckb01;
    @BindView(R.id.dckb02) RadioButton dckb02;
    @BindView(R.id.dckc) RadioGroup dckc;
    @BindView(R.id.dckc01) RadioButton dckc01;
    @BindView(R.id.dckc02) RadioButton dckc02;
    @BindView(R.id.dckd) DatePicker dckd;
    @BindView(R.id.dckdy) EditText dckdy;
    @BindView(R.id.dckdm) EditText dckdm;
    @BindView(R.id.dckdd) EditText dckdd;
    @BindView(R.id.dckf) RadioGroup dckf;
    @BindView(R.id.dckf01) RadioButton dckf01;
    @BindView(R.id.dckf02) RadioButton dckf02;
    @BindView(R.id.dcki) RadioGroup dcki;
    @BindView(R.id.dcki01) RadioButton dcki01;
    @BindView(R.id.dcki02) RadioButton dcki02;
    @BindView(R.id.dckbcg) RadioGroup dckbcg;
    @BindView(R.id.dckbcg01) RadioButton dckbcg01;
    @BindView(R.id.dckbcg02) RadioButton dckbcg02;
    @BindView(R.id.dckbcgsrc) RadioGroup dckbcgsrc;
    @BindView(R.id.dckbcgsrc01) RadioButton dckbcgsrc01;
    @BindView(R.id.dckbcgsrc02) RadioButton dckbcgsrc02;
    @BindView(R.id.dckscar) RadioGroup dckscar;
    @BindView(R.id.dckdscar01) RadioButton dckdscar01;
    @BindView(R.id.dckscar02) RadioButton dckscar02;
    @BindView(R.id.dckopv0) RadioGroup dckopv0;
    @BindView(R.id.dckopv001) RadioButton dckopv001;
    @BindView(R.id.dckopv002) RadioButton dckopv002;
    @BindView(R.id.dckopv0src) RadioGroup dckopv0src;
    @BindView(R.id.dckopv0src01) RadioButton dckopv0src01;
    @BindView(R.id.dckopv0src02) RadioButton dckopv0src02;
    @BindView(R.id.dckdate0) DatePicker dckdate0;
    @BindView(R.id.dckp1) RadioGroup dckp1;
    @BindView(R.id.dckp101) RadioButton dckp101;
    @BindView(R.id.dckp102) RadioButton dckp102;
    @BindView(R.id.dckp1src) RadioGroup dckp1src;
    @BindView(R.id.dckp1src01) RadioButton dckp1src01;
    @BindView(R.id.dckp1src02) RadioButton dckp1src02;
    @BindView(R.id.dckpcv1) RadioGroup dckpcv1;
    @BindView(R.id.dckdpcv101) RadioButton dckdpcv101;
    @BindView(R.id.dckpcv102) RadioButton dckpcv102;
    @BindView(R.id.dckpcv1src) RadioGroup dckpcv1src;
    @BindView(R.id.dckpcv1src01) RadioButton dckpcv1src01;
    @BindView(R.id.dckpcv1src02) RadioButton dckpcv1src02;
    @BindView(R.id.dckopv1) RadioGroup dckopv1;
    @BindView(R.id.dckopv101) RadioButton dckopv101;
    @BindView(R.id.dckopv102) RadioButton dckopv102;
    @BindView(R.id.dckopv1src) RadioGroup dckopv1src;
    @BindView(R.id.dckopv1src01) RadioButton dckopv1src01;
    @BindView(R.id.dckopv1src02) RadioButton dckopv1src02;
    @BindView(R.id.dckdate1) DatePicker dckdate1;
    @BindView(R.id.dckp2) RadioGroup dckp2;
    @BindView(R.id.dckp201) RadioButton dckp201;
    @BindView(R.id.dckp202) RadioButton dckp202;
    @BindView(R.id.dckp2src) RadioGroup dckp2src;
    @BindView(R.id.dckp2src01) RadioButton dckp2src01;
    @BindView(R.id.dckp2src02) RadioButton dckp2src02;
    @BindView(R.id.dckpcv2) RadioGroup dckpcv2;
    @BindView(R.id.dckdpcv201) RadioButton dckdpcv201;
    @BindView(R.id.dckpcv202) RadioButton dckpcv202;
    @BindView(R.id.dckpcv2src) RadioGroup dckpcv2src;
    @BindView(R.id.dckpcv2src01) RadioButton dckpcv2src01;
    @BindView(R.id.dckpcv2src02) RadioButton dckpcv2src02;
    @BindView(R.id.dckopv2) RadioGroup dckopv2;
    @BindView(R.id.dckopv201) RadioButton dckopv201;
    @BindView(R.id.dckopv202) RadioButton dckopv202;
    @BindView(R.id.dckopv2src) RadioGroup dckopv2src;
    @BindView(R.id.dckopv2src01) RadioButton dckopv2src01;
    @BindView(R.id.dckopv2src02) RadioButton dckopv2src02;
    @BindView(R.id.dckdate2) DatePicker dckdate2;
    @BindView(R.id.dckp3) RadioGroup dckp3;
    @BindView(R.id.dckp301) RadioButton dckp301;
    @BindView(R.id.dckp302) RadioButton dckp302;
    @BindView(R.id.dckp3src) RadioGroup dckp3src;
    @BindView(R.id.dckp3src01) RadioButton dckp3src01;
    @BindView(R.id.dckp3src02) RadioButton dckp3src02;
    @BindView(R.id.dckpcv3) RadioGroup dckpcv3;
    @BindView(R.id.dckdpcv301) RadioButton dckdpcv301;
    @BindView(R.id.dckpcv302) RadioButton dckpcv302;
    @BindView(R.id.dckpcv3src) RadioGroup dckpcv3src;
    @BindView(R.id.dckpcv3src01) RadioButton dckpcv3src01;
    @BindView(R.id.dckpcv3src02) RadioButton dckpcv3src02;
    @BindView(R.id.dckopv3) RadioGroup dckopv3;
    @BindView(R.id.dckopv301) RadioButton dckopv301;
    @BindView(R.id.dckopv302) RadioButton dckopv302;
    @BindView(R.id.dckopv3src) RadioGroup dckopv3src;
    @BindView(R.id.dckopv3src01) RadioButton dckopv3src01;
    @BindView(R.id.dckopv3src02) RadioButton dckopv3src02;
    @BindView(R.id.dckdate3) DatePicker dckdate3;
    @BindView(R.id.dckm1) RadioGroup dckm1;
    @BindView(R.id.dckm101) RadioButton dckm101;
    @BindView(R.id.dckm102) RadioButton dckm102;
    @BindView(R.id.dckm1src) RadioGroup dckm1src;
    @BindView(R.id.dckm1src01) RadioButton dckm1src01;
    @BindView(R.id.dckm1src02) RadioButton dckm1src02;
    @BindView(R.id.dckdate4) DatePicker dckdate4;
    @BindView(R.id.dckm2) RadioGroup dckm2;
    @BindView(R.id.dckm201) RadioButton dckm201;
    @BindView(R.id.dckm202) RadioButton dckm202;
    @BindView(R.id.dckm2src) RadioGroup dckm2src;
    @BindView(R.id.dckm2src01) RadioButton dckm2src01;
    @BindView(R.id.dckm2src02) RadioButton dckm2src02;
    @BindView(R.id.dckdate5) DatePicker dckdate5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_k);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section K");

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

        startActivity(new Intent(this,SectionLActivity.class));
    }
}
