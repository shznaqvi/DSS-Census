package edu.aku.hassannaqvi.dss_census_sur_ra.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.aku.hassannaqvi.dss_census_sur_ra.R;
import edu.aku.hassannaqvi.dss_census_sur_ra.databinding.ActivityAdultDeathReportBinding;

public class AdultDeathReportActivity extends Activity {
ActivityAdultDeathReportBinding bi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_adult_death_report);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_adult_death_report);
        bi.setCallback(this);
    }
}
