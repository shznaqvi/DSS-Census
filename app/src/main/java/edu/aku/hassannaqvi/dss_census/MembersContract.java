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
    private String _UID = "";
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

        this._ID= jsonObject.getString(singleMember.COLUMN_ID);
        this._UID= jsonObject.getString(singleMember.COLUMN_UID);
        this.formDate= jsonObject.getString(singleMember.COLUMN_FORMDATE);
        this.interviewer= jsonObject.getString(singleMember.COLUMN_INTERVIEWER);
        this.dssID= jsonObject.getString(singleMember.COLUMN_DSSID);
        this.istatus= jsonObject.getString(singleMember.COLUMN_ISTATUS);
        this.fmName= jsonObject.getString(singleMember.COLUMN_FMNAME);
        this.fmRHH= jsonObject.getString(singleMember.COLUMN_FMRHH);
        this.fmDssIdF= jsonObject.getString(singleMember.COLUMN_FMDSSIDF);
        this.fmDssIdM= jsonObject.getString(singleMember.COLUMN_FMDSSIDM);
        this.fmMaritalStatus= jsonObject.getString(singleMember.COLUMN_FMMARITALSTATUS);
        this.fmGender= jsonObject.getString(singleMember.COLUMN_FMGENDER);
        this.fmEducation= jsonObject.getString(singleMember.COLUMN_FMEDUCATION);
        this.fmOccupation= jsonObject.getString(singleMember.COLUMN_FMOCCUPATION);
        this.fmDOB= jsonObject.getString(singleMember.COLUMN_FMDOB);
        this.fmAgeY= jsonObject.getString(singleMember.COLUMN_FMAGEY);
        this.fmAgeM= jsonObject.getString(singleMember.COLUMN_FMAGEM);
        this.fmAgeD= jsonObject.getString(singleMember.COLUMN_FMAGED);
        this.fmCurStatus= jsonObject.getString(singleMember.COLUMN_FMCURSTATUS);
        this.fmCSDate= jsonObject.getString(singleMember.COLUMN_FMCSDATE);
        this.fmRemarks= jsonObject.getString(singleMember.COLUMN_FMREMARKS);
        this.gpsLat= jsonObject.getString(singleMember.COLUMN_GPSLAT);
        this.gpsLng= jsonObject.getString(singleMember.COLUMN_GPSLNG);
        this.gpsTime= jsonObject.getString(singleMember.COLUMN_GPSTIME);
        this.gpsAcc= jsonObject.getString(singleMember.COLUMN_GPSACC);
        this.deviceID= jsonObject.getString(singleMember.COLUMN_DEVICEID);
        this.synced= jsonObject.getString(singleMember.COLUMN_SYNCED);
        this.synced_date= jsonObject.getString(singleMember.COLUMN_SYNCED_DATE);


        return this;

    }

    public MembersContract Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FORMDATE));
        this.interviewer = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_INTERVIEWER));
        this.dssID = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_DSSID));
        this.istatus = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_ISTATUS));
        this.fmName = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMNAME));
        this.fmRHH = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMRHH));
        this.fmDssIdF = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMDSSIDF));
        this.fmDssIdM = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMDSSIDM));
        this.fmMaritalStatus = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMMARITALSTATUS));
        this.fmGender = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMGENDER));
        this.fmEducation = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMEDUCATION));
        this.fmOccupation = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMOCCUPATION));
        this.fmDOB = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMDOB));
        this.fmAgeY = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMAGEY));
        this.fmAgeM = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMAGEM));
        this.fmAgeD = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMAGED));
        this.fmCurStatus = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMCURSTATUS));
        this.fmCSDate = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMCSDATE));
        this.fmRemarks = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_FMREMARKS));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_GPSLNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_GPSTIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_DEVICEID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleMember.COLUMN_SYNCED_DATE));

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleMember.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleMember.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(singleMember.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(singleMember.COLUMN_INTERVIEWER, this.interviewer == null ? JSONObject.NULL : this.interviewer);
        json.put(singleMember.COLUMN_DSSID, this.dssID == null ? JSONObject.NULL : this.dssID);
        json.put(singleMember.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(singleMember.COLUMN_FMNAME, this.fmName == null ? JSONObject.NULL : this.fmName);
        json.put(singleMember.COLUMN_FMRHH, this.fmRHH == null ? JSONObject.NULL : this.fmRHH);
        json.put(singleMember.COLUMN_FMDSSIDF, this.fmDssIdF == null ? JSONObject.NULL : this.fmDssIdF);
        json.put(singleMember.COLUMN_FMDSSIDM, this.fmDssIdM == null ? JSONObject.NULL : this.fmDssIdM);
        json.put(singleMember.COLUMN_FMMARITALSTATUS, this.fmMaritalStatus == null ? JSONObject.NULL : this.fmMaritalStatus);
        json.put(singleMember.COLUMN_FMGENDER, this.fmGender == null ? JSONObject.NULL : this.fmGender);
        json.put(singleMember.COLUMN_FMEDUCATION, this.fmEducation == null ? JSONObject.NULL : this.fmEducation);
        json.put(singleMember.COLUMN_FMOCCUPATION, this.fmOccupation == null ? JSONObject.NULL : this.fmOccupation);
        json.put(singleMember.COLUMN_FMDOB, this.fmDOB == null ? JSONObject.NULL : this.fmDOB);
        json.put(singleMember.COLUMN_FMAGEY, this.fmAgeY == null ? JSONObject.NULL : this.fmAgeY);
        json.put(singleMember.COLUMN_FMAGEM, this.fmAgeM == null ? JSONObject.NULL : this.fmAgeM);
        json.put(singleMember.COLUMN_FMAGED, this.fmAgeD == null ? JSONObject.NULL : this.fmAgeD);
        json.put(singleMember.COLUMN_FMCURSTATUS, this.fmCurStatus == null ? JSONObject.NULL : this.fmCurStatus);
        json.put(singleMember.COLUMN_FMCSDATE, this.fmCSDate == null ? JSONObject.NULL : this.fmCSDate);
        json.put(singleMember.COLUMN_FMREMARKS, this.fmRemarks == null ? JSONObject.NULL : this.fmRemarks);
        json.put(singleMember.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleMember.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleMember.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(singleMember.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleMember.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleMember.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleMember.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public static abstract class singleMember implements BaseColumns {

        public static final String TABLE_NAME = "members";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_INTERVIEWER = "interviewer";
        public static final String COLUMN_DSSID = "dssid";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_FMNAME = "fmname";
        public static final String COLUMN_FMRHH = "fmrhh";
        public static final String COLUMN_FMDSSIDF = "fmdssidf";
        public static final String COLUMN_FMDSSIDM = "fmdssidm";
        public static final String COLUMN_FMMARITALSTATUS = "fmmaritalstatus";
        public static final String COLUMN_FMGENDER = "fmgender";
        public static final String COLUMN_FMEDUCATION = "fmeducation";
        public static final String COLUMN_FMOCCUPATION = "fmoccupation";
        public static final String COLUMN_FMDOB = "fmdob";
        public static final String COLUMN_FMAGEY = "fmagey";
        public static final String COLUMN_FMAGEM = "fmagem";
        public static final String COLUMN_FMAGED = "fmaged";
        public static final String COLUMN_FMCURSTATUS = "fmcurstatus";
        public static final String COLUMN_FMCSDATE = "fmcsdate";
        public static final String COLUMN_FMREMARKS = "fmremarks";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

    }
}
