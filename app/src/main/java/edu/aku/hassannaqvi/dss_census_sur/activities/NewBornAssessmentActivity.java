package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;


import edu.aku.hassannaqvi.dss_census_sur.R;

public class NewBornAssessmentActivity extends Activity {

public class NewBornAssessmentActivity extends AppCompatActivity {
ActivityNewBornAssessmentBinding bi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_new_born_assessment);
        bi.setCallBack(this);
       // setContentView(R.layout.activity_new_born_assessment);

    }
}
