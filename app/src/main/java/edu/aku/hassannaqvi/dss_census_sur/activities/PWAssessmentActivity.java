package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityPwAssessmentBinding;
import edu.aku.hassannaqvi.dss_census_sur.validation.validatorClass;

public class PWAssessmentActivity extends AppCompatActivity {
    ActivityPwAssessmentBinding bi;

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_pw_assessment);
        bi.setCallback(this);

        db = new DatabaseHelper(this);

        setContentsUI();
    }

    public void setContentsUI() {

        bi.dsa01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(i == R.id.dsa01a){
                    bi.fldGrpPwdsa02.setVisibility(View.GONE);
                    bi.fldGrpPwdsa04.setVisibility(View.GONE);
                    bi.fldGrpPwdsa05.setVisibility(View.GONE);
                }else {
                    bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa04.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa05.setVisibility(View.VISIBLE);

                }

            }
        });

        bi.dsa02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(i == R.id.dsa02e){
                    bi.fldGrpPwdsa03.setVisibility(View.GONE);
                    bi.fldGrpPwdsa04.setVisibility(View.GONE);
                    bi.fldGrpPwdsa05.setVisibility(View.GONE);
                    bi.fldGrpPwdsa06.setVisibility(View.GONE);
                    bi.fldGrpPwdsa07.setVisibility(View.GONE);
                    bi.fldGrpPwdsa08.setVisibility(View.GONE);
                    bi.fldGrpPwdsa09.setVisibility(View.GONE);
                    bi.fldGrpPwdsa10.setVisibility(View.GONE);
                    bi.fldGrpPwdsa11.setVisibility(View.GONE);
                    bi.fldGrpPwdsa12.setVisibility(View.GONE);
                    bi.fldGrpPwdsa13.setVisibility(View.GONE);
                    bi.fldGrpPwdsa14.setVisibility(View.GONE);
                    bi.fldGrpPwdsa15.setVisibility(View.GONE);
                    bi.fldGrpPwdsa16.setVisibility(View.GONE);
                    bi.fldGrpPwdsa17.setVisibility(View.GONE);
                    bi.fldGrpPwdsa18.setVisibility(View.GONE);
                    bi.fldGrpPwdsa19.setVisibility(View.GONE);
                    bi.fldGrpPwdsa20.setVisibility(View.GONE);



                }else {

                    bi.fldGrpPwdsa03.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa04.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa05.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa06.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa07.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa08.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa09.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa10.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa11.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa12.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa13.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa14.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa15.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa16.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa17.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa18.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa19.setVisibility(View.VISIBLE);
                    bi.fldGrpPwdsa20.setVisibility(View.VISIBLE);


                }
            }
        });

        bi.dsa06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(i == R.id.dsa06b || i == R.id.dsa06c){
                    bi.fldGrpPwdsa07.setVisibility(View.GONE);
                }else {
                    bi.fldGrpPwdsa07.setVisibility(View.VISIBLE);
                }
            }
        });


    }

    public void BtnEnd() {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        /*finish();
        startActivity(new Intent(this, NB_EndingActivity.class)
                .putExtra("check", false));*/
    }

    public void BtnContinue() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (formValidation()) {

        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
        /*if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                startActivity(new Intent(this, NB_EndingActivity.class)
                        .putExtra("check", true));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (!validatorClass.EmptyRadioButton(this, bi.dsa01, bi.dsa01a, getString(R.string.dsa01))) {
            return false;
        }

//        if (bi.dsa01b.isChecked()) {
//            if (!validatorClass.EmptyRadioButton(this, bi.dsa02, bi.dsa0298, getString(R.string.dsa02))) {
//                return false;
//            }
//        }

        return true;
    }

    public void SaveDraft() throws JSONException {


    }

    // 8 - GONE
    // 0 - visible
    // 4 - Invisible
    public int settingUI() {
        if (bi.dsa01b.isChecked()) {
            return View.VISIBLE;

        } else {
            return View.GONE;
        }
    }


    private boolean UpdateDB() {
        return true;
    }


}
