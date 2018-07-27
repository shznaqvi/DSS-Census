package edu.aku.hassannaqvi.dss_census_sur.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class EventsContract implements Serializable {

    private String euid;
    private String formdate;
    private String name;
    private String dss_id_member;
    private String dss_id_h;
    private String status;
    private String lmp_dt;
    private String status_date;
    private String birth_time;
    private String gender;
    private String totalMem;
    private String round;
    private String dss_id_m;
    private String dss_id_hus;

    public String getDss_id_hus() {
        return dss_id_hus;
    }

    public void setDss_id_hus(String dss_id_hus) {
        this.dss_id_hus = dss_id_hus;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getDss_id_m() {
        return dss_id_m;
    }

    public void setDss_id_m(String dss_id_m) {
        this.dss_id_m = dss_id_m;
    }

    public EventsContract() {
    }

    public EventsContract(EventsContract cc) {
        this.euid = cc.euid;
        this.formdate = cc.formdate;
        this.dss_id_member = cc.dss_id_member;
        this.name = cc.name;
        this.status = cc.status;
        this.lmp_dt = cc.lmp_dt;
        this.status_date = cc.status_date;
        this.birth_time = cc.birth_time;
        this.dss_id_h = cc.dss_id_h;
        this.gender = cc.gender;
        this.totalMem = cc.totalMem;
        this.round = cc.round;
        this.dss_id_m = cc.dss_id_m;
        this.dss_id_hus = cc.dss_id_hus;
    }

    public String getEuid() {
        return euid;
    }

    public void setEuid(String euid) {
        this.euid = euid;
    }

    public String getFormdate() {
        return formdate;
    }

    public void setFormdate(String formdate) {
        this.formdate = formdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDss_id_member() {
        return dss_id_member;
    }

    public void setDss_id_member(String dss_id_member) {
        this.dss_id_member = dss_id_member;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLmp_dt() {
        return lmp_dt;
    }

    public void setLmp_dt(String lmp_dt) {
        this.lmp_dt = lmp_dt;
    }

    public String getStatus_date() {
        return status_date;
    }

    public void setStatus_date(String status_date) {
        this.status_date = status_date;
    }

    public String getBirth_time() {
        return birth_time;
    }

    public void setBirth_time(String birth_time) {
        this.birth_time = birth_time;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDss_id_h() {
        return dss_id_h;
    }

    public void setDss_id_h(String dss_id_h) {
        this.dss_id_h = dss_id_h;
    }

    public String getTotalMem() {
        return totalMem;
    }

    public void setTotalMem(String totalMem) {
        this.totalMem = totalMem;
    }

    public EventsContract Sync(JSONObject jsonObject) throws JSONException {
        this.euid = jsonObject.getString(singleEV.COLUMN_EUID);
        this.formdate = jsonObject.getString(singleEV.COLUMN_FORMDATE);
        this.name = jsonObject.getString(singleEV.COLUMN_NAME);
        this.dss_id_member = jsonObject.getString(singleEV.COLUMN_DSS_ID_MEMBER);
        this.status = jsonObject.getString(singleEV.COLUMN_STATUS);
        this.lmp_dt = jsonObject.getString(singleEV.COLUMN_LMP_DT);
        this.status_date = jsonObject.getString(singleEV.COLUMN_STATUS_DATE);
        this.birth_time = jsonObject.getString(singleEV.COLUMN_BIRTH_TIME);
        this.gender = jsonObject.getString(singleEV.COLUMN_GENDER);
        this.dss_id_h = jsonObject.getString(singleEV.COLUMN_DSS_ID_H);
        this.round = jsonObject.getString(singleEV.COLUMN_ROUND);
        this.dss_id_m = jsonObject.getString(singleEV.COLUMN_DSS_ID_M);
        this.dss_id_hus = jsonObject.getString(singleEV.COLUMN_DSS_ID_HUS);

        return this;
    }

    public EventsContract Hydrate(Cursor cursor) {

        this.euid = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_EUID));
        this.formdate = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_FORMDATE));
        this.name = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_NAME));
        this.dss_id_member = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_DSS_ID_MEMBER));
        this.status = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_STATUS));
        this.lmp_dt = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_LMP_DT));
        this.status_date = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_STATUS_DATE));
        this.birth_time = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_BIRTH_TIME));
        this.gender = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_GENDER));
        this.dss_id_h = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_DSS_ID_H));
        this.dss_id_m = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_DSS_ID_M));
        this.round = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_ROUND));
        this.dss_id_hus = cursor.getString(cursor.getColumnIndex(singleEV.COLUMN_DSS_ID_HUS));

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(singleEV.COLUMN_EUID, this.euid == null ? JSONObject.NULL : this.euid);
        json.put(singleEV.COLUMN_FORMDATE, this.formdate == null ? JSONObject.NULL : this.formdate);
        json.put(singleEV.COLUMN_NAME, this.name == null ? JSONObject.NULL : this.name);
        json.put(singleEV.COLUMN_DSS_ID_MEMBER, this.dss_id_member == null ? JSONObject.NULL : this.dss_id_member);
        json.put(singleEV.COLUMN_STATUS, this.status == null ? JSONObject.NULL : this.status);
        json.put(singleEV.COLUMN_LMP_DT, this.lmp_dt == null ? JSONObject.NULL : this.lmp_dt);
        json.put(singleEV.COLUMN_STATUS_DATE, this.status_date == null ? JSONObject.NULL : this.status_date);
        json.put(singleEV.COLUMN_BIRTH_TIME, this.birth_time == null ? JSONObject.NULL : this.birth_time);
        json.put(singleEV.COLUMN_GENDER, this.gender == null ? JSONObject.NULL : this.gender);
        json.put(singleEV.COLUMN_DSS_ID_H, this.dss_id_h == null ? JSONObject.NULL : this.dss_id_h);
        json.put(singleEV.COLUMN_DSS_ID_M, this.dss_id_m == null ? JSONObject.NULL : this.dss_id_m);
        json.put(singleEV.COLUMN_ROUND, this.round == null ? JSONObject.NULL : this.round);
        json.put(singleEV.COLUMN_DSS_ID_HUS, this.dss_id_hus == null ? JSONObject.NULL : this.dss_id_hus);

        return json;
    }

    public static abstract class singleEV implements BaseColumns {

        public static final String TABLE_NAME = "events";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_EUID = "euid";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DSS_ID_MEMBER = "dss_id_member";
        public static final String COLUMN_DSS_ID_H = "dss_id_hh";
        public static final String COLUMN_DSS_TOTAL_MEM = "totalmem";
        public static final String COLUMN_STATUS = "status";
        public static final String COLUMN_LMP_DT = "lmp_dt";
        public static final String COLUMN_STATUS_DATE = "status_date";
        public static final String COLUMN_BIRTH_TIME = "birth_time";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_ROUND = "round";
        public static final String COLUMN_DSS_ID_M = "mother_name";
        public static final String COLUMN_DSS_ID_HUS = "husband_name";
        public static String _URI = "events.php";
    }
}
