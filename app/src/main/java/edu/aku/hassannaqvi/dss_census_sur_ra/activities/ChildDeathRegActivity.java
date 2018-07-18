package edu.aku.hassannaqvi.dss_census_sur_ra.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import edu.aku.hassannaqvi.dss_census_sur_ra.R;

public class ChildDeathRegActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_death_reg);

        TextView head = findViewById(R.id.childDeathHead);
        LinearLayout fldGrpdcdr01 = findViewById(R.id.fldGrpdcdr01);

        if (getIntent().getExtras().getInt("type", 0) == 1) {
            head.setText(getString(R.string.dcdrHeading1));
            fldGrpdcdr01.setVisibility(View.VISIBLE);
        } else {
            head.setText(getString(R.string.dcdrHeading2));
            fldGrpdcdr01.setVisibility(View.GONE);
        }

    }
}
