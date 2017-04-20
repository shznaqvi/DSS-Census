package edu.aku.hassannaqvi.dss_census.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gul.sanober on 4/20/2017.
 */

public class DeceasedContract {

    private final String projectName = "DSS Census";
    private String _ID = "";
    private String _UID = "";
    private String _UUID = "";
    private String _DATE = "";
    private String formDate = "";
    private String deviceId = "";
    private String user = "";
    private String relation_hh = "";
    private String dss_id_hh = "";
    private String dss_id_f = "";
    private String dss_id_m = "";
    private String dss_id_h = "";
    private String dss_id_member = "";
    private String site_code = "";
    private String name = "";
    private String gender = "";
    private String dob = "";
    private String ageY = "";
    private String ageM = "";
    private String ageD = "";
    private String dod = "";
    private String synced = "";
    private String syncedDate = "";
    private String remarks = "";
    private String wra = "";


    public DeceasedContract() {
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

    public String get_DATE() {
        return _DATE;
    }

    public void set_DATE(String _DATE) {
        this._DATE = _DATE;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }

    public String getDss_id_hh() {
        return dss_id_hh;
    }

    public void setDss_id_hh(String dss_id_hh) {
        this.dss_id_hh = dss_id_hh;
    }

    public String getDss_id_f() {
        return dss_id_f;
    }

    public void setDss_id_f(String dss_id_f) {
        this.dss_id_f = dss_id_f;
    }

    public String getDss_id_m() {
        return dss_id_m;
    }

    public void setDss_id_m(String dss_id_m) {
        this.dss_id_m = dss_id_m;
    }

    public String getDss_id_h() {
        return dss_id_h;
    }

    public void setDss_id_h(String dss_id_h) {
        this.dss_id_h = dss_id_h;
    }

    public String getDss_id_member() {
        return dss_id_member;
    }

    public void setDss_id_member(String dss_id_member) {
        this.dss_id_member = dss_id_member;
    }


    public String getSite_code() {
        return site_code;
    }

    public void setSite_code(String site_code) {
        this.site_code = site_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAgeY() {
        return ageY;
    }

    public void setAgeY(String ageY) {
        this.ageY = ageY;
    }

    public String getAgeM() {
        return ageM;
    }

    public void setAgeM(String ageM) {
        this.ageM = ageM;
    }

    public String getAgeD() {
        return ageD;
    }

    public void setAgeD(String ageD) {
        this.ageD = ageD;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getRelation_hh() {
        return relation_hh;
    }

    public void setRelation_hh(String relation_hh) {
        this.relation_hh = relation_hh;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getWra() {
        return wra;
    }

    public void setWra(String wra) {
        this.wra = wra;
    }


    public DeceasedContract Sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_ID);
        this._UID = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_UID);
        this._UUID = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_UUID);
        this._DATE = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DATE);
        this.formDate = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_FORMDATE);
        this.deviceId = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DEVICEID);
        this.user = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_USER);
        this.dss_id_hh = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_HH);
        this.dss_id_f = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_F);
        this.dss_id_m = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_M);
        this.dss_id_h = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_H);
        this.dss_id_member = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_MEMBER);
        this.site_code = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_SITE_CODE);
        this.name = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_NAME);
        this.dob = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DOB);
        this.ageY = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_AGEY);
        this.ageM = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_AGEM);
        this.ageD = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_AGED);
        this.gender = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_GENDER);
        this.relation_hh = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_RELATION_HH);
        this.dod = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_DOD);
        this.synced = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_SYNCED);
        this.syncedDate = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_SYNCED_DATE);
        this.remarks = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_REMARKS);
        this.wra = jsonObject.getString(DeceasedContract.DeceasedMember.COLUMN_WRA);

        return this;

    }

    public DeceasedContract Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_UID));
        this._UUID = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_UUID));
        this._DATE = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DATE));
        this.formDate = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_FORMDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DEVICEID));
        this.user = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_USER));
        this.dss_id_hh = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_HH));
        this.dss_id_f = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_F));
        this.dss_id_m = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_M));
        this.dss_id_h = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_H));
        this.dss_id_member = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_MEMBER));
        this.site_code = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_SITE_CODE));
        this.name = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_NAME));
        this.dob = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DOB));
        this.ageY = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_AGEY));
        this.ageM = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_AGEM));
        this.ageD = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_AGED));
        this.gender = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_GENDER));
        this.relation_hh = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_RELATION_HH));
        this.dod = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_DOD));
        this.synced = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_SYNCED));
        this.syncedDate = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_SYNCED_DATE));
        this.remarks = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_REMARKS));
        this.remarks = cursor.getString(cursor.getColumnIndex(DeceasedContract.DeceasedMember.COLUMN_WRA));

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(DeceasedContract.DeceasedMember.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(DeceasedContract.DeceasedMember.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(DeceasedContract.DeceasedMember.COLUMN_UUID, this._UUID == null ? JSONObject.NULL : this._UUID);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DATE, this._DATE == null ? JSONObject.NULL : this._DATE);
        json.put(DeceasedContract.DeceasedMember.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
        json.put(DeceasedContract.DeceasedMember.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_HH, this.dss_id_hh == null ? JSONObject.NULL : this.dss_id_hh);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_F, this.dss_id_f == null ? JSONObject.NULL : this.dss_id_f);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_M, this.dss_id_m == null ? JSONObject.NULL : this.dss_id_m);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_H, this.dss_id_h == null ? JSONObject.NULL : this.dss_id_h);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DSS_ID_MEMBER, this.dss_id_member == null ? JSONObject.NULL : this.dss_id_member);
        json.put(DeceasedContract.DeceasedMember.COLUMN_SITE_CODE, this.site_code == null ? JSONObject.NULL : this.site_code);
        json.put(DeceasedContract.DeceasedMember.COLUMN_NAME, this.name == null ? JSONObject.NULL : this.name);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DOB, this.dob == null ? JSONObject.NULL : this.dob);
        json.put(DeceasedContract.DeceasedMember.COLUMN_AGEY, this.ageY == null ? JSONObject.NULL : this.ageY);
        json.put(DeceasedContract.DeceasedMember.COLUMN_AGEY, this.ageM == null ? JSONObject.NULL : this.ageM);
        json.put(DeceasedContract.DeceasedMember.COLUMN_AGEY, this.ageD == null ? JSONObject.NULL : this.ageD);
        json.put(DeceasedContract.DeceasedMember.COLUMN_GENDER, this.gender == null ? JSONObject.NULL : this.gender);
        json.put(DeceasedContract.DeceasedMember.COLUMN_RELATION_HH, this.relation_hh == null ? JSONObject.NULL : this.relation_hh);
        json.put(DeceasedContract.DeceasedMember.COLUMN_DOD, this.dod == null ? JSONObject.NULL : this.dod);
        json.put(DeceasedContract.DeceasedMember.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(DeceasedContract.DeceasedMember.COLUMN_SYNCED_DATE, this.syncedDate == null ? JSONObject.NULL : this.syncedDate);
        json.put(DeceasedContract.DeceasedMember.COLUMN_REMARKS, this.remarks == null ? JSONObject.NULL : this.remarks);
        json.put(DeceasedContract.DeceasedMember.COLUMN_WRA, this.wra == null ? JSONObject.NULL : this.wra);

        return json;
    }

    public static abstract class DeceasedMember implements BaseColumns {

        public static final String TABLE_NAME = "deceased";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECT_NAME = "project_name";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_DATE = "_date";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_DSS_ID_HH = "dss_id_hh";
        public static final String COLUMN_DSS_ID_F = "dss_id_f";
        public static final String COLUMN_DSS_ID_M = "dss_id_m";
        public static final String COLUMN_DSS_ID_H = "dss_id_h";
        public static final String COLUMN_DSS_ID_MEMBER = "dss_id_member";
        public static final String COLUMN_SITE_CODE = "site_code";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DOB = "dob";
        public static final String COLUMN_AGEY = "agey";
        public static final String COLUMN_AGEM = "agem";
        public static final String COLUMN_AGED = "aged";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_RELATION_HH = "relation_hh";
        public static final String COLUMN_DOD = "dod";
        public static final String COLUMN_REMARKS = "remarks";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "sync_date";
        public static final String COLUMN_WRA = "wra";
    }

}
