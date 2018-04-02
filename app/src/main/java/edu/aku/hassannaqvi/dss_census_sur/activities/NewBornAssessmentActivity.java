package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.databinding.ActivityNewBornAssessmentBinding;

public class NewBornAssessmentActivity extends Activity {
    ActivityNewBornAssessmentBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_new_born_assessment);
        bi.setCallback(this);
        // setContentView(R.layout.activity_new_born_assessment);
        bi.dnb25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.dnb25b) {
                    bi.fldGrpdnb25.setVisibility(View.GONE);
                    bi.dnb26.clearCheck();
                    bi.dnb26x.setText(null);
                    bi.dnb27.clearCheck();
                    bi.dnb28.setText(null);
                } else {
                    bi.fldGrpdnb25.setVisibility(View.VISIBLE);
                }
            }

        });
    }
}
