package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.CensusContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.FollowUpsContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.MembersContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

public class SectionBNewPrevActivity extends AppCompatActivity {

    private static final String TAG = SectionBActivity.class.getSimpleName();

    @BindView(R.id.scrollView01)
    ScrollView scroll;
    @BindView(R.id.dcba)
    EditText dcba;
    @BindView(R.id.dcbid)
    EditText dcbid;
    /*@BindView(R.id.dcbbrhh)
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
    @BindView(R.id.dcbbrhh88)
    RadioButton dcbbrhh88;
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
    @BindView(R.id.dcbc88)
    RadioButton dcbc88;
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
    @BindView(R.id.dcbe96)
    RadioButton dcbe96;
    @BindView(R.id.dcbe99)
    RadioButton dcbe99;
    @BindView(R.id.dcbe88)
    RadioButton dcbe88;
    @BindView(R.id.dcbe96x)
    EditText dcbe96x;
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
    @BindView(R.id.dcbf88)
    RadioButton dcbf88;
    @BindView(R.id.dcbf96)
    RadioButton dcbf96;
    @BindView(R.id.dcbf96x)
    EditText dcbf96x;
    @BindView(R.id.dcbdob)
    RadioGroup dcbdob;
    @BindView(R.id.dcbdob01)
    RadioButton dcbdob01;
    @BindView(R.id.dcbAge02)
    RadioButton dcbAge02;
    @BindView(R.id.fldGrpdcbdob)
    LinearLayout fldGrpdcbdob;
    @BindView(R.id.dcbg)
    DatePicker dcbg;
    @BindView(R.id.fldGrpdcpAge)
    LinearLayout fldGrpdcpAge;
    @BindView(R.id.dcbhy)
    EditText dcbhy;
    @BindView(R.id.dcbhm)
    EditText dcbhm;
    @BindView(R.id.dcbhd)
    EditText dcbhd;*/
    @BindView(R.id.dcbis)
    RadioGroup dcbis;
    @BindView(R.id.dcbis00)
    RadioButton dcbis00;
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
    @BindView(R.id.dcbis07)
    RadioButton dcbis07;

    @BindView(R.id.fldGrpdcbis05)
    LinearLayout fldGrpdcbis05;
    @BindView(R.id.dcbis05Age)
    EditText dcbis05Age;
    @BindView(R.id.dcbis05Place)
    RadioGroup dcbis05Place;
    @BindView(R.id.dcbis05Placea)
    RadioButton dcbis05Placea;
    @BindView(R.id.dcbis05Placeb)
    RadioButton dcbis05Placeb;
    @BindView(R.id.dcbis05Placec)
    RadioButton dcbis05Placec;
    @BindView(R.id.dcbis05Place96)
    RadioButton dcbis05Place96;

    @BindView(R.id.fldGrpdcbidt)
    LinearLayout fldGrpdcbidt;
    @BindView(R.id.dcbidtTxt)
    TextView dcbidtTxt;
    @BindView(R.id.dcbidob)
    DatePicker dcbidob;

    @BindView(R.id.dcbis03a)
    EditText dcbis03a;

    /*@BindView(R.id.fldGrpdcbir)
    LinearLayout fldGrpdcbir;
    @BindView(R.id.fldgrpmigout)
    LinearLayout fldgrpmigout;
    @BindView(R.id.dcbir)
    RadioGroup dcbir;
    @BindView(R.id.dcbir01)
    RadioButton dcbir01;
    @BindView(R.id.dcbir02)
    RadioButton dcbir02;
    @BindView(R.id.dcbir03)
    RadioButton dcbir03;
    @BindView(R.id.dcbirm)
    EditText dcbirm;
    @BindView(R.id.rsvp)
    RadioGroup rsvp;
    @BindView(R.id.rsvp01)
    RadioButton rsvp01;
    @BindView(R.id.rsvp02)
    RadioButton rsvp02;
    @BindView(R.id.dcbm)
    RadioGroup dcbm;
    @BindView(R.id.dcbm01)
    RadioButton dcbm01;
    @BindView(R.id.dcbm02)
    RadioButton dcbm02;
    @BindView(R.id.dcbm03)
    RadioButton dcbm03;
    @BindView(R.id.dcbm04)
    RadioButton dcbm04;*/

    @BindView(R.id.fldGrpdcbidt01)
    LinearLayout fldGrpdcbidt01;
    @BindView(R.id.fldGrpdcbidt02)
    LinearLayout fldGrpdcbidt02;
    @BindView(R.id.dcbis04Out)
    RadioGroup dcbis04Out;
    @BindView(R.id.dcbis04Outa)
    RadioButton dcbis04Outa;
    @BindView(R.id.dcbis04Outb)
    RadioButton dcbis04Outb;
    @BindView(R.id.dcbis04Outc)
    RadioButton dcbis04Outc;
    @BindView(R.id.dcbis04Outd)
    RadioButton dcbis04Outd;
    @BindView(R.id.dcbis01Out)
    RadioGroup dcbis01Out;
    @BindView(R.id.dcbis01Outa)
    RadioButton dcbis01Outa;
    @BindView(R.id.dcbis01Outb)
    RadioButton dcbis01Outb;
    @BindView(R.id.dcbis01Outc)
    RadioButton dcbis01Outc;
    @BindView(R.id.dcbis01Outd)
    RadioButton dcbis01Outd;

    @BindView(R.id.fldGrpdcbidt0201)
    LinearLayout fldGrpdcbidt0201;
    @BindView(R.id.dcbis04Outda)
    EditText dcbis04Outda;
    @BindView(R.id.dcbis04Outdb)
    EditText dcbis04Outdb;
    @BindView(R.id.dcbis04Outdc)
    EditText dcbis04Outdc;

    @BindView(R.id.fldGrpdcbidt02a)
    LinearLayout fldGrpdcbidt02a;
    @BindView(R.id.dcbis09)
    RadioGroup dcbis09;
    @BindView(R.id.dcbis09a)
    RadioButton dcbis09a;
    @BindView(R.id.dcbis09b)
    RadioButton dcbis09b;
    @BindView(R.id.dcbis09c)
    CheckBox dcbis09c;
    @BindView(R.id.dcbis09bTxt)
    TextView dcbis09bTxt;

    @BindView(R.id.fldGrpdcbis09b)
    LinearLayout fldGrpdcbis09b;
    @BindView(R.id.dcbis09bdt)
    DatePicker dcbis09bdt;

    int position = 0;
    String mt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b_new_prev);
        ButterKnife.bind(this);

        this.setTitle("D S S");

        Calendar cal = Calendar.getInstance();
//        dcbg.setMaxDate(new Date().getTime());
        dcbidob.setMaxDate(new Date().getTime());
        dcbis09bdt.setMaxDate(new Date().getTime());
        cal.setTimeInMillis(System.currentTimeMillis());

//        Check Respondent

