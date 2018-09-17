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
import edu.aku.hassannaqvi.dss_census_sur.otherClasses.DateUtils;
import edu.aku.hassannaqvi.dss_census_sur.validation.validatorClass;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;
import io.blackbox_vision.datetimepickeredittext.view.TimePickerEditText;

public class SectionBNewPrevActivity extends AppCompatActivity {

    private static final String TAG = SectionBActivity.class.getSimpleName();
    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());

    @BindView(R.id.scrollView01)
    ScrollView scroll;
    @BindView(R.id.dcba)
    EditText dcba;
    @BindView(R.id.dcbid)
    EditText dcbid;
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
    @BindView(R.id.dcbis05Cause)
    EditText dcbis05Cause;
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
    DatePickerInputEditText dcbidob;

    @BindView(R.id.dcbis03a)
    EditText dcbis03a;

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
    DatePickerInputEditText dcbis09bdt;
    @BindView(R.id.dcbis04Outdt)
    DatePickerInputEditText dcbis04Outdt;
    @BindView(R.id.dcbis04Outtime)
    TimePickerEditText dcbis04Outtime;


    @BindView(R.id.cb_dcbid)
    CheckBox cbDcbid;
    @BindView(R.id.edt_dcbid)
    EditText edtDcbid;

    int position = 0;
    String mt;

    //TODO: Convert old date picker and time picker to new ones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b_new_prev);
        ButterKnife.bind(this);

        this.setTitle("D S S");

        Calendar cal = Calendar.getInstance();
        dcbis04Outtime.setManager(getSupportFragmentManager());
        dcbis04Outtime.setTimeFormat("HH:mm");
        dcbidob.setManager(getSupportFragmentManager());
        dcbidob.setMaxDate(dateToday);
        dcbis09bdt.setManager(getSupportFragmentManager());
        dcbis09bdt.setMaxDate(dateToday);
        dcbis09bdt.setMinDate(DateUtils.getUpdatedDate("dd/MM/yyyy", -280));

        dcbis04Outdt.setManager(getSupportFragmentManager());
        dcbis04Outdt.setMaxDate(dateToday);
        cal.setTimeInMillis(System.currentTimeMillis());

        position = getIntent().getExtras().getInt("position");

        dcba.setText(MainApp.familyMembersList.get(position).getName());

        dcbid.setText(MainApp.familyMembersList.get(position).getDss_id_member());
        Log.d(TAG, "onCreate: " + MainApp.familyMembersList.get(position).getDss_id_member());
        dcbid.setEnabled(false);

        mt = MainApp.familyMembersList.get(position).getMember_type();
