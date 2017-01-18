package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
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

public class SectionCActivity extends Activity  {

    @BindView(R.id.activity_section_c) FrameLayout activitySectionC;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcca) EditText dcca;
    @BindView(R.id.dccbrhh) RadioGroup dccbrhh;
    @BindView(R.id.dccbrhh01) RadioButton dccbrhh01;
    @BindView(R.id.dccbrhh02) RadioButton dccbrhh02;
    @BindView(R.id.dccbrhh03) RadioButton dccbrhh03;
    @BindView(R.id.dccbrhh04) RadioButton dccbrhh04;
    @BindView(R.id.dccbrhh05) RadioButton dccbrhh05;
    @BindView(R.id.dccbrhh06) RadioButton dccbrhh06;
    @BindView(R.id.dccbrhh07) RadioButton dccbrhh07;
    @BindView(R.id.dccbrhh08) RadioButton dccbrhh08;
    @BindView(R.id.dccbrhh09) RadioButton dccbrhh09;
    @BindView(R.id.dccbrhh10) RadioButton dccbrhh10;
    @BindView(R.id.dccbrhh11) RadioButton dccbrhh11;
    @BindView(R.id.dccbrhh98) RadioButton dccbrhh98;
    @BindView(R.id.dccbrhh99) RadioButton dccbrhh99;
    @BindView(R.id.dccbrhh09x) EditText dccbrhh09x;
    @BindView(R.id.dccbfid) EditText dccbfid;
    @BindView(R.id.dccbmid) EditText dccbmid;
    @BindView(R.id.dccc) RadioGroup dccc;
    @BindView(R.id.dccc01) RadioButton dccc01;
    @BindView(R.id.dccc02) RadioButton dccc02;
    @BindView(R.id.dccd) DatePicker dccd;
    @BindView(R.id.dccey) EditText dccey;
    @BindView(R.id.dccem) EditText dccem;
    @BindView(R.id.dcced) EditText dcced;
    @BindView(R.id.dccf) DatePicker dccf;
    @BindView(R.id.dccg) EditText dccg;
    @BindView(R.id.dcch) RadioGroup dcch;
    @BindView(R.id.dcch01) RadioButton dcch01;
    @BindView(R.id.dcch02) RadioButton dcch02;
    @BindView(R.id.dcch03) RadioButton dcch03;
    @BindView(R.id.dcch04) RadioButton dcch04;
    @BindView(R.id.dcch05) RadioButton dcch05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section C: People Deceased in Last One Year");

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

        startActivity(new Intent(this,SectionDActivity.class));

    }
}
