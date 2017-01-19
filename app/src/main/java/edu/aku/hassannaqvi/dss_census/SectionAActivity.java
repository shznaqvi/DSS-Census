package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionAActivity extends Activity {

    @BindView(R.id.activity_section_a)
    RelativeLayout activitySectionA;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dca01)
    EditText dca01;
    @BindView(R.id.dca04)
    RadioGroup dca04;
    @BindView(R.id.dca0401)
    RadioButton dca0401;
    @BindView(R.id.dca0402)
    RadioButton dca0402;
    @BindView(R.id.dca0403)
    RadioButton dca0403;
    @BindView(R.id.dca05)
    EditText dca05;
    @BindView(R.id.dca0501)
    RadioGroup dca0501;
    @BindView(R.id.dca050101)
    RadioButton dca050101;
    @BindView(R.id.dca050102)
    RadioButton dca050102;
    @BindView(R.id.dca0502)
    RadioGroup dca0502;
    @BindView(R.id.dca050201)
    RadioButton dca050201;
    @BindView(R.id.dca050202)
    RadioButton dca050202;
    @BindView(R.id.dca0503)
    EditText dca0503;
    @BindView(R.id.dca0504)
    EditText dca0504;
    @BindView(R.id.dca0505)
    RadioGroup dca0505;
    @BindView(R.id.dca06)
    EditText dca06;
    @BindView(R.id.dca0601)
    RadioGroup dca0601;
    @BindView(R.id.dca060101)
    RadioButton dca060101;
    @BindView(R.id.dca060102)
    RadioButton dca060102;
    @BindView(R.id.dca0602)
    RadioGroup dca0602;
    @BindView(R.id.dca0603)
    EditText dca0603;
    @BindView(R.id.dca0604)
    EditText dca0604;
    @BindView(R.id.dca0701)
    EditText dca0701;
    @BindView(R.id.dca0702)
    EditText dca0702;
    @BindView(R.id.dca0703)
    EditText dca0703;
    @BindView(R.id.dca0801)
    EditText dca0801;
    @BindView(R.id.dca0802)
    EditText dca0802;
    @BindView(R.id.dca0803)
    EditText dca0803;
    @BindView(R.id.dca09)
    RadioGroup dca09;
    @BindView(R.id.dca0901)
    RadioButton dca0901;
    @BindView(R.id.dca0902)
    RadioButton dca0902;
    @BindView(R.id.dca0903)
    RadioButton dca0903;
    @BindView(R.id.dca09m)
    EditText dca09m;
    @BindView(R.id.dca09y)
    EditText dca09y;
    @BindView(R.id.dca10a)
    EditText dca10a;
    @BindView(R.id.dca10b)
    EditText dca10b;
    @BindView(R.id.dca11)
    RadioGroup dca11;
    @BindView(R.id.dca1101)
    RadioButton dca1101;
    @BindView(R.id.dca1102)
    RadioButton dca1102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section A: HH Identification & Visit Status");


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
        Intent endSec = new Intent(this, MainActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */

    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (!dca0701.getText().toString().isEmpty() && Integer.parseInt(dca0701.getText().toString()) > 0){
            dca0701.setError(null);
            MainApp.NoMembers = Integer.parseInt(dca0701.getText().toString());
            startActivity(new Intent(this, FamilyMembersActivity.class));
        }else {
            Toast.makeText(this,getString(R.string.dca07),Toast.LENGTH_SHORT).show();
            dca0701.setError("Invalid!!");
        }

    }


}
