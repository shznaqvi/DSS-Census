package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionLActivity extends Activity  {

    private static final String TAG = SectionLActivity.class.getSimpleName();


    @BindView(R.id.activity_section_l) RelativeLayout activitySectionL;
    @BindView(R.id.scrollView01) ScrollView scrollView01;
    @BindView(R.id.app_header) TextView appHeader;
    @BindView(R.id.dcl01am) CheckBox dcl01am;
    @BindView(R.id.fldGrpa1)
    LinearLayout fldGrpa1;
    @BindView(R.id.dcl01a1days)
    EditText dcl01a1days;
    @BindView(R.id.dcl01a1fr) EditText dcl01a1fr;
    @BindView(R.id.dcl01ac) CheckBox dcl01ac;
    @BindView(R.id.fldGrpa2)
    LinearLayout fldGrpa2;
    @BindView(R.id.dcl01a2days)
    EditText dcl01a2days;
    @BindView(R.id.dcl01a2fr) EditText dcl01a2fr;
    @BindView(R.id.dcl01bm) CheckBox dcl01bm;
    @BindView(R.id.fldGrpb1)
    LinearLayout fldGrpb1;
    @BindView(R.id.dcl01b1days)
    EditText dcl01b1days;
    @BindView(R.id.dcl01b1fr) EditText dcl01b1fr;
    @BindView(R.id.dcl01bc) CheckBox dcl01bc;
    @BindView(R.id.fldGrpb2)
    LinearLayout fldGrpb2;
    @BindView(R.id.dcl01b2days)
    EditText dcl01b2days;
    @BindView(R.id.dcl01b2fr) EditText dcl01b2fr;
    @BindView(R.id.dcl01cm) CheckBox dcl01cm;
    @BindView(R.id.fldGrpc1)
    LinearLayout fldGrpc1;
    @BindView(R.id.dcl01c1days)
    EditText dcl01c1days;
    @BindView(R.id.dcl01c1fr) EditText dcl01c1fr;
    @BindView(R.id.dcl01cc) CheckBox dcl01cc;
    @BindView(R.id.fldGrpc2)
    LinearLayout fldGrpc2;
    @BindView(R.id.dcl01c2days)
    EditText dcl01c2days;
    @BindView(R.id.dcl01c2fr) EditText dcl01c2fr;
    @BindView(R.id.dcl01dm) CheckBox dcl01dm;
    @BindView(R.id.fldGrpd1)
    LinearLayout fldGrpd1;
    @BindView(R.id.dcl01d1days)
    EditText dcl01d1days;
    @BindView(R.id.dcl01d1fr) EditText dcl01d1fr;
    @BindView(R.id.dcl01dc) CheckBox dcl01dc;
    @BindView(R.id.fldGrpd2)
    LinearLayout fldGrpd2;
    @BindView(R.id.dcl01d2days)
    EditText dcl01d2days;
    @BindView(R.id.dcl01d2fr) EditText dcl01d2fr;
    @BindView(R.id.dcl01em) CheckBox dcl01em;
    @BindView(R.id.fldGrpe1)
    LinearLayout fldGrpe1;
    @BindView(R.id.dcl01e1days)
    EditText dcl01e1days;
    @BindView(R.id.dcl01e1fr) EditText dcl01e1fr;
    @BindView(R.id.dcl01ec) CheckBox dcl01ec;
    @BindView(R.id.fldGrpe2)
    LinearLayout fldGrpe2;
    @BindView(R.id.dcl01e2days)
    EditText dcl01e2days;
    @BindView(R.id.dcl01e2fr) EditText dcl01e2fr;
    @BindView(R.id.dcl01fm) CheckBox dcl01fm;
    @BindView(R.id.fldGrpf1)
    LinearLayout fldGrpf1;
    @BindView(R.id.dcl01f1days)
    EditText dcl01f1days;
    @BindView(R.id.dcl01f1fr) EditText dcl01f1fr;
    @BindView(R.id.dcl01fc) CheckBox dcl01fc;
    @BindView(R.id.fldGrpf2)
    LinearLayout fldGrpf2;
    @BindView(R.id.dcl01f2days)
    EditText dcl01f2days;
    @BindView(R.id.dcl01f2fr) EditText dcl01f2fr;
    @BindView(R.id.dcl01gm) CheckBox dcl01gm;
    @BindView(R.id.fldGrpg1)
    LinearLayout fldGrpg1;
    @BindView(R.id.dcl01g1days)
    EditText dcl01g1days;
    @BindView(R.id.dcl01g1fr) EditText dcl01g1fr;
    @BindView(R.id.dcl01gc) CheckBox dcl01gc;
    @BindView(R.id.fldGrpg2)
    LinearLayout fldGrpg2;
    @BindView(R.id.dcl01g2days)
    EditText dcl01g2days;
    @BindView(R.id.dcl01g2fr) EditText dcl01g2fr;
    @BindView(R.id.dcl01hm) CheckBox dcl01hm;
    @BindView(R.id.fldGrh1)
    LinearLayout fldGrh1;
    @BindView(R.id.dcl01h1days)
    EditText dcl01h1days;
    @BindView(R.id.dcl01h1fr) EditText dcl01h1fr;
    @BindView(R.id.dcl01hc) CheckBox dcl01hc;
    @BindView(R.id.fldGrph2)
    LinearLayout fldGrph2;
    @BindView(R.id.dcl01h2days)
    EditText dcl01h2days;
    @BindView(R.id.dcl01h2fr) EditText dcl01h2fr;
    @BindView(R.id.dcl01im) CheckBox dcl01im;
    @BindView(R.id.fldGrpi1)
    LinearLayout fldGrpi1;
    @BindView(R.id.dcl01i1days)
    EditText dcl01i1days;
    @BindView(R.id.dcl01i1fr) EditText dcl01i1fr;
    @BindView(R.id.dcl01ic) CheckBox dcl01ic;
    @BindView(R.id.fldGrpi2)
    LinearLayout fldGrpi2;
    @BindView(R.id.dcl01i2days)
    EditText dcl01i2days;
    @BindView(R.id.dcl01i2fr) EditText dcl01i2fr;
    @BindView(R.id.dcl02a)
    EditText dcl02a;
    @BindView(R.id.dcl02b)
    EditText dcl02b;
    @BindView(R.id.dcl02c)
    EditText dcl02c;
    @BindView(R.id.dcl02d)
    EditText dcl02d;
    @BindView(R.id.dcl02e)
    EditText dcl02e;
    @BindView(R.id.dcl03) RadioGroup dcl03;
    @BindView(R.id.dcl0388) RadioButton dcl0388;
    @BindView(R.id.dcl0301) RadioButton dcl0301;
    @BindView(R.id.dcl0302) RadioButton dcl0302;
    @BindView(R.id.dcl0303) RadioButton dcl0303;
    @BindView(R.id.dcl04) RadioGroup dcl04;
    @BindView(R.id.dcl0488) RadioButton dcl0488;
    @BindView(R.id.dcl0401) RadioButton dcl0401;
    @BindView(R.id.dcl0402) RadioButton dcl0402;
    @BindView(R.id.dcl0403) RadioButton dcl0403;
    @BindView(R.id.dcl05) RadioGroup dcl05;
    @BindView(R.id.dcl0588) RadioButton dcl0588;
    @BindView(R.id.dcl0501) RadioButton dcl0501;
    @BindView(R.id.dcl0502) RadioButton dcl0502;
    @BindView(R.id.dcl0503) RadioButton dcl0503;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l);
        ButterKnife.bind(this);

        appHeader.setText("DSS - > Section L : Household Food Insecurity");

        // ============== A1 ==============

        dcl01am.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpa1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpa1.setVisibility(View.GONE);
                    dcl01a1days.setText(null);
                    dcl01a1fr.setText(null);
                }
            }
        });

        // ============== A2 ==============

        dcl01ac.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpa2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpa2.setVisibility(View.GONE);
                    dcl01a2days.setText(null);
                    dcl01a2fr.setText(null);
                }
            }
        });


        // ============== B1 ==============

        dcl01bm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpb1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpb1.setVisibility(View.GONE);
                    dcl01b1days.setText(null);
                    dcl01b1fr.setText(null);
                }
            }
        });

        // ============== B2 ==============

        dcl01bc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpb2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpb2.setVisibility(View.GONE);
                    dcl01b2days.setText(null);
                    dcl01b2fr.setText(null);
                }
            }
        });


        // ============== C1 ==============

        dcl01cm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpc1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpc1.setVisibility(View.GONE);
                    dcl01c1days.setText(null);
                    dcl01c1fr.setText(null);
                }
            }
        });

        // ============== C2 ==============

        dcl01cc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpc2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpc2.setVisibility(View.GONE);
                    dcl01c2days.setText(null);
                    dcl01c2fr.setText(null);
                }
            }
        });


        // ============== D1 ==============

        dcl01dm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpd1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpd1.setVisibility(View.GONE);
                    dcl01d1days.setText(null);
                    dcl01d1fr.setText(null);
                }
            }
        });

        // ============== A2 ==============

        dcl01dc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpd2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpd2.setVisibility(View.GONE);
                    dcl01d2days.setText(null);
                    dcl01d2fr.setText(null);
                }
            }
        });


        // ============== E1 ==============

        dcl01em.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpe1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpe1.setVisibility(View.GONE);
                    dcl01e1days.setText(null);
                    dcl01e1fr.setText(null);
                }
            }
        });

        // ============== E2 ==============

        dcl01ec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpe2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpe2.setVisibility(View.GONE);
                    dcl01e2days.setText(null);
                    dcl01e2fr.setText(null);
                }
            }
        });


        // ============== F1 ==============

        dcl01fm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpf1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf1.setVisibility(View.GONE);
                    dcl01f1days.setText(null);
                    dcl01f1fr.setText(null);
                }
            }
        });

        // ============== A2 ==============

        dcl01fc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpf2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpf2.setVisibility(View.GONE);
                    dcl01f2days.setText(null);
                    dcl01f2fr.setText(null);
                }
            }
        });


        // ============== G1 ==============

        dcl01gm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpg1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpg1.setVisibility(View.GONE);
                    dcl01g1days.setText(null);
                    dcl01g1fr.setText(null);
                }
            }
        });

        // ============== A2 ==============

        dcl01gc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpg2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpg2.setVisibility(View.GONE);
                    dcl01g2days.setText(null);
                    dcl01g2fr.setText(null);
                }
            }
        });


        // ============== H1 ==============

        dcl01hm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrh1.setVisibility(View.VISIBLE);
                } else {
                    fldGrh1.setVisibility(View.GONE);
                    dcl01h1days.setText(null);
                    dcl01h1fr.setText(null);
                }
            }
        });

        // ============== H2 ==============

        dcl01hc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrph2.setVisibility(View.VISIBLE);
                } else {
                    fldGrph2.setVisibility(View.GONE);
                    dcl01h2days.setText(null);
                    dcl01h2fr.setText(null);
                }
            }
        });


        // ============== I1 ==============

        dcl01im.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpi1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpi1.setVisibility(View.GONE);
                    dcl01i1days.setText(null);
                    dcl01i1fr.setText(null);
                }
            }
        });

        // ============== I2 ==============

        dcl01ic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpi2.setVisibility(View.VISIBLE);
                } else {
                    fldGrpi2.setVisibility(View.GONE);
                    dcl01i2days.setText(null);
                    dcl01i2fr.setText(null);
                }
            }
        });
    }

    @OnClick(R.id.btn_End) void onBtnEndClick() {

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

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
//        if (formValidation()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

        finish();

        startActivity(new Intent(this, SectionMActivity.class));
//
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }


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

        JSONObject sk = new JSONObject();
        sk.put("dcl01am", dcl01am.isChecked() ? "1" : "0");
        sk.put("dcl01a1days", dcl01a1days.getText().toString());
        sk.put("dcl01a1fr", dcl01a1fr.getText().toString());
        sk.put("dcl01ac", dcl01ac.isChecked() ? "1" : "0");
        sk.put("dcl01a2days", dcl01a2days.getText().toString());
        sk.put("dcl01a2fr", dcl01a2fr.getText().toString());
        sk.put("dcl01bm", dcl01bm.isChecked() ? "1" : "0");
        sk.put("dcl01b1days", dcl01b1days.getText().toString());
        sk.put("dcl01b1fr", dcl01b1fr.getText().toString());
        sk.put("dcl01bc", dcl01bc.isChecked() ? "1" : "0");
        sk.put("dcl01b2days", dcl01b2days.getText().toString());
        sk.put("dcl01b2fr", dcl01b2fr.getText().toString());
        sk.put("dcl01cm", dcl01cm.isChecked() ? "1" : "0");
        sk.put("dcl01c1days", dcl01c1days.getText().toString());
        sk.put("dcl01c1fr", dcl01c1fr.getText().toString());
        sk.put("dcl01cc", dcl01cc.isChecked() ? "1" : "0");
        sk.put("dcl01c2days", dcl01c2days.getText().toString());
        sk.put("dcl01c2fr", dcl01c2fr.getText().toString());
        sk.put("dcl01dm", dcl01dm.isChecked() ? "1" : "0");
        sk.put("dcl01d1days", dcl01d1days.getText().toString());
        sk.put("dcl01d1fr", dcl01d1fr.getText().toString());
        sk.put("dcl01dc", dcl01dc.isChecked() ? "1" : "0");
        sk.put("dcl01d2days", dcl01d2days.getText().toString());
        sk.put("dcl01d2fr", dcl01d2fr.getText().toString());
        sk.put("dcl01em", dcl01em.isChecked() ? "1" : "0");
        sk.put("dcl01e1days", dcl01e1days.getText().toString());
        sk.put("dcl01e1fr", dcl01e1fr.getText().toString());
        sk.put("dcl01ec", dcl01ec.isChecked() ? "1" : "0");
        sk.put("dcl01e2days", dcl01e2days.getText().toString());
        sk.put("dcl01e2fr", dcl01e2fr.getText().toString());
        sk.put("dcl01fm", dcl01fm.isChecked() ? "1" : "0");
        sk.put("dcl01f1days", dcl01f1days.getText().toString());
        sk.put("dcl01f1fr", dcl01f1fr.getText().toString());
        sk.put("dcl01fc", dcl01fc.isChecked() ? "1" : "0");
        sk.put("dcl01f2days", dcl01f2days.getText().toString());
        sk.put("dcl01f2fr", dcl01f2fr.getText().toString());
        sk.put("dcl01gm", dcl01gm.isChecked() ? "1" : "0");
        sk.put("dcl01g1days", dcl01g1days.getText().toString());
        sk.put("dcl01g1fr", dcl01g1fr.getText().toString());
        sk.put("dcl01gc", dcl01gc.isChecked() ? "1" : "0");
        sk.put("dcl01g2days", dcl01g2days.getText().toString());
        sk.put("dcl01g2fr", dcl01g2fr.getText().toString());
        sk.put("dcl01hm", dcl01hm.isChecked() ? "1" : "0");
        sk.put("dcl01h1days", dcl01h1days.getText().toString());
        sk.put("dcl01h1fr", dcl01h1fr.getText().toString());
        sk.put("dcl01hc", dcl01hc.isChecked() ? "1" : "0");
        sk.put("dcl01h2days", dcl01h2days.getText().toString());
        sk.put("dcl01h2fr", dcl01h2fr.getText().toString());
        sk.put("dcl01im", dcl01im.isChecked() ? "1" : "0");
        sk.put("dcl01i1days", dcl01i1days.getText().toString());
        sk.put("dcl01i1fr", dcl01i1fr.getText().toString());
        sk.put("dcl01ic", dcl01ic.isChecked() ? "1" : "0");
        sk.put("dcl01i2days", dcl01i2days.getText().toString());
        sk.put("dcl01i2fr", dcl01i2fr.getText().toString());
        sk.put("dcl02a", dcl02a.getText().toString());
        sk.put("dcl02b", dcl02b.getText().toString());
        sk.put("dcl02c", dcl02c.getText().toString());
        sk.put("dcl02d", dcl02d.getText().toString());
        sk.put("dcl02e", dcl02e.getText().toString());
        sk.put("dcl03", dcl0388.isChecked() ? "88" : dcl0301.isChecked() ? "1" : dcl0302.isChecked() ? "2"
                : dcl0303.isChecked() ? "3" : "0");
        sk.put("dcl04", dcl0488.isChecked() ? "88" : dcl0401.isChecked() ? "1" : dcl0402.isChecked() ? "2"
                : dcl0403.isChecked() ? "3" : "0");
        sk.put("dcl05", dcl0588.isChecked() ? "88" : dcl0501.isChecked() ? "1" : dcl0502.isChecked() ? "2"
                : dcl0503.isChecked() ? "3" : "0");


