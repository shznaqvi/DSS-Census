package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

public class SectionBActivity extends AppCompatActivity implements View.OnKeyListener, TextWatcher {

    private static final String TAG = SectionBActivity.class.getSimpleName();

    @BindView(R.id.scrollView01)
    ScrollView scroll;
    @BindView(R.id.dcba)
    EditText dcba;
    @BindView(R.id.dcbid)
    EditText dcbid;
    @BindView(R.id.dcbd)
    RadioGroup dcbd;
    @BindView(R.id.dcbd01)
    RadioButton dcbd01;
    @BindView(R.id.dcbd02)
    RadioButton dcbd02;
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
    @BindView(R.id.fldGrpdcbidt)
    LinearLayout fldGrpdcbidt;
    @BindView(R.id.fldGrpdcbidttime)
    LinearLayout fldGrpdcbidttime;
    @BindView(R.id.dcbidtTxt)
    TextView dcbidtTxt;
    @BindView(R.id.dcbidob)
    DatePickerInputEditText dcbidob;
    @BindView(R.id.dcbitime)
    TimePicker dcbitime;
    @BindView(R.id.dcbm)
    RadioGroup dcbm;
    @BindView(R.id.dcbm01)
    RadioButton dcbm01;
    @BindView(R.id.dcbm02)
    RadioButton dcbm02;
    @BindView(R.id.dcbm03)
    RadioButton dcbm03;
    @BindView(R.id.dcbm04)
    RadioButton dcbm04;

    @BindView(R.id.childCounterlbl)
    TextView childCounterlbl;

    @BindView(R.id.mothDssID)
    LinearLayout mothDssID;
    @BindView(R.id.dcbbmid)
    EditText dcbbmid;
    @BindView(R.id.dcbbmidSpinner)
    Spinner dcbbmidSpinner;

    @BindView(R.id.husbDssID)
    LinearLayout husbDssIDLayout;
    @BindView(R.id.dcbbhid)
    EditText dcbbhid;
    @BindView(R.id.dcbbhidSpinner)
    Spinner dcbbhidSpinner;

    @BindView(R.id.fldGrpdbis0401)
    LinearLayout fldGrpdbis0401;
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

    @BindView(R.id.dcbis01Status)
    RadioGroup dcbis01Status;
    @BindView(R.id.dcbis01Statusa)
    RadioButton dcbis01Statusa;
    @BindView(R.id.dcbis01Statusb)
    RadioButton dcbis01Statusb;
    @BindView(R.id.dcbis01Statusc)
    RadioButton dcbis01Statusc;

    @BindView(R.id.fldGrpdbis0401a)
    LinearLayout fldGrpdbis0401a;
    @BindView(R.id.dcbis04prvDSSID)
    EditText dcbis04prvDSSID;

    int position = 0;
    boolean dataFlag = false;
    int childCount;
    public static int childCounter = 1;
    public static int sbCounter = 0;

    DatabaseHelper db;

    ArrayList<String> husbandNames;
    ArrayList<String> husbandDSSID;
    ArrayList<String> motherNames;
    ArrayList<String> motherDSSID;

    @BindView(R.id.dcbis09bdt)
    DatePickerInputEditText dcbis09bdt;
    @BindView(R.id.dcbis04Outdt)
    DatePickerInputEditText dcbis04Outdt;
    @BindView(R.id.dcbis04Outtime)
    TimePickerEditText dcbis04Outtime;

    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
    String minDate = null;
    //TODO: Convert old date picker and time picker to new ones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
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

        db = new DatabaseHelper(this);

        dataFlag = getIntent().getBooleanExtra("dataFlag", false);
        position = getIntent().getExtras().getInt("position");

        dcbid.setEnabled(true);

        dcbid.setText(MainApp.fc.getDSSID());

        dcbid.setOnKeyListener(SectionBActivity.this);
        dcbid.addTextChangedListener(SectionBActivity.this);

        dcbid.setInputType(InputType.TYPE_CLASS_NUMBER);


