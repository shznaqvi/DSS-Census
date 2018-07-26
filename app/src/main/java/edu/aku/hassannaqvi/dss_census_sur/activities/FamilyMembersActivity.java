package edu.aku.hassannaqvi.dss_census_sur.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.MembersContract;
import edu.aku.hassannaqvi.dss_census_sur.core.DatabaseHelper;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import ru.whalemare.sheetmenu.SheetMenu;

public class FamilyMembersActivity extends AppCompatActivity {

    @BindView(R.id.recycler_noMembers)
    RecyclerView recycler_noMembers;
    @BindView(R.id.btn_addMember)
    FloatingActionButton btn_addMember;
    familyMembersAdapter mAdapter;


    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;

    @BindView(R.id.progress)
    ProgressBar progressDialog;

    int progress = 0;
    int progressStatus = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members_new);
        ButterKnife.bind(this);

        collapsingToolbar.setTitle("FAMILY MEMBERS");

//        Set Recycler View
        mAdapter = new familyMembersAdapter(MainApp.familyMembersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_noMembers.setLayoutManager(mLayoutManager);
        recycler_noMembers.setItemAnimator(new DefaultItemAnimator());
        recycler_noMembers.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();

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
                                        .putExtra("followUpData", SectionAActivity.fp)
                                        .putExtra("dataFlag", true).putExtra("position", position));

                            }
                        }

//                        Toast.makeText(getApplicationContext(),familyMembersList.get(position).getMemberName(),Toast.LENGTH_SHORT).show();
                    }
                })
        );

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                for (int item : MainApp.memClicked) {
                    recycler_noMembers.getChildAt(item).setBackgroundColor(Color.BLACK);
                }
            }
        }, 1200);
    }

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

                        SheetMenu.with(FamilyMembersActivity.this)
                                .setTitle("Select Option")
                                .setMenu(R.menu.activity_menu)
                                .setAutoCancel(true)
                                .setClick(new MenuItem.OnMenuItemClickListener() {
                                    @Override
                                    public boolean onMenuItemClick(MenuItem item) {

                                        progress = 0;
                                        progressStatus = 0;
                                        progressDialog.setVisibility(View.GONE);

                                        if (item.getItemId() == R.id.add_member) {

                                            if (HouseholdListActivity.visitType == 1) {
                                                if (MainApp.familyMembersList.size() == SectionAActivity.memFlag) {
                                                    MainApp.TotalMembersCount++;
                                                    startActivity(new Intent(FamilyMembersActivity.this, SectionBActivity.class)
                                                            .putExtra("followUpData", SectionAActivity.fp)
                                                            .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount));
                                                } else {
                                                    Toast.makeText(FamilyMembersActivity.this, "Please update all members.", Toast.LENGTH_SHORT).show();
                                                }
                                            } else {
                                                MainApp.TotalMembersCount++;
                                                startActivity(new Intent(FamilyMembersActivity.this, SectionBActivity.class)
                                                        .putExtra("followUpData", SectionAActivity.fp)
                                                        .putExtra("dataFlag", false).putExtra("position", MainApp.TotalMembersCount));
                                            }

                                        } else if (item.getItemId() == R.id.next_activity) {

                                            if (HouseholdListActivity.visitType == 1) {
                                                if (MainApp.familyMembersList.size() == SectionAActivity.memFlag) {

                                                    showDialog(true, "Are you sure to proceed?");

                                                } else {
                                                    Toast.makeText(FamilyMembersActivity.this, "Please update all members.", Toast.LENGTH_SHORT).show();
                                                }
                                            } else {
                                                showDialog(true, "Are you sure to proceed?");
                                            }
                                        } else {
                                            showDialog(false, "Are you sure to force exit?");
                                        }

                                        return false;
                                    }
                                }).show();
                    }
                });
            }

            private int doSomeWork() {
                try {
                    // ---simulate doing some work---
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return ++progress;
            }
        }).start();

    }

    public void showDialog(final Boolean flag, final String msg) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                FamilyMembersActivity.this);
        alertDialogBuilder
                .setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {

                                finish();
                                startActivity(new Intent(FamilyMembersActivity.this, EndingActivity.class).putExtra("check", flag));

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
                case 2:
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
                            st = getString(R.string.dcbis05Placea);
                            break;
                        case "2":
                            st = getString(R.string.dcbis05Placeb);
                            break;
                        case "3":
                            st = getString(R.string.dcbis05Placec);
                            break;
                        case "96":
                            st = getString(R.string.dcbis05Place96);
                            break;
                    }
                    break;

                default:
                    switch (i) {
                        case "9":
                            st = getString(R.string.dcbist01);
                            break;
                        case "1":
                            st = getString(R.string.dcbis07);
                            break;
                        case "2":
                            st = getString(R.string.dcbis03);
                            break;
                        case "3":
                            st = getString(R.string.dcbis05);
                            break;
                        case "4":
                            st = getString(R.string.dcbis01);
                            break;
                        case "5":
                            st = getString(R.string.dcbis02);
                            break;
                        case "6":
                            st = getString(R.string.dcbis04);
                            break;
                        case "7":
                            st = getString(R.string.dcbis10);
                            break;
                        case "8":
                            st = getString(R.string.dcbis11);
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