/*        if (MainApp.isRsvp) {
            rsvp02.setChecked(true);
            rsvp01.setEnabled(false);
        }

        if (MainApp.isHead) {
            dcbbrhh01.setEnabled(false);
        }
*/


        /*dcbg.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {

            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
                Log.d("Date", "Year=" + year + " Month=" + (month + 1) + " day=" + dayOfMonth);

                Calendar cal = Calendar.getInstance();
                cal.set(year, month, dayOfMonth);
                //dcbg1.updateDate(year, month, dayOfMonth);
                dcbidob.setMinDate(cal.getTime().getTime());
            }
        });*/

        position = getIntent().getExtras().getInt("position");

        MainApp.selectedPos = position;

        dcba.setText(MainApp.familyMembersList.get(position).getName());

        dcbid.setText(MainApp.familyMembersList.get(position).getDss_id_member());
        Log.d(TAG, "onCreate: " + MainApp.familyMembersList.get(position).getDss_id_member());
        dcbid.setEnabled(false);

        mt = MainApp.familyMembersList.get(position).getMember_type();
//        dcbis01.setEnabled(mt.equals("c") ? false : true);
        dcbis02.setEnabled(mt.equals("h") || mt.equals("c") ? false : true);
        dcbis04.setEnabled(mt.equals("h") || mt.equals("c") ? false : true);
        dcbis01Outa.setEnabled(!(mt.equals("mw") || mt.equals("h")));

//        For child under 2 name enable true. And for under 10 MStatus not enabled
        int calculateYears = 0;
        if (mt.equals("c") || mt.equals("ot")) {
            if (MainApp.familyMembersList.get(position).getDob().contains(":")) {
                String[] splitAge = MainApp.familyMembersList.get(position).getDob().split(":");
                calculateYears = Integer.valueOf(splitAge[0]);
            } else {
                calculateYears = (int) MainApp.ageInYearByDOB(MainApp.familyMembersList.get(position).getDob());
            }

            if (calculateYears < 2) {
                dcba.setEnabled(true);
            }
            dcbis01.setEnabled(calculateYears < 10 ? false : true);
        }


            /*dcbbfid.setText(MainApp.familyMembersList.get(position).getDss_id_f());
            dcbbmid.setText(MainApp.familyMembersList.get(position).getDss_id_m());

            if (!MainApp.familyMembersList.get(position).getM_status().contains("null")) {

                dcbc.check(MainApp.familyMembersList.get(position).getM_status() == "1" ? dcbc01.getId()
                        : MainApp.familyMembersList.get(position).getM_status() == "2" ? dcbc02.getId()
                        : MainApp.familyMembersList.get(position).getM_status() == "3" ? dcbc03.getId()
                        : MainApp.familyMembersList.get(position).getM_status() == "4" ? dcbc04.getId()
                        : dcbc88.getId()
                );
            }*/

/*        if (!MainApp.familyMembersList.get(position).getGender().equals("null")) {

//                dcbd.check(MainApp.familyMembersList.get(position).getGender().equals("1") ? dcbd01.getId() : dcbd02.getId());

            if (MainApp.familyMembersList.get(position).getGender().equals("1")) {
                   *//* dcbd02.setEnabled(false);
                    dcbd01.setEnabled(true);

                    dcbf09.setEnabled(false);
                    dcbf09.setChecked(false);*//*

                dcbm01.setEnabled(false);
                dcbm01.setChecked(false);

                dcbm02.setEnabled(true);

            } else {
                   *//* dcbd01.setEnabled(false);
                    dcbd02.setEnabled(true);

                    dcbf09.setEnabled(true);*//*
                dcbm01.setEnabled(true);

                dcbm02.setEnabled(false);
                dcbm02.setChecked(false);
            }
        }*/

