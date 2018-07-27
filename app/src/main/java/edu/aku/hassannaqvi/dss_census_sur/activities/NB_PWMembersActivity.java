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

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.dss_census_sur.R;
import edu.aku.hassannaqvi.dss_census_sur.contracts.EventsContract;
import edu.aku.hassannaqvi.dss_census_sur.core.MainApp;
import ru.whalemare.sheetmenu.SheetMenu;

public class NB_PWMembersActivity extends AppCompatActivity {

    static int type = 0;
    @BindView(R.id.recycler_noMembers)
    RecyclerView recycler_noMembers;
    @BindView(R.id.btn_addMember)
    FloatingActionButton btn_addMember;
    eventsAdapter mAdapter;
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

        if (type == 0) {
            type = getIntent().getIntExtra("type", 0);
        }

        collapsingToolbar.setTitle(type == 1 ? "PREGNANT WOMENS FOLLOW UP" : "NEW BORNS FOLLOW UP");

//        Set Recycler View
        mAdapter = new eventsAdapter(EventsListActivity.eventsList);
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

                                if (type == 1) {
                                    startActivity(new Intent(getApplicationContext(), PWAssessmentActivity.class)
                                            .putExtra("position", position)
                                            .putExtra("followUpData", EventsListActivity.eventsList.get(position)));
                                } else {
                                    startActivity(new Intent(getApplicationContext(), NewBornAssessmentActivity.class)
                                            .putExtra("position", position)
                                            .putExtra("followUpData", EventsListActivity.eventsList.get(position)));
                                }

                            }
                        }
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

                        SheetMenu.with(NB_PWMembersActivity.this)
                                .setTitle("Select Option")
                                .setMenu(R.menu.activity_menu_nb_pw)
                                .setAutoCancel(true)
                                .setClick(new MenuItem.OnMenuItemClickListener() {
                                    @Override
                                    public boolean onMenuItemClick(MenuItem item) {

                                        progress = 0;
                                        progressStatus = 0;
                                        progressDialog.setVisibility(View.GONE);

                                        if (item.getItemId() == R.id.next_activity) {
                                            if (EventsListActivity.eventsList.size() == EventsListActivity.memFlag) {

                                                showDialog(false, "Are you sure to proceed?");

                                            } else {
                                                Toast.makeText(NB_PWMembersActivity.this, "Please update all members.", Toast.LENGTH_SHORT).show();
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
                NB_PWMembersActivity.this);
        alertDialogBuilder
                .setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {

                                type = 0;

                                finish();
                                startActivity(new Intent(NB_PWMembersActivity.this, EventsListActivity.class).putExtra("check", flag));

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

    public class eventsAdapter extends RecyclerView.Adapter<eventsAdapter.MyViewHolder> {

        private List<EventsContract> familyMembersList;

        public eventsAdapter(List<EventsContract> familyMembersList) {
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
            EventsContract familyMembers = EventsListActivity.eventsList.get(position);
            holder.memberName.setText(familyMembers.getName().toUpperCase());
            holder.DSSidm.setText(familyMembers.getDss_id_member());
            holder.memberType.setText(checkCurrentStatus(familyMembers.getStatus()));
            holder.currentStatus.setText("");
            holder.year.setText(familyMembers.getStatus().equals("1") ? "LMP: " + familyMembers.getLmp_dt() : "Birth:" + familyMembers.getStatus_date());
        }

        public String checkCurrentStatus(String currStatus) {

            if (currStatus.equals("1")) {
                return "Pregnant Women";
            } else {
                return "New Born Child";
            }
        }

        @Override
        public int getItemCount() {

            return familyMembersList.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView memberName, DSSidm, year, currentStatus, memberType;

            public MyViewHolder(View view) {
                super(view);
                this.memberName = view.findViewById(R.id.memberName);
                this.DSSidm = view.findViewById(R.id.DSSid);
                this.currentStatus = view.findViewById(R.id.currentStatus);
                this.memberType = view.findViewById(R.id.memberType);
                year = view.findViewById(R.id.year);
            }
        }
    }

}
