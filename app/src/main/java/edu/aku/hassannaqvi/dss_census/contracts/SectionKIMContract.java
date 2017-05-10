package edu.aku.hassannaqvi.dss_census.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gul.sanober on 5/10/2017.
 */

public class SectionKIMContract {

    private final String projectName = "DSS Census";
    private String _ID = "";
    private String UID = "";
    private String _UUID = "";
    private String deviceId = "";
    private String formDate = ""; // Date
    private String user = ""; // Interviewer
    private String childID = "", dssID = "";
    private String sK = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";

    public SectionKIMContract() {

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

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String get_UUID() {
        return _UUID;
    }

    public void set_UUID(String _UUID) {
        this._UUID = _UUID;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public String getChildID() {
        return childID;
    }

    public void setChildID(String childID) {
        this.childID = childID;
    }

    public String getDssID() {
        return dssID;
    }

    public void setDssID(String dssID) {
        this.dssID = dssID;
    }

    public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public SectionKIMContract Sync(JSONObject jsonObject) throws Exception {
        this._ID = jsonObject.getString(singleIm.COLUMN_ID);
        this._UUID = jsonObject.getString(singleIm.COLUMN_UUID);
        this.UID = jsonObject.getString(singleIm.COLUMN_UID);
        this.sK = jsonObject.getString(singleIm.COLUMN_SK);
        this.formDate = jsonObject.getString(singleIm.COLUMN_FORMDATE);
        this.user = jsonObject.getString(singleIm.COLUMN_USER);
        this.childID = jsonObject.getString(singleIm.COLUMN_CHILDID);
        this.dssID = jsonObject.getString(singleIm.COLUMN_DSSID);
        this.gpsLat = jsonObject.getString(singleIm.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(singleIm.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(singleIm.COLUMN_GPSDT);
        this.gpsAcc = jsonObject.getString(singleIm.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(singleIm.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(singleIm.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(singleIm.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(singleIm.COLUMN_SYNCED_DATE);

        return this;

    }

    public SectionKIMContract Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_ID));
        this._UUID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_UUID));
        this.UID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_UID));
        this.sK = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_SK));
        this.formDate = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_FORMDATE));
        this.user = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_USER));
        this.childID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_CHILDID));
        this.dssID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_DSSID));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSDT));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_DEVICETAGID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_SYNCED_DATE));

        return this;

    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleIm.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleIm.COLUMN_UUID, this._UUID == null ? JSONObject.NULL : this._UUID);
        json.put(singleIm.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(singleIm.COLUMN_SK, this.sK == null ? JSONObject.NULL : this.sK);
        json.put(singleIm.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(singleIm.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(singleIm.COLUMN_CHILDID, this.childID == null ? JSONObject.NULL : this.childID);
        json.put(singleIm.COLUMN_DSSID, this.dssID == null ? JSONObject.NULL : this.dssID);
        json.put(singleIm.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleIm.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleIm.COLUMN_GPSDT, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(singleIm.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleIm.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleIm.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(singleIm.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleIm.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);

        return json;
    }

    public static abstract class singleIm implements BaseColumns {

        public static final String TABLE_NAME = "ims";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_SK = "sk";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_CHILDID = "childid";
        public static final String COLUMN_DSSID = "dssid";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSDT = "gpsdt";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

        //public static String _URL = "mother.php";

    }
}