        dcbis06.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dcbis06x.setVisibility(View.VISIBLE);
                } else {
                    dcbis06x.setVisibility(View.GONE);
                    dcbis06x.setText(null);
                }
            }
        });

        dcbis.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                clearFieldsOnStatus();

                if (dcbis01.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);
                    fldGrpdcbidttime.setVisibility(View.VISIBLE);
                    dcbidtTxt.setText(getString(R.string.dcbis01) + " " + getString(R.string.dcbidt));
                    fldGrpdbis0401.setVisibility(View.GONE);
                    fldGrpdbis0401a.setVisibility(View.GONE);
                } else if (dcbis02.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);
                    fldGrpdcbidttime.setVisibility(View.GONE);
                    dcbidtTxt.setText(getString(R.string.dcbis02) + " " + getString(R.string.dcbidt));
                    fldGrpdbis0401.setVisibility(View.VISIBLE);
                    fldGrpdbis0401a.setVisibility(View.GONE);
                } else if (dcbis03.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);
                    dcbidtTxt.setText(getString(R.string.dcbis03) + " " + getString(R.string.dcbidt));
                    fldGrpdbis0401.setVisibility(View.GONE);
                    fldGrpdbis0401a.setVisibility(View.GONE);
                } else if (dcbis04.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);
                    fldGrpdcbidttime.setVisibility(View.GONE);
                    dcbidtTxt.setText(getString(R.string.dcbis04) + " " + getString(R.string.dcbidt));
                    fldGrpdbis0401.setVisibility(View.VISIBLE);
                    fldGrpdbis0401a.setVisibility(View.VISIBLE);
                } else if (dcbis05.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);
                    dcbidtTxt.setText(" " + getString(R.string.dccf));
                    fldGrpdbis0401.setVisibility(View.GONE);
                    fldGrpdbis0401a.setVisibility(View.GONE);
                } else {
                    fldGrpdbis0401.setVisibility(View.GONE);
                    fldGrpdbis0401a.setVisibility(View.GONE);
                }
            }
        });

        dcbis01Out.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.dcbis01Outb || checkedId == R.id.dcbis01Outc || checkedId == R.id.dcbis01Outd) {
                    if (dcbm01.isChecked()) {
                        fldGrpdcbidt02.setVisibility(View.VISIBLE);
                    }
                } else {
                    fldGrpdcbidt02.setVisibility(View.GONE);
                    dcbis09.clearCheck();
                    dcbis09c.setChecked(false);
                    dcbis04Out.clearCheck();
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

        dcbis06.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpdcbidt.setVisibility(View.GONE);

                    dcbis06x.setVisibility(View.VISIBLE);
                } else {
                    dcbis06x.setVisibility(View.GONE);
                    dcbis06x.setText(null);
                }
            }
        });

        dcbd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (childCount == 0) {
                    if (dcbd01.isChecked()) {
                        dcbm01.setEnabled(false);
                        dcbm01.setChecked(false);

                        dcbm02.setEnabled(true);
                    } else {
                        dcbm02.setEnabled(false);
                        dcbm02.setChecked(false);
                        dcbm01.setEnabled(true);
                    }
                }
                dcbis.clearCheck();
            }
        });

        dcbm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                dcbid.setOnKeyListener(SectionBActivity.this);
                dcbid.addTextChangedListener(SectionBActivity.this);

                memberTypeOtherFun();
                fldGrpdcbidt.setVisibility(View.GONE);

                if (dcbm01.isChecked() || dcbm02.isChecked()) {

                    dcbis01Outa.setEnabled(false);
                    dcbis01Out.clearCheck();

                    mothDssID.setVisibility(View.GONE);
                    dcbbmidSpinner.setVisibility(View.GONE);
                    dcbid.setText(null);
                    dcbid.setEnabled(true);
                    dcbbmid.setText(null);
                    dcbidob.setMinDate(minDate);

                    dcbis.clearCheck();
                    dcbis01.setEnabled(false);
                    dcbis02.setEnabled(true);
                    dcbis04.setEnabled(true);

                    if (i == R.id.dcbm01) {
                        husbDssIDLayout.setVisibility(View.VISIBLE);

                        husbandNames = new ArrayList<>();
                        husbandNames.add("....");
                        husbandDSSID = new ArrayList<>();
                        husbandDSSID.add("");

                        for (CensusContract censusContract : db.getMaleMemCensus(MainApp.fc.getDSSID().toUpperCase(), MainApp.fc.getFormDate())) {

                            Boolean checkFlag;
                            if (censusContract.getMember_type().equals("c")) {
                                checkFlag = getAgeByDOB(censusContract.getDob()) > 10;
                            } else if (censusContract.getMember_type().equals("ot")) {
                                if (censusContract.getDob().equals("")) {
                                    checkFlag = true;
                                } else {
                                    checkFlag = getAgeByDOB(censusContract.getDob()) > 10;
                                }
                            } else {
                                checkFlag = true;
                            }

                            if (checkFlag) {
                                husbandNames.add(censusContract.getName());
                                husbandDSSID.add(censusContract.getDss_id_member());
                            }
                        }
                        dcbbhidSpinner.setAdapter(new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, husbandNames));

                    }

                } else if (dcbm03.isChecked()) {

                    husbDssIDLayout.setVisibility(View.GONE);

                    dcbid.setInputType(InputType.TYPE_CLASS_NUMBER);

                    dcbis.clearCheck();
                    dcbis01.setEnabled(true);
                    dcbis02.setEnabled(false);
                    dcbis04.setEnabled(false);
                    dcbidob.setMinDate(DateUtils.getUpdatedDateByMonths("dd/MM/yyyy", -59

                    ));

                    if (childCount == 0) {
                        mothDssID.setVisibility(View.VISIBLE);
                        dcbbmidSpinner.setVisibility(View.VISIBLE);
                        dcbbmid.setEnabled(false);
                        dcbid.setEnabled(false);

                        motherNames = new ArrayList<>();
                        motherNames.add("....");
                        motherDSSID = new ArrayList<>();
                        motherDSSID.add("");

                        for (CensusContract censusContract : db.getMWRAsCensus(MainApp.fc.getDSSID().toUpperCase(), MainApp.fc.getFormDate(), MainApp.fc.getUID())) {
                            motherNames.add(censusContract.getName());
                            motherDSSID.add(censusContract.getDss_id_member());
                        }
                        dcbbmidSpinner.setAdapter(new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, motherNames));
                    }
                } else {

                    dcbis01Outa.setEnabled(true);

                    dcbis.clearCheck();
                    dcbis01.setEnabled(true);
                    dcbis02.setEnabled(true);
                    dcbis04.setEnabled(true);
                    dcbidob.setMinDate(minDate);
                    husbDssIDLayout.setVisibility(View.GONE);

                    mothDssID.setVisibility(View.GONE);
                    dcbbmidSpinner.setVisibility(View.GONE);
                    dcbbmid.setText(null);
                }

            }
        });

        /*Visibility gone*/
        dcbis03.setVisibility(View.GONE);
        dcbis05.setVisibility(View.GONE);
        dcbis06.setVisibility(View.GONE);

