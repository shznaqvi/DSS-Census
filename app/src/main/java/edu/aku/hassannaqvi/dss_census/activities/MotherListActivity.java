package edu.aku.hassannaqvi.dss_census.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.core.MainApp;
import edu.aku.hassannaqvi.dss_census.otherClasses.MothersLst;

public class MotherListActivity extends Activity {
//    @BindView(R.id.scrollView01)
//    ScrollView scrollView01;
    @BindView(R.id.motherList)
    ListView motherList;
    @BindView(R.id.btn_continue)
    Button btn_continue;
    @BindView(R.id.lblNoMother)
    TextView lblNoMother;

    int leftChild = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_list);
        ButterKnife.bind(this);

        DatabaseHelper db = new DatabaseHelper(this);
        try {
            Collection<MothersLst> mo = db.getMotherByHousehold(MainApp.fc.getDSSID());

            MainApp.lstMothers = new ArrayList<>();

            for (MothersLst m : mo) {

                Log.d("Mothers", String.valueOf(m));

                if (checkChild(m.getDate_of_birth())) {
                    MainApp.lstMothers.add(new MothersLst(m));
                }
            }

            if (MainApp.lstMothers.size() == 0) {
                btn_continue.setEnabled(true);
                lblNoMother.setText("No Mother Found");
//                lblNoMother.setVisibility(View.VISIBLE);
            } else {
                btn_continue.setEnabled(false);
                lblNoMother.setText("Child Above Age 2:" + leftChild);
//                lblNoMother.setVisibility(View.GONE);
            }

            MainApp.fc.setsF(String.valueOf(MainApp.lstMothers.size()));

            db.updateMotherCount(MainApp.fc.getsF(), MainApp.fc.get_ID());

            listAdapter motherAdapter = new listAdapter(this, android.R.layout.simple_list_item_1, MainApp.lstMothers);

            motherList.setAdapter(motherAdapter);
        } catch (Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    public Boolean checkChild(String dob) {

        try {
            Date dt = new SimpleDateFormat("dd-MM-yy").parse(dob);
            double current_age = ((new Date().getTime() - dt.getTime()) / 30.44) - 1;

            if (monthsBetweenDates(dt,new Date()) < MainApp.selectedCHILD) {
                return true;
            } else {
                leftChild++;
                return false;
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return true;

    }

    public int monthsBetweenDates(Date startDate, Date endDate){

        Calendar start = Calendar.getInstance();
        start.setTime(startDate);

        Calendar end = Calendar.getInstance();
        end.setTime(endDate);

        int monthsBetween = 0;
        int dateDiff = end.get(Calendar.DAY_OF_MONTH)-start.get(Calendar.DAY_OF_MONTH);

        if(dateDiff<0) {
            int borrrow = end.getActualMaximum(Calendar.DAY_OF_MONTH);
            dateDiff = (end.get(Calendar.DAY_OF_MONTH)+borrrow)-start.get(Calendar.DAY_OF_MONTH);
            monthsBetween--;

            if(dateDiff>0) {
                monthsBetween++;
            }
        }

        monthsBetween += end.get(Calendar.MONTH)-start.get(Calendar.MONTH);
        monthsBetween  += (end.get(Calendar.YEAR)-start.get(Calendar.YEAR))*12;
        return monthsBetween;
    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
//        finish();
//        Intent endSec = new Intent(this, EndingActivity.class);
//        endSec.putExtra("check", false);
//        startActivity(endSec);

        MainApp.endActivity(this,this);
    }


    @OnClick(R.id.btn_continue)
    void onBtnContinueClick() {
        //TODO implement
        Toast.makeText(this, "Next Section", Toast.LENGTH_SHORT).show();
        finish();
        if (MainApp.totalChild > 0) {
            startActivity(new Intent(this, SectionKActivity.class));
        } else {
            startActivity(new Intent(this, SectionLActivity.class));
        }
    }

    public class listAdapter extends ArrayAdapter {

        ArrayList<MothersLst> list = new ArrayList<>();

        public listAdapter(Context context, int textViewResourceId, ArrayList<MothersLst> objects) {
            super(context, textViewResourceId, objects);
            list = objects;
        }

        @Override
        public boolean isEnabled(int position) {
            return false;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            View v = view;
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.lstview, null);
            final TextView mother_name = (TextView) v.findViewById(R.id.mother_name);
            TextView child_name = (TextView) v.findViewById(R.id.child_name);
            TextView date_of_birth = (TextView) v.findViewById(R.id.date_of_birth);

            mother_name.setText(list.get(position).getMother_name());
            child_name.setText(list.get(position).getChild_name());
            date_of_birth.setText(list.get(position).getDate_of_birth());

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

//                    finish();

                    motherList.getChildAt(position).setEnabled(false);
                    motherList.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.gray));

                    btn_continue.setEnabled(true);

//                Toast.makeText(getApplicationContext(),AppMain.currentParticipantName,Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();

                    Intent cb = new Intent(getApplicationContext(), SectionFActivity.class);
                    cb.putExtra("position", position);
                    startActivity(cb);
                }
            });

            return v;
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
