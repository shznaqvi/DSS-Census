package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.IdRes;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

public class SectionHActivity extends Activity {

    private static final String TAG = SectionHActivity.class.getSimpleName();


    @BindView(R.id.dch01)
    RadioGroup dch01;
    @BindView(R.id.dch0101)
    RadioButton dch0101;
    @BindView(R.id.dch0102)
    RadioButton dch0102;
    @BindView(R.id.fldGrpdch02)
    LinearLayout fldGrpdch02;
    @BindView(R.id.dch02)
    RadioGroup dch02;
    @BindView(R.id.dch0201)
    RadioButton dch0201;
    @BindView(R.id.dch0202)
    RadioButton dch0202;
    @BindView(R.id.dch03)
    RadioGroup dch03;
    @BindView(R.id.dch0301)
    RadioButton dch0301;
    @BindView(R.id.dch0302)
    RadioButton dch0302;
    @BindView(R.id.fldGrpdch04)
    LinearLayout fldGrpdch04;
    @BindView(R.id.dch04)
    RadioGroup dch04;
    @BindView(R.id.dch0401)
    RadioButton dch0401;
    @BindView(R.id.dch0402)
    RadioButton dch0402;
    @BindView(R.id.dch0403)
    RadioButton dch0403;
    @BindView(R.id.fldGrpdch05)
    LinearLayout fldGrpdch05;
    @BindView(R.id.dch05)
    EditText dch05;
    @BindView(R.id.dch06)
    RadioGroup dch06;
    @BindView(R.id.dch0601)
    RadioButton dch0601;
    @BindView(R.id.dch0602)
    RadioButton dch0602;
    @BindView(R.id.dch07m)
    EditText dch07m;
    @BindView(R.id.dch07y)
    EditText dch07y;
    @BindView(R.id.dch07)
    RadioGroup dch07;
    @BindView(R.id.dch0701)
    RadioButton dch0701;
    @BindView(R.id.dch0702)
    RadioButton dch0702;
    @BindView(R.id.dch0703)
    RadioButton dch0703;
    @BindView(R.id.dch0796)
    RadioButton dch0796;
    @BindView(R.id.dch0799)
    RadioButton dch0799;
    @BindView(R.id.dch0796x)
    EditText dch0796x;
    @BindView(R.id.dch08)
    RadioGroup dch08;
    @BindView(R.id.dch0801)
    RadioButton dch0801;
    @BindView(R.id.dch0802)
    RadioButton dch0802;
    @BindView(R.id.dch0803)
    RadioButton dch0803;
    @BindView(R.id.dch0804)
    RadioButton dch0804;
    @BindView(R.id.dch09)
    RadioGroup dch09;
    @BindView(R.id.dch0901)
    RadioButton dch0901;
    @BindView(R.id.dch0902)
    RadioButton dch0902;
    @BindView(R.id.dch0999)
    RadioButton dch0999;
    @BindView(R.id.fldGrpdch10)
    LinearLayout fldGrpdch10;
    @BindView(R.id.dch10)
    RadioGroup dch10;
    @BindView(R.id.dch1001)
    RadioButton dch1001;
    @BindView(R.id.dch1002)
    RadioButton dch1002;
    @BindView(R.id.dch1003)
    RadioButton dch1003;
    @BindView(R.id.dch1004)
    RadioButton dch1004;
    @BindView(R.id.dch1005)
    RadioButton dch1005;
    @BindView(R.id.dch1006)
    RadioButton dch1006;
    @BindView(R.id.dch1007)
    RadioButton dch1007;
    @BindView(R.id.dch1008)
    RadioButton dch1008;
    @BindView(R.id.dch1009)
    RadioButton dch1009;
    @BindView(R.id.dch1099)
    RadioButton dch1099;
    @BindView(R.id.dch1096)
    RadioButton dch1096;
    @BindView(R.id.dch1096x)
    EditText dch1096x;
    @BindView(R.id.dch11)
    EditText dch11;
    @BindView(R.id.dch12)
    EditText dch12;
    @BindView(R.id.fldGrpdch07)
    LinearLayout fldGrpdch07;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);


        // ================ Q 9 Skip Check =================

        if (dch0901.isChecked() || dch0902.isChecked() || dch0703.isChecked() || dch0799.isChecked() || dch0796.isChecked()) {
            dch07m.setVisibility(View.GONE);
            dch07y.setVisibility(View.GONE);
            dch07m.setText(null);
            dch07y.setText(null);
        } else {
            dch07m.setVisibility(View.VISIBLE);
            dch07y.setVisibility(View.VISIBLE);

        }

        // ================== Q 12 others ============

        dch10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == dch1096.getId()) {

                    dch1096x.setVisibility(View.VISIBLE);
                    dch1096x.requestFocus();

                } else {

                    dch1096x.setVisibility(View.GONE);
                    dch1096x.setText(null);
                }
            }
        });


        // ================== Q1 Skip Pattern ===============

        dch01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dch0101.isChecked()) {
                    fldGrpdch02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch02.setVisibility(View.GONE);
                    dch02.clearCheck();
                    dch03.clearCheck();
                    dch04.clearCheck();
                    dch05.setText(null);
                }
            }
        });

        dch03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
