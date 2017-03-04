package edu.aku.hassannaqvi.dss_census;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class MembersContract {

    private final String projectName = "DSS Census";
    //private final String surveyType = "SN";
    private String _ID = "";
    private String UID = "";
    private String formDate = ""; // Date
    private String interviewer = ""; // Interviewer
    private String dssID = ""; // DSS ID
    private String istatus = ""; // Interview Status
    private String fmName = "";
    private String fmRHH = "";
    private String fmDssIdF = "";
    private String fmDssIdM = "";
    private String fmMaritalStatus = "";
    private String fmGender = "";
    private String fmEducation = "";
    private String fmOccupation = "";
    private String fmDOB = "";
    private String fmAgeY = "";
    private String fmAgeM = "";
    private String fmAgeD = "";
    private String fmCurStatus = "";
    private String fmCSDate = "";
    private String fmRemarks = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    public MembersContract() {
    }


    public MembersContract Sync(JSONObject jsonObject) throws JSONException {


        // TODO:

        return this;

    }

    public MembersContract Hydrate(Cursor cursor) {

        // TODO:
        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();


        // TODO:

        return json;
    }

    public static abstract class singleMember implements BaseColumns {

        public static final String TABLE_NAME = "members";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";

        // TODO:
    }
}
