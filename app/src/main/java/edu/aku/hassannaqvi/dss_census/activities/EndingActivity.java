package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.core.MainApp;

public class EndingActivity extends Activity {

    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.dcstatus)
    RadioGroup dcstatus;
    @BindView(R.id.dcstatus01)
    RadioButton dcstatus01;
    @BindView(R.id.dcstatus02)
    RadioButton dcstatus02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("check");

        if (check) {
            dcstatus01.setEnabled(true);
            dcstatus02.setEnabled(false);

        } else {
            //fldGrpmn0823Reason.setVisibility(View.GONE);
            dcstatus01.setEnabled(false);
            dcstatus02.setEnabled(true);


        }

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        finish();

        MainApp.familyMembersList.clear();
        MainApp.memFlag = 0;

        Intent endSec = new Intent(this, MainActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateE();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (mn0823.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Not Selected): " + getString(R.string.mn0823), Toast.LENGTH_LONG).show();
            mn082304.setError("Please Select One");    // Set Error on last radio button
            Log.i(TAG, "mn082304: This data is Required!");
            return false;
        } else {
            mn082304.setError(null);
        }


        if (mn082302.isChecked()) {

            if (mn082302x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn082302x.setError("Please specify reason");    // Set Error on last radio button
                Log.i(TAG, "mn082302x: This data is Required!");
                return false;
            } else {
                mn082302x.setError(null);
            }
        }
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();


        SRCApp.fc.setROW_MN823(mn082301.isChecked() ? "1" : mn082302.isChecked() ? "2" : mn082303.isChecked() ? "3" : mn082304.isChecked() ? "4" : "0");
        SRCApp.fc.setROW_MN823X(mn082302x.getText().toString());

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }



}
