package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.MembersContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;

public class FamilyMembersActivity extends Activity {

    @BindView(R.id.recycler_noMembers)
    RecyclerView recycler_noMembers;
    /*    @BindView(R.id.btn_Continue)
        Button btn_Continue;*/
    @BindView(R.id.btn_addMember)
    FloatingActionButton btn_addMember;
    /*    @BindView(R.id.btn_End)
        Button btn_End;*/
    familyMembersAdapter mAdapter;

/*    @BindView(R.id.TotalMem)
    TextView totalMem;
    @BindView(R.id.TotalChild)
    TextView totalChild;
    @BindView(R.id.countMen)
    TextView countMen;
    @BindView(R.id.countFemale)
    TextView countFemale;
    @BindView(R.id.countBoy)
    TextView countBoy;
    @BindView(R.id.countGirl)
    TextView countGirl;*/

    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;

    @BindView(R.id.progress)
    ProgressBar progressDialog;

    static int progress = 0;
    int progressStatus = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members_new);
        ButterKnife.bind(this);

        collapsingToolbar.setTitle("FAMILY MEMBERS");

//        Setting

        /*totalMem.setText(String.valueOf(MainApp.NoMembersCount));
        totalChild.setText(String.valueOf(MainApp.totalChild));
        countMen.setText(String.valueOf(MainApp.NoMaleCount));
        countFemale.setText(String.valueOf(MainApp.NoFemaleCount));
        countBoy.setText(String.valueOf(MainApp.NoBoyCount));
        countGirl.setText(String.valueOf(MainApp.NoGirlCount));*/

        //Set Enable for Next Section
        if (MainApp.familyMembersList.size() == MainApp.memFlag) {
            btn_addMember.setEnabled(true);
        } else {
//            btn_Continue.setEnabled(false);
            btn_addMember.setEnabled(false);
        }

//        Set Recycler View
        mAdapter = new familyMembersAdapter(MainApp.familyMembersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_noMembers.setLayoutManager(mLayoutManager);
        recycler_noMembers.setItemAnimator(new DefaultItemAnimator());
        recycler_noMembers.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();

        MainApp.memClicked = new ArrayList<>();

        recycler_noMembers.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        // TODO Handle item click

                        if (position != -1) {
                            boolean flag = true;
                            for (int mem : MainApp.memClicked) {
                                if (mem == position) {
                                    flag = false;
                                    break;
                                }
                            }

                            if (flag) {

                                startActivity(new Intent(getApplicationContext(), SectionBNewPrevActivity.class)
                                        .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                                        .putExtra("dataFlag", true).putExtra("position", position));

                            }
                        }

//                        Toast.makeText(getApplicationContext(),familyMembersList.get(position).getMemberName(),Toast.LENGTH_SHORT).show();
                    }
                })
        );
        for (int item : MainApp.memClicked) {
            recycler_noMembers.getChildAt(item).setBackgroundColor(Color.BLACK);
        }
    }

