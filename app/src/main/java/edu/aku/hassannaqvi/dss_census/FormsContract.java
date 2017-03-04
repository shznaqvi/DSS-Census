package edu.aku.hassannaqvi.dss_census;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    private final String projectName = "DSS Census";
    //private final String surveyType = "SN";
    private String _ID = "";
    private String UID = "";
    private String DSSID = "";
    private String formDate = ""; // Date
    private String interviewer = ""; // Interviewer
    private String areacode = "0000"; // Area Code
    private String subareacode = ""; // Cluster
    private String household = ""; // Household number

    private String istatus = ""; // Interview Status
    private String sA = "";
    //private String sB = ""; // commented out for Members
    //private String sC = ""; // Commented out for Deceased
    private String sD = "";
    private String sE = "";
    private String sF = "";
    private String sG = "";
    private String sH = "";
    private String sI = "";
    private String sJ = "";
    private String sK = "";
    private String sL = "";
    private String sM = "";


    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }



    public FormsContract Sync(JSONObject jsonObject) throws JSONException {

        // TODO:
        return this;

    }

    public FormsContract Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleForm._ID));
        // TODO:

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleForm._ID, this._ID == null ? JSONObject.NULL : this._ID);
        //TODO:

        return json;
    }

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";


    }
}
