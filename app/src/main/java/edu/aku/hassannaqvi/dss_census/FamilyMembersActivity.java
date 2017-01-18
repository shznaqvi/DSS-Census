package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FamilyMembersActivity extends Activity  {

    @BindView(R.id.activity_family_members) RelativeLayout activityFamilyMembers;
    @BindView(R.id.lst_noMembers) ListView lstNoMembers;


    Adapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        ButterKnife.bind(this);

        final List<String> Members = new ArrayList<String>();

        for (byte i=0;i<MainApp.NoMembers;i++){
            Members.add("Member "+i);
        }

        lstNoMembers.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.lstview, Members));

        lstNoMembers.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Intent i = new Intent(getApplicationContext(), SectionAActivity.class);

                i.putExtra("memberName",Members.get(position));

                startActivity(i);

//                Toast.makeText(getApplicationContext(),""+Members.get(position),Toast.LENGTH_LONG).show();

            }
        });
    }

}
