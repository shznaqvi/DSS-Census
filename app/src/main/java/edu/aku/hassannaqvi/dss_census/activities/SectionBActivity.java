package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census.MainApp;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.otherClasses.familyMembers;

public class SectionBActivity extends Activity {

    private static final String TAG = SectionBActivity.class.getSimpleName();

    @BindView(R.id.activity_section_b)
    RelativeLayout activitySectionB;
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
    @BindView(R.id.dcbf18)
    RadioButton dcbf18;
    @BindView(R.id.dcbf18x)
    EditText dcbf18x;
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
    @BindView(R.id.fldGrpdcbidt)
    LinearLayout fldGrpdcbidt;
    @BindView(R.id.dcbidob)
    DatePicker dcbidob;
    @BindView(R.id.dcbirm)
    EditText dcbirm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);
        dcbg.setMaxDate(new Date().getTime());
        dcbidob.setMaxDate(new Date().getTime());

//        dcba.setText(getIntent().getExtras().get("memberName").toString());

        //      dcba.setEnabled(false);

        // ====================== Education Level Others ================
        dcbe.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcbe09.isChecked()) {
                    dcbe09x.setVisibility(View.VISIBLE);
                } else {
                    dcbe09x.setVisibility(View.GONE);
                    dcbe09x.setText(null);
                }
            }
        });

        //===================== Occupation Others =================
        dcbf.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dcbf18.isChecked()) {
                    dcbf18x.setVisibility(View.VISIBLE);
                } else {
                    dcbf18x.setVisibility(View.GONE);
                    dcbf18x.setText(null);
                }
            }
        });



        dcbd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dcbd01.isChecked()) {
                    dcbf09.setEnabled(false);
                    dcbf09.setChecked(false);
                } else {
                    dcbf09.setEnabled(true);
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
        });

        dcbis.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dcbis01.isChecked()) {
                    dcbidt01.setEnabled(true);
                    dcbidt02.setEnabled(false);
                    dcbidt02.setChecked(false);
                    dcbidt03.setEnabled(false);
                    dcbidt03.setChecked(false);
                    dcbidt04.setEnabled(false);
                    dcbidt04.setChecked(false);
                    dcbidt05.setEnabled(false);
                    dcbidt05.setChecked(false);
                    dcbir01.setEnabled(false);
                    dcbir01.setChecked(false);
                    dcbir02.setEnabled(false);
                    dcbir02.setChecked(false);
                    dcbir03.setEnabled(false);
                    dcbir03.setChecked(false);
                    dcbirm.setVisibility(View.GONE);
                    dcbirm.setText(null);
                } else if (dcbis02.isChecked()) {
                    dcbidt01.setEnabled(false);
                    dcbidt01.setChecked(false);
                    dcbidt02.setEnabled(true);
                    dcbidt03.setEnabled(false);
                    dcbidt03.setChecked(false);
                    dcbidt04.setEnabled(false);
                    dcbidt04.setChecked(false);
                    dcbidt05.setEnabled(false);
                    dcbidt05.setChecked(false);
                    dcbir01.setEnabled(true);
                    dcbir02.setEnabled(false);
                    dcbidt02.setChecked(false);
                    dcbir03.setEnabled(false);
                    dcbidt03.setChecked(false);
                    dcbirm.setVisibility(View.VISIBLE);
                } else if (dcbis03.isChecked()) {
                    dcbidt01.setEnabled(false);
                    dcbidt01.setChecked(false);
                    dcbidt02.setEnabled(false);
                    dcbidt02.setChecked(false);
                    dcbidt03.setEnabled(true);
                    dcbidt04.setEnabled(false);
                    dcbidt04.setChecked(false);
                    dcbidt05.setEnabled(false);
                    dcbidt05.setChecked(false);
                    dcbir01.setEnabled(false);
                    dcbir01.setChecked(false);
                    dcbir02.setEnabled(true);
                    dcbir03.setEnabled(false);
                    dcbir03.setChecked(false);
                    dcbirm.setVisibility(View.VISIBLE);
                } else if (dcbis04.isChecked()) {
                    dcbidt01.setEnabled(false);
                    dcbidt01.setChecked(false);
                    dcbidt02.setEnabled(false);
                    dcbidt02.setChecked(false);
                    dcbidt03.setEnabled(false);
                    dcbidt03.setChecked(false);
                    dcbidt04.setEnabled(true);
                    dcbidt05.setEnabled(false);
                    dcbidt05.setChecked(false);
                    dcbir01.setEnabled(false);
                    dcbir01.setChecked(false);
                    dcbir02.setEnabled(false);
                    dcbir02.setChecked(false);
                    dcbir03.setEnabled(true);
                    dcbirm.setVisibility(View.VISIBLE);

                } else if (dcbis05.isChecked()) {
                    dcbidt01.setEnabled(false);
                    dcbidt01.setChecked(false);
                    dcbidt02.setEnabled(false);
                    dcbidt02.setChecked(false);
                    dcbidt03.setEnabled(false);
                    dcbidt03.setChecked(false);
                    dcbidt04.setEnabled(false);
                    dcbidt04.setChecked(false);
                    dcbidt05.setEnabled(true);
                    dcbir01.setEnabled(false);
                    dcbir01.setChecked(false);
                    dcbir02.setEnabled(false);
                    dcbir02.setChecked(false);
                    dcbir03.setEnabled(false);
                    dcbir03.setChecked(false);
                    dcbirm.setVisibility(View.GONE);
                    dcbirm.setText(null);
                }
            }
        });

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

        dcbidt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dcbidt01.isChecked() || dcbidt02.isChecked() || dcbidt03.isChecked() || dcbidt04.isChecked() || dcbidt05.isChecked()) {
                    fldGrpdcbidt.setVisibility(View.VISIBLE);
                }
            }
        });


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
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

//                MainApp.deadMembers.add(new MainApp.deadMemberClass(Integer.parseInt(getIntent().getExtras().get("position").toString()),
//                        dcbid.getText().toString()));

                MainApp.familyMembersList.add(new familyMembers(dcba.getText().toString(),
                        dcbid.getText().toString()
                        ,((RadioButton)findViewById(dcbis.getCheckedRadioButtonId())).getText().toString()
                        ,((RadioButton)findViewById(dcbd.getCheckedRadioButtonId())).getText().toString()));

                if (!(((RadioButton)findViewById(dcbis.getCheckedRadioButtonId())).getText().toString()).contains("Death")) {
                    MainApp.currentStatusCount += 1;
                }else {
                    if (MainApp.NoMembersCount != 0){
                        MainApp.NoMembersCount -= 1;
                    }
                }

                finish();

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        //SRCDBHelper db = new SRCDBHelper(this);

        //int updcount = db.updateSe();

//        if (updcount == 1) {
//            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
//            return true;
//        } else {
//            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
//            return false;
//        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sB = new JSONObject();

        sB.put("dcba", dcba.getText().toString());
        sB.put("dcbid", dcbid.getText().toString());
        sB.put("dcbbrhh", dcbbrhh01.isChecked() ? "1" : dcbbrhh02.isChecked() ? "2" : dcbbrhh03.isChecked() ? "3"
                : dcbbrhh04.isChecked() ? "4" : dcbbrhh05.isChecked() ? "5" : dcbbrhh06.isChecked() ? "6"
                : dcbbrhh07.isChecked() ? "7" : dcbbrhh08.isChecked() ? "8" : dcbbrhh09.isChecked() ? "9" : dcbbrhh10.isChecked() ? "10"
                : dcbbrhh11.isChecked() ? "11" : dcbbrhh98.isChecked() ? "98" : dcbbrhh99.isChecked() ? "99" : "0");
        sB.put("dcbbfid", dcbbfid.getText().toString());
        sB.put("dcbbmid", dcbbmid.getText().toString());
        sB.put("dcbc", dcbc01.isChecked() ? "1" : dcbc02.isChecked() ? "2" : dcbc03.isChecked() ? "3"
                : dcbc04.isChecked() ? "4" : dcbc99.isChecked() ? "99" : "0");

        sB.put("dcbd", dcbd01.isChecked() ? "1" : dcbd02.isChecked() ? "2" : "0");
        sB.put("dcbe", dcbe01.isChecked() ? "1" : dcbe02.isChecked() ? "2" : dcbe03.isChecked() ? "3"
                : dcbe04.isChecked() ? "4" : dcbe05.isChecked() ? "5" : dcbe06.isChecked() ? "6"
                : dcbe07.isChecked() ? "7" : dcbe08.isChecked() ? "8" : dcbe09.isChecked() ? "9"
                : dcbe98.isChecked() ? "98" : dcbe99.isChecked() ? "99" : "0");
        sB.put("dcbe09x", dcbe09x.getText().toString());
        sB.put("dcbf", dcbf01.isChecked() ? "1" : dcbf02.isChecked() ? "2" : dcbf03.isChecked() ? "3"
                : dcbf04.isChecked() ? "4" : dcbf05.isChecked() ? "5" : dcbf06.isChecked() ? "6"
                : dcbf07.isChecked() ? "7" : dcbf08.isChecked() ? "8" : dcbf09.isChecked() ? "9"
                : dcbf10.isChecked() ? "10" : dcbf11.isChecked() ? "11" : dcbf12.isChecked() ? "12"
                : dcbf13.isChecked() ? "13" : dcbf14.isChecked() ? "14" : dcbf15.isChecked() ? "15"
                : dcbf16.isChecked() ? "16" : dcbf17.isChecked() ? "17" : dcbf18.isChecked() ? "18"
                : dcbf99.isChecked() ? "99" : "0");
        sB.put("dcbf18x", dcbf18x.getText().toString());
        sB.put("dcbg", new SimpleDateFormat("dd-MM-yyyy").format(dcbg.getCalendarView().getDate()));
        sB.put("dcbhy", dcbhy.getText().toString());
        sB.put("dcbhm", dcbhm.getText().toString());
        sB.put("dcbhd", dcbhd.getText().toString());
        sB.put("dcbis", dcbis01.isChecked() ? "1" : dcbis02.isChecked() ? "2" : dcbis03.isChecked() ? "3"
                : dcbis04.isChecked() ? "4" : dcbis05.isChecked() ? "5" : dcbis06.isChecked() ? "6" : "0");
        sB.put("dcbis06x", dcbis06x.getText().toString());
        sB.put("dcbidt", dcbidt01.isChecked() ? "1" : dcbidt02.isChecked() ? "2" : dcbidt03.isChecked() ? "3"
                : dcbidt04.isChecked() ? "4" : dcbidt05.isChecked() ? "5" : "0");
        sB.put("dcbidob", new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
        sB.put("dcbimid", new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
        sB.put("dcbimod", new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
        sB.put("dcbiimd", new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));
        sB.put("dcbidod", new SimpleDateFormat("dd-MM-yyyy").format(dcbidob.getCalendarView().getDate()));

        sB.put("dcbir", dcbir01.isChecked() ? "1" : dcbir02.isChecked() ? "2" : dcbir03.isChecked() ? "3" : "0");
        sB.put("dcbirm", dcbirm.getText().toString());


        //DCEApp.fc.setROW_Sb(String.valueOf(sb));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();


    }

    public boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ====================== Name ==============

        if (dcba.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcba), Toast.LENGTH_SHORT).show();
            dcba.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcba: This data is Required!");
            return false;
        } else {
            dcba.setError(null);
        }

        //=============== ID =============

        if (dcbid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbid), Toast.LENGTH_SHORT).show();
            dcbid.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbid: This data is Required!");
            return false;
        } else {
            dcbid.setError(null);
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

        //============= Father ID ====================

        if (dcbbfid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbfid), Toast.LENGTH_SHORT).show();
            dcbbfid.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbbfid: This data is Required!");
            return false;
        } else {
            dcbbfid.setError(null);
        }

        // ============== Mother ID ===================

        if (dcbbmid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbmid), Toast.LENGTH_SHORT).show();
            dcbbmid.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbbmid: This data is Required!");
            return false;
        } else {
            dcbbmid.setError(null);
        }

        // ============== Marital Status ===================

        if (dcbc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbc), Toast.LENGTH_SHORT).show();
            dcbc99.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbc: This data is Required!");
            return false;
        } else {
            dcbc99.setError(null);
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

        // ============== Education ===================

        if (dcbe.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbe), Toast.LENGTH_SHORT).show();
            dcbe99.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbe: This data is Required!");
            return false;
        } else {
            dcbe99.setError(null);
        }

        // ================= Other Education ===========
        if (dcbe09.isChecked() && dcbe09x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbe) + " - " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dcbe09x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbe09x: This data is Required!");
            return false;
        } else {
            dcbe09x.setError(null);
        }

        // ============== Occupation ===================

        if (dcbf.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbf), Toast.LENGTH_SHORT).show();
            dcbf99.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbf: This data is Required!");
            return false;
        } else {
            dcbf99.setError(null);
        }

        // ================= Other Occupation ===========
        if (dcbf18.isChecked() && dcbf18x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbf) + " - " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
            dcbf18x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbf18x: This data is Required!");
            return false;
        } else {
            dcbf18x.setError(null);
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
        }

        // ============== Status ===================

        if (dcbis.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbis), Toast.LENGTH_SHORT).show();
            dcbis06.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbis: This data is Required!");
            return false;
        } else {
            dcbis06.setError(null);
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

        // ============== Date ===================

        if (dcbidt.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbidt), Toast.LENGTH_SHORT).show();
            dcbidt05.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcbidt: This data is Required!");
            return false;
        } else {
            dcbidt05.setError(null);
        }

        // ============== Remarks ===================
        if (dcbidt02.isChecked() || dcbidt03.isChecked() || dcbidt04.isChecked()) {
            if (dcbir.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbir), Toast.LENGTH_SHORT).show();
                dcbir03.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbir: This data is Required!");
                return false;
            } else {
                dcbir03.setError(null);
            }

            if (dcbirm.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbir), Toast.LENGTH_SHORT).show();
                dcbirm.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcbirm: This data is Required!");
                return false;
            } else {
                dcbirm.setError(null);
            }
        }


        return true;
    }

    //@Override
//    public void onBackPressed() {
//        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
//    }


}
