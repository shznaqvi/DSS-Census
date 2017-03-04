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
    private String _UID = "";
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
        this._ID= jsonObject.getString(singleForm.COLUMN_ID);
        this._UID= jsonObject.getString(singleForm.COLUMN_UID);
        this.DSSID= jsonObject.getString(singleForm.COLUMN_DSSID);
        this.formDate= jsonObject.getString(singleForm.COLUMN_FORMDATE);
        this.interviewer= jsonObject.getString(singleForm.COLUMN_INTERVIEWER);
        this.areacode= jsonObject.getString(singleForm.COLUMN_AREACODE);
        this.subareacode= jsonObject.getString(singleForm.COLUMN_SUBAREACODE);
        this.household= jsonObject.getString(singleForm.COLUMN_HOUSEHOLD);
        this.istatus= jsonObject.getString(singleForm.COLUMN_ISTATUS);
        this.sA= jsonObject.getString(singleForm.COLUMN_SA);
        this.sD= jsonObject.getString(singleForm.COLUMN_SD);
        this.sE= jsonObject.getString(singleForm.COLUMN_SE);
        this.sF= jsonObject.getString(singleForm.COLUMN_SF);
        this.sG= jsonObject.getString(singleForm.COLUMN_SG);
        this.sH= jsonObject.getString(singleForm.COLUMN_SH);
        this.sI= jsonObject.getString(singleForm.COLUMN_SI);
        this.sJ= jsonObject.getString(singleForm.COLUMN_SJ);
        this.sK= jsonObject.getString(singleForm.COLUMN_SK);
        this.sL= jsonObject.getString(singleForm.COLUMN_SL);
        this.sM= jsonObject.getString(singleForm.COLUMN_SM);
        this.gpsLat= jsonObject.getString(singleForm.COLUMN_GPSLAT);
        this.gpsLng= jsonObject.getString(singleForm.COLUMN_GPSLNG);
        this.gpsTime= jsonObject.getString(singleForm.COLUMN_GPSTIME);
        this.gpsAcc= jsonObject.getString(singleForm.COLUMN_GPSACC);
        this.deviceID= jsonObject.getString(singleForm.COLUMN_DEVICEID);
        this.synced= jsonObject.getString(singleForm.COLUMN_SYNCED);
        this.synced_date= jsonObject.getString(singleForm.COLUMN_SYNCED_DATE);

        return this;

    }

    public FormsContract Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_UID));
        this.DSSID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_DSSID));
        this.formDate = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_FORMDATE));
        this.interviewer = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_INTERVIEWER));
        this.areacode = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_AREACODE));
        this.subareacode = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SUBAREACODE));
        this.household = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_HOUSEHOLD));
        this.istatus = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_ISTATUS));
        this.sA = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SA));
        this.sD = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SG));
        this.sH = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SH));
        this.sI = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SI));
        this.sJ = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SJ));
        this.sK = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SK));
        this.sL = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SL));
        this.sM = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SM));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSLNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSTIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_DEVICEID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED_DATE));

        // TODO:

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleForm.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleForm.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(singleForm.COLUMN_DSSID, this.DSSID == null ? JSONObject.NULL : this.DSSID);
        json.put(singleForm.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(singleForm.COLUMN_INTERVIEWER, this.interviewer == null ? JSONObject.NULL : this.interviewer);
        json.put(singleForm.COLUMN_AREACODE, this.areacode == null ? JSONObject.NULL : this.areacode);
        json.put(singleForm.COLUMN_SUBAREACODE, this.subareacode == null ? JSONObject.NULL : this.subareacode);
        json.put(singleForm.COLUMN_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(singleForm.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(singleForm.COLUMN_SA, this.sA == null ? JSONObject.NULL : this.sA);
        json.put(singleForm.COLUMN_SD, this.sD == null ? JSONObject.NULL : this.sD);
        json.put(singleForm.COLUMN_SE, this.sE == null ? JSONObject.NULL : this.sE);
        json.put(singleForm.COLUMN_SF, this.sF == null ? JSONObject.NULL : this.sF);
        json.put(singleForm.COLUMN_SG, this.sG == null ? JSONObject.NULL : this.sG);
        json.put(singleForm.COLUMN_SH, this.sH == null ? JSONObject.NULL : this.sH);
        json.put(singleForm.COLUMN_SI, this.sI == null ? JSONObject.NULL : this.sI);
        json.put(singleForm.COLUMN_SJ, this.sJ == null ? JSONObject.NULL : this.sJ);
        json.put(singleForm.COLUMN_SK, this.sK == null ? JSONObject.NULL : this.sK);
        json.put(singleForm.COLUMN_SL, this.sL == null ? JSONObject.NULL : this.sL);
        json.put(singleForm.COLUMN_SM, this.sM == null ? JSONObject.NULL : this.sM);
        json.put(singleForm.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleForm.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleForm.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(singleForm.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleForm.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleForm.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleForm.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_DSSID = "dssid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_INTERVIEWER = "interviewer";
        public static final String COLUMN_AREACODE = "areacode";
        public static final String COLUMN_SUBAREACODE = "subareacode";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";
        public static final String COLUMN_SH = "sh";
        public static final String COLUMN_SI = "si";
        public static final String COLUMN_SJ = "sj";
        public static final String COLUMN_SK = "sk";
        public static final String COLUMN_SL = "sl";
        public static final String COLUMN_SM = "sm";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
    }
}
