package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityAdultDeathReportBinding;

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
