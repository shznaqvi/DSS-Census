package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
    @BindView(R.id.dc102a) EditText dc102a;
    @BindView(R.id.dc102b) EditText dc102b;
    @BindView(R.id.dc102c) EditText dc102c;
    @BindView(R.id.dc102d) EditText dc102d;
    @BindView(R.id.dc102e) EditText dc102e;
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


//        MainApp.fc.setROW_sk(String.valueOf(sk));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ====================== Name ==============


        return true;
    }





}