//                if (dch0301.isChecked() || dch0303.isChecked()) {
//                    fldGrpdch04.setVisibility(View.VISIBLE);
//                    fldGrpdch05.setVisibility(View.GONE);
//                    dch05.setText(null);
//                } else {
//                    fldGrpdch05.setVisibility(View.VISIBLE);
//                    fldGrpdch04.setVisibility(View.GONE);
//                    dch04.clearCheck();
//                }
                if (dch0302.isChecked()) {
                    fldGrpdch04.setVisibility(View.GONE);
                    dch04.clearCheck();
                    fldGrpdch05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch04.setVisibility(View.VISIBLE);
                }
            }
        });


        dch04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dch0402.isChecked()) {
                    fldGrpdch05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch05.setVisibility(View.GONE);
                }
            }
        });


       /* //============== Q4 Skip Pattern ==================
        dch04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (dch0402.isChecked()) {
                    fldGrpdch05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch05.setVisibility(View.GONE);
                    dch05.setText(null);
                }
            }
        });*/

        dch09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dch0902.isChecked()) {
                    fldGrpdch10.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch10.setVisibility(View.GONE);
                    dch10.clearCheck();
                    dch1096x.setText(null);
                }
            }
        });

        dch06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (dch0602.isChecked()) {
                    fldGrpdch07.setVisibility(View.VISIBLE);
                } else {
                    fldGrpdch07.setVisibility(View.GONE);
                    dch07m.setText(null);
                    dch07y.setText(null);
                    dch07.clearCheck();
                    dch0796x.setText(null);
                    dch08.clearCheck();
                    dch09.clearCheck();
                    dch10.clearCheck();
                    dch1096x.setText(null);
                }
            }
        });


        // ================== Q 9 others ============

        dch07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                /*if ((!dch07y.getText().toString().isEmpty() || !dch07m.getText().toString().isEmpty())
                        && dch07.getCheckedRadioButtonId() != -1) {
                    dch07m.setText(null);
                    dch07y.setText(null);

                }*/
                if (dch07.getCheckedRadioButtonId() != -1) {
                    dch07m.setText(null);
                    dch07y.setText(null);
                }


                if (checkedId == dch0796.getId()) {

                    dch0796x.setVisibility(View.VISIBLE);
                    dch0796x.requestFocus();

                } else {

                    dch0796x.setVisibility(View.GONE);
                    dch0796x.setText(null);
                }
            }
        });

        dch07m.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!dch07m.getText().toString().isEmpty()) {
                    dch07.clearCheck();
                    dch0796x.setText(null);
                    dch0796x.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        dch07y.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!dch07y.getText().toString().isEmpty()) {
                    dch07.clearCheck();
                    dch0796x.setText(null);
                    dch0796x.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
//        finish();
        MainApp.finishActivity(this, this);
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, SectionIActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSH();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sH = new JSONObject();

        // Radio Group
        sH.put("dch01", dch0101.isChecked() ? "1" : dch0102.isChecked() ? "2" : "0");
        sH.put("dch02", dch0201.isChecked() ? "1" : dch0202.isChecked() ? "2" : "0");
        sH.put("dch03", dch0301.isChecked() ? "1" : dch0302.isChecked() ? "2" : "0");
        sH.put("dch04", dch0401.isChecked() ? "1" : dch0402.isChecked() ? "2" : dch0403.isChecked() ? "99" : "0");
        sH.put("dch05", dch05.getText().toString());

        sH.put("dch06", dch0601.isChecked() ? "1" : dch0602.isChecked() ? "2" : "0");
        sH.put("dch07m", dch07m.getText().toString());
        sH.put("dch07y", dch07y.getText().toString());
        sH.put("dch07", dch0701.isChecked() ? "1" : dch0702.isChecked() ? "2" : dch0703.isChecked() ? "3"
                : dch0796.isChecked() ? "96" : dch0799.isChecked() ? "99" : "0");
        sH.put("dch0796x", dch0796x.getText().toString());
        sH.put("dch08", dch0801.isChecked() ? "1" : dch0802.isChecked() ? "2" : dch0803.isChecked() ? "3" : "0");
        sH.put("dch09", dch0901.isChecked() ? "1" : dch0902.isChecked() ? "2" : dch0999.isChecked() ? "99" : "0");
        sH.put("dch10", dch1001.isChecked() ? "1" : dch1002.isChecked() ? "2" : dch1003.isChecked() ? "3"
                : dch1004.isChecked() ? "4" : dch1005.isChecked() ? "5" : dch1006.isChecked() ? "6"
                : dch1007.isChecked() ? "7" : dch1008.isChecked() ? "8" : dch1009.isChecked() ? "9"
                : dch1096.isChecked() ? "96" : dch1099.isChecked() ? "99" : "0");
        sH.put("dch1096x", dch1096x.getText().toString());
        sH.put("dch11", dch11.getText().toString());
        sH.put("dch12", dch12.getText().toString());
        //sh.put("dch13", dch1301.isChecked() ? "1" : dch1302.isChecked() ? "2" : "0");


        MainApp.mc.setsH(String.valueOf(sH));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        // ====================== Q 1 ==============
        if (dch01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch01), Toast.LENGTH_SHORT).show();
            dch0102.setError("This data is Required!");
            Log.i(TAG, "dch01: This data is Required!");
            return false;
        } else {
            dch0102.setError(null);
        }

        // ====================== Q 2 ===================

        if (dch0101.isChecked()) {
            if (dch02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch02), Toast.LENGTH_SHORT).show();
                dch0202.setError("This data is Required!");
                Log.i(TAG, "dch02: This data is Required!");
                return false;
            } else {
                dch0202.setError(null);
            }


            // ==================== Q 3 ==================

            if (dch03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch03), Toast.LENGTH_SHORT).show();
                dch0302.setError("This data is Required!");
                Log.i(TAG, "dch03: This data is Required!");
                return false;
            } else {
                dch0302.setError(null);
            }


            // ================= Q 4 ========================
            if (!dch0302.isChecked()) {
                if (dch04.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch04), Toast.LENGTH_SHORT).show();
                    dch0402.setError("This data is Required!");
                    Log.i(TAG, "dch04: This data is Required!");
                    return false;
                } else {
                    dch0402.setError(null);
                }
            }

            if (dch0402.isChecked()) {
                if (dch05.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch05), Toast.LENGTH_SHORT).show();
                    dch05.setError("This data is Required!");
                    Log.i(TAG, "dch05: This data is Required!");
                    return false;
                } else {
                    dch05.setError(null);
                }
            }
        }
        //==================== Q 6 ==============


        // =================== Q 8 ==================
        if (dch06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch06), Toast.LENGTH_SHORT).show();
            dch0602.setError("This data is Required!");
            Log.i(TAG, "dch06: This data is Required!");
            return false;
        } else {
            dch0602.setError(null);
        }

        if (dch0602.isChecked()) {
            // =================== Q 9 ==================
            if ((dch07m.getText().toString().isEmpty() && dch07y.getText().toString().isEmpty()) && dch07.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch07), Toast.LENGTH_SHORT).show();
                dch0799.setError("This data is Required!");
                Log.i(TAG, "dch07: This data is Required!");
                return false;
            } else {
                dch0799.setError(null);
            }

            if (dch07.getCheckedRadioButtonId() == -1) {
                if (dch07m.getText().toString().isEmpty()
                        || dch07y.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch07), Toast.LENGTH_SHORT).show();
                    dch07y.setError("This data is Required!");
                    Log.i(TAG, "dch07: This data is Required!");
                    return false;
                } else {
                    dch07y.setError(null);
                }

                if (Integer.valueOf(dch07m.getText().toString()) > 11 || (Integer.valueOf(dch07m.getText().toString()) == 0 &&
                        Integer.valueOf(dch07y.getText().toString()) == 0)) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.dch07), Toast.LENGTH_SHORT).show();
                    dch07y.setError("This data is Invalid!");
                    Log.i(TAG, "dch07: This data is Invalid!");
                    return false;
                } else {
                    dch07y.setError(null);
                }
            }

            /*if ((Integer.valueOf(dch07m.getText().toString().isEmpty() ? "0" : dch07m.getText().toString()) < 1
                    || Integer.valueOf(dch07y.getText().toString().isEmpty() ? "0" : dch07y.getText().toString()) < 1)
                    && dch07.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch07), Toast.LENGTH_SHORT).show();
                dch0799.setError("This data is Required!");
                Log.i(TAG, "dch07: This data is Required!");
                return false;
            } else {
                dch0799.setError(null);
            }

            if ((Integer.valueOf(dch07m.getText().toString().isEmpty() ? "0" : dch07m.getText().toString()) > 0
                    || Integer.valueOf(dch07y.getText().toString().isEmpty() ? "0" : dch07y.getText().toString()) > 0)
                    && dch07.getCheckedRadioButtonId() != -1) {
                dch07.clearCheck();
            }*/


            if (dch0796.isChecked() && dch0796x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch07) + "- " + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
                dch0796x.setError("This data is Required!");
                Log.i(TAG, "dch0796x: This data is Required!");
                return false;
            } else {
                dch0796x.setError(null);
            }

            // =================== Q 10 ==================
            if (dch08.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch08), Toast.LENGTH_SHORT).show();
                dch0804.setError("This data is Required!");
                Log.i(TAG, "dch08: This data is Required!");
                return false;
            } else {
                dch0804.setError(null);
            }

            // =================== Q 11 ==================
            if (dch09.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch09), Toast.LENGTH_SHORT).show();
                dch0999.setError("This data is Required!");
                Log.i(TAG, "dch09: This data is Required!");
                return false;
            } else {
                dch0999.setError(null);
            }

            if (dch0902.isChecked()) {

                // =================== Q 12 ==================
                if (dch10.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch10), Toast.LENGTH_SHORT).show();
                    dch1099.setError("This data is Required!");
                    Log.i(TAG, "dch10: This data is Required!");
                    return false;
                } else {
                    dch1099.setError(null);
                }

                if (dch1096.isChecked() && dch1096x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch10) + "-" + getString(R.string.dcother), Toast.LENGTH_SHORT).show();
                    dch1096x.setError("This data is Required!");
                    Log.i(TAG, "dch1096x: This data is Required!");
                    return false;
                } else {
                    dch1096x.setError(null);
                }
            }
        }

        if (dch11.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch11), Toast.LENGTH_SHORT).show();
            dch11.setError("This data is Required!");
            Log.i(TAG, "dch11: This data is Required!");
            return false;
        } else {
            dch11.setError(null);
        }

        //==================== Q 7 ==============

        if (dch12.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch12), Toast.LENGTH_SHORT).show();
            dch12.setError("This data is Required!");
            Log.i(TAG, "dch12: This data is Required!");
            return false;
        } else {
            dch12.setError(null);
        }


        // =================== Q 13 ==================

        /*if (dch13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dch13), Toast.LENGTH_SHORT).show();
            dch1302.setError("This data is Required!");
            Log.i(TAG, "dch13: This data is Required!");
            return false;
        } else {
            dch1302.setError(null);
        }*/

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
