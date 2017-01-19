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

public class SectionBActivity extends Activity {

    @BindView(R.id.activity_section_b)
    FrameLayout activitySectionB;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dcba)
    EditText dcba;
    @BindView(R.id.dcbid)
    EditText dcbid;
    @BindView(R.id.dcbbrhh)
    RadioGroup dcbbrhh;
    @BindView(R.id.dcbbrhh01)
    RadioButton dcbbrhh01;
    @BindView(R.id.dcbbrhh02)
    RadioButton dcbbrhh02;
    @BindView(R.id.dcbbrhh03)
    RadioButton dcbbrhh03;
    @BindView(R.id.dcbbrhh04)
    RadioButton dcbbrhh04;
    @BindView(R.id.dcbbrhh05)
    RadioButton dcbbrhh05;
    @BindView(R.id.dcbbrhh06)
    RadioButton dcbbrhh06;
    @BindView(R.id.dcbbrhh07)
    RadioButton dcbbrhh07;
    @BindView(R.id.dcbbrhh08)
    RadioButton dcbbrhh08;
    @BindView(R.id.dcbbrhh09)
    RadioButton dcbbrhh09;
    @BindView(R.id.dcbbrhh10)
    RadioButton dcbbrhh10;
    @BindView(R.id.dcbbrhh11)
    RadioButton dcbbrhh11;
    @BindView(R.id.dcbbrhh98)
    RadioButton dcbbrhh98;
    @BindView(R.id.dcbbrhh99)
    RadioButton dcbbrhh99;
    @BindView(R.id.dcbbfid)
    EditText dcbbfid;
    @BindView(R.id.dcbbmid)
    EditText dcbbmid;
    @BindView(R.id.dcbc)
    RadioGroup dcbc;
    @BindView(R.id.dcbc01)
    RadioButton dcbc01;
    @BindView(R.id.dcbc02)
    RadioButton dcbc02;
    @BindView(R.id.dcbc03)
    RadioButton dcbc03;
    @BindView(R.id.dcbc04)
    RadioButton dcbc04;
    @BindView(R.id.dcbc99)
    RadioButton dcbc99;
    @BindView(R.id.dcbd)
    RadioGroup dcbd;
    @BindView(R.id.dcbd01)
    RadioButton dcbd01;
    @BindView(R.id.dcbd02)
    RadioButton dcbd02;
    @BindView(R.id.dcbe)
    RadioGroup dcbe;
    @BindView(R.id.dcbe01)
    RadioButton dcbe01;
    @BindView(R.id.dcbe02)
    RadioButton dcbe02;
    @BindView(R.id.dcbe03)
    RadioButton dcbe03;
    @BindView(R.id.dcbe04)
    RadioButton dcbe04;
    @BindView(R.id.dcbe05)
    RadioButton dcbe05;
    @BindView(R.id.dcbe06)
    RadioButton dcbe06;
    @BindView(R.id.dcbe07)
    RadioButton dcbe07;
    @BindView(R.id.dcbe08)
    RadioButton dcbe08;
    @BindView(R.id.dcbe09)
    RadioButton dcbe09;
    @BindView(R.id.dcbe98)
    RadioButton dcbe98;
    @BindView(R.id.dcbe99)
    RadioButton dcbe99;
    @BindView(R.id.dcbe09x)
    EditText dcbe09x;
    @BindView(R.id.dcbf)
    RadioGroup dcbf;
    @BindView(R.id.dcbf01)
    RadioButton dcbf01;
    @BindView(R.id.dcbf02)
    RadioButton dcbf02;
    @BindView(R.id.dcbf03)
    RadioButton dcbf03;
    @BindView(R.id.dcbf04)
    RadioButton dcbf04;
    @BindView(R.id.dcbf05)
    RadioButton dcbf05;
    @BindView(R.id.dcbf06)
    RadioButton dcbf06;
    @BindView(R.id.dcbf07)
    RadioButton dcbf07;
    @BindView(R.id.dcbf08)
    RadioButton dcbf08;
    @BindView(R.id.dcbf09)
    RadioButton dcbf09;
    @BindView(R.id.dcbf10)
    RadioButton dcbf10;
    @BindView(R.id.dcbf11)
    RadioButton dcbf11;
    @BindView(R.id.dcbf12)
    RadioButton dcbf12;
    @BindView(R.id.dcbf13)
    RadioButton dcbf13;
    @BindView(R.id.dcbf14)
    RadioButton dcbf14;
    @BindView(R.id.dcbf15)
    RadioButton dcbf15;
    @BindView(R.id.dcbf16)
    RadioButton dcbf16;
    @BindView(R.id.dcbf17)
    RadioButton dcbf17;
    @BindView(R.id.dcbf99)
    RadioButton dcbf99;
    @BindView(R.id.dcbg)
    DatePicker dcbg;
    @BindView(R.id.dcbhy)
    EditText dcbhy;
    @BindView(R.id.dcbhm)
    EditText dcbhm;
    @BindView(R.id.dcbhd)
    EditText dcbhd;
    @BindView(R.id.dcbis)
    RadioGroup dcbis;
    @BindView(R.id.dcbis01)
    RadioButton dcbis01;
    @BindView(R.id.dcbis02)
    RadioButton dcbis02;
    @BindView(R.id.dcbis03)
    RadioButton dcbis03;
    @BindView(R.id.dcbis04)
    RadioButton dcbis04;
    @BindView(R.id.dcbis05)
    RadioButton dcbis05;
    @BindView(R.id.dcbis06)
    RadioButton dcbis06;
    @BindView(R.id.dcbis06x)
    EditText dcbis06x;
    @BindView(R.id.dcbidt)
    RadioGroup dcbidt;
    @BindView(R.id.dcbidt01)
    RadioButton dcbidt01;
    @BindView(R.id.dcbidt02)
    RadioButton dcbidt02;
    @BindView(R.id.dcbidt03)
    RadioButton dcbidt03;
    @BindView(R.id.dcbidt04)
    RadioButton dcbidt04;
    @BindView(R.id.dcbidt05)
    RadioButton dcbidt05;
    @BindView(R.id.dcbir)
    RadioGroup dcbir;
    @BindView(R.id.dcbir01)
    RadioButton dcbir01;
    @BindView(R.id.dcbir02)
    RadioButton dcbir02;
    @BindView(R.id.dcbir03)
    RadioButton dcbir03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section B");

        dcba.setText(getIntent().getExtras().get("memberName").toString());

        dcba.setEnabled(false);


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

        if(!dcbid.getText().toString().isEmpty()) {

            dcbid.setError(null);

            if (dcbis05.isChecked()) {

                MainApp.deadMembers.add(new MainApp.deadMemberClass(Integer.parseInt(getIntent().getExtras().get("position").toString()),
                        dcbid.getText().toString()));

//                startActivity(new Intent(this, FamilyMembersActivity.class));
                finish();

            } else {
                finish();
                startActivity(new Intent(this, SectionCActivity.class));
            }
        }else {
            Toast.makeText(this,getString(R.string.dcbid),Toast.LENGTH_SHORT).show();
            dcbid.setError("Invalid!!");
        }
    }

}