//        Checking live birth of child
        childCount = getIntent().getIntExtra("chCount", 0);
        if (childCount > 0) {
            childCounterlbl.setVisibility(View.VISIBLE);
            childCounterlbl.setText("Child " + childCounter + " out of " + childCount);

            dcbm01.setEnabled(false);
            dcbm02.setEnabled(false);
            dcbm04.setEnabled(false);
            dcbm03.setChecked(true);

            mothDssID.setVisibility(View.VISIBLE);

            CensusContract cContract = (CensusContract) getIntent().getSerializableExtra("mothData");

//            String motherDSSID = getIntent().getStringExtra("mothDSSID");
            String motherDSSID = cContract.getDss_id_member();
            dcbbmid.setText(motherDSSID);
            dcbbmid.setEnabled(false);

            if (MainApp.MotherChildList.get(motherDSSID) != null) {
                String chID = MainApp.MotherChildList.get(motherDSSID).substring(motherDSSID.length());
                MainApp.MotherChildList.put(motherDSSID, motherDSSID + (Integer.valueOf(chID) + 1));
            } else {
                MainApp.MotherChildList.put(motherDSSID, motherDSSID + "1");
            }

            dcbid.setText(MainApp.MotherChildList.get(motherDSSID));
            dcbid.setEnabled(false);

        } else {
            childCounterlbl.setVisibility(View.GONE);
            mothDssID.setVisibility(View.GONE);
            dcbbmid.setText(null);
        }

        dcbbmidSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {

                    dcbbmid.setText(motherDSSID.get(position));

                    if (MainApp.MotherChildList.get(motherDSSID.get(position)) != null) {
                        String chID = MainApp.MotherChildList.get(motherDSSID.get(position)).substring(motherDSSID.get(position).length());
                        MainApp.MotherChildList.put(motherDSSID.get(position), motherDSSID.get(position) + (Integer.valueOf(chID) + 1));
                    } else {
                        MainApp.MotherChildList.put(motherDSSID.get(position), motherDSSID.get(position) + "1");
                    }
                    dcbid.setText(MainApp.MotherChildList.get(motherDSSID.get(position)));

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dcbbhidSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {
                    dcbbhid.setText(husbandDSSID.get(position));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private int getAgeByDOB(String dob) {
        if (!dob.equals("")) {
            if (dob.contains(":")) {
                return Integer.valueOf(dob.split(":")[0]);
            } else {
                return (int) MainApp.ageInYearByDOB(dob);
            }
        } else {
            return 0;
        }
    }

    private void memberTypeOtherFun() {

//        New Functionality

        if (!dataFlag) {
            if (dcbm04.isChecked()) {
                dcbid.setText(MainApp.fc.getDSSID() + "X" + (MainApp.randID < 10 ? "0" + MainApp.randID : MainApp.randID));
                dcbid.setEnabled(false);
            } else {

                if (dcbid.getText().toString().length() > 11) {
                    if (dcbid.getText().toString().charAt(11) == 'X') {
                        dcbid.setText(MainApp.fc.getDSSID());
                        dcbid.setEnabled(true);

                        scroll.setScrollY(0);
                        dcbid.requestFocus();
                    }
                }
            }
        }
    }

    public void clearFieldsOnStatus() {

        dcbis01Status.clearCheck();

        dcbis04Out.clearCheck();
        dcbis01Out.clearCheck();
        dcbis09.clearCheck();
        dcbis09c.setChecked(false);

        dcbis04prvDSSID.setText(null);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (dcbm03.isChecked()) {
            if (dcbid.getText().length() < MainApp.fc.getDSSID().length()) {
                dcbid.setText(MainApp.fc.getDSSID());
            }
        } else {
            if (dcbid.getText().length() < MainApp.fc.getDSSID().length()) {
                dcbid.setText(MainApp.fc.getDSSID());
            }
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {
        if (dcbm03.isChecked()) {
            if (editable == dcbid.getEditableText()) {
                if (dcbid.getText().length() < MainApp.fc.getDSSID().length()) {
                    dcbid.setText(MainApp.fc.getDSSID());
                }
            }
        } else {
            if (editable == dcbid.getEditableText()) {
                if (dcbid.getText().length() < MainApp.fc.getDSSID().length()) {
                    dcbid.setText(MainApp.fc.getDSSID());
                }
            }
        }
    }

    @Override
    public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
        if (keyCode == KeyEvent.KEYCODE_DEL) {
            //do nothing
            if (view == dcbid) {
                if (dcbid.getText().length() == MainApp.fc.getDSSID().length()) {

                } else {
                    return false;
                }
            }
        }
        return true;
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SectionBActivity.this);
        alertDialogBuilder
                .setMessage("Are you sure to end this section?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {

                                finish();
                                if (childCount > 0) {
                                    dcba.setText("Not Complete Child!!");
                                    try {
                                        SaveDraft();
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                    if (childCount != childCounter) {
                                        childCounter++;
                                        MainApp.TotalMembersCount++;
                                        startActivity(new Intent(SectionBActivity.this, SectionBActivity.class)
                                                .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                                                .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount)
                                                .putExtra("chCount", childCount));
                                    } else {
                                        // reseting child counter
                                        childCounter = 1;


                                        if (dcbis04Outb.isChecked()) {
                                            sbCounter = 1;
                                        } else if (dcbis04Outd.isChecked()) {
                                            sbCounter = Integer.valueOf(dcbis04Outdb.getText().toString());
                                        } else {
                                            sbCounter = 0;
                                        }

                                        if (sbCounter > 0) {
                                            startActivity(new Intent(SectionBActivity.this, StillBirthReportActivity.class)
                                                    .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                                                    .putExtra("mothData", getIntent().getSerializableExtra("mothData"))
                                                    .putExtra("sbCount", sbCounter)
                                            );
                                        } else {
                                            startActivity(new Intent(SectionBActivity.this, FamilyMembersActivity.class));
                                        }

                                    }
                                }

                            }
                        });
        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
//        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {

// Insert into array for showing in alert if same member id wants to enter
            boolean flag = true;
            for (String mem : MainApp.insertMem) {

                if (mem.equals(dcbid.getText().toString())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                contFunc();
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
            }
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

            MainApp.insertMem.add(dcbid.getText().toString());

            if (dcbm04.isChecked()) {
                MainApp.randID += 1;
            }

            SectionAActivity.memFlag++;
            finish();

            if (childCount > 0) {
                if (childCount != childCounter) {
                    childCounter++;
                    MainApp.TotalMembersCount++;
                    startActivity(new Intent(SectionBActivity.this, SectionBActivity.class)
                            .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                            .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount)
                            .putExtra("chCount", childCount)
                            .putExtra("mothData", getIntent().getSerializableExtra("mothData")));
                } else {
                    childCounter = 1;

                    if (sbCounter > 0) {
                        startActivity(new Intent(SectionBActivity.this, StillBirthReportActivity.class)
                                .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                                .putExtra("mothData", getIntent().getSerializableExtra("mothData"))
                                .putExtra("sbCount", sbCounter)
                        );
                    } else {
                        startActivity(new Intent(SectionBActivity.this, FamilyMembersActivity.class));
                    }
                }
            } else {
                int chCount = 0;
                if (dcbis04Outc.isChecked()) {
                    chCount = 1;
                } else if (dcbis04Outd.isChecked()) {
                    chCount = Integer.valueOf(dcbis04Outdc.getText().toString());
                    sbCounter = Integer.valueOf(dcbis04Outdb.getText().toString());
                }

                if (chCount > 0) {
                    MainApp.TotalMembersCount++;
                    startActivity(new Intent(SectionBActivity.this, SectionBActivity.class)
                            .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                            .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount)
                            .putExtra("chCount", chCount)
                            .putExtra("mothData", MainApp.cc));
                } else {

                    if (dcbis04Outb.isChecked()) {
                        sbCounter = 1;
                    } else if (dcbis04Outd.isChecked()) {
                        sbCounter = Integer.valueOf(dcbis04Outdb.getText().toString());
                    } else {
                        sbCounter = 0;
                    }

                    if (sbCounter > 0) {
                        startActivity(new Intent(SectionBActivity.this, StillBirthReportActivity.class)
                                .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                                .putExtra("mothData", MainApp.cc)
                                .putExtra("sbCount", sbCounter)
                        );
                    } else {
                        startActivity(new Intent(SectionBActivity.this, FamilyMembersActivity.class));
                    }
                }
            }

        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }

    }


