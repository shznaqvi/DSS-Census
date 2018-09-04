package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.EventsContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityPwAssessmentBinding;
import edu.aku.hassannaqvi.dss_census_sur.validation.ClearClass;
import edu.aku.hassannaqvi.dss_census_sur.validation.validatorClass;

public class PWAssessmentActivity extends AppCompatActivity {
    ActivityPwAssessmentBinding bi;

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    DatabaseHelper db;
    EventsContract followUpData;
    JSONObject sPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_pw_assessment);
        bi.setCallback(this);
        db = new DatabaseHelper(this);
        setContentsUI();
        setFollowUpData();
    }

    public void setFollowUpData() {

        followUpData = (EventsContract) getIntent().getSerializableExtra("followUpData");
        //bi.round.setText(followUpData.getRound());
        bi.dsaHeading01.setText("PW ASSESMENT " + "(" + followUpData.getName() + ")");
        bi.husbandName.setText("Husband Name: " + followUpData.getDss_id_hus());
        bi.dssID.setText("DSS ID: " + followUpData.getDss_id_member());
    }

    public void setContentsUI() {

        bi.dsa01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa01a) {
                    bi.fldGrpPwdsa02.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa02, false);
                    bi.fldGrpPwdsa04.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa04, false);
                    bi.fldGrpPwdsa05.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa05, false);
                    bi.fldGrpPwdsa03.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, true);
                    bi.fldGrpPwdsa06.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, true);
                } else {
                    //bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    // ClearClass.ClearAllFields(bi.fldGrpPwdsa02, true);
                    //bi.fldGrpPwdsa04.setVisibility(View.VISIBLE);
                    //ClearClass.ClearAllFields(bi.fldGrpPwdsa04, true);
                    // bi.fldGrpPwdsa05.setVisibility(View.VISIBLE);
                    //ClearClass.ClearAllFields(bi.fldGrpPwdsa05, true);

                }

                if (i == R.id.dsa0198) {
                    bi.fldGrpPwdsa02.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa02, false);
                    bi.fldGrpPwdsa03.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, false);
                    bi.fldGrpPwdsa06.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, false);
                } else {
                    // bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    //ClearClass.ClearAllFields(bi.fldGrpPwdsa02, true);
                }

                if (i == R.id.dsa01b) {
                    bi.fldGrpPwdsa02.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa02, true);
                    bi.fldGrpPwdsa03.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, false);
                    bi.fldGrpPwdsa06.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, false);
                }

            }
        });

        bi.dsa02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa02e) {
                    bi.fldGrpPwdsa03.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa03, false);
                    bi.fldGrpPwdsa04.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa04, false);
                    bi.fldGrpPwdsa05.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa05, false);
                    bi.fldGrpPwdsa06.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, false);
                    bi.fldGrpPwdsa07.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, false);
                    bi.fldGrpPwdsa08.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa08, false);
                    bi.fldGrpPwdsa09.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa09, false);
                    bi.fldGrpPwdsa10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, false);
                    bi.fldGrpPwdsa11.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa11, false);
                    bi.fldGrpPwdsa12.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, false);
                    bi.fldGrpPwdsa13.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa13, false);
                    bi.fldGrpPwdsa14.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, false);
                    bi.fldGrpPwdsa15.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa15, false);
                    bi.fldGrpPwdsa16.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, false);
                    bi.fldGrpPwdsa17.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa17, false);
                    bi.fldGrpPwdsa18.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa18, false);
                    bi.fldGrpPwdsa19.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa19, false);
                    bi.fldGrpPwdsa20.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa20, false);
                    bi.dsaHeading03.setVisibility(View.GONE);


                } else {

                    //bi.fldGrpPwdsa03.setVisibility(View.VISIBLE);
                    //ClearClass.ClearAllFields(bi.fldGrpPwdsa03, true);
                    bi.fldGrpPwdsa04.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa04, true);
                    bi.fldGrpPwdsa05.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa05, true);
                    bi.fldGrpPwdsa06.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa06, true);
                    bi.fldGrpPwdsa07.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, true);
                    bi.fldGrpPwdsa08.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa08, true);
                    bi.fldGrpPwdsa09.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa09, true);
                    bi.fldGrpPwdsa10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, true);
                    bi.fldGrpPwdsa11.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa11, true);
                    bi.fldGrpPwdsa12.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, true);
                    bi.fldGrpPwdsa13.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa13, true);
                    bi.fldGrpPwdsa14.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, true);
                    bi.fldGrpPwdsa15.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa15, true);
                    bi.fldGrpPwdsa16.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, true);
                    bi.fldGrpPwdsa17.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa17, true);
                    bi.fldGrpPwdsa18.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa18, true);
                    bi.fldGrpPwdsa19.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa19, true);
                    bi.fldGrpPwdsa20.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa20, true);
                    bi.dsaHeading03.setVisibility(View.VISIBLE);


                }
            }
        });

        bi.dsa06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa06b || i == R.id.dsa06c) {
                    bi.fldGrpPwdsa07.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, false);
                } else {
                    bi.fldGrpPwdsa07.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa07, true);
                }
            }
        });

        bi.dsa09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa09a) {
                    bi.fldGrpPwdsa10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, true);
                } else {
                    bi.fldGrpPwdsa10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa10, false);
                }
            }
        });

        bi.dsa11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa1197) {

                    bi.fldGrpPwdsa12.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, false);
                } else {
                    bi.fldGrpPwdsa12.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa12, true);
                }
            }
        });
        bi.dsa12b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.dsa12a.setVisibility(View.GONE);
                    bi.dsa12a.setText(null);
                    bi.dsa1298.setChecked(false);
                } else if (!bi.dsa1298.isChecked()) {
                    bi.dsa12a.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.dsa1298.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    bi.dsa12a.setVisibility(View.GONE);
                    bi.dsa12a.setText(null);
                    bi.dsa12b.setChecked(false);
                } else if (!bi.dsa12b.isChecked()) {
                    bi.dsa12a.setVisibility(View.VISIBLE);
                }
            }
        });
        bi.dsa1298.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.dsa12a.setVisibility(View.GONE);
                    bi.dsa12a.setText(null);
                    bi.dsa12b.setChecked(false);
                } else if (!bi.dsa12b.isChecked()) {
                    bi.dsa12a.setVisibility(View.VISIBLE);
                }
            }
        });
        bi.dsa13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa1397) {
                    bi.fldGrpPwdsa14.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, false);
                } else {
                    bi.fldGrpPwdsa14.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa14, true);
                }
            }
        });

        bi.dsa14b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.dsa14a.setVisibility(View.GONE);
                    bi.dsa14a.setText(null);
                    bi.dsa1498.setChecked(false);
                } else if (!bi.dsa1498.isChecked()) {
                    bi.dsa14a.setVisibility(View.VISIBLE);
                }
            }
        });
        bi.dsa1498.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.dsa14a.setVisibility(View.GONE);
                    bi.dsa14a.setText(null);
                    bi.dsa14b.setChecked(false);
                } else if (!bi.dsa14b.isChecked()) {
                    bi.dsa14a.setVisibility(View.VISIBLE);
                }
            }
        });
        bi.dsa15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.dsa1597) {

                    bi.fldGrpPwdsa16.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, false);
                } else {
                    bi.fldGrpPwdsa16.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(bi.fldGrpPwdsa16, true);
                }
            }
        });

        bi.dsa16b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.dsa16a.setVisibility(View.GONE);
                    bi.dsa16a.setText(null);
                    bi.dsa1698.setChecked(false);
                } else if (!bi.dsa1698.isChecked()) {
                    bi.dsa16a.setVisibility(View.VISIBLE);
                }
            }
        });
        bi.dsa1698.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bi.dsa16a.setVisibility(View.GONE);
                    bi.dsa16a.setText(null);
                    bi.dsa16b.setChecked(false);
                } else if (!bi.dsa16b.isChecked()) {
                    bi.dsa16a.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void BtnEnd() {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);
        alertDialogBuilder
                .setMessage("Are you sure to end this section?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {

                                SaveDraft(true);

                                if (UpdateDB()) {

                                    MainApp.memClicked.add(getIntent().getIntExtra("position", -1));
                                    EventsListActivity.memFlag++;

                                    finish();
                                    startActivity(new Intent(getApplicationContext(), PW_EndingActivity.class).putExtra("check", false));

                                } else {
                                    Toast.makeText(getApplicationContext(), "Failed to Update Database!", Toast.LENGTH_SHORT).show();
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

    public void BtnContinue() {
        if (formValidation()) {

            SaveDraft();

            if (UpdateDB()) {

                MainApp.memClicked.add(getIntent().getIntExtra("position", -1));
                EventsListActivity.memFlag++;

                finish();
                startActivity(new Intent(this, PW_EndingActivity.class)
                        .putExtra("check", true));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();
        if (!validatorClass.EmptyRadioButton(this, bi.dsa01, bi.dsa01a, getString(R.string.dsa01))) {
            return false;
        }
        if (bi.dsa01b.isChecked()) {
            if (!validatorClass.EmptyRadioButton(this, bi.dsa02, bi.dsa02a, getString(R.string.dsa02))) {
                return false;
            }
        }
        if (!bi.dsa02e.isChecked()) {
            if (bi.dsa01a.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, bi.dsa03d, getString(R.string.dsa03) + " " + getString(R.string.dsa03d))) {
                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.dsa03m, getString(R.string.dsa03) + " " + getString(R.string.dsa03m))) {
                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.dsa03y, getString(R.string.dsa03) + " " + getString(R.string.dsa03y))) {
                    return false;
                }
            }
            if (!bi.dsa01a.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.dsa04a, getString(R.string.dsa04))) {
                    return false;
                }
                if (!validatorClass.EmptyTextBox(this, bi.dsa05a, getString(R.string.dsa05))) {
                    return false;
                }
            }
            if (bi.dsa01a.isChecked()) {

                if (!validatorClass.EmptyRadioButton(this, bi.dsa06, bi.dsa06a, getString(R.string.dsa06))) {
                    return false;
                }
            }
            if (bi.dsa06a.isChecked() || bi.dsa0698.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.dsa07a, getString(R.string.dsa07))) {
                    return false;
                }
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0801, bi.dsa0801a, getString(R.string.dsa08a))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0802, bi.dsa0802a, getString(R.string.dsa08b))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0803, bi.dsa0803a, getString(R.string.dsa08c))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0804, bi.dsa0804a, getString(R.string.dsa08d))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0805, bi.dsa0805a, getString(R.string.dsa08e))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0806, bi.dsa0806a, getString(R.string.dsa08f))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0807, bi.dsa0807a, getString(R.string.dsa08g))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0808, bi.dsa0808a, getString(R.string.dsa08h))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0809, bi.dsa0809a, getString(R.string.dsa08i))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0810, bi.dsa0810a, getString(R.string.dsa08j))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0811, bi.dsa0811a, getString(R.string.dsa08k))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa0812, bi.dsa0812a, bi.dsa0813, getString(R.string.dsa0896))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bi.dsa09, bi.dsa09a, getString(R.string.dsa09))) {
                return false;
            }
            if (bi.dsa09a.isChecked()) {

                if (!validatorClass.EmptyRadioButton(this, bi.dsa101, bi.dsa101a, getString(R.string.dsa10a))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dsa102, bi.dsa102a, getString(R.string.dsa10b))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dsa103, bi.dsa103a, getString(R.string.dsa10c))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dsa104, bi.dsa104a, getString(R.string.dsa10d))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dsa105, bi.dsa105a, getString(R.string.dsa10e))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dsa106, bi.dsa106a, getString(R.string.dsa10f))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, bi.dsa107, bi.dsa10798, bi.dsa1096x, getString(R.string.dsa1096))) {
                    return false;
                }
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa11, bi.dsa1197, getString(R.string.dsa11))) {
                return false;
            }
            if (!bi.dsa1197.isChecked()) {

                if (!bi.dsa12b.isChecked() && !bi.dsa1298.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, bi.dsa12a, getString(R.string.dsa12))) {
                        return false;
                    }
                } else {
                    if (!validatorClass.EmptyCheckBox(this, bi.dsa12, bi.dsa12b, getString(R.string.dsa12))) {
                        return false;
                    }
                }
            }

            if (!validatorClass.EmptyRadioButton(this, bi.dsa13, bi.dsa13a, getString(R.string.dsa13))) {
                return false;
            }
            if (!bi.dsa1397.isChecked()) {
                if (!bi.dsa14b.isChecked() && !bi.dsa1498.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, bi.dsa14a, getString(R.string.dsa14))) {
                        return false;
                    }
                } else {
                    if (!validatorClass.EmptyCheckBox(this, bi.dsa14, bi.dsa14b, getString(R.string.dsa14))) {
                        return false;
                    }
                }
            }

            if (!validatorClass.EmptyRadioButton(this, bi.dsa15, bi.dsa15a, getString(R.string.dsa15))) {
                return false;
            }
            if (!bi.dsa1597.isChecked()) {
                if (!bi.dsa16b.isChecked() && !bi.dsa1698.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, bi.dsa16a, getString(R.string.dsa16))) {
                        return false;
                    }
                } else {
                    if (!validatorClass.EmptyCheckBox(this, bi.dsa16, bi.dsa16b, getString(R.string.dsa16))) {
                        return false;
                    }
                }
            }
            if (!validatorClass.EmptyRadioButton(this, bi.dsa17, bi.dsa17a, getString(R.string.dsa17))) {
                return false;
            }
            if (!bi.dsa1899.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.dsa18w, getString(R.string.dsa18))) {
                    return false;
                }
                if (!bi.dsa18w.getText().toString().matches("^(\\d{3,3}\\.\\d{2,2})$")) {
                    Toast.makeText(this, "Please enter correct decimal value!", Toast.LENGTH_SHORT).show();
                    bi.dsa18w.requestFocus();
                    bi.dsa18w.setError("Please enter correct decimal value!");
                    return false;
                } else {
                    bi.dsa18w.clearFocus();
                    bi.dsa18w.setError(null);
                    if (!validatorClass.RangeTextBox(this, bi.dsa18w, 20.0, 250.0, getString(R.string.dsa18w), " kg")) {
                        return false;
                    }
                }
            }
            if (!bi.dsa1999.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.dsa19m, getString(R.string.dsa19))) {
                    return false;
                }
                if (!bi.dsa19m.getText().toString().matches("^(\\d{2,2}\\.\\d{1,1})$")) {
                    Toast.makeText(this, "Please enter correct decimal value!", Toast.LENGTH_SHORT).show();
                    bi.dsa19m.requestFocus();
                    bi.dsa19m.setError("Please enter correct decimal value!");
                    return false;
                } else {
                    bi.dsa19m.clearFocus();
                    bi.dsa19m.setError(null);
                    if (!validatorClass.RangeTextBox(this, bi.dsa19m, 50.0, 60.0, getString(R.string.dsa19m), " cm")) {
                        return false;
                    }
                }
            }
            if (!bi.dsa2099.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.dsa20h, getString(R.string.dsa20))) {
                    return false;
                }
                if (!bi.dsa20h.getText().toString().matches("^(\\d{3,3}\\.\\d{1,1})$")) {
                    Toast.makeText(this, "Please enter correct decimal value!", Toast.LENGTH_SHORT).show();
                    bi.dsa20h.requestFocus();
                    bi.dsa20h.setError("Please enter correct decimal value!");
                    return false;
                } else {
                    bi.dsa20h.clearFocus();
                    bi.dsa20h.setError(null);

                    return validatorClass.RangeTextBox(this, bi.dsa20h, 40.0, 140.0, getString(R.string.dsa20h), " cm");
                }
            }
        }

        return true;
    }

    public void SaveDraft(boolean type) {
        try {

//            SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

         /*   MainApp.pw = new PWContract();

            MainApp.pw.setFormDate(dtToday);
            MainApp.pw.setUser(MainApp.userName);
            MainApp.pw.setDeviceId(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                    Settings.Secure.ANDROID_ID));
            MainApp.pw.setDss_id_member(MainApp.fc.getDSSID().toUpperCase());
            MainApp.pw.setDevicetagID(sharedPref.getString("tagName", null));
            MainApp.pw.setsvisitstatus(String.valueOf(MainApp.pw_visit_status));*/

            sPW = new JSONObject();

            sPW.put("prv_euid", followUpData.getEuid());
            sPW.put("prv_formdate", followUpData.getFormdate());
            sPW.put("prv_status", followUpData.getStatus());
            sPW.put("prv_status_date", followUpData.getStatus_date());
            sPW.put("prv_round", followUpData.getRound());
            sPW.put("prv_name", followUpData.getName());
            sPW.put("prv_dss_id_member", followUpData.getDss_id_member());
            sPW.put("prv_id_hus", followUpData.getDss_id_h());
            sPW.put("prv_lmp_date", followUpData.getLmp_dt());
            sPW.put("prv_status_date", followUpData.getStatus_date());
            sPW.put("prv_total_mem", followUpData.getTotalMem());
            sPW.put("prv_dss_id_m", followUpData.getDss_id_m());
            sPW.put("prv_dss_id_h", followUpData.getDss_id_h());

            if (type) {
                MainApp.pw.setsPW(String.valueOf(sPW));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SaveDraft() {
        try {

            SaveDraft(false);

            sPW.put("dsa01", bi.dsa01a.isChecked() ? "1" : bi.dsa01b.isChecked() ? "2" : bi.dsa0198.isChecked() ? "98" : "0");
            sPW.put("dsa02", bi.dsa02a.isChecked() ? "1" : bi.dsa02b.isChecked() ? "2" : bi.dsa02c.isChecked() ? "3" :
                    bi.dsa02d.isChecked() ? "4" : bi.dsa02e.isChecked() ? "5" : bi.dsa02f.isChecked() ? "6" : bi.dsa0298.isChecked() ? "98" : "0");
            sPW.put("dsa03d", bi.dsa03d.getText().toString());
            sPW.put("dsa03m", bi.dsa03m.getText().toString());
            sPW.put("dsa03y", bi.dsa03y.getText().toString());
            sPW.put("dsa04", bi.dsa04a.getText().toString());
            sPW.put("dsa05", bi.dsa05a.getText().toString());
            sPW.put("dsa06", bi.dsa06a.isChecked() ? "1" : bi.dsa06b.isChecked() ? "2" : bi.dsa06c.isChecked() ? "3" :
                    bi.dsa0698.isChecked() ? "98" : "0");
            sPW.put("dsa07", bi.dsa07a.getText().toString());
            sPW.put("dsa0801", bi.dsa0801a.isChecked() ? "1" : bi.dsa0801b.isChecked() ? "2" : "0");
            sPW.put("dsa0802", bi.dsa0802a.isChecked() ? "1" : bi.dsa0802b.isChecked() ? "2" : "0");
            sPW.put("dsa0803", bi.dsa0803a.isChecked() ? "1" : bi.dsa0803b.isChecked() ? "2" : "0");
            sPW.put("dsa0804", bi.dsa0804a.isChecked() ? "1" : bi.dsa0804b.isChecked() ? "2" : "0");
            sPW.put("dsa0805", bi.dsa0805a.isChecked() ? "1" : bi.dsa0805b.isChecked() ? "2" : "0");
            sPW.put("dsa0806", bi.dsa0806a.isChecked() ? "1" : bi.dsa0806b.isChecked() ? "2" : "0");
            sPW.put("dsa0807", bi.dsa0807a.isChecked() ? "1" : bi.dsa0807b.isChecked() ? "2" : "0");
            sPW.put("dsa0808", bi.dsa0808a.isChecked() ? "1" : bi.dsa0808b.isChecked() ? "2" : "0");
            sPW.put("dsa0809", bi.dsa0809a.isChecked() ? "1" : bi.dsa0809b.isChecked() ? "2" : "0");
            sPW.put("dsa0810", bi.dsa0810a.isChecked() ? "1" : bi.dsa0810b.isChecked() ? "2" : "0");
            sPW.put("dsa0811", bi.dsa0811a.isChecked() ? "1" : bi.dsa0811b.isChecked() ? "2" : "0");
            sPW.put("dsa0812", bi.dsa0812a.isChecked() ? "1" : bi.dsa0812b.isChecked() ? "2" : "0");
            sPW.put("dsa0813", bi.dsa0813.getText().toString());
            sPW.put("dsa09", bi.dsa09a.isChecked() ? "1" : bi.dsa09b.isChecked() ? "2" : bi.dsa0998.isChecked() ? "98" : "0");
            sPW.put("dsa1001", bi.dsa101a.isChecked() ? "1" : bi.dsa101b.isChecked() ? "2" : bi.dsa10198.isChecked() ? "98" : "0");
            sPW.put("dsa1002", bi.dsa102a.isChecked() ? "1" : bi.dsa102b.isChecked() ? "2" : bi.dsa10298.isChecked() ? "98" : "0");
            sPW.put("dsa1003", bi.dsa103a.isChecked() ? "1" : bi.dsa103b.isChecked() ? "2" : bi.dsa10398.isChecked() ? "98" : "0");
            sPW.put("dsa1004", bi.dsa104a.isChecked() ? "1" : bi.dsa104b.isChecked() ? "2" : bi.dsa10498.isChecked() ? "98" : "0");
            sPW.put("dsa1005", bi.dsa105a.isChecked() ? "1" : bi.dsa105b.isChecked() ? "2" : bi.dsa10598.isChecked() ? "98" : "0");
            sPW.put("dsa1006", bi.dsa106a.isChecked() ? "1" : bi.dsa106b.isChecked() ? "2" : bi.dsa10698.isChecked() ? "98" : "0");
            sPW.put("dsa1007", bi.dsa107a.isChecked() ? "1" : bi.dsa107b.isChecked() ? "2" : bi.dsa10798.isChecked() ? "98" : "0");
            sPW.put("dsa1096x", bi.dsa1096x.getText().toString());
            sPW.put("dsa11", bi.dsa11a.isChecked() ? "2" : bi.dsa11b.isChecked() ? "3" : bi.dsa11c.isChecked() ? "4" : bi.dsa1197.isChecked() ? "1" : "0");
            sPW.put("dsa12a", bi.dsa12a.getText().toString());
            sPW.put("dsa12b", bi.dsa12b.isChecked() ? "2" : "0");
            sPW.put("dsa1298", bi.dsa1298.isChecked() ? "98" : "0");
            sPW.put("dsa13", bi.dsa13a.isChecked() ? "2" : bi.dsa13b.isChecked() ? "3" : bi.dsa13c.isChecked() ? "4" : bi.dsa1397.isChecked() ? "1" : "0");
            sPW.put("dsa14a", bi.dsa14a.getText().toString());
            sPW.put("dsa14b", bi.dsa14b.isChecked() ? "2" : "0");
            sPW.put("dsa1498", bi.dsa1498.isChecked() ? "98" : "0");
            sPW.put("dsa15", bi.dsa15a.isChecked() ? "2" : bi.dsa15b.isChecked() ? "3" : bi.dsa15c.isChecked() ? "4" : bi.dsa1597.isChecked() ? "1" : "0");
            sPW.put("dsa16a", bi.dsa16a.getText().toString());
            sPW.put("dsa16b", bi.dsa16b.isChecked() ? "2" : "0");
            sPW.put("dsa1698", bi.dsa1698.isChecked() ? "98" : "0");
            sPW.put("dsa17", bi.dsa17a.isChecked() ? "2" : bi.dsa17b.isChecked() ? "3" : bi.dsa17c.isChecked() ? "4" : bi.dsa1797.isChecked() ? "1" : "0");
            sPW.put("dsa18", bi.dsa1899.isChecked() ? "99" : bi.dsa18w.getText().toString());
            sPW.put("dsa19", bi.dsa1999.isChecked() ? "99" : bi.dsa19m.getText().toString());
            sPW.put("dsa20", bi.dsa2099.isChecked() ? "99" : bi.dsa20h.getText().toString());

            MainApp.pw.setsPW(String.valueOf(sPW));

        } catch (Exception e) {
            e.printStackTrace();
        }

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
        db = new DatabaseHelper(this);
        int updcount = db.updatePWinfo();
        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
