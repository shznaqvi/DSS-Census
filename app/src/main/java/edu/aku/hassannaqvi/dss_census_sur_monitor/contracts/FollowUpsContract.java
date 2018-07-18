package edu.aku.hassannaqvi.dss_census_sur_monitor.contracts;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class FollowUpsContract implements Serializable {

    private static final String TAG = "FollowUps_CONTRACT";
    String hhID;
    String followUpDt;
    String followUpRound;

    public FollowUpsContract() {
        // Default Constructor
    }

    public FollowUpsContract Sync(JSONObject jsonObject) throws JSONException {
        this.hhID = jsonObject.getString(FollowUpTable.COLUMN_HOUSEHOLDID);
        this.followUpDt = jsonObject.getString(FollowUpTable.COLUMN_FOLLOWUP_DT);
        this.followUpRound = jsonObject.getString(FollowUpTable.COLUMN_FOLLOWUP_ROUND);
        return this;
    }

    public FollowUpsContract hydrate(Cursor cursor) {
        this.hhID = cursor.getString(cursor.getColumnIndex(FollowUpTable.COLUMN_HOUSEHOLDID));
        this.followUpDt = cursor.getString(cursor.getColumnIndex(FollowUpTable.COLUMN_FOLLOWUP_DT));
        this.followUpRound = cursor.getString(cursor.getColumnIndex(FollowUpTable.COLUMN_FOLLOWUP_ROUND));
        return this;
    }

    public String getHhID() {
        return hhID;
    }

    public void setHhID(String hhID) {
        this.hhID = hhID;
    }

    public String getFollowUpDt() {
        return followUpDt;
    }

    public void setFollowUpDt(String followUpDt) {
        this.followUpDt = followUpDt;
    }

    public String getFollowUpRound() {
        return followUpRound;
    }

    public void setFollowUpRound(String followUpRound) {
        this.followUpRound = followUpRound;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(FollowUpTable.COLUMN_HOUSEHOLDID, this.hhID == null ? JSONObject.NULL : this.hhID);
        json.put(FollowUpTable.COLUMN_FOLLOWUP_DT, this.followUpDt == null ? JSONObject.NULL : this.followUpDt);
        json.put(FollowUpTable.COLUMN_FOLLOWUP_ROUND, this.followUpRound == null ? JSONObject.NULL : this.followUpRound);
        return json;
    }


    public static abstract class FollowUpTable implements BaseColumns {

        public static final String TABLE_NAME = "followups";
        public static final String COLUMN_HOUSEHOLDID = "dss_id_st";
        public static final String COLUMN_FOLLOWUP_DT = "visitdt";
        public static final String COLUMN_FOLLOWUP_ROUND = "surround";

        public static final String _URI = "surfup.php";
    }
}