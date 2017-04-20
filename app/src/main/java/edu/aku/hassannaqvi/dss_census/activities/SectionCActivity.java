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

public class SectionCActivity extends Activity {

    private static final String TAG = SectionCActivity.class.getSimpleName();

    @BindView(R.id.activity_section_c)
    RelativeLayout activitySectionC;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dcca)
    EditText dcca;
    @BindView(R.id.dccbrhh)
    RadioGroup dccbrhh;
    @BindView(R.id.dccbrhh01)
    RadioButton dccbrhh01;
    @BindView(R.id.dccbrhh02)
    RadioButton dccbrhh02;
    @BindView(R.id.dccbrhh03)
    RadioButton dccbrhh03;
    @BindView(R.id.dccbrhh04)
    RadioButton dccbrhh04;
    @BindView(R.id.dccbrhh05)
    RadioButton dccbrhh05;
    @BindView(R.id.dccbrhh06)
    RadioButton dccbrhh06;
    @BindView(R.id.dccbrhh07)
    RadioButton dccbrhh07;
    @BindView(R.id.dccbrhh08)
    RadioButton dccbrhh08;
    @BindView(R.id.dccbrhh96)
    RadioButton dccbrhh96;
    @BindView(R.id.dccbrhh10)
    RadioButton dccbrhh10;
    @BindView(R.id.dccbrhh11)
    RadioButton dccbrhh11;
    @BindView(R.id.dccbrhh99)
    RadioButton dccbrhh99;
    @BindView(R.id.dccbrhh88)
    RadioButton dccbrhh88;
    @BindView(R.id.dccbrhh96x)
    EditText dccbrhh96x;
    @BindView(R.id.dccbfid)
    EditText dccbfid;
    @BindView(R.id.dccbmid)
    EditText dccbmid;
    @BindView(R.id.dccc)
    RadioGroup dccc;
    @BindView(R.id.dccc01)
    RadioButton dccc01;
    @BindView(R.id.dccc02)
    RadioButton dccc02;
    @BindView(R.id.dccd)
    DatePicker dccd;
    @BindView(R.id.dccdod)
    RadioGroup dccdod;
    @BindView(R.id.dccage01)
    RadioButton dccage01;
    @BindView(R.id.dccdod02)
    RadioButton dccdod02;
    @BindView(R.id.fldGrpdccage)
    LinearLayout fldGrpdccage;
    @BindView(R.id.dccey)
    EditText dccey;
    @BindView(R.id.dccem)
    EditText dccem;
    @BindView(R.id.dcced)
    EditText dcced;
    @BindView(R.id.fldGrpdccdod)
    LinearLayout fldGrpdccdod;
    @BindView(R.id.dccf)
    DatePicker dccf;
    @BindView(R.id.dccg)
    EditText dccg;
    @BindView(R.id.dcch)
    RadioGroup dcch;
    @BindView(R.id.dcch01)
    RadioButton dcch01;
    @BindView(R.id.dcch02)
    RadioButton dcch02;
    @BindView(R.id.dcch03)
    RadioButton dcch03;
    @BindView(R.id.dcch04)
    RadioButton dcch04;
    @BindView(R.id.dcch05)
    RadioButton dcch05;
    @BindView(R.id.fldGrpdcch)
    LinearLayout fldGrpdcch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);
        dccd.setMaxDate(new Date().getTime());
        dccf.setMaxDate(new Date().getTime());
        dccf.setMinDate((new Date().getTime() - ((MainApp.MILLISECONDS_IN_YEAR) + MainApp.MILLISECONDS_IN_DAY)));

        appHeader.setText("DSS - > Section C: People Deceased in Last One Year");

        dccdod.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dccage01.isChecked()) {
                    fldGrpdccage.setVisibility(View.VISIBLE);
                    fldGrpdccdod.setVisibility(View.GONE);

                } else {
                    fldGrpdccdod.setVisibility(View.VISIBLE);
                    fldGrpdccage.setVisibility(View.GONE);
                    dcced.setText(null);
                    dccem.setText(null);
                    dccey.setText(null);
                }
            }
        });

        dccc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (dccc01.isChecked()) {
                    fldGrpdcch.setVisibility(View.GONE);
                    dcch.clearCheck();
                } else {
                    fldGrpdcch.setVisibility(View.VISIBLE);
                }
            }
        });

        dccbrhh96.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    dccbrhh96x.setVisibility(View.VISIBLE);
                } else {
                    dccbrhh96x.setVisibility(View.GONE);
                    dccbrhh96x.setText(null);
                }
            }
        });


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
//        if (formValidation()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }
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

                finish();

                MainApp.NoMembersCount -= 1;

//                Intent secNext = new Intent(this, FamilyMembersActivity.class);
//                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
//        DatabaseHelper db = new DatabaseHelper(this);
//
//        int updcount = db.updatesE();
//
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

        JSONObject sC = new JSONObject();

        sC.put("dcca", dcca.getText().toString());
        sC.put("dccbrhh", dccbrhh01.isChecked() ? "1" : dccbrhh02.isChecked() ? "2" : dccbrhh03.isChecked() ? "3"
                : dccbrhh04.isChecked() ? "4" : dccbrhh05.isChecked() ? "5" : dccbrhh06.isChecked() ? "6"
                : dccbrhh07.isChecked() ? "7" : dccbrhh08.isChecked() ? "8" : dccbrhh96.isChecked() ? "9"
                : dccbrhh10.isChecked() ? "10" : dccbrhh11.isChecked() ? "11" : dccbrhh99.isChecked() ? "99"
                : dccbrhh88.isChecked() ? "88" : "0");
        sC.put("dccbfid", dccbfid.getText().toString());
        sC.put("dccbmid", dccbmid.getText().toString());
        sC.put("dccc", dccc01.isChecked() ? "1" : dccc02.isChecked() ? "2" : "0");
        sC.put("dccd", new SimpleDateFormat("dd-MM-yyyy").format(dccd.getCalendarView().getDate()));
        sC.put("dccey", dccey.getText().toString());
        sC.put("dccem", dccem.getText().toString());
        sC.put("dcced", dcced.getText().toString());
        sC.put("dccf", new SimpleDateFormat("dd-MM-yyyy").format(dccf.getCalendarView().getDate()));
        sC.put("dccg", dccg.getText().toString());
        sC.put("dcch", dcch01.isChecked() ? "1" : dcch02.isChecked() ? "2" : dcch03.isChecked() ? "3"
                : dcch04.isChecked() ? "4" : dcch05.isChecked() ? "5" : "0");


        //        MainApp.fc.setROW_sc(String.valueOf(sc));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ====================== Name ==============

        if (dcca.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcca), Toast.LENGTH_SHORT).show();
            dcca.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcca: This data is Required!");
            return false;
        } else {
            dcca.setError(null);
        }

        // ===================== Relation with HH ==============
        if (dccbrhh.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccbrhh), Toast.LENGTH_SHORT).show();
            dccbrhh99.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccbrhh: This data is Required!");
            return false;
        } else {
            dccbrhh99.setError(null);
        }

        //============= Father ID ====================

        if (dccbfid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbfid), Toast.LENGTH_SHORT).show();
            dccbfid.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccbfid: This data is Required!");
            return false;
        } else {
            dccbfid.setError(null);
        }

        // ============== Mother ID ===================

        if (dccbmid.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcbbmid), Toast.LENGTH_SHORT).show();
            dccbmid.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccbmid: This data is Required!");
            return false;
        } else {
            dccbmid.setError(null);
        }

        // ============== Sex ===================

        if (dccc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccc), Toast.LENGTH_SHORT).show();
            dccc02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccc: This data is Required!");
            return false;
        } else {
            dccc02.setError(null);
        }

        if (dccdod.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcce), Toast.LENGTH_SHORT).show();
            dccdod02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccdod: This data is Required!");
            return false;
        } else {
            dccdod02.setError(null);
        }


        if (dccage01.isChecked()) {
            // ================= Age in years ===========
            if (dccey.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccey), Toast.LENGTH_SHORT).show();
                dccey.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dccey: This data is Required!");
                return false;
            } else {
                dccey.setError(null);
            }

            // ================= Age in months ===========
            if (dccem.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccem), Toast.LENGTH_SHORT).show();
                dccem.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dccem: This data is Required!");
                return false;
            } else {
                dccem.setError(null);
            }

            // ================= Age in days ===========
            if (dcced.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcced), Toast.LENGTH_SHORT).show();
                dcced.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "dcced: This data is Required!");
                return false;
            } else {
                dcced.setError(null);
            }
        }

        // ============== Remarks ===================

        if (dccg.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dccg), Toast.LENGTH_SHORT).show();
            dccg.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dccg: This data is Required!");
            return false;
        } else {
            dccg.setError(null);
        }

        if (dccc02.isChecked()) {

            // ============== Status of WRA ===================

            if (dcch.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcch), Toast.LENGTH_SHORT).show();
                dcch05.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcch: This data is Required!");
                return false;
            } else {
                dcch05.setError(null);
            }
        }

        return true;
    }

    //@Override
//    public void onBackPressed() {
//        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
//    }


}
