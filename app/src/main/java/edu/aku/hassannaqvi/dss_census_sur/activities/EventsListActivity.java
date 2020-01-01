package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
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

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.EventsContract;
import edu.aku.hassannaqvi.dss_census_sur.contracts.HouseholdContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

public class EventsListActivity extends AppCompatActivity {

    //  Static variables
    static List<Integer> hhClicked;
    static String hhID = "";
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
    @BindView(R.id.btn_End)
    Button btn_End;
    /*Variables*/
    Collection<HouseholdContract> household;
    DatabaseHelper db;
    HouseholdAdapter mAdapter;
    //  Flag for checking HH field
    Boolean flagHH = false;

    public static ArrayList<EventsContract> eventsList;
    public static int memFlag;
    static int typeFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
        ButterKnife.bind(this);

        this.setTitle("D S S");

//        Set Region DssIDD
        hhno.setText(MainApp.regionDss);

//        Initialize
        db = new DatabaseHelper(this);
        memFlag = 0;
        MainApp.memClicked = new ArrayList<>();

        //get this intent 'TRUE' from endActivity
        if (getIntent().getBooleanExtra("check", true)) {
            hhClicked = new ArrayList<>();
            typeFilter = getIntent().getIntExtra("type", 0);
        } else {
            hhno.setText(hhID);
            hhno.setEnabled(false);
            fldGrpMain.setVisibility(View.VISIBLE);
            new populateRecyclerView(this).execute();

        }

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

//        Recycler click listener
        recyclerHouseholds.addOnItemTouchListener(
                new FamilyMembersActivity.RecyclerItemClickListener(getApplicationContext(), new FamilyMembersActivity.RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, final int position) {
                        // TODO Handle item click

                        if (position != -1) {
                            boolean flag = true;
                            for (int hh : hhClicked) {
                                if (hh == position) {
                                    flag = false;
                                    break;
                                }
                            }

                            if (flag) {
                                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                                        EventsListActivity.this);
                                alertDialogBuilder
                                        .setMessage("Are you sure to go in this Household")
                                        .setCancelable(false)
                                        .setPositiveButton("Ok",
                                                new DialogInterface.OnClickListener() {
                                                    public void onClick(DialogInterface dialog,
                                                                        int id) {

                                                        hhClicked.add(position);
                                                        for (int item : hhClicked) {
                                                            recyclerHouseholds.getChildAt(item).setBackgroundColor(Color.BLACK);
                                                        }

                                                        new Thread(new Runnable() {
                                                            @Override
                                                            public void run() {

                                                                eventsList = new ArrayList<>();

                                                                Collection<EventsContract> events = db.getMembersByEvents(MainApp.householdList.get(position).getHouseholdID(),
                                                                        String.valueOf(typeFilter));

                                                                for (EventsContract ec : events) {
                                                                    eventsList.add(new EventsContract(ec));
                                                                }

                                                                finish();
                                                                startActivity(new Intent(getApplicationContext(), NB_PWMembersActivity.class)
                                                                        .putExtra("type", typeFilter));

                                                            }
                                                        }).start();

                                                    }
                                                });
                                alertDialogBuilder.setNegativeButton("Cancel",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                dialog.cancel();
                                            }
                                        });
                                AlertDialog alert = alertDialogBuilder.create();
                                alert.show();
                            }
                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                })
        );

    }

    @OnClick(R.id.checkHHID)
    void onCheckHHIDClick() {
        //TODO implement

        if (!hhno.getText().toString().trim().isEmpty()) {
            if (hhno.getText().toString().length() == 9) {

                hhno.setError(null);
                household = db.getHHListByHHForMem(hhno.getText().toString().toUpperCase(), String.valueOf(typeFilter));

                MainApp.householdList = new ArrayList<>();

                if (household.size() != 0) {

                    fldGrpHHExists.setVisibility(View.VISIBLE);
                    hhCount.setText("Follow up found \n" + household.size() + " Households found.");

                    for (HouseholdContract ec : household) {
                        MainApp.householdList.add(new HouseholdContract(ec));
                    }

                    flagHH = true;

                    hhID = hhno.getText().toString();

                    fldGrpMain.setVisibility(View.VISIBLE);

                    new populateRecyclerView(this).execute();

                } else {
                    flagHH = false;
                    Toast.makeText(this, "Not Found", Toast.LENGTH_LONG).show();
                }

            } else {
                hhno.setError("Invalid DSS-ID!!");
            }
        } else {
            hhno.setError("This data is Required!");
        }
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                EventsListActivity.this);
        alertDialogBuilder
                .setMessage("Do you want to EXIT??")
                .setCancelable(false)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                finish();
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        });
        alertDialogBuilder.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    @Override
    public void onBackPressed() {
        if (getIntent().getBooleanExtra("check", true)) {
            super.onBackPressed();
        } else {
            Toast.makeText(this, "Press End Button!!", Toast.LENGTH_SHORT).show();
        }
    }

    //    Recycler classes
    public class HouseholdAdapter extends RecyclerView.Adapter<HouseholdAdapter.MyViewHolder> {

        MyViewHolder holder;
        private List<HouseholdContract> householdList;

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

    public class populateRecyclerView extends AsyncTask<String, String, String> {
        private Context mContext;

        public populateRecyclerView(Context mContext) {
            this.mContext = mContext;
        }

        @Override
        protected String doInBackground(String... strings) {
            runOnUiThread(new Runnable() {

                @Override
                public void run() {

//              Set Recycler View
                    mAdapter = new HouseholdAdapter(MainApp.householdList);
                    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerHouseholds.setLayoutManager(mLayoutManager);
                    recyclerHouseholds.setItemAnimator(new DefaultItemAnimator());
                    recyclerHouseholds.setAdapter(mAdapter);

                    mAdapter.notifyDataSetChanged();
                }
            });


            return null;
        }

        @Override
        protected void onPostExecute(String s) {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
//                   Background black for those that's data filled
                    for (int item : hhClicked) {
                        recyclerHouseholds.getChildAt(item).setBackgroundColor(Color.BLACK);
                    }
                }
            }, 800);
        }
    }

}

