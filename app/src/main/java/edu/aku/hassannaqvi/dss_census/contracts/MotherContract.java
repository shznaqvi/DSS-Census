package edu.aku.hassannaqvi.dss_census.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gul.sanober on 5/9/2017.
 */

public class MotherContract {

    private final String projectName = "DSS Census";
    private String _ID = "";
    private String _UID = "";
    private String _UUID = "";
    private String deviceId = "";
    private String formDate = ""; // Date
    private String user = ""; // Interviewer

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
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";


    public MotherContract() {
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

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }

    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }

    public String getsJ() {
        return sJ;
    }

    public void setsJ(String sJ) {
        this.sJ = sJ;
    }

    public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }

    public String getsL() {
        return sL;
    }

    public void setsL(String sL) {
        this.sL = sL;
    }

    public String getsM() {
        return sM;
    }

    public void setsM(String sM) {
        this.sM = sM;
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


    public MotherContract Sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(Mother.COLUMN_ID);
        this._UUID = jsonObject.getString(Mother.COLUMN_UUID);
        this._UID = jsonObject.getString(Mother.COLUMN_UID);
        this.formDate = jsonObject.getString(Mother.COLUMN_FORMDATE);
        this.user = jsonObject.getString(Mother.COLUMN_USER);
        this.sF = jsonObject.getString(Mother.COLUMN_SF);
        this.sG = jsonObject.getString(Mother.COLUMN_SG);
        this.sH = jsonObject.getString(Mother.COLUMN_SH);
        this.sI = jsonObject.getString(Mother.COLUMN_SI);
        this.sJ = jsonObject.getString(Mother.COLUMN_SJ);
        this.sK = jsonObject.getString(Mother.COLUMN_SK);
        this.sL = jsonObject.getString(Mother.COLUMN_SL);
        this.sM = jsonObject.getString(Mother.COLUMN_SM);
        this.gpsLat = jsonObject.getString(Mother.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(Mother.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(Mother.COLUMN_GPSDT);
        this.gpsAcc = jsonObject.getString(Mother.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(Mother.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(Mother.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(Mother.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(Mother.COLUMN_SYNCED_DATE);


        return this;

    }

    public MotherContract Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_ID));
        this._UUID = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_UUID));
        this._UID = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_FORMDATE));
        this.user = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_USER));
        this.sF = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SG));
        this.sH = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SH));
        this.sI = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SI));
        this.sJ = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SJ));
        this.sK = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SK));
        this.sL = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SL));
        this.sM = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SM));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_GPSDT));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_DEVICETAGID));
        this.synced = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(Mother.COLUMN_SYNCED_DATE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(Mother.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Mother.COLUMN_UUID, this._UUID == null ? JSONObject.NULL : this._UUID);
        json.put(Mother.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(Mother.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(Mother.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(Mother.COLUMN_SF, this.sF == null ? JSONObject.NULL : this.sF);
        json.put(Mother.COLUMN_SG, this.sG == null ? JSONObject.NULL : this.sG);
        json.put(Mother.COLUMN_SH, this.sH == null ? JSONObject.NULL : this.sH);
        json.put(Mother.COLUMN_SI, this.sI == null ? JSONObject.NULL : this.sI);
        json.put(Mother.COLUMN_SJ, this.sJ == null ? JSONObject.NULL : this.sJ);
        json.put(Mother.COLUMN_SK, this.sK == null ? JSONObject.NULL : this.sK);
        json.put(Mother.COLUMN_SL, this.sL == null ? JSONObject.NULL : this.sL);
        json.put(Mother.COLUMN_SM, this.sM == null ? JSONObject.NULL : this.sM);
        json.put(Mother.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(Mother.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(Mother.COLUMN_GPSDT, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(Mother.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(Mother.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(Mother.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(Mother.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(Mother.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public static abstract class Mother implements BaseColumns {

        public static final String TABLE_NAME = "mother";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECT_NAME = "project_name";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_USER = "user";
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
        public static final String COLUMN_GPSDT = "gpsdt";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

        public static String _URL = "mother.php";
    }
}
