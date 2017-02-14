package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

public class SectionAActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    FrameLayout activitySectionA;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.dca03)
    EditText dca03;
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
    @BindView(R.id.dca050501)
    RadioButton dca050501;
    @BindView(R.id.dca050502)
    RadioButton dca050502;
    @BindView(R.id.dca050503)
    RadioButton dca050503;
    @BindView(R.id.dca050504)
    RadioButton dca050504;
    @BindView(R.id.dca050505)
    RadioButton dca050505;
    @BindView(R.id.dca050506)
    RadioButton dca050506;
    @BindView(R.id.dca050507)
    RadioButton dca050507;
    @BindView(R.id.dca050508)
    RadioButton dca050508;
    @BindView(R.id.dca050509)
    RadioButton dca050509;
    @BindView(R.id.dca050510)
    RadioButton dca050510;
    @BindView(R.id.dca050511)
    RadioButton dca050511;
    @BindView(R.id.dca050512)
    RadioButton dca050512;
    @BindView(R.id.dca050596)
    RadioButton dca050596;
    @BindView(R.id.dca050596x)
    EditText dca050596x;
    @BindView(R.id.dca06)
    EditText dca06;
    @BindView(R.id.dca0601)
    RadioGroup dca0601;
    @BindView(R.id.dca060101)
    RadioButton dca060101;
    @BindView(R.id.dca060102)
    RadioButton dca060102;
    @BindView(R.id.dca0602)
    EditText dca0602;
    @BindView(R.id.dca0603)
    EditText dca0603;
    @BindView(R.id.dca0604)
    RadioGroup dca0604;
    @BindView(R.id.dca060401)
    RadioButton dca060401;
    @BindView(R.id.dca060402)
    RadioButton dca060402;
    @BindView(R.id.dca060403)
    RadioButton dca060403;
    @BindView(R.id.dca060404)
    RadioButton dca060404;
    @BindView(R.id.dca060405)
    RadioButton dca060405;
    @BindView(R.id.dca060406)
    RadioButton dca060406;
    @BindView(R.id.dca060407)
    RadioButton dca060407;
    @BindView(R.id.dca060408)
    RadioButton dca060408;
    @BindView(R.id.dca060409)
    RadioButton dca060409;
    @BindView(R.id.dca060410)
    RadioButton dca060410;
    @BindView(R.id.dca060411)
    RadioButton dca060411;
    @BindView(R.id.dca060412)
    RadioButton dca060412;
    @BindView(R.id.dca060496)
    RadioButton dca060496;
    @BindView(R.id.dca060496x)
    EditText dca060496x;
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


//        dca01.setText(getIntent().getExtras().get("memberName").toString());

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

        if (formValidation()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
            Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

            finish();

            MainApp.NoMembers = Integer.parseInt(dca0701.getText().toString());
            startActivity(new Intent(this, FamilyMembersActivity.class));
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
        }

    }

    public boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01
        if (dca03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca03), Toast.LENGTH_SHORT).show();
            dca03.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca03.setError(null);
        }

//        02
        if (dca04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca04), Toast.LENGTH_SHORT).show();
            dca0402.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca04: This data is Required!");
            return false;
        } else {
            dca0402.setError(null);
        }

//        03
        if (dca05.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca05), Toast.LENGTH_SHORT).show();
            dca05.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca05.setError(null);
        }

//        04
        if (dca0501.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0501), Toast.LENGTH_SHORT).show();
            dca050102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca0501: This data is Required!");
            return false;
        } else {
            dca050102.setError(null);
        }

//        05
        if (dca0502.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0502), Toast.LENGTH_SHORT).show();
            dca050202.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca0502: This data is Required!");
            return false;
        } else {
            dca050202.setError(null);
        }

//        06
        if (dca0503.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0503), Toast.LENGTH_SHORT).show();
            dca0503.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0503.setError(null);
        }

//        06
        if (dca0504.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0504), Toast.LENGTH_SHORT).show();
            dca0504.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0504.setError(null);
        }

//        07
        if (dca0505.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0505), Toast.LENGTH_SHORT).show();
            dca050502.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca0505: This data is Required!");
            return false;
        } else {
            dca050502.setError(null);
        }

        if (dca050596.isChecked() && dca050596x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0505), Toast.LENGTH_SHORT).show();
            dca050596x.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca050596x.setError(null);
        }

//        08
        if (dca06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca06), Toast.LENGTH_SHORT).show();
            dca06.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca06.setError(null);
        }

//        09
        if (dca0601.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0601), Toast.LENGTH_SHORT).show();
            dca060102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca0601: This data is Required!");
            return false;
        } else {
            dca060102.setError(null);
        }

//        10
        if (dca0602.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0602), Toast.LENGTH_SHORT).show();
            dca0602.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca0602: This data is Required!");
            return false;
        } else {
            dca0602.setError(null);
        }

//        11
        if (dca0603.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0603), Toast.LENGTH_SHORT).show();
            dca0603.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0603.setError(null);
        }

//        12
        if (dca0604.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0604), Toast.LENGTH_SHORT).show();
            dca060496.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca060496.setError(null);
        }

        if (dca060496.isChecked() && dca060496x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca0604), Toast.LENGTH_SHORT).show();
            dca060496x.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca060496x.setError(null);
        }

//        13
        if (dca0701.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca07), Toast.LENGTH_SHORT).show();
            dca0701.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0701.setError(null);
        }

        if (Integer.parseInt(dca0701.getText().toString()) < 1) {
            Toast.makeText(this, "Invalid Data: " + getString(R.string.dca07), Toast.LENGTH_SHORT).show();
            dca0701.setError("Invalid Data must me greater then 0");    // Set Error on last radio button
            return false;
        } else {
            dca0701.setError(null);
        }

        if (dca0702.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca07), Toast.LENGTH_SHORT).show();
            dca0702.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0702.setError(null);
        }

        if (dca0703.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca07), Toast.LENGTH_SHORT).show();
            dca0703.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0703.setError(null);
        }

//        14
        if (dca0801.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca08), Toast.LENGTH_SHORT).show();
            dca0801.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0801.setError(null);
        }

        if (dca0802.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca08), Toast.LENGTH_SHORT).show();
            dca0802.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0802.setError(null);
        }

        if (dca0803.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca08), Toast.LENGTH_SHORT).show();
            dca0803.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca0803.setError(null);
        }

//        15
        if (dca09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca09), Toast.LENGTH_SHORT).show();
            dca0902.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca09: This data is Required!");
            return false;
        } else {
            dca0902.setError(null);
        }

//        16
        if (dca09m.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca09m), Toast.LENGTH_SHORT).show();
            dca09m.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca09m.setError(null);
        }

        if (dca09y.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca09y), Toast.LENGTH_SHORT).show();
            dca09y.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca09y.setError(null);
        }

//        17
        if (dca10a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca10a), Toast.LENGTH_SHORT).show();
            dca10a.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca10a.setError(null);
        }

//        18
        if (dca10b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca10b), Toast.LENGTH_SHORT).show();
            dca10b.setError("This data is Required!");    // Set Error on last radio button
            return false;
        } else {
            dca10b.setError(null);
        }

//        19
        if (dca11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.dca11), Toast.LENGTH_SHORT).show();
            dca1102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "dca11: This data is Required!");
            return false;
        } else {
            dca1102.setError(null);
        }

        return true;
    }


}