/*            if (!MainApp.familyMembersList.get(position).getEducation().contains("null")) {

                dcbe.check(MainApp.familyMembersList.get(position).getEducation() == "1" ? dcbe01.getId()
                        : MainApp.familyMembersList.get(position).getEducation() == "2" ? dcbe02.getId()
                        : MainApp.familyMembersList.get(position).getEducation() == "3" ? dcbe03.getId()
                        : MainApp.familyMembersList.get(position).getEducation() == "4" ? dcbe04.getId()
                        : dcbe88.getId());

            }
            if (!MainApp.familyMembersList.get(position).getOccupation().contains("null")) {
                ((RadioButton) dcbf.getChildAt((Integer.parseInt(MainApp.familyMembersList.get(position).getOccupation())) - 1)).setChecked(true);
            }*/

        /*if (!MainApp.familyMembersList.get(position).getCurrent_status().contains("null")) {
            ((RadioButton) dcbis.getChildAt((Integer.parseInt(MainApp.familyMembersList.get(position).getCurrent_status())) - 1)).setChecked(true);
        }*/
 /*       if (!MainApp.familyMembersList.get(position).getMember_type().contains("null")) {

            String mt = MainApp.familyMembersList.get(position).getMember_type();
            dcbm.check(mt.equals("mw") ? dcbm01.getId() : mt.equals("h") ? dcbm02.getId() : mt.equals("ch") ? dcbm03.getId() : dcbm04.getId());

            if (mt.equals("ch")) {

                    *//*dcbbrhh01.setEnabled(false);
                    dcbbrhh01.setChecked(false);

                    dcbbrhh02.setEnabled(false);
                    dcbbrhh02.setChecked(false);

                    dcbbrhh04.setEnabled(false);
                    dcbbrhh04.setChecked(false);

                    dcbbrhh06.setEnabled(false);
                    dcbbrhh06.setChecked(false);

                    dcbbrhh07.setEnabled(false);
                    dcbbrhh07.setChecked(false);

                    dcbc01.setEnabled(false);
                    dcbc01.setChecked(false);
                    dcbc02.setEnabled(false);
                    dcbc02.setChecked(false);
                    dcbc03.setEnabled(false);
                    dcbc03.setChecked(false);
                    dcbe07.setEnabled(false);
                    dcbe07.setChecked(false);

                    dcbf01.setEnabled(false);
                    dcbf01.setChecked(false);
                    dcbf02.setEnabled(false);
                    dcbf02.setChecked(false);
                    dcbf06.setEnabled(false);
                    dcbf06.setChecked(false);
                    dcbf07.setEnabled(false);
                    dcbf07.setChecked(false);
                    dcbf12.setEnabled(false);
                    dcbf12.setChecked(false);
                    dcbf13.setEnabled(false);
                    dcbf13.setChecked(false);
                    dcbf15.setEnabled(false);
                    dcbf15.setChecked(false);*//*

                dcbm01.setEnabled(false);
                dcbm02.setEnabled(false);
                dcbm04.setEnabled(false);
            } else if (mt.equals("mw")) {

                dcbm02.setEnabled(false);
                dcbm03.setEnabled(false);
                dcbm04.setEnabled(false);

                    *//*dcbbrhh01.setEnabled(true);
                    dcbbrhh02.setEnabled(true);
                    dcbbrhh04.setEnabled(true);
                    dcbbrhh06.setEnabled(true);
                    dcbbrhh07.setEnabled(true);

                    dcbc01.setEnabled(true);
                    dcbc02.setEnabled(true);
                    dcbc03.setEnabled(true);
                    dcbe07.setEnabled(true);
                    dcbf01.setEnabled(true);
                    dcbf02.setEnabled(true);
                    dcbf06.setEnabled(true);
                    dcbf07.setEnabled(true);
                    dcbf12.setEnabled(true);
                    dcbf13.setEnabled(true);
                    dcbf15.setEnabled(true);*//*
            } else if (mt.equals("h")) {

                dcbm01.setEnabled(false);
                dcbm03.setEnabled(false);
                dcbm04.setEnabled(false);
            } else if (mt.equals("mw")) {

                dcbm01.setEnabled(false);
                dcbm02.setEnabled(false);
                dcbm03.setEnabled(false);
            }
        }*/

          /*  dcbbfid.setEnabled(false);
            dcbbmid.setEnabled(false);*/


        // ====================== Education Level Others ================
        /*dcbe.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcbe96.isChecked()) {
                    dcbe96x.setVisibility(View.VISIBLE);
                } else {
                    dcbe96x.setVisibility(View.GONE);
                    dcbe96x.setText(null);
                }
            }
        });

        //===================== Occupation Others =================
        dcbf.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcbf96.isChecked()) {
                    dcbf96x.setVisibility(View.VISIBLE);
                } else {
                    dcbf96x.setVisibility(View.GONE);
                    dcbf96x.setText(null);
                }
            }
        });

        dcbdob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dcbdob01.isChecked()) {
                    fldGrpdcbdob.setVisibility(View.VISIBLE);
                    fldGrpdcpAge.setVisibility(View.GONE);
                    dcbhd.setText(null);
                    dcbhm.setText(null);
                    dcbhy.setText(null);
                } else {
                    fldGrpdcpAge.setVisibility(View.VISIBLE);
                    fldGrpdcbdob.setVisibility(View.GONE);
                }
            }
        });*/

        dcbis.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                clearFieldsOnStatus();

                if (dcbis00.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.GONE);

                    fldGrpdcbidt01.setVisibility(View.GONE);

                    fldGrpdcbidt02.setVisibility(View.GONE);

                    fldGrpdcbis05.setVisibility(View.GONE);

                } else if (dcbis01.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.GONE);

                    fldGrpdcbidt01.setVisibility(View.VISIBLE);
                    fldGrpdcbidt02.setVisibility(View.GONE);

                    fldGrpdcbis05.setVisibility(View.GONE);

                } else if (dcbis02.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);

                    dcbis03a.setVisibility(View.GONE);

                    dcbidtTxt.setText("LMP " + getString(R.string.dcbidt));

                    fldGrpdcbidt01.setVisibility(View.GONE);

                    fldGrpdcbidt02.setVisibility(View.GONE);

                    fldGrpdcbis05.setVisibility(View.GONE);

                } else if (dcbis03.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);

                    dcbis03a.setVisibility(View.VISIBLE);

                    fldGrpdcbidt01.setVisibility(View.GONE);

                    fldGrpdcbidt02.setVisibility(View.GONE);

                    fldGrpdcbis05.setVisibility(View.GONE);

                    dcbidtTxt.setText(getString(R.string.dcbis03) + " " + getString(R.string.dcbidt));

                } else if (dcbis04.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);

                    dcbis03a.setVisibility(View.GONE);

                    fldGrpdcbidt01.setVisibility(View.GONE);

                    fldGrpdcbidt02.setVisibility(View.VISIBLE);

                    fldGrpdcbis05.setVisibility(View.GONE);

                    dcbidtTxt.setText(getString(R.string.dcbis09) + " " + getString(R.string.dcbidt));

                } else if (dcbis05.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);

                    dcbis03a.setVisibility(View.GONE);

                    fldGrpdcbis05.setVisibility(View.VISIBLE);
                    dcbidtTxt.setText(" " + getString(R.string.dccf));

                    fldGrpdcbidt01.setVisibility(View.GONE);

                    fldGrpdcbidt02.setVisibility(View.GONE);

                } else if (dcbis06.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.GONE);

                    fldGrpdcbidt01.setVisibility(View.GONE);

                    fldGrpdcbidt02.setVisibility(View.GONE);

                    fldGrpdcbis05.setVisibility(View.GONE);

                } else if (dcbis07.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.GONE);

                    fldGrpdcbidt01.setVisibility(View.GONE);

                    fldGrpdcbidt02.setVisibility(View.GONE);

                    fldGrpdcbis05.setVisibility(View.GONE);

                }
            }
        });

        dcbis04Out.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.dcbis04Outd) {
                    fldGrpdcbidt0201.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcbidt0201.setVisibility(View.GONE);
                    dcbis04Outda.setText(null);
                    dcbis04Outdb.setText(null);
                    dcbis04Outdc.setText(null);
                }
            }
        });

        // Martial status
        dcbis01Out.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.dcbis01Outa) {
                    dcbis09.clearCheck();
                    dcbis09c.setChecked(false);
                    dcbis04Out.clearCheck();
                    fldGrpdcbidt02.setVisibility(View.GONE);
                } else {
                    if (!(MainApp.familyMembersList.get(position).getMember_type().equals("h") ||
                            MainApp.familyMembersList.get(position).getMember_type().equals("c"))) {
                        fldGrpdcbidt02.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        dcbis09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.dcbis09b) {
                    fldGrpdcbis09b.setVisibility(View.VISIBLE);
                    dcbis09bTxt.setText("LMP " + getString(R.string.dcbidt));
                } else {
                    fldGrpdcbis09b.setVisibility(View.GONE);
                }
            }
        });

        dcbis09c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpdcbidt02a.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdcbidt02a.setVisibility(View.GONE);
                    dcbis04Out.clearCheck();
                }
            }
        });

        /*dcbd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dcbd01.isChecked()) {
                    dcbf09.setEnabled(false);
                    dcbf09.setChecked(false);
                } else {
                    dcbf09.setEnabled(true);
                }
            }
        });*/

 /*       dcbm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                if (!dcbm03.isChecked()) {
                    *//*dcbbfid.setText("null");
                    dcbbmid.setText("null");

                    dcbbfid.setEnabled(false);
                    dcbbmid.setEnabled(false);
                    dcbbrhh02.setEnabled(true);
                    dcbbrhh04.setEnabled(true);
                    dcbbrhh06.setEnabled(true);
                    dcbbrhh07.setEnabled(true);

                    dcbc01.setEnabled(true);
                    dcbc02.setEnabled(true);
                    dcbc03.setEnabled(true);
                    dcbe07.setEnabled(true);

                    dcbf01.setEnabled(true);
                    dcbf02.setEnabled(true);
                    dcbf06.setEnabled(true);
                    dcbf07.setEnabled(true);
                    dcbf12.setEnabled(true);
                    dcbf13.setEnabled(true);
                    dcbf15.setEnabled(true);

                    if (!MainApp.isRsvp) {
                        rsvp.clearCheck();
                        rsvp01.setEnabled(true);
                    }
                    if (!MainApp.isHead) {
                        dcbbrhh01.setEnabled(true);
                    } else {
                        dcbbrhh01.setEnabled(false);
                    }

                    if (dcbm01.isChecked()) {
                        dcbd01.setChecked(false);
                        dcbd01.setEnabled(false);

                        dcbd02.setEnabled(true);
                    } else if (dcbm02.isChecked()) {

                        dcbd01.setEnabled(true);

                        dcbd02.setChecked(false);
                        dcbd02.setEnabled(false);
                    } else {
                        dcbd01.setEnabled(true);
                        dcbd02.setEnabled(true);
                    }*//*

                } else {

                    *//*dcbbrhh01.setEnabled(false);
                    dcbbrhh01.setChecked(false);
                    dcbbrhh02.setEnabled(false);
                    dcbbrhh02.setChecked(false);
                    dcbbrhh04.setEnabled(false);
                    dcbbrhh04.setChecked(false);
                    dcbbrhh06.setEnabled(false);
                    dcbbrhh06.setChecked(false);
                    dcbbrhh07.setEnabled(false);
                    dcbbrhh07.setChecked(false);

                    dcbc01.setEnabled(false);
                    dcbc01.setChecked(false);
                    dcbc02.setEnabled(false);
                    dcbc02.setChecked(false);
                    dcbc03.setEnabled(false);
                    dcbc03.setChecked(false);

                    dcbe07.setEnabled(false);
                    dcbe07.setChecked(false);

                    dcbf01.setEnabled(false);
                    dcbf01.setChecked(false);
                    dcbf02.setEnabled(false);
                    dcbf02.setChecked(false);
                    dcbf06.setEnabled(false);
                    dcbf06.setChecked(false);
                    dcbf07.setEnabled(false);
                    dcbf07.setChecked(false);
                    dcbf12.setEnabled(false);
                    dcbf12.setChecked(false);
                    dcbf13.setEnabled(false);
                    dcbf13.setChecked(false);
                    dcbf15.setEnabled(false);
                    dcbf15.setChecked(false);

                    dcbbfid.setOnKeyListener(SectionBActivity.this);
                    dcbbfid.addTextChangedListener(SectionBActivity.this);
                    dcbbmid.setOnKeyListener(SectionBActivity.this);
                    dcbbmid.addTextChangedListener(SectionBActivity.this);*//*

         *//*dcbbfid.setInputType(InputType.TYPE_CLASS_NUMBER);
                    dcbbmid.setInputType(InputType.TYPE_CLASS_NUMBER);

                    dcbbfid.setEnabled(true);
                    dcbbmid.setEnabled(true);

                    dcbbfid.setText(MainApp.fc.getDSSID());
                    dcbbmid.setText(MainApp.fc.getDSSID());

                    if (!MainApp.isRsvp) {
                        rsvp.clearCheck();
                        rsvp01.setEnabled(false);
                        rsvp02.setChecked(true);
                    }


                    dcbd01.setEnabled(true);
                    dcbd02.setEnabled(true);*//*
                }
            }
        });
*/

    }

    public void clearFieldsOnStatus() {

        dcbis05Age.setText(null);
        dcbis05Place.clearCheck();

        dcbis04Out.clearCheck();

        dcbis01Out.clearCheck();

        dcbis09.clearCheck();
        dcbis09c.setChecked(false);

        dcbis03a.setText(null);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        MainApp.finishActivity(this, this);
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        if (formValidation()) {

// Insert into array for showing in alert if same member id wants to enter
            /*boolean flag = true;
            for (String mem : MainApp.insertMem) {

                if (mem.equals(dcbid.getText().toString())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {

                if (!dcbis03.isChecked() && !dcbis05.isChecked() && !dcbis04.isChecked()) {

                    if (dcbm01.isChecked() && (MainApp.TotalFemaleCount >= MainApp.NoFemaleCount || MainApp.NoFemaleCount == 0
                            || MainApp.NoFemaleCount - (MainApp.TotalFemaleCount - MainApp.TotalGirlCount) == MainApp.NoGirlCount)) {
                        MainApp.errorCountDialog(this, this, "Need to increase no of Female's in Family Member Activity.");
                    } else if (dcbm02.isChecked() && (MainApp.TotalMaleCount >= MainApp.NoMaleCount || MainApp.NoMaleCount == 0
                            || MainApp.NoMaleCount - (MainApp.TotalMaleCount - MainApp.TotalBoyCount) == MainApp.NoBoyCount)) {
                        MainApp.errorCountDialog(this, this, "Need to increase no of Male's in Family Member Activity.");
                    } else if (dcbm03.isChecked() && dcbd01.isChecked()) {
                        if (checkChildLessThenFive(dcbdob01.isChecked() ? 1 : 2)) {
                            if ((MainApp.TotalBoyCount >= MainApp.NoBoyCount) || MainApp.NoBoyCount == 0) {
                                MainApp.errorCountDialog(this, this, "Need to increase no of Boys's in Family Member Activity.");
                            } else {
                                contFunc();
                            }
                        } else {
                            if ((MainApp.TotalMaleCount >= (MainApp.NoMaleCount - MainApp.NoBoyCount)) || MainApp.NoMaleCount == 0) {
                                MainApp.errorCountDialog(this, this, "Need to increase no of Male's in Family Member Activity.");
                            } else {
                                contFunc();
                            }
                        }

                    } else if (dcbm03.isChecked() && dcbd02.isChecked()) {
                        if (checkChildLessThenFive(dcbdob01.isChecked() ? 1 : 2)) {
                            if ((MainApp.TotalGirlCount >= MainApp.NoGirlCount) || MainApp.NoGirlCount == 0) {
                                MainApp.errorCountDialog(this, this, "Need to increase no of Girls's in Family Member Activity.");
                            } else {
                                contFunc();
                            }
                        } else {
                            if ((MainApp.TotalFemaleCount >= (MainApp.NoFemaleCount - MainApp.NoGirlCount)) || MainApp.NoFemaleCount == 0) {
                                MainApp.errorCountDialog(this, this, "Need to increase no of Female's in Family Member Activity.");
                            } else {
                                contFunc();
                            }
                        }
                    } else if (dcbm04.isChecked() && dcbd01.isChecked()) {
                        if (MainApp.TotalMaleCount >= MainApp.NoMaleCount || MainApp.NoMaleCount == 0
                                || MainApp.NoMaleCount - (MainApp.TotalMaleCount - MainApp.TotalBoyCount) == MainApp.NoBoyCount) {
                            MainApp.errorCountDialog(this, this, "Need to increase no of Male's in Family Member Activity.");
                        } else {
                            contFunc();
                        }
                    } else if (dcbm04.isChecked() && dcbd02.isChecked()) {
                        if (MainApp.TotalFemaleCount >= MainApp.NoFemaleCount || MainApp.NoFemaleCount == 0
                                || MainApp.NoFemaleCount - (MainApp.TotalFemaleCount - MainApp.TotalGirlCount) == MainApp.NoGirlCount) {
                            MainApp.errorCountDialog(this, this, "Need to increase no of Female's in Family Member Activity.");
                        } else {
                            contFunc();
                        }
                    } else {
                        contFunc();
                    }
                } else {
                contFunc();
                }
            } else {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        this);

                String memberID = "";
                for (byte i = 0; i < MainApp.insertMem.size(); i++) {

                    memberID += "ID: " + MainApp.insertMem.get(i) + "\n";
                }


                alertDialogBuilder
                        .setTitle("memberIDs Already Exist")
                        .setMessage(memberID)
                        .setCancelable(false);
                alertDialogBuilder.setNegativeButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }*/

            contFunc();
        }
    }

    public void contFunc() {

        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
//            Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

            MainApp.memClicked.add(position);

            MainApp.memFlag++;

            finish();

            int chCount = 0;
            if (dcbis04Outc.isChecked()) {
                chCount = 1;
            } else if (dcbis04Outd.isChecked()) {
                chCount = Integer.valueOf(dcbis04Outdc.getText().toString());
            }

            if (chCount > 0) {
                MainApp.TotalMembersCount++;
                startActivity(new Intent(SectionBNewPrevActivity.this, SectionBActivity.class)
                        .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                        .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount)
                        .putExtra("chCount", chCount)
                        .putExtra("mothDSSID", MainApp.cc.getDss_id_member()));
            }

        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }

    }


 /*   public boolean checkChildLessThenFive(int i) {

        if (i == 1) {

            Calendar cal = Calendar.getInstance();
            cal.set(dcbg.getYear(), dcbg.getMonth(), dcbg.getDayOfMonth());
            Date date1 = new Date();
            Date date2 = cal.getTime();
            long diff = date1.getTime() - date2.getTime();
            long ageInYears = (diff / (24 * 60 * 60 * 1000)) / 365;

            return ageInYears < 5;

        } else {
return (Integer.parseInt(dcbhy.getText().toString()) == 5 && Integer.parseInt(dcbhm.getText().toString()) == 0 &&
                    Integer.parseInt(dcbhd.getText().toString()) == 0) || Integer.parseInt(dcbhy.getText().toString()) < 5;

            return Integer.parseInt(dcbhy.getText().toString()) < 5;
        }
    }*/

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);
        Long updcount = db.addCensusMembers(MainApp.cc);
        MainApp.cc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.cc.set_UID(
                    (MainApp.cc.getDeviceId() + MainApp.cc.get_ID()));
            db.updateCensusID();

            MainApp.familyMembersList.set(position, new MembersContract(setDataForList(MainApp.cc)));

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
//        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.cc = new CensusContract();

        MainApp.cc.set_UUID(MainApp.fc.getUID());
        MainApp.cc.setFormDate(MainApp.fc.getFormDate());
        MainApp.cc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.cc.setDss_id_hh(MainApp.fc.getDSSID().toUpperCase());
        MainApp.cc.setUser(MainApp.fc.getUser());

        MainApp.cc.setDevicetagID(sharedPref.getString("tagName", null));