/*    @OnClick(R.id.addMen)
    void onAddMenClick() {
        //TODO implement

        MainApp.NoMaleCount++;
        countMen.setText(String.valueOf(MainApp.NoMaleCount));

        MainApp.NoMembersCount++;
        totalMem.setText(String.valueOf(MainApp.NoMembersCount));

        resumeWork();
    }

    @OnClick(R.id.minusMen)
    void onMinusMenClick() {
        //TODO implement

        if ((Integer.parseInt(totalMem.getText().toString()) - 1) > 0 && ((MainApp.NoMaleCount > MainApp.NoBoyCount)
                && MainApp.NoMaleCount - (MainApp.TotalMaleCount - MainApp.TotalBoyCount) != MainApp.NoBoyCount)) {
            if (MainApp.NoMaleCount > 0) {
                if (MainApp.TotalMaleCount >= MainApp.NoMaleCount || (MainApp.TotalMaleCount >= (MainApp.NoMaleCount - MainApp.NoBoyCount))) {
                    MainApp.errorCheck(this, "Men's can't decrease.");
                } else {
                    MainApp.NoMaleCount--;
                    countMen.setText(String.valueOf(MainApp.NoMaleCount));
                    MainApp.NoMembersCount--;
                    totalMem.setText(String.valueOf(MainApp.NoMembersCount));
                }
                resumeWork();
            }
        }

    }

    @OnClick(R.id.addFemale)
    void onAddWomenClick() {
        //TODO implement

        MainApp.NoFemaleCount++;
        countFemale.setText(String.valueOf(MainApp.NoFemaleCount));

        MainApp.NoMembersCount++;
        totalMem.setText(String.valueOf(MainApp.NoMembersCount));

        resumeWork();
    }

    @OnClick(R.id.minusFemale)
    void onMinusWomenClick() {
        //TODO implement

//        if ((Integer.parseInt(totalMem.getText().toString()) - 1) > 0 && ((MainApp.NoFemaleCount) > MainApp.NoGirlCount) || MainApp.NoGirlCount == 0) {
        if ((Integer.parseInt(totalMem.getText().toString()) - 1) > 0 && ((MainApp.NoFemaleCount > MainApp.NoGirlCount)
                && MainApp.NoFemaleCount - (MainApp.TotalFemaleCount - MainApp.TotalGirlCount) != MainApp.NoGirlCount)) {
            if (MainApp.NoFemaleCount > 0) {
                if (MainApp.TotalFemaleCount >= MainApp.NoFemaleCount || (MainApp.TotalFemaleCount >= (MainApp.NoFemaleCount - MainApp.NoGirlCount))) {
                    MainApp.errorCheck(this, "Women's can't decrease.");
                } else {
                    MainApp.NoFemaleCount--;
                    countFemale.setText(String.valueOf(MainApp.NoFemaleCount));
                    MainApp.NoMembersCount--;
                    totalMem.setText(String.valueOf(MainApp.NoMembersCount));
                }

                resumeWork();
            }
        }
    }

    @OnClick(R.id.addBoy)
    void onAddBoyClick() {
        //TODO implement

        MainApp.NoBoyCount++;
        countBoy.setText(String.valueOf(MainApp.NoBoyCount));

        MainApp.NoMembersCount++;
        MainApp.NoMaleCount++;
        MainApp.totalChild++;
        countMen.setText(String.valueOf(MainApp.NoMaleCount));
        totalMem.setText(String.valueOf(MainApp.NoMembersCount));
        totalChild.setText(String.valueOf(MainApp.totalChild));
        resumeWork();
    }

    @OnClick(R.id.minusBoy)
    void onMinusBoyClick() {
        //TODO implement

        if ((Integer.parseInt(totalMem.getText().toString()) - 1) > 0) {
            if (MainApp.NoBoyCount > 0) {
                if (MainApp.TotalBoyCount >= MainApp.NoBoyCount) {
                    MainApp.errorCheck(this, "You have already added:" + MainApp.NoBoyCount + " Boys");
                } else {

                    if (!(MainApp.TotalMaleCount >= MainApp.NoMaleCount)) {
                        MainApp.NoMaleCount--;
                        MainApp.NoBoyCount--;
                        countBoy.setText(String.valueOf(MainApp.NoBoyCount));
                        countMen.setText(String.valueOf(MainApp.NoMaleCount));
                        MainApp.NoMembersCount--;
                        MainApp.totalChild--;
                        totalMem.setText(String.valueOf(MainApp.NoMembersCount));
                        totalChild.setText(String.valueOf(MainApp.totalChild));
                    } else {
                        MainApp.NoBoyCount--;
                        countBoy.setText(String.valueOf(MainApp.NoBoyCount));
                        MainApp.totalChild--;
                        totalChild.setText(String.valueOf(MainApp.totalChild));
                    }
                }

                resumeWork();
            }
        }
    }

    @OnClick(R.id.addGirl)
    void onAddGirlClick() {
        //TODO implement

        MainApp.NoGirlCount++;
        countGirl.setText(String.valueOf(MainApp.NoGirlCount));

        MainApp.NoMembersCount++;
        MainApp.NoFemaleCount++;
        MainApp.totalChild++;
        countFemale.setText(String.valueOf(MainApp.NoFemaleCount));
        totalMem.setText(String.valueOf(MainApp.NoMembersCount));
        totalChild.setText(String.valueOf(MainApp.totalChild));

        resumeWork();
    }

    @OnClick(R.id.minusGirl)
    void onMinusGirlClick() {
        //TODO implement

        if ((Integer.parseInt(totalMem.getText().toString()) - 1) > 0) {
            if (MainApp.NoGirlCount > 0) {
                if (MainApp.TotalGirlCount >= MainApp.NoGirlCount) {
                    MainApp.errorCheck(this, "You have already added:" + MainApp.NoGirlCount + " Girls");
                } else {

                    if (!(MainApp.TotalFemaleCount >= MainApp.NoFemaleCount)) {
                        MainApp.NoFemaleCount--;
                        MainApp.NoGirlCount--;
                        countGirl.setText(String.valueOf(MainApp.NoGirlCount));
                        MainApp.NoMembersCount--;
                        MainApp.totalChild--;
                        countFemale.setText(String.valueOf(MainApp.NoFemaleCount));
                        totalMem.setText(String.valueOf(MainApp.NoMembersCount));
                        totalChild.setText(String.valueOf(MainApp.totalChild));
                    } else {
                        MainApp.NoGirlCount--;
                        countGirl.setText(String.valueOf(MainApp.NoGirlCount));
                        MainApp.totalChild--;
                        totalChild.setText(String.valueOf(MainApp.totalChild));
                    }
                }

                resumeWork();
            }
        }
    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        finish();

        try {
            saveDT();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        MainApp.memClicked.clear();
        MainApp.insertMem.clear();

//        startActivity(new Intent(this, SectionDActivity.class));
        startActivity(new Intent(this, EndingActivity.class).putExtra("check", true));

    }*/

    public void saveDT() throws JSONException {
        JSONObject sG = new JSONObject();
/*
        sG.put("dca0701", totalMem.getText().toString());
        sG.put("dca0702", countMen.getText().toString());
        sG.put("dca0703", countFemale.getText().toString());
        sG.put("dca0801", totalChild.getText().toString());
        sG.put("dca0802", countBoy.getText().toString());
        sG.put("dca0803", countGirl.getText().toString());
*/

        MainApp.fc.setsG(String.valueOf(sG));

        DatabaseHelper db = new DatabaseHelper(this);
        db.updateSA();
    }

    @OnClick(R.id.btn_addMember)
    void onBtnAddMemberClick() {

//        MainApp.memFlag++;

/*        MainApp.memClicked.add(MainApp.TotalMembersCount++);

        startActivity(new Intent(this, SectionBActivity.class)
                .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount - 1));*/

        progressDialog.setVisibility(View.VISIBLE);

        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 100) {
                    progressStatus = doSomeWork();
                    handler.post(new Runnable() {
                        public void run() {
                            progressDialog.setProgress(progressStatus);
                        }
                    });
                }
                handler.post(new Runnable() {
                    public void run() {
//                        MainApp.memClicked.add(MainApp.TotalMembersCount++);

                        MainApp.TotalMembersCount++;
                        startActivity(new Intent(FamilyMembersActivity.this, SectionBActivity.class)
                                .putExtra("followUpData", getIntent().getSerializableExtra("followUpData"))
                                .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount));
                    }
                });
            }

            private int doSomeWork() {
                try {
                    // ---simulate doing some work---
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return ++progress;
            }
        }).start();

    }

    @Override
    protected void onResume() {
        super.onResume();

        progress = 0;
        progressStatus = 0;
        progressDialog.setVisibility(View.GONE);

        /*if (MainApp.selectedPos != -1) {
            for (int mem = 0; mem < MainApp.memClicked.size(); mem++) {
                if (MainApp.memClicked.get(mem) == MainApp.selectedPos) {
                    MainApp.memClicked.remove(mem);
                    break;
                }
            }
        }*/

        resumeWork();

        /*countBoy.setText(String.valueOf(MainApp.NoBoyCount));
        countMen.setText(String.valueOf(MainApp.NoMaleCount));
        countGirl.setText(String.valueOf(MainApp.NoGirlCount));
        countFemale.setText(String.valueOf(MainApp.NoFemaleCount));
        totalMem.setText(String.valueOf(MainApp.NoMembersCount));
        totalChild.setText(String.valueOf(MainApp.totalChild));*/


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                for (int item : MainApp.memClicked) {
                    recycler_noMembers.getChildAt(item).setBackgroundColor(Color.BLACK);
                }
            }
        }, 800);

    }

    public void resumeWork() {
        mAdapter.notifyDataSetChanged();

//        Toast.makeText(this, "Mem checkingFlag:" + MainApp.memFlag, Toast.LENGTH_SHORT).show();

//        Set Enable for Next Section

        if (MainApp.familyMembersList.size() == MainApp.memFlag) {
//            btn_Continue.setEnabled(true);
            btn_addMember.setEnabled(true);

        } else {
//            btn_Continue.setEnabled(false);
            btn_addMember.setEnabled(false);
        }

        /*btn_addMember.setEnabled(true);
        if (MainApp.checkingFlag > 0) {
            btn_Continue.setEnabled(true);
        }*/

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public static class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
        GestureDetector mGestureDetector;
        private OnItemClickListener mListener;

        public RecyclerItemClickListener(Context context, OnItemClickListener listener) {
            mListener = listener;

            mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
            View childView = view.findChildViewUnder(e.getX(), e.getY());
            if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
                mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) {
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }

        public interface OnItemClickListener {
            void onItemClick(View view, int position);
        }
    }

    public class familyMembersAdapter extends RecyclerView.Adapter<familyMembersAdapter.MyViewHolder> {

        private List<MembersContract> familyMembersList;

        public familyMembersAdapter(List<MembersContract> familyMembersList) {
            this.familyMembersList = familyMembersList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.familymemberslist, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
//            familyMembers familyMembers = familyMembersList.get(position);
            MembersContract familyMembers = MainApp.familyMembersList.get(position);
//            holder.memberName.setText(familyMembers.getMemberName().toUpperCase());
//            holder.DSSidm.setText(familyMembers.getDSSid());
//            holder.currentStatus.setText(familyMembers.getcStatus());
            holder.memberName.setText(familyMembers.getName().toUpperCase());

            holder.DSSidm.setText(familyMembers.getDss_id_member());
            holder.memberType.setText(familyMembers.getMember_type().equals("mw") ? "(Married Women)" : familyMembers.getMember_type().equals("h") ? "(Husband)" :
                    (familyMembers.getMember_type().equals("c") || familyMembers.getMember_type().equals("ch")) ? "(Child)" : "(Other)");

            holder.currentStatus.setText(checkCurrentStatus(familyMembers.getCurrent_status()));
//            holder.year.setText(familyMembers.getAge().equals("y m d") ? familyMembers.getDob() : familyMembers.getAge());
            holder.year.setText(familyMembers.getCurrent_date());
        }

        public String checkCurrentStatus(String currStatus) {

            String[] st;

            if (currStatus.contains("_")) {
                st = currStatus.split("_");

                return setStatus(Integer.valueOf(st[0]), st[1]);
            } else {
                return setStatus(0, currStatus);
            }
        }

        public String setStatus(int cond, String i) {
            String st = "";
            switch (cond) {
                case 1:
                    switch (i) {
                        case "1":
                            st = getString(R.string.dcbis07a);
                            break;
                        case "2":
                            st = getString(R.string.dcbis07b);
                            break;
                        case "3":
                            st = getString(R.string.dcbis07c);
                            break;
                        case "4":
                            st = getString(R.string.dcbis07d);
                            break;
                    }
                    break;

                case 4:
                    switch (i) {
                        case "1":
                            st = getString(R.string.dcbis04Outa);
                            break;
                        case "2":
                            st = getString(R.string.dcbis04Outb);
                            break;
                        case "3":
                            st = getString(R.string.dcbis04Outc);
                            break;
                        case "4":
                            st = getString(R.string.dcbis04Outd);
                            break;
                    }
                    break;

                default:
                    switch (i) {
                        case "1":
                            st = getString(R.string.dcbis07);
                            break;
                        case "2":
                            st = getString(R.string.dcbis08);
                            break;
                        case "3":
                            st = getString(R.string.dcbis03);
                            break;
                        case "4":
                            st = getString(R.string.dcbis09);
                            break;
                        case "5":
                            st = getString(R.string.dcbis05);
                            break;
                        case "6":
                            st = getString(R.string.dcbis04);
                            break;
                        case "7":
                            st = getString(R.string.dcbis06);
                            break;
                        case "8":
                            st = getString(R.string.dcbis01);
                            break;
                        case "9":
                            st = getString(R.string.dcbis02);
                            break;
                        case "10":
                            st = getString(R.string.dcbist01);
                            break;
                    }
                    break;
            }

            return st;
        }

        @Override
        public int getItemCount() {

            return familyMembersList.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView memberName, DSSidm, year, currentStatus, memberType;

            public MyViewHolder(View view) {
                super(view);
                this.memberName = (TextView) view.findViewById(R.id.memberName);
                this.DSSidm = (TextView) view.findViewById(R.id.DSSid);
                this.currentStatus = (TextView) view.findViewById(R.id.currentStatus);
                this.memberType = (TextView) view.findViewById(R.id.memberType);
                year = (TextView) view.findViewById(R.id.year);
            }
        }
    }

}
