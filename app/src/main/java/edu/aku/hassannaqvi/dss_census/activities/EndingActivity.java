package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census.R;

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

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        finish();
        Intent endSec = new Intent(this, MainActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
    }


}
