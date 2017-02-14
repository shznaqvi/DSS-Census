package edu.aku.hassannaqvi.dss_census;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FamilyMembersActivity extends Activity  {

//    @BindView(R.id.activity_family_members) RelativeLayout activityFamilyMembers;
//    @BindView(R.id.lst_noMembers) ListView lstNoMembers;


    private List<familyMembers> familyMembersList = new ArrayList<>();
//    private RecyclerView recycler_noMembers;
    private familyMembersAdapter mAdapter;

    String[] mStatus = {"Single","Married","Divorced"};
    String[] gender = {"Male","Female"};

    @BindView(R.id.recycler_noMembers)
    RecyclerView recycler_noMembers;

    @BindView(R.id.btn_Continue)
    Button btn_Continue;

    @BindView(R.id.btn_End)
    Button btn_End;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        ButterKnife.bind(this);

//        final List<String> Members = new ArrayList<>();

//        lstNoMembers.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.lstview, Members));
//
//        lstNoMembers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
//                Intent i = new Intent(getApplicationContext(), SectionBActivity.class);
//
//                i.putExtra("memberName",Members.get(position));
//                i.putExtra("position",position + 1);
//
//                startActivity(i);
//            }
//        });

//        Set Recycler View

        mAdapter = new familyMembersAdapter(familyMembersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_noMembers.setLayoutManager(mLayoutManager);
        recycler_noMembers.setItemAnimator(new DefaultItemAnimator());
        recycler_noMembers.setAdapter(mAdapter);

        for (byte i=0;i<MainApp.NoMembers;i++){

            familyMembersList.add(new familyMembers("Member "+(i+1),""+ mStatus[new Random().nextInt(mStatus.length)],"none"
                    ,""+gender[new Random().nextInt(gender.length)]));
        }

        mAdapter.notifyDataSetChanged();

        recycler_noMembers.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // TODO Handle item click

                        Intent i = new Intent(getApplicationContext(), SectionBActivity.class);
                        i.putExtra("memberName", familyMembersList.get(position).getMemberName());
                        i.putExtra("position", position + 1);

                        startActivity(i);

//                        Toast.makeText(getApplicationContext(),familyMembersList.get(position).getMemberName(),Toast.LENGTH_SHORT).show();
                    }
                })
        );

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
       /* if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, MainActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */

    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        startActivity(new Intent(this,SectionCActivity.class));

    }

    @OnClick(R.id.btn_addMember)
    void onBtnAddMemberClick() {

        startActivity(new Intent(this,SectionBActivity.class));

    }

    @Override
    protected void onResume() {
        super.onResume();

//        Death Members

//        for (MainApp.deadMemberClass curVal : MainApp.deadMembers){
//            lstNoMembers.getChildAt(curVal.position - 1).setBackgroundColor(getResources().getColor(R.color.gray));
//        }
    }

    public class familyMembersAdapter extends RecyclerView.Adapter<familyMembersAdapter.MyViewHolder> {

        private List<familyMembers> familyMembersList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView memberName, martialStatus, year, currentStatus;

            public MyViewHolder(View view) {
                super(view);
                this.memberName = (TextView) view.findViewById(R.id.memberName);
                this.martialStatus = (TextView) view.findViewById(R.id.martialStatus);
                this.currentStatus = (TextView) view.findViewById(R.id.currentStatus);
                year = (TextView) view.findViewById(R.id.year);
            }
        }


        public familyMembersAdapter(List<familyMembers> familyMembersList) {
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
            familyMembers familyMembers = familyMembersList.get(position);
            holder.memberName.setText(familyMembers.getMemberName());
            holder.martialStatus.setText(familyMembers.getmStatus());
            holder.currentStatus.setText(familyMembers.getcStatus());
            holder.year.setText(familyMembers.getDob());
        }

        @Override
        public int getItemCount() {
            return familyMembersList.size();
        }
    }

    public static class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
        private OnItemClickListener mListener;

        public interface OnItemClickListener {
            void onItemClick(View view, int position);
        }

        GestureDetector mGestureDetector;

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
    }
}
