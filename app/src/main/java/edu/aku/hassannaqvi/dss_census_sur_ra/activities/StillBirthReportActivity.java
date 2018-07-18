package edu.aku.hassannaqvi.dss_census_sur_ra.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.aku.hassannaqvi.dss_census_sur_ra.R;
import edu.aku.hassannaqvi.dss_census_sur_ra.databinding.ActivityStillBirthReportBinding;

public class StillBirthReportActivity extends Activity {
ActivityStillBirthReportBinding bi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_still_birth_report);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_still_birth_report);
        bi.setCallback(this);
    }
}