//        dcbis01.setEnabled(mt.equals("c") ? false : true);
        dcbis02.setEnabled(!mt.equals("h") && !mt.equals("c"));
        dcbis04.setEnabled(!mt.equals("h") && !mt.equals("c"));
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
            dcbis01.setEnabled(calculateYears >= 10);
        }

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
                            MainApp.familyMembersList.get(position).getMember_type().equals("c") || MainApp.familyMembersList.get(position).getGender().equals("1"))) {
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

        cbDcbid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtDcbid.setVisibility(View.VISIBLE);
                } else {
                    edtDcbid.setVisibility(View.GONE);
                    edtDcbid.setText(null);
                }
            }
        });

    }

    public void clearFieldsOnStatus() {

        dcbis05Age.setText(null);
        dcbis05Cause.setText(null);
        dcbis05Place.clearCheck();

        dcbis04Out.clearCheck();

        dcbis01Out.clearCheck();

        dcbis09.clearCheck();
        dcbis09c.setChecked(false);

        dcbis03a.setText(null);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

//        MainApp.finishActivity(this, this);
        startActivity(new Intent(SectionBNewPrevActivity.this, FamilyMembersActivity.class));
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        if (formValidation()) {

            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
//            Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                MainApp.memClicked.add(position);

                SectionAActivity.memFlag++;

                finish();

                int chCount = 0;
                if (dcbis04Outc.isChecked()) {
                    chCount = 1;
                } else if (dcbis04Outd.isChecked()) {
                    chCount = Integer.valueOf(dcbis04Outdc.getText().toString());
                    SectionBActivity.sbCounter = Integer.valueOf(dcbis04Outdb.getText().toString());
                }

                if (chCount > 0) {
                    MainApp.TotalMembersCount++;
                    startActivity(new Intent(SectionBNewPrevActivity.this, SectionBActivity.class)
                            .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                            .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount)
                            .putExtra("chCount", chCount)
                            .putExtra("mothData", MainApp.cc)
                    );
                } else {

                    if (dcbis04Outb.isChecked()) {
                        SectionBActivity.sbCounter = 1;
                    } else if (dcbis04Outd.isChecked()) {
                        SectionBActivity.sbCounter = Integer.valueOf(dcbis04Outdb.getText().toString());
                    } else {
                        SectionBActivity.sbCounter = 0;
                    }

                    if (SectionBActivity.sbCounter > 0) {
                        startActivity(new Intent(SectionBNewPrevActivity.this, StillBirthReportActivity.class)
                                .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                                .putExtra("mothData", MainApp.cc)
                                .putExtra("sbCount", SectionBActivity.sbCounter)
                        );
                    } else {
                        startActivity(new Intent(SectionBNewPrevActivity.this, FamilyMembersActivity.class));
                    }

                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }

        }
    }

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

        MainApp.cc.setDob(MainApp.familyMembersList.get(position).getDob());

        FollowUpsContract fp = (FollowUpsContract) getIntent().getSerializableExtra("followUpData");

        JSONObject sC = new JSONObject();

        if (cbDcbid.isChecked()) {
            sC.put("dcbid_cm", edtDcbid.getText().toString());
        }

        sC.put("isNew", "2");
        sC.put("dss_id_st", fp.getHhID());
        sC.put("visitdt", fp.getFollowUpDt());
        sC.put("surround", fp.getFollowUpRound());
        sC.put("appVer", MainApp.versionName + "." + MainApp.versionCode);
        sC.put("visit_type", HouseholdListActivity.visitType);

        if (dcbis09b.isChecked()) {
            sC.put("lmp_dt", dcbis09bdt.getText().toString());
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

                    sC.put("current_status_out_dt", dcbis04Outdt.getText().toString());
                    sC.put("current_status_out_time", dcbis04Outtime.getText().toString());

                    MainApp.cc.setCurrent_statusOutcome(dcbis04Outa.isChecked() ? "1" : dcbis04Outb.isChecked() ? "2" : dcbis04Outc.isChecked() ? "3"
                            : dcbis04Outd.isChecked() ? "4" : "0");

                    if (dcbis04Outd.isChecked()) {
                        sC.put("current_status_out_a", dcbis04Outda.getText().toString());
                        sC.put("current_status_out_b", dcbis04Outdb.getText().toString());
                        sC.put("current_status_out_c", dcbis04Outdc.getText().toString());
                    }
                }

                /*if (dcbis09b.isChecked()) {
//                    MainApp.cc.setCurrent_pregOutcomeDT(new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
                    MainApp.cc.setCurrent_pregOutcomeDT(dcbidob.getText().toString());
                }*/
            }
        } else if (dcbis03.isChecked()) {
//            MainApp.cc.setCurrent_date(new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
            MainApp.cc.setCurrent_date(dcbidob.getText().toString());
            sC.put("dcbis_mig_place", dcbis03a.getText().toString());
        } else if (dcbis05.isChecked()) {
//            MainApp.cc.setCurrent_date(new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
            MainApp.cc.setCurrent_date(dcbidob.getText().toString());
            sC.put("dcbis_death_age", dcbis05Age.getText().toString());
            sC.put("dcbis_death_cause", dcbis05Cause.getText().toString());
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
            m.setCurrent_status(c.getCurrent_status() + "_" + c.getCurrent_maritalOutcome() + ":" + (dcbis09a.isChecked() ? "1" : dcbis09b.isChecked() ? "2" : ""));
            if (dcbis09c.isChecked()) {
                m.setCurrent_status(c.getCurrent_status() + "_" + c.getCurrent_maritalOutcome() + ":" + (dcbis09a.isChecked() ? "1" : dcbis09b.isChecked() ? "2" : "") + ":" + c.getCurrent_statusOutcome());
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

        if (cbDcbid.isChecked()) {
            if (edtDcbid.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.edt_dcbid), Toast.LENGTH_SHORT).show();
                edtDcbid.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "edtDcbid: This data is Required!");
                return false;
            } else {
                edtDcbid.setError(null);
            }
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
                            MainApp.familyMembersList.get(position).getMember_type().equals("c") || MainApp.familyMembersList.get(position).getGender().equals("1"))) {

                if (dcbis09.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis09), Toast.LENGTH_SHORT).show();
                    dcbis09a.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "dcbis09: This data is Required!");
                    return false;
                } else {
                    dcbis09a.setError(null);
                }
                if (dcbis09b.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, dcbis09bdt, getString(R.string.date))) {
                        return false;
                    }
                }

                if (dcbis09c.isChecked()) {

                    if (!validatorClass.EmptyTextBox(this, dcbis04Outdt, getString(R.string.date))) {
                        return false;
                    }
                    if (!validatorClass.EmptyTextBox(this, dcbis04Outtime, getString(R.string.dci17b1time))) {
                        return false;
                    }

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

            if (dcbis05Cause.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis05Cause), Toast.LENGTH_SHORT).show();
                dcbis05Cause.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "dcbis05Cause: This data is Required!");
                return false;
            } else {
                dcbis05Cause.setError(null);
            }
        } else if (dcbis03.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, dcbidob, getString(R.string.date))) {
                return false;
            }

            return validatorClass.EmptyTextBox(this, dcbis03a, getString(R.string.dcbis03a));

        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