/*    public boolean checkChildLessThenFive(int i) {

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
        db = new DatabaseHelper(this);
        Long updcount = db.addCensusMembers(MainApp.cc);
        MainApp.cc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.cc.set_UID(
                    (MainApp.cc.getDeviceId() + MainApp.cc.get_ID()));
            db.updateCensusID();


            MainApp.familyMembersList.add(new MembersContract(setDataForList(MainApp.cc)));

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.cc = new CensusContract();

        MainApp.cc.set_UUID(MainApp.fc.getUID());
        MainApp.cc.setFormDate(MainApp.fc.getFormDate());
        MainApp.cc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.cc.setDss_id_hh(MainApp.fc.getDSSID().toUpperCase());
        MainApp.cc.setUser(MainApp.fc.getUser());

        MainApp.cc.setDevicetagID(sharedPref.getString("tagName", null));

        MainApp.cc.setDss_id_member(dcbid.getText().toString().toUpperCase());
        MainApp.cc.setName(dcba.getText().toString());
        MainApp.cc.setDss_id_m(dcbbmid.getText().toString());

        MainApp.cc.setDss_id_h(dcbbhid.getText().toString());

        if (dcbd01.isChecked()) {
            MainApp.cc.setGender("1");
        } else if (dcbd02.isChecked()) {
            MainApp.cc.setGender("2");
        }

        FollowUpsContract fp = (FollowUpsContract) getIntent().getSerializableExtra("followUpData");

        JSONObject sC = new JSONObject();

        sC.put("isNew", "1");
        sC.put("dss_id_st", fp.getHhID());
        sC.put("visitdt", fp.getFollowUpDt());
        sC.put("surround", fp.getFollowUpRound());
        sC.put("appVer", MainApp.versionName + "." + MainApp.versionCode);
        sC.put("visit_type", HouseholdListActivity.visitType);

        if (dcbis09b.isChecked()) {
            sC.put("lmp_dt", dcbis09bdt.getText().toString());
        }

        MainApp.cc.setCurrent_status(dcbis01.isChecked() ? "4" : dcbis02.isChecked() ? "5" : dcbis04.isChecked() ? "6" : "0");
        MainApp.cc.setCurrent_date(dcbidob.getText().toString());

        if (dcbis01.isChecked()) {

            MainApp.cc.setDob(dcbidob.getText().toString());

            MainApp.cc.setCurChildBirth_time(dcbitime.getCurrentHour() + ":" + dcbitime.getCurrentMinute());
            MainApp.cc.setCurrent_childStatus(dcbis01Statusa.isChecked() ? "1" : dcbis01Statusb.isChecked() ? "2" : dcbis01Statusc.isChecked() ? "3" : "0");

        } else if (dcbis02.isChecked() || dcbis04.isChecked()) {

            MainApp.cc.setCurrent_maritalOutcome(dcbis01Outa.isChecked() ? "1" : dcbis01Outb.isChecked() ? "2" : dcbis01Outc.isChecked() ? "3"
                    : dcbis01Outd.isChecked() ? "4" : "0");

            if (dcbis04.isChecked()) {
                sC.put("prvDSSID", dcbis04prvDSSID.getText().toString());
            }

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
                    MainApp.cc.setCurrent_pregOutcomeDT(dcbidob.getText().toString());
                }*/

            }
        }
        MainApp.cc.setMember_type(dcbm01.isChecked() ? "mw" : dcbm02.isChecked() ? "h" : dcbm03.isChecked() ? "c" : dcbm04.isChecked() ? "ot" : "0");

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
            m.setCurrent_status(c.getCurrent_status() + "_" + c.getCurrent_childStatus());
        } else if (dcbis02.isChecked() || dcbis04.isChecked()) {
            m.setCurrent_status(c.getCurrent_status() + "_" + c.getCurrent_maritalOutcome() + ":" + (dcbis09a.isChecked() ? "1" : dcbis09b.isChecked() ? "2" : ""));
            if (dcbis09c.isChecked()) {
                m.setCurrent_status(c.getCurrent_status() + "_" + c.getCurrent_maritalOutcome() + ":" + (dcbis09a.isChecked() ? "1" : dcbis09b.isChecked() ? "2" : "") + ":" + c.getCurrent_statusOutcome());
            }
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

        // ============== Members Status ===================

        if (dcbm.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbm), Toast.LENGTH_SHORT).show();
            dcbm03.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbm: This data is Required!");
            return false;
        } else {
            dcbm03.setError(null);
        }

        //=============== ID =============

        if (!dataFlag) {
            if (dcbid.getText().length() == MainApp.fc.getDSSID().length()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbid), Toast.LENGTH_SHORT).show();
                dcbid.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbid: This data is Required!");
                return false;
            } else {
                dcbid.setError(null);
            }
        }

        // ============== Check Equality - 1 ===================

        if (dcbm01.isChecked() && dcbid.getText().length() != 12) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dcbid), Toast.LENGTH_SHORT).show();
            dcbid.setError("This data is Invalid!");    // Set Error on last radio button

            Log.i(TAG, "dcbid: This data is Invalid!");
            return false;
        } else {
            dcbid.setError(null);
        }

        if (dcbm01.isChecked()) {
            if (dcbbhidSpinner.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.dcbbhid), Toast.LENGTH_SHORT).show();
                ((TextView) dcbbhidSpinner.getSelectedView()).setText("This Data is Required");
                ((TextView) dcbbhidSpinner.getSelectedView()).setError("This Data is Required");
                ((TextView) dcbbhidSpinner.getSelectedView()).setTextColor(Color.RED);

                Log.i(TAG, "dcbbhid: This Data is Required!");
                return false;
            } else {
                ((TextView) dcbbhidSpinner.getSelectedView()).setError(null);
            }
        } else {
            if (!dataFlag) {
                if (dcbm04.isChecked() ? dcbid.getText().length() != 14 : dcbid.getText().length() != 13) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dcbid), Toast.LENGTH_SHORT).show();
                    dcbid.setError("This data is Invalid!");    // Set Error on last radio button

                    Log.i(TAG, "dcbid: This data is Invalid!");
                    return false;
                } else {
                    dcbid.setError(null);
                }

                if (childCount == 0 && dcbm03.isChecked()) {
                    if (dcbbmidSpinner.getSelectedItem() == "....") {
                        Toast.makeText(this, "ERROR(Empty)" + getString(R.string.dcbbmid), Toast.LENGTH_SHORT).show();
                        ((TextView) dcbbmidSpinner.getSelectedView()).setText("This Data is Required");
                        ((TextView) dcbbmidSpinner.getSelectedView()).setError("This Data is Required");
                        ((TextView) dcbbmidSpinner.getSelectedView()).setTextColor(Color.RED);

                        Log.i(TAG, "dcbbmid: This Data is Required!");
                        return false;
                    } else {
                        ((TextView) dcbbmidSpinner.getSelectedView()).setError(null);
                    }
                }
            }
        }

        // ============== Status ===================

        if (dcbis.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis), Toast.LENGTH_SHORT).show();
            dcbis02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbis: This data is Required!");
            return false;
        } else {
            dcbis02.setError(null);
        }

        // ================= Other Status ===========
        if (dcbis06.isChecked() && dcbis06x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis) + " - " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dcbis06x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbis06x: This data is Required!");
            return false;
        } else {
            dcbis06x.setError(null);
        }
        if (!validatorClass.EmptyTextBox(this, dcbidob, getString(R.string.date))) {
            return false;
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

        if (dcbis01.isChecked()) {
            if (dcbis01Status.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis01Status), Toast.LENGTH_SHORT).show();
                dcbis01Statusc.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbis01Status: This data is Required!");
                return false;
            } else {
                dcbis01Statusc.setError(null);
            }
        }

        // Checks for married
        if (dcbis02.isChecked() || dcbis04.isChecked()) {

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
                    !(dcbm02.isChecked() || dcbm03.isChecked() || dcbm04.isChecked())) {

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
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
