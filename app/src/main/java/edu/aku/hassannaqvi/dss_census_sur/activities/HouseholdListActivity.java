package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.HouseholdContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

public class HouseholdListActivity extends Activity {

    @BindView(R.id.hhno)
    EditText hhno;
    @BindView(R.id.fldGrpHHExists)
    LinearLayout fldGrpHHExists;
    @BindView(R.id.fldGrpMain)
    LinearLayout fldGrpMain;
    @BindView(R.id.hh_count)
    TextView hhCount;
    @BindView(R.id.heading)
    TextView heading;
    @BindView(R.id.recycler_households)
    RecyclerView recyclerHouseholds;
    @BindView(R.id.btn_Continue)
    Button btn_Continue;

    /*Variables*/
    Collection<HouseholdContract> household;
    DatabaseHelper db;
    HouseholdAdapter mAdapter;

    //    flag for checking HH field
    Boolean flagHH = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household_list);
        ButterKnife.bind(this);

//        Set Region DssIDD
        hhno.setText(MainApp.regionDss);
        hhno.setSelection(hhno.getText().length());

//        Initialize
        db = new DatabaseHelper(this);

//        Checking HH field
        hhno.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                flagHH = false;
                fldGrpMain.setVisibility(View.GONE);
                fldGrpHHExists.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    @OnClick(R.id.checkHHID)
    void onCheckHHIDClick() {
        //TODO implement

        if (!hhno.getText().toString().trim().isEmpty()) {

            hhno.setError(null);
            household = db.getHHListByHH(hhno.getText().toString().toUpperCase());

            fldGrpHHExists.setVisibility(View.VISIBLE);
            hhCount.setText(household.size() + " Households found.");

            if (household.size() != 0) {

                for (HouseholdContract ec : household) {
                    MainApp.householdList.add(new HouseholdContract(ec));
                }

                Toast.makeText(this, "HH Found", Toast.LENGTH_LONG).show();

                flagHH = true;

                fldGrpMain.setVisibility(View.VISIBLE);

//              Set Recycler View
                MainApp.householdList = new ArrayList<>();
                mAdapter = new HouseholdAdapter(MainApp.householdList);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerHouseholds.setLayoutManager(mLayoutManager);
                recyclerHouseholds.setItemAnimator(new DefaultItemAnimator());
                recyclerHouseholds.setAdapter(mAdapter);

                mAdapter.notifyDataSetChanged();


            } else {
                flagHH = false;
                Toast.makeText(this, "No Members Found", Toast.LENGTH_LONG).show();
            }
        } else {
            hhno.setError("This data is Required!");
        }

    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        if (flagHH) {

        } else {
            Toast.makeText(this, "Click on check button", Toast.LENGTH_LONG).show();
        }
    }

//    Recycler classes

    public class HouseholdAdapter extends RecyclerView.Adapter<HouseholdAdapter.MyViewHolder> {

        private List<HouseholdContract> householdList;

        MyViewHolder holder;

        public HouseholdAdapter(List<HouseholdContract> householdList) {
            this.householdList = householdList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.householdlist, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            this.holder = holder;
            this.holder.bindUser(this.householdList.get(position));
        }

        @Override
        public int getItemCount() {
            return householdList.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            @BindView(R.id.hhID)
            TextView hhID;
            @BindView(R.id.totalMem)
            TextView totalMem;
            @BindView(R.id.viewMembers)
            TextView viewMembers;

            public MyViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }

            public void bindUser(HouseholdContract contact) {
                hhID.setText(contact.getHouseholdID());
                totalMem.setText("Total Members:" + contact.getTotalMem());
            }
        }
    }


}

