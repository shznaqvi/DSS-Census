package edu.aku.hassannaqvi.dss_census.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.dss_census.R;
import edu.aku.hassannaqvi.dss_census.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census.core.MainApp;
import edu.aku.hassannaqvi.dss_census.otherClasses.MothersLst;

public class MotherListActivity extends Activity {
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.motherList)
    ListView motherList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_list);
        ButterKnife.bind(this);


        DatabaseHelper db = new DatabaseHelper(this);

        Collection<MothersLst> mo = db.getMotherByHousehold(MainApp.fc.getDSSID());

        ArrayList<MothersLst> lstMothers = new ArrayList<>();

        for (MothersLst m : mo){

            Log.d("Mothers",String.valueOf(m));

            lstMothers.add(new MothersLst(m));
        }


        listAdapter motherAdapter = new listAdapter(this,android.R.layout.simple_list_item_1,lstMothers);

        motherList.setAdapter(motherAdapter);

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
            TextView mother_name = (TextView) v.findViewById(R.id.mother_name);
            TextView child_name = (TextView) v.findViewById(R.id.child_name);
            TextView date_of_birth = (TextView) v.findViewById(R.id.date_of_birth);

            mother_name.setText(list.get(position).getMother_name());
            child_name.setText(list.get(position).getChild_name());
            date_of_birth.setText(list.get(position).getDate_of_birth());

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

//                    AppMain.currentParticipantName = (String) participantList.getItemAtPosition(position);
//
//                    participantList.getChildAt(position).setEnabled(false);
//                    participantList.getChildAt(position).setBackgroundColor(getResources().getColor(R.color.gray));
//
////                Toast.makeText(getApplicationContext(),AppMain.currentParticipantName,Toast.LENGTH_LONG).show();
////                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_LONG).show();
//
//                    Intent cb = new Intent(getApplicationContext(), SectionCBActivity.class);
//                    cb.putExtra("l_uid",AppMain.Eparticipant.get(position).getL_uid());
//                    startActivity(cb);
                }
            });

            return v;
        }
    }

}
