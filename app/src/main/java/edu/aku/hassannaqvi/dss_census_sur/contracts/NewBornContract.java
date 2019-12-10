package edu.aku.hassannaqvi.dss_census_sur.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class NewBornContract {

    private final String projectName = "DSS Surveillance - R6";
    private String _ID;
    private String _UID;
    private String dss_id_hh;
    private String formDate;
    private String user;
    private String deviceId;
    private String devicetagID;
    private String dss_id_m;
    private String dss_id_member;
    private String study_id;
    private String name;
    private String sNB;
    private String istatus;
    private String synced;
    private String syncedDate;


    public NewBornContract() {
    }

    public String getProjectName() {
        return projectName;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }

    public String getDss_id_hh() {
        return dss_id_hh;
    }

    public void setDss_id_hh(String dss_id_hh) {
        this.dss_id_hh = dss_id_hh;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }

    public String getDss_id_m() {
        return dss_id_m;
    }

    public void setDss_id_m(String dss_id_m) {
        this.dss_id_m = dss_id_m;
    }

    public String getDss_id_member() {
        return dss_id_member;
    }

    public void setDss_id_member(String dss_id_member) {
        this.dss_id_member = dss_id_member;
    }

    public String getStudy_id() {
        return study_id;
    }

    public void setStudy_id(String study_id) {
        this.study_id = study_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsNB() {
        return sNB;
    }

    public void setsNB(String sNB) {
        this.sNB = sNB;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncedDate() {
        return syncedDate;
    }

    public void setSyncedDate(String syncedDate) {
        this.syncedDate = syncedDate;
    }

    public NewBornContract Sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(newBornFup.COLUMN_ID);
        this._UID = jsonObject.getString(newBornFup.COLUMN_UID);
        this.dss_id_hh = jsonObject.getString(newBornFup.COLUMN_DSS_ID_HH);
        this.formDate = jsonObject.getString(newBornFup.COLUMN_FORMDATE);
        this.user = jsonObject.getString(newBornFup.COLUMN_USER);
        this.deviceId = jsonObject.getString(newBornFup.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(newBornFup.COLUMN_DEVICETAGID);
        this.dss_id_m = jsonObject.getString(newBornFup.COLUMN_DSS_ID_M);
        this.dss_id_member = jsonObject.getString(newBornFup.COLUMN_DSS_ID_MEMBER);
        this.study_id = jsonObject.getString(newBornFup.COLUMN_STUDY_ID);
        this.name = jsonObject.getString(newBornFup.COLUMN_NAME);
        this.sNB = jsonObject.getString(newBornFup.COLUMN_SNB);
        this.istatus = jsonObject.getString(newBornFup.COLUMN_ISTATUS);
        this.synced = jsonObject.getString(newBornFup.COLUMN_SYNCED);
        this.syncedDate = jsonObject.getString(newBornFup.COLUMN_SYNCEDDATE);

        return this;

    }

    public NewBornContract Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_UID));
        this.dss_id_hh = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_DSS_ID_HH));
        this.formDate = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_FORMDATE));
        this.user = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_USER));
        this.deviceId = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_DEVICETAGID));
        this.dss_id_m = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_DSS_ID_M));
        this.dss_id_member = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_DSS_ID_MEMBER));
        this.study_id = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_STUDY_ID));
        this.name = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_NAME));
        this.sNB = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_SNB));
        this.istatus = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_ISTATUS));
/*        this.synced = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_SYNCED));
        this.syncedDate = cursor.getString(cursor.getColumnIndex(newBornFup.COLUMN_SYNCEDDATE));*/

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(newBornFup.COLUMN_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(newBornFup.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(newBornFup.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(newBornFup.COLUMN_DSS_ID_HH, this.dss_id_hh == null ? JSONObject.NULL : this.dss_id_hh);
        json.put(newBornFup.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(newBornFup.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(newBornFup.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
        json.put(newBornFup.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(newBornFup.COLUMN_DSS_ID_M, this.dss_id_m == null ? JSONObject.NULL : this.dss_id_m);
        json.put(newBornFup.COLUMN_DSS_ID_MEMBER, this.dss_id_member == null ? JSONObject.NULL : this.dss_id_member);
        json.put(newBornFup.COLUMN_STUDY_ID, this.study_id == null ? JSONObject.NULL : this.study_id);
        json.put(newBornFup.COLUMN_NAME, this.name == null ? JSONObject.NULL : this.name);
        /*if (!this.sNB.equals("") && !this.sNB.equals(null)) {
            json.put(newBornFup.COLUMN_SNB, this.sNB == null ? JSONObject.NULL : new JSONObject(this.sNB));

        }*/

        if (this.sNB != null) {
            if (!this.sNB.equals("")) {
                json.put(newBornFup.COLUMN_SNB, this.sNB == null ? JSONObject.NULL : new JSONObject(this.sNB));
            }
        }

        json.put(newBornFup.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(newBornFup.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(newBornFup.COLUMN_SYNCEDDATE, this.syncedDate == null ? JSONObject.NULL : this.syncedDate);

        return json;
    }

    public static abstract class newBornFup implements BaseColumns {

        public static final String TABLE_NAME = "newBorn";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECT_NAME = "project_name";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_DSS_ID_HH = "dss_id_hh";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_DSS_ID_M = "dss_id_m";
        public static final String COLUMN_DSS_ID_MEMBER = "dss_id_member";
        public static final String COLUMN_STUDY_ID = "study_id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SNB = "snb";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCEDDATE = "synceddate";


        public static String _URL = "newborn_data.php";
    }
}
