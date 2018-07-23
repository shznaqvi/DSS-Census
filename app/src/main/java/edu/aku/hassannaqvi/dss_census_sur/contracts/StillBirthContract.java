package edu.aku.hassannaqvi.dss_census_sur.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gul.sanober on 4/20/2017.
 */

public class StillBirthContract {

    private final String projectName = "DSS Census";
    private String ID;
    private String UID;
    private String UUID;
    private String MUID;
    private String formDate;
    private String user;
    private String deviceId;
    private String devicetagID;
    private String dss_id_member;
    private String sSB;
    private String name;
    private String istatus;
    private String appver;
    private String synced;
    private String syncedDate;


    public StillBirthContract() {
    }

    public String getProjectName() {
        return projectName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getMUID() {
        return MUID;
    }

    public void setMUID(String MUID) {
        this.MUID = MUID;
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

    public String getDss_id_member() {
        return dss_id_member;
    }

    public void setDss_id_member(String dss_id_member) {
        this.dss_id_member = dss_id_member;
    }

    public String getsSB() {
        return sSB;
    }

    public void setsSB(String sSB) {
        this.sSB = sSB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
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

    public StillBirthContract Sync(JSONObject jsonObject) throws JSONException {

        this.ID = jsonObject.getString(sBFup.COLUMN_ID);
        this.UID = jsonObject.getString(sBFup.COLUMN_UID);
        this.UUID = jsonObject.getString(sBFup.COLUMN_UUID);
        this.MUID = jsonObject.getString(sBFup.COLUMN_MUID);
        this.formDate = jsonObject.getString(sBFup.COLUMN_FORMDATE);
        this.user = jsonObject.getString(sBFup.COLUMN_USER);
        this.deviceId = jsonObject.getString(sBFup.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(sBFup.COLUMN_DEVICETAGID);
        this.dss_id_member = jsonObject.getString(sBFup.COLUMN_DSS_ID_MEMBER);
        this.sSB = jsonObject.getString(sBFup.COLUMN_SPW);
        this.name = jsonObject.getString(sBFup.COLUMN_NAME);
        this.istatus = jsonObject.getString(sBFup.COLUMN_ISTATUS);
        this.appver = jsonObject.getString(sBFup.COLUMN_APPVER);
        this.synced = jsonObject.getString(sBFup.COLUMN_SYNCED);
        this.syncedDate = jsonObject.getString(sBFup.COLUMN_SYNCEDDATE);

        return this;

    }

    public StillBirthContract Hydrate(Cursor cursor) {

        this.ID = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_ID));
        this.UID = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_UID));
        this.UUID = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_UUID));
        this.MUID = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_MUID));
        this.formDate = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_FORMDATE));
        this.user = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_USER));
        this.deviceId = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_DEVICETAGID));
        this.dss_id_member = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_DSS_ID_MEMBER));
        this.sSB = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_SPW));
        this.name = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_NAME));
        this.istatus = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_ISTATUS));
        this.appver = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_APPVER));
        this.synced = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_SYNCED));
        this.syncedDate = cursor.getString(cursor.getColumnIndex(sBFup.COLUMN_SYNCEDDATE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(sBFup.COLUMN_ID, this.ID == null ? JSONObject.NULL : this.ID);
        json.put(sBFup.COLUMN_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(sBFup.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(sBFup.COLUMN_UUID, this.UUID == null ? JSONObject.NULL : this.UUID);
        json.put(sBFup.COLUMN_MUID, this.MUID == null ? JSONObject.NULL : this.MUID);
        json.put(sBFup.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(sBFup.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(sBFup.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
        json.put(sBFup.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(sBFup.COLUMN_DSS_ID_MEMBER, this.dss_id_member == null ? JSONObject.NULL : this.dss_id_member);
        json.put(sBFup.COLUMN_SPW, this.sSB == null ? JSONObject.NULL : new JSONObject(this.sSB));
        json.put(sBFup.COLUMN_NAME, this.name == null ? JSONObject.NULL : this.name);
        json.put(sBFup.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(sBFup.COLUMN_APPVER, this.appver == null ? JSONObject.NULL : this.appver);
        json.put(sBFup.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(sBFup.COLUMN_SYNCEDDATE, this.syncedDate == null ? JSONObject.NULL : this.syncedDate);


        return json;
    }

    public static abstract class sBFup implements BaseColumns {

        public static final String TABLE_NAME = "stillBirth";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECT_NAME = "project_name";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_MUID = "muid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_DSS_ID_MEMBER = "dss_id_member";
        public static final String COLUMN_SPW = "ssb";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_APPVER = "appver";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCEDDATE = "synceddate";

        public static String _URL = "sbirth_data.php";
    }

}