//        MainApp.cc.setSerialNo(String.valueOf(position + 1));

        MainApp.cc.setDss_id_h(MainApp.familyMembersList.get(position).getDss_id_h().toUpperCase());
        MainApp.cc.setPrevs_dss_id_member(MainApp.familyMembersList.get(position).getPrevs_dss_id_member());
        MainApp.cc.setDss_id_f(MainApp.familyMembersList.get(position).getDss_id_f());
        MainApp.cc.setDss_id_m(MainApp.familyMembersList.get(position).getDss_id_m());

//        MainApp.cc.setSite_code(MainApp.familyMembersList.get(position).getSite_code());
//        MainApp.cc.setREF_ID(MainApp.familyMembersList.get(position).get_ID());
        MainApp.cc.set_DATE(MainApp.familyMembersList.get(position).get_DATE());

//        MainApp.cc.setUpdate_dt(new SimpleDateFormat("dd-MM-yy").format(new Date()));
//        MainApp.cc.setUpdate_flag("true");

        MainApp.cc.setDss_id_member(dcbid.getText().toString().toUpperCase());
        MainApp.cc.setName(dcba.getText().toString());
        MainApp.cc.setMember_type(MainApp.familyMembersList.get(position).getMember_type());

        MainApp.cc.setGender(MainApp.familyMembersList.get(position).getGender());

        /*MainApp.cc.setDss_id_f(dcbbfid.getText().toString().toUpperCase());
        MainApp.cc.setDss_id_m(dcbbmid.getText().toString().toUpperCase());

        MainApp.cc.setRelation_hh(dcbbrhh01.isChecked() ? "1" : dcbbrhh02.isChecked() ? "2" : dcbbrhh03.isChecked() ? "3"
                : dcbbrhh04.isChecked() ? "4" : dcbbrhh05.isChecked() ? "5" : dcbbrhh06.isChecked() ? "6"
                : dcbbrhh07.isChecked() ? "7" : dcbbrhh08.isChecked() ? "8" : dcbbrhh09.isChecked() ? "9" : dcbbrhh10.isChecked() ? "10"
                : dcbbrhh11.isChecked() ? "11" : dcbbrhh99.isChecked() ? "99" : dcbbrhh88.isChecked() ? "88" : "0");
        MainApp.cc.setDss_id_f(dcbbfid.getText().toString());
        MainApp.cc.setDss_id_m(dcbbmid.getText().toString());
        MainApp.cc.setM_status(dcbc01.isChecked() ? "1" : dcbc02.isChecked() ? "2" : dcbc03.isChecked() ? "3"
                : dcbc04.isChecked() ? "4" : dcbc88.isChecked() ? "88" : "0");
        if (dcbd01.isChecked()) {
            MainApp.cc.setGender("1");
        } else if (dcbd02.isChecked()) {
            MainApp.cc.setGender("2");
        }

        MainApp.cc.setEducation(dcbe01.isChecked() ? "1" : dcbe02.isChecked() ? "2" : dcbe03.isChecked() ? "3"
                : dcbe04.isChecked() ? "4" : dcbe05.isChecked() ? "5" : dcbe06.isChecked() ? "6"
                : dcbe07.isChecked() ? "7" : dcbe08.isChecked() ? "8" : dcbe96.isChecked() ? "96"
                : dcbe99.isChecked() ? "99" : dcbe88.isChecked() ? "88" : "0");
        MainApp.cc.setEducationX(dcbe96x.getText().toString());
        MainApp.cc.setOccupation(dcbf01.isChecked() ? "1" : dcbf02.isChecked() ? "2" : dcbf03.isChecked() ? "3"
                : dcbf04.isChecked() ? "4" : dcbf05.isChecked() ? "5" : dcbf06.isChecked() ? "6"
                : dcbf07.isChecked() ? "7" : dcbf08.isChecked() ? "8" : dcbf09.isChecked() ? "9"
                : dcbf10.isChecked() ? "10" : dcbf11.isChecked() ? "11" : dcbf12.isChecked() ? "12"
                : dcbf13.isChecked() ? "13" : dcbf14.isChecked() ? "14" : dcbf15.isChecked() ? "15"
                : dcbf16.isChecked() ? "16" : dcbf17.isChecked() ? "17" : dcbf96.isChecked() ? "96"
                : dcbf88.isChecked() ? "88" : "0");
        MainApp.cc.setOccupationX(dcbf96x.getText().toString());

        if (dcbis01.isChecked() || dcbis02.isChecked() || dcbis06.isChecked()) {
            if (dcbdob01.isChecked()) {
                MainApp.cc.setDob(new SimpleDateFormat("dd-MM-yyyy").format(dcbg.getCalendarView().getDate()));
            } else {
                MainApp.cc.setAgeY(dcbhy.getText().toString());
                MainApp.cc.setAgeM(dcbhm.getText().toString());
                MainApp.cc.setAgeD(dcbhd.getText().toString());
            }
        }*/


        FollowUpsContract fp = (FollowUpsContract) getIntent().getSerializableExtra("followUpData");

        JSONObject sC = new JSONObject();

        sC.put("isNew", "2");
        sC.put("dss_id_st", fp.getHhID());
        sC.put("visitdt", fp.getFollowUpDt());
        sC.put("surround", fp.getFollowUpRound());
        sC.put("appVer", MainApp.versionName + "." + MainApp.versionCode);

        if (dcbis09b.isChecked()) {
            sC.put("lmp_dt", new SimpleDateFormat("dd-MM-yyyy").format(dcbis09bdt.getCalendarView().getDate()));
        }

        MainApp.cc.setCurrent_status(dcbis00.isChecked() ? "9" : dcbis01.isChecked() ? "1" : dcbis03.isChecked() ? "2"
                : dcbis05.isChecked() ? "3" : dcbis06.isChecked() ? "7" : dcbis07.isChecked() ? "8" : "0");
        if (dcbis01.isChecked()) {
            MainApp.cc.setCurrent_maritalOutcome(dcbis01Outa.isChecked() ? "1" : dcbis01Outb.isChecked() ? "2" : dcbis01Outc.isChecked() ? "3"
                    : dcbis01Outd.isChecked() ? "4" : "0");

            if (!dcbis01Outa.isChecked()) {

                sC.put("current_preg_status", dcbis09a.isChecked() ? "1" : dcbis09b.isChecked() ? "2" : "0");
                sC.put("current_preg_prv_status", dcbis09c.isChecked() ? "1" : "0");

                if (dcbis09c.isChecked()) {
                    MainApp.cc.setCurrent_statusOutcome(dcbis04Outa.isChecked() ? "1" : dcbis04Outb.isChecked() ? "2" : dcbis04Outc.isChecked() ? "3"
                            : dcbis04Outd.isChecked() ? "4" : "0");

                    if (dcbis04Outd.isChecked()) {
                        sC.put("current_status_out_a", dcbis04Outda.getText().toString());
                        sC.put("current_status_out_b", dcbis04Outdb.getText().toString());
                        sC.put("current_status_out_c", dcbis04Outdc.getText().toString());
                    }
                }

                if (dcbis09b.isChecked()) {
                    MainApp.cc.setCurrent_pregOutcomeDT(new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
                }
            }
        } else if (dcbis03.isChecked()) {
            MainApp.cc.setCurrent_date(new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
            sC.put("dcbis_mig_place", dcbis03a.getText().toString());
        } else if (dcbis05.isChecked()) {
            MainApp.cc.setCurrent_date(new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
            sC.put("dcbis_death_age", dcbis05Age.getText().toString());
            sC.put("dcbis_death_place", dcbis05Placea.isChecked() ? "1" : dcbis05Placeb.isChecked() ? "2" : dcbis05Placec.isChecked() ? "3"
                    : dcbis05Place96.isChecked() ? "96" : "0");
        }

        /*MainApp.cc.setMember_type(dcbm01.isChecked() ? "mw" : dcbm02.isChecked() ? "h" : dcbm03.isChecked() ? "c" : dcbm04.isChecked() ? "ot" : "0");
        MainApp.cc.setsC(dcbir01.isChecked() ? "1" : dcbir02.isChecked() ? "2" : dcbir03.isChecked() ? "3" : "0");

        MainApp.cc.setIs_head(dcbbrhh01.isChecked() ? "1" : "null");
        if (!MainApp.isHead) {
            MainApp.isHead = dcbbrhh01.isChecked() ? true : false;
        }

        MainApp.cc.setRsvp(rsvp01.isChecked() ? "1" : rsvp02.isChecked() ? "2" : "0");
        if (!MainApp.isRsvp) {
            MainApp.isRsvp = rsvp01.isChecked() ? true : false;
        }*/

        MainApp.cc.setsC(String.valueOf(sC));

        Log.d(TAG, "SaveDraft: " + MainApp.cc.toJSONObject());
//        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public MembersContract setDataForList(CensusContract c) {

        MembersContract m = new MembersContract();

        m.set_ID(c.get_ID());
        m.set_DATE(c.get_DATE());
        m.setDss_id_hh(c.getDss_id_hh());
        m.setDss_id_f(c.getDss_id_f());
        m.setDss_id_m(c.getDss_id_m());
        m.setDss_id_h(c.getDss_id_h());
        m.setDss_id_member(c.getDss_id_member());
        m.setPrevs_dss_id_member(c.getPrevs_dss_id_member());
        m.setSite_code(c.getSite_code());
        m.setName(c.getName());
        m.setDob(c.getDob());
        m.setAge(c.getAgeY() + "y " + c.getAgeM() + "m " + c.getAgeD() + "d");
        m.setGender(c.getGender());
        m.setIs_head(c.getIs_head());
        m.setRelation_hh(c.getRelation_hh());
        if (dcbis01.isChecked()) {
            m.setCurrent_status(c.getCurrent_status() + "_" + c.getCurrent_maritalOutcome());
            if (!dcbis01Outa.isChecked() && dcbis09c.isChecked()) {
                m.setCurrent_status(c.getCurrent_status() + "_" + c.getCurrent_statusOutcome());
            }
        } else if (dcbis05.isChecked()) {
            m.setCurrent_status(c.getCurrent_status() + "_" + (dcbis05Placea.isChecked() ? "1" : dcbis05Placeb.isChecked() ? "2" : dcbis05Placec.isChecked() ? "3"
                    : dcbis05Place96.isChecked() ? "96" : ""));
        } else {
            m.setCurrent_status(c.getCurrent_status());
        }

        m.setCurrent_date(c.getCurrent_date());
        m.setDod(c.getCurrent_child_birth_time());
        m.setM_status(c.getM_status());
        m.setEducation(c.getEducation());
        m.setOccupation(c.getOccupation());
        m.setMember_type(c.getMember_type());


        return m;
    }

    public boolean formValidation() {

//        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ====================== Name ==============

        if (dcba.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcba), Toast.LENGTH_SHORT).show();
            dcba.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcba: This data is Required!");
            return false;
        } else {
            dcba.setError(null);
        }

        // ============== Status ===================

        if (dcbis.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis), Toast.LENGTH_SHORT).show();
            dcbis07.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "dcbis: This data is Required!");
            return false;
        } else {
            dcbis07.setError(null);
        }

        if (dcbis01.isChecked()) {

            //Marital status
            if (dcbis01Out.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis07d), Toast.LENGTH_SHORT).show();
                dcbis01Outd.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbis01Out: This data is Required!");
                return false;
            } else {
                dcbis01Outd.setError(null);
            }

            // Married female
            if (!dcbis01Outa.isChecked() &&
                    !(MainApp.familyMembersList.get(position).getMember_type().equals("h") ||
                            MainApp.familyMembersList.get(position).getMember_type().equals("c"))) {

                if (dcbis09.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis09), Toast.LENGTH_SHORT).show();
                    dcbis09a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "dcbis09: This data is Required!");
                    return false;
                } else {
                    dcbis09a.setError(null);
                }

                if (dcbis09c.isChecked()) {
                    if (dcbis04Out.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis0901), Toast.LENGTH_SHORT).show();
                        dcbis04Outd.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "dcbis04Out: This data is Required!");
                        return false;
                    } else {
                        dcbis04Outd.setError(null);
                    }

                    if (dcbis04Outd.isChecked()) {
                        if (dcbis04Outda.getText().toString().isEmpty()) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis09da), Toast.LENGTH_SHORT).show();
                            dcbis04Outda.setError("This data is Required!");

                            Log.i(TAG, "dcbis04Outda: This data is Required!");
                            return false;
                        } else {
                            dcbis04Outda.setError(null);
                        }
                        if (Integer.valueOf(dcbis04Outda.getText().toString()) < 1) {
                            Toast.makeText(this, "ERROR(Range): " + getString(R.string.dcbis09da), Toast.LENGTH_SHORT).show();
                            dcbis04Outda.setError("Range greater then 1!");

                            Log.i(TAG, "dcbis04Outda: Range greater then 1!");
                            return false;
                        } else {
                            dcbis04Outda.setError(null);
                        }
                        if (dcbis04Outdb.getText().toString().isEmpty()) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis09db), Toast.LENGTH_SHORT).show();
                            dcbis04Outdb.setError("This data is Required!");

                            Log.i(TAG, "dcbis04Outdb: This data is Required!");
                            return false;
                        } else {
                            dcbis04Outdb.setError(null);
                        }
                        if (dcbis04Outdc.getText().toString().isEmpty()) {
                            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis09dc), Toast.LENGTH_SHORT).show();
                            dcbis04Outdc.setError("This data is Required!");

                            Log.i(TAG, "dcbis04Outdc: This data is Required!");
                            return false;
                        } else {
                            dcbis04Outdc.setError(null);
                        }
                        if (Integer.valueOf(dcbis04Outdb.getText().toString()) + Integer.valueOf(dcbis04Outdc.getText().toString()) != Integer.valueOf(dcbis04Outda.getText().toString())) {
                            Toast.makeText(this, "ERROR(Range): " + getString(R.string.dcbis09da), Toast.LENGTH_SHORT).show();
                            dcbis04Outda.setError("Total is not correct!");

                            Log.i(TAG, "dcbis04Outda: Total is not correct!");
                            return false;
                        } else {
                            dcbis04Outda.setError(null);
                        }
                    }
                }
            }
        } else if (dcbis05.isChecked()) {
            if (dcbis05Age.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis05Age), Toast.LENGTH_SHORT).show();
                dcbis05Age.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "dcbis05Age: This data is Required!");
                return false;
            } else {
                dcbis05Age.setError(null);
            }

            int minRange = mt.equals("mw") || mt.equals("h") ? 15 : 0;
            int maxRange = mt.equals("c") ? 14 : 100;

            if (Integer.valueOf(dcbis05Age.getText().toString()) < minRange || Integer.valueOf(dcbis05Age.getText().toString()) > maxRange) {
                Toast.makeText(this, "ERROR(Range): " + getString(R.string.dcbis05Age), Toast.LENGTH_SHORT).show();
                dcbis05Age.setError("Age is not correct!");

                Log.i(TAG, "dcbis05Age: Age is not correct!");
                return false;
            } else {
                dcbis05Age.setError(null);
            }

            if (dcbis05Place.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis05Place), Toast.LENGTH_SHORT).show();
                dcbis05Place96.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "dcbis05Place: This data is Required!");
                return false;
            } else {
                dcbis05Place96.setError(null);
            }
        }

        /*if (!dcbis03.isChecked() && !dcbis05.isChecked() && !dcbis04.isChecked()) {

            // ===================== IS_Responder ==============
            if (rsvp.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.rsvp), Toast.LENGTH_SHORT).show();
                rsvp02.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "rsvp: This data is Required!");
                return false;
            } else {
                rsvp02.setError(null);
            }

            // ===================== Relation with HH ==============
            if (dcbbrhh.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbrhh), Toast.LENGTH_SHORT).show();
                dcbbrhh99.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbbrhh: This data is Required!");
                return false;
            } else {
                dcbbrhh99.setError(null);
            }


            if (dcbm03.isChecked()) {
                //============= Father ID ====================
                if (dcbbfid.getText().length() == MainApp.fc.getDSSID().length()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbfid), Toast.LENGTH_SHORT).show();
                    dcbbfid.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "dcbbfid: This data is Required!");
                    return false;
                } else {
                    dcbbfid.setError(null);
                }

                if (dcbbfid.getText().length() != 13) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dcbbfid), Toast.LENGTH_SHORT).show();
                    dcbbfid.setError("This data is Invalid!");    // Set Error on last radio button

                    Log.i(TAG, "dcbbfid: This data is Invalid!");
                    return false;
                } else {
                    dcbbfid.setError(null);
                }

                // ============== MotherTB ID ===================

                if (dcbbmid.getText().length() == MainApp.fc.getDSSID().length()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbmid), Toast.LENGTH_SHORT).show();
                    dcbbmid.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "dcbbmid: This data is Required!");
                    return false;
                } else {
                    dcbbmid.setError(null);
                }
            }

            // ============== Marital Status ===================

            if (dcbc.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbc), Toast.LENGTH_SHORT).show();
                dcbc88.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbc: This data is Required!");
                return false;
            } else {
                dcbc88.setError(null);
            }

            // ============== Sex ===================

            if (dcbd.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbd), Toast.LENGTH_SHORT).show();
                dcbd02.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbd: This data is Required!");
                return false;
            } else {
                dcbd02.setError(null);
            }


            // ============== Check Mother Equality - 2 ===================


            if (dcbm03.isChecked()) {

                char m = dcbbmid.getText().toString().charAt(11);
                if (m != dcbid.getText().toString().charAt(11)) {
                    Toast.makeText(this, "ERROR(Invalid): Member ID not match", Toast.LENGTH_SHORT).show();
                    dcbbmid.setError("Not match with Member ID");

                    Log.i(TAG, "dcbbmid: Not match with Member ID.");
                    return false;
                } else {
                    dcbbmid.setError(null);
                }
            }

            // ============== Education ===================

            if (dcbe.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbe), Toast.LENGTH_SHORT).show();
                dcbe88.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbe: This data is Required!");
                return false;
            } else {
                dcbe88.setError(null);
            }

            // ================= Other Education ===========
            if (dcbe96.isChecked() && dcbe96x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbe) + " - " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
                dcbe96x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbe96x: This data is Required!");
                return false;
            } else {
                dcbe96x.setError(null);
            }

            // ============== Occupation ===================

            if (dcbf.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbf), Toast.LENGTH_SHORT).show();
                dcbf88.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbf: This data is Required!");
                return false;
            } else {
                dcbf88.setError(null);
            }

            // ================= Other Occupation ===========
            if (dcbf96.isChecked() && dcbf96x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbf) + " - " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
                dcbf96x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbf96x: This data is Required!");
                return false;
            } else {
                dcbf96x.setError(null);
            }

            if (dcbdob.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbg), Toast.LENGTH_SHORT).show();
                dcbAge02.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbf: This data is Required!");
                return false;
            } else {
                dcbAge02.setError(null);
            }

            if (dcbAge02.isChecked()) {

                if ((Integer.parseInt(dcbhy.getText().toString().isEmpty() ? "0" : dcbhy.getText().toString()) == 0
                        && Integer.parseInt(dcbhm.getText().toString().isEmpty() ? "0" : dcbhm.getText().toString()) == 0
                        && Integer.parseInt(dcbhd.getText().toString().isEmpty() ? "0" : dcbhd.getText().toString()) == 0)) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbh), Toast.LENGTH_SHORT).show();
                    dcbhd.setError("Can not be zero");
                    Log.i(TAG, "dcbhd: Can not be zero");
                    return false;
                } else {
                    dcbhd.setError(null);
                }
                // ================= Age in years ===========
                if (dcbhy.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbhy), Toast.LENGTH_SHORT).show();
                    dcbhy.setError("This data is Required! Please enter some value or zero");    // Set Error on last radio button

                    Log.i(TAG, "dcbhy: This data is Required!");
                    return false;
                } else {
                    dcbhy.setError(null);
                }

                if ((Integer.parseInt(dcbhy.getText().toString()) < 0) || (Integer.parseInt(dcbhy.getText().toString()) > 99)) {
                    Toast.makeText(this, "ERROR(Range): " + getString(R.string.dcbhy), Toast.LENGTH_SHORT).show();
                    dcbhy.setError("Range is 1 to 99 Years");    // Set Error on last radio button

                    Log.i(TAG, "dcbhy: Range is 1 to 99 Years");
                    return false;
                } else {
                    dcbhy.setError(null);
                }

                // ================= Age in months ===========
                if (dcbhm.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbhm), Toast.LENGTH_SHORT).show();
                    dcbhm.setError("This data is Required! Please enter some value or zero");    // Set Error on last radio button

                    Log.i(TAG, "dcbhm: This data is Required!");
                    return false;
                } else {
                    dcbhm.setError(null);
                }

                if ((Integer.parseInt(dcbhm.getText().toString()) < 0) || (Integer.parseInt(dcbhm.getText().toString()) > 11)) {
                    Toast.makeText(this, "ERROR(Range): " + getString(R.string.dcbhm), Toast.LENGTH_SHORT).show();
                    dcbhm.setError("Range is 1 to 11 months");    // Set Error on last radio button

                    Log.i(TAG, "dcbhy: Range is 1 to 11 months");
                    return false;
                } else {
                    dcbhm.setError(null);
                }


                // ================= Age in days ===========
                if (dcbhd.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbhd), Toast.LENGTH_SHORT).show();
                    dcbhd.setError("This data is Required! Please enter some value or zero");    // Set Error on last radio button

                    Log.i(TAG, "dcbhd: This data is Required!");
                    return false;
                } else {
                    dcbhd.setError(null);
                }

                if ((Integer.parseInt(dcbhd.getText().toString()) < 0) || (Integer.parseInt(dcbhd.getText().toString()) > 29)) {
                    Toast.makeText(this, "ERROR(Range): " + getString(R.string.dcbhd), Toast.LENGTH_SHORT).show();
                    dcbhd.setError("Range is 1 to 29 Days");    // Set Error on last radio button

                    Log.i(TAG, "dcbhy: Range is 1 to 29 Days");
                    return false;
                } else {
                    dcbhd.setError(null);
                }

//                Check for mw and h
                if (dcbm01.isChecked() || dcbm02.isChecked()) {
                    if (Integer.parseInt(dcbhy.getText().toString()) < 14) {
                        Toast.makeText(this, "ERROR(Invalid): It would be Greater then 10", Toast.LENGTH_SHORT).show();
                        dcbhy.setError("It would be Greater then 10");    // Set Error on last radio button

                        Log.i(TAG, "dcbhy: It would be Greater then 10");
                        return false;
                    } else {
                        dcbhy.setError(null);
                    }
                }
            } else {
                if (dcbm01.isChecked() || dcbm02.isChecked()) {
                    Calendar cal2 = Calendar.getInstance();
                    cal2.set(dcbg.getYear(), dcbg.getMonth(), dcbg.getDayOfMonth());

                    Date crrDate = new Date();

                    Date dateOfBirth = cal2.getTime();

                    long diff = crrDate.getTime() - dateOfBirth.getTime();

                    Long ageInYears = (diff / (24 * 60 * 60 * 1000)) / 365;

                    if (ageInYears < 14) {
                        Toast.makeText(this, "ERROR(Invalid): It would be Greater then 10", Toast.LENGTH_SHORT).show();
                        dcbdob01.setError("It would be Greater then 10");    // Set Error on last radio button

                        Log.i(TAG, "dcbg: It would be Greater then 10");
                        return false;
                    } else {
                        dcbdob01.setError(null);
                    }
                }
            }
        }*/

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