//        MainApp.fc.setROW_sk(String.valueOf(sk));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ================= Q1A / Mother =============
        if (dcl01am.isChecked()) {
            if (dcl01a1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01a1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01a1days: This data is Required!");
                return false;
            } else {
                dcl01a1days.setError(null);
            }

            if (dcl01a1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01a1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01a1fr: This data is Required!");
                return false;
            } else {
                dcl01a1fr.setError(null);
            }
        }

        // ================ Q1A / Child ================

        if (dcl01ac.isChecked()) {
            if (dcl01a2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01a2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01a2days: This data is Required!");
                return false;
            } else {
                dcl01a2days.setError(null);
            }

            if (dcl01a2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01a2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01a2fr: This data is Required!");
                return false;
            } else {
                dcl01a2fr.setError(null);
            }

        }

        // ================ Q1B / Mother ================

        if (dcl01bm.isChecked()) {
            if (dcl01b1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01b1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01b1days: This data is Required!");
                return false;
            } else {
                dcl01b1days.setError(null);
            }

            if (dcl01b1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01b1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01b1fr: This data is Required!");
                return false;
            } else {
                dcl01b1fr.setError(null);
            }

        }

        // ================ Q1B / Child ================

        if (dcl01bc.isChecked()) {
            if (dcl01b2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01b2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01b2days: This data is Required!");
                return false;
            } else {
                dcl01b2days.setError(null);
            }

            if (dcl01b2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01b2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01b2fr: This data is Required!");
                return false;
            } else {
                dcl01b2fr.setError(null);
            }

        }

        // ================ Q1C / Mother ================

        if (dcl01cm.isChecked()) {
            if (dcl01c1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01c1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01c1days: This data is Required!");
                return false;
            } else {
                dcl01c1days.setError(null);
            }

            if (dcl01c1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01c1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01c1fr: This data is Required!");
                return false;
            } else {
                dcl01c1fr.setError(null);
            }

        }

        // ================ Q1C / Child ================

        if (dcl01cc.isChecked()) {
            if (dcl01c2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01c2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01c2days: This data is Required!");
                return false;
            } else {
                dcl01c2days.setError(null);
            }

            if (dcl01c2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01c2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01c2fr: This data is Required!");
                return false;
            } else {
                dcl01c2fr.setError(null);
            }

        }

        // ================ Q1D / Mother ================

        if (dcl01dm.isChecked()) {
            if (dcl01d1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01d1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d1days: This data is Required!");
                return false;
            } else {
                dcl01d1days.setError(null);
            }

            if (dcl01d1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01d1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d1fr: This data is Required!");
                return false;
            } else {
                dcl01d1fr.setError(null);
            }

        }

        // ================ Q1C / Child ================

        if (dcl01dc.isChecked()) {
            if (dcl01d2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01d2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d2days: This data is Required!");
                return false;
            } else {
                dcl01d2days.setError(null);
            }

            if (dcl01d2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01d2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01d2fr: This data is Required!");
                return false;
            } else {
                dcl01d2fr.setError(null);
            }

        }

        // ================ Q1E / Mother ================

        if (dcl01em.isChecked()) {
            if (dcl01e1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01e1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01e1days: This data is Required!");
                return false;
            } else {
                dcl01e1days.setError(null);
            }

            if (dcl01e1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01e1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01e1fr: This data is Required!");
                return false;
            } else {
                dcl01e1fr.setError(null);
            }

        }

        // ================ Q1E / Child ================

        if (dcl01ec.isChecked()) {
            if (dcl01e2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01e2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01e2days: This data is Required!");
                return false;
            } else {
                dcl01e2days.setError(null);
            }

            if (dcl01e2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01e2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01e2fr: This data is Required!");
                return false;
            } else {
                dcl01e2fr.setError(null);
            }

        }

        // ================ Q1C / Mother ================

        if (dcl01fm.isChecked()) {
            if (dcl01f1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01f1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01f1days: This data is Required!");
                return false;
            } else {
                dcl01f1days.setError(null);
            }

            if (dcl01f1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01f1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01f1fr: This data is Required!");
                return false;
            } else {
                dcl01f1fr.setError(null);
            }

        }

        // ================ Q1C / Child ================

        if (dcl01fc.isChecked()) {
            if (dcl01f2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01f2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01f2days: This data is Required!");
                return false;
            } else {
                dcl01f2days.setError(null);
            }

            if (dcl01f2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01f2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01f2fr: This data is Required!");
                return false;
            } else {
                dcl01f2fr.setError(null);
            }

        }

        // ================ Q1G / Mother ================

        if (dcl01gm.isChecked()) {
            if (dcl01g1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01g1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01g1days: This data is Required!");
                return false;
            } else {
                dcl01g1days.setError(null);
            }

            if (dcl01g1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01g1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01g1fr: This data is Required!");
                return false;
            } else {
                dcl01g1fr.setError(null);
            }

        }

        // ================ Q1G / Child ================

        if (dcl01gc.isChecked()) {
            if (dcl01g2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01g2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01g2days: This data is Required!");
                return false;
            } else {
                dcl01g2days.setError(null);
            }

            if (dcl01g2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01g2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01g2fr: This data is Required!");
                return false;
            } else {
                dcl01g2fr.setError(null);
            }

        }

        // ================ Q1H / Mother ================

        if (dcl01hm.isChecked()) {
            if (dcl01h1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01h1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01h1days: This data is Required!");
                return false;
            } else {
                dcl01h1days.setError(null);
            }

            if (dcl01h1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01h1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01h1fr: This data is Required!");
                return false;
            } else {
                dcl01h1fr.setError(null);
            }

        }

        // ================ Q1H / Child ================

        if (dcl01hc.isChecked()) {
            if (dcl01h2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01h2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01h2days: This data is Required!");
                return false;
            } else {
                dcl01h2days.setError(null);
            }

            if (dcl01h2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01h2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01h2fr: This data is Required!");
                return false;
            } else {
                dcl01h2fr.setError(null);
            }

        }

        // ================ Q1I / Mother ================

        if (dcl01im.isChecked()) {
            if (dcl01i1days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01i1days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01i1days: This data is Required!");
                return false;
            } else {
                dcl01i1days.setError(null);
            }

            if (dcl01i1fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01i1fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01i1fr: This data is Required!");
                return false;
            } else {
                dcl01i1fr.setError(null);
            }

        }

        // ================ Q1I / Child ================

        if (dcl01ic.isChecked()) {
            if (dcl01i2days.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                dcl01i2days.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01i2days: This data is Required!");
                return false;
            } else {
                dcl01i2days.setError(null);
            }

            if (dcl01i2fr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.Frequency), Toast.LENGTH_SHORT).show();
                dcl01i2fr.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "dcl01i2fr: This data is Required!");
                return false;
            } else {
                dcl01i2fr.setError(null);
            }

        }

        //======================== Q2A==================
        if (dcl02a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl02a), Toast.LENGTH_SHORT).show();
            dcl02a.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl02a: This data is Required!");
            return false;
        } else {
            dcl02a.setError(null);
        }

        //======================== Q2B==================
        if (dcl02b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl02b), Toast.LENGTH_SHORT).show();
            dcl02b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl02b: This data is Required!");
            return false;
        } else {
            dcl02b.setError(null);
        }

        //======================== Q2C==================
        if (dcl02c.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl02c), Toast.LENGTH_SHORT).show();
            dcl02c.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl02c: This data is Required!");
            return false;
        } else {
            dcl02c.setError(null);
        }

        //======================== Q2D==================
        if (dcl02d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl02d), Toast.LENGTH_SHORT).show();
            dcl02d.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl02d: This data is Required!");
            return false;
        } else {
            dcl02d.setError(null);
        }

        //======================== Q2E==================
        if (dcl02e.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl02e), Toast.LENGTH_SHORT).show();
            dcl02e.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl02e: This data is Required!");
            return false;
        } else {
            dcl02e.setError(null);
        }

        //======================== Q3==================
        if (dcl03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl03), Toast.LENGTH_SHORT).show();
            dcl0303.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl0303: This data is Required!");
            return false;
        } else {
            dcl0303.setError(null);
        }

        //======================== Q4==================
        if (dcl04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl04), Toast.LENGTH_SHORT).show();
            dcl0403.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl0403: This data is Required!");
            return false;
        } else {
            dcl0403.setError(null);
        }

        //======================== Q5==================
        if (dcl05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dcl05), Toast.LENGTH_SHORT).show();
            dcl0503.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dcl0503: This data is Required!");
            return false;
        } else {
            dcl0503.setError(null);
        }


        return true;
    }


}
