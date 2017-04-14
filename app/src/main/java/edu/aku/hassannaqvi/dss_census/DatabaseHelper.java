package edu.aku.hassannaqvi.dss_census;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import edu.aku.hassannaqvi.dss_census.contracts.FormsContract;
import edu.aku.hassannaqvi.dss_census.contracts.FormsContract.singleForm;
import edu.aku.hassannaqvi.dss_census.contracts.HouseholdContract;
import edu.aku.hassannaqvi.dss_census.contracts.MembersContract;
import edu.aku.hassannaqvi.dss_census.contracts.MembersContract.singleMember;
import edu.aku.hassannaqvi.dss_census.contracts.UsersContract;
import edu.aku.hassannaqvi.dss_census.contracts.UsersContract.*;
import edu.aku.hassannaqvi.dss_census.contracts.HouseholdContract.*;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String SQL_CREATE_USERS = "CREATE TABLE " + singleUser.TABLE_NAME + "("
            + singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleUser.ROW_USERNAME + " TEXT,"
            + singleUser.ROW_PASSWORD + " TEXT );";
    private static final String DATABASE_NAME = "dss-census.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            +singleForm.TABLE_NAME + "("
            +singleForm.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            +singleForm.COLUMN_PROJECT_NAME + " TEXT,"
            +singleForm.COLUMN_UID + " TEXT," +
            singleForm.COLUMN_DSSID + " TEXT," +
            singleForm.COLUMN_FORMDATE + " TEXT," +
            singleForm.COLUMN_USER + " TEXT," +
            singleForm.COLUMN_SA + " TEXT," +
            singleForm.COLUMN_SD + " TEXT," +
            singleForm.COLUMN_SE + " TEXT," +
            singleForm.COLUMN_SF + " TEXT," +
            singleForm.COLUMN_SG + " TEXT," +
            singleForm.COLUMN_SH + " TEXT," +
            singleForm.COLUMN_SI + " TEXT," +
            singleForm.COLUMN_SJ + " TEXT," +
            singleForm.COLUMN_SK + " TEXT," +
            singleForm.COLUMN_SL + " TEXT," +
            singleForm.COLUMN_SM + " TEXT," +
            singleForm.COLUMN_ISTATUS + " TEXT," +
            singleForm.COLUMN_GPSLAT + " TEXT," +
            singleForm.COLUMN_GPSLNG + " TEXT," +
            singleForm.COLUMN_GPSDATE + " TEXT," +
            singleForm.COLUMN_GPSACC + " TEXT," +
            singleForm.COLUMN_DEVICEID + " TEXT," +
            singleForm.COLUMN_SYNCED + " TEXT," +
            singleForm.COLUMN_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_CREATE_HOUSEHOLD = "CREATE TABLE "
            + householdForm.TABLE_NAME + "("
            + householdForm.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + householdForm.COLUMN_PROJECT_NAME + " TEXT,"
            + householdForm.COLUMN_UID + " TEXT," +
            householdForm.COLUMN_HOUSEHOLDID + " TEXT," +
            householdForm.COLUMN_FORMDATE + " TEXT," +
            householdForm.COLUMN_USER + " TEXT," +
            householdForm.COLUMN_CENTER + " TEXT," +
            householdForm.COLUMN_GPSLAT + " TEXT," +
            householdForm.COLUMN_GPSLNG + " TEXT," +
            householdForm.COLUMN_GPSTIME + " TEXT," +
            householdForm.COLUMN_GPSACC + " TEXT," +
            householdForm.COLUMN_DEVICEID + " TEXT," +
            householdForm.COLUMN_SYNCED + " TEXT," +
            householdForm.COLUMN_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_CREATE_MEMBERS = "CREATE TABLE "
            + singleMember.TABLE_NAME + "("
            + singleMember.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
            singleMember.COLUMN_UID + " TEXT,"+
            singleMember.COLUMN_FORMDATE + " TEXT,"+
            singleMember.COLUMN_DEVICEID + " TEXT,"+
            singleMember.COLUMN_USER + " TEXT,"+
            singleMember.COLUMN_DSS_ID_HH + " TEXT,"+
            singleMember.COLUMN_DSS_ID_F + " TEXT,"+
            singleMember.COLUMN_DSS_ID_M + " TEXT,"+
            singleMember.COLUMN_DSS_ID_H + " TEXT,"+
            singleMember.COLUMN_DSS_ID_MEMBER + " TEXT,"+
            singleMember.COLUMN_PREVS_DSS_ID_MEMBER + " TEXT,"+
            singleMember.COLUMN_SITE_CODE + " TEXT,"+
            singleMember.COLUMN_NAME + " TEXT,"+
            singleMember.COLUMN_DOB + " TEXT,"+
            singleMember.COLUMN_AGE + " TEXT,"+
            singleMember.COLUMN_GENDER + " TEXT,"+
            singleMember.COLUMN_IS_HEAD + " TEXT,"+
            singleMember.COLUMN_RELATION_HH + " TEXT,"+
            singleMember.COLUMN_CURRENT_STATUS + " TEXT,"+
            singleMember.COLUMN_CURRENT_DATE + " TEXT,"+
            singleMember.COLUMN_DOD + " TEXT,"+
            singleMember.COLUMN_M_STATUS + " TEXT,"+
            singleMember.COLUMN_EDUCATION + " TEXT,"+
            singleMember.COLUMN_OCCUPATION + " TEXT,"+
            singleMember.COLUMN_MEMBER_TYPE + " TEXT,"+
            singleMember.COLUMN_UPDATE_FLAG + " TEXT,"+
            singleMember.COLUMN_UPDATE_DT + " TEXT,"+
            singleMember.COLUMN_SYNCED + " TEXT,"+
            singleMember.COLUMN_SYNCEDDATE + " TEXT"
            + " );";
    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + singleUser.TABLE_NAME;
    private static final String SQL_DELETE_FORMS =
            "DROP TABLE IF EXISTS " + singleForm.TABLE_NAME;
    private static final String SQL_DELETE_HOUSEHOLD =
            "DROP TABLE IF EXISTS " + householdForm.TABLE_NAME;
    private static final String SQL_DELETE_MEMBERS =
            "DROP TABLE IF EXISTS " + singleMember.TABLE_NAME;
    private final String TAG = "DatabaseHelper";
    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());


    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_HOUSEHOLD);
        db.execSQL(SQL_CREATE_MEMBERS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_HOUSEHOLD);
        db.execSQL(SQL_DELETE_MEMBERS);
    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(singleUser.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");


                ContentValues values = new ContentValues();

                values.put(singleUser.ROW_USERNAME, userName);
                values.put(singleUser.ROW_PASSWORD, password);
                db.insert(singleUser.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + singleUser.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    UsersContract user = new UsersContract();
                    user.setId(cursor.getInt(0));
                    user.setUserName(cursor.getString(1));
                    user.setPassword(cursor.getString(2));
                    userList.add(user);
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }

    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + singleUser.TABLE_NAME + " WHERE " + singleUser.ROW_USERNAME + "=? AND " + singleUser.ROW_PASSWORD + "=?", new String[]{username, password});
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public Long addForm(FormsContract fc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_PROJECT_NAME, fc.getProjectName());
        values.put(singleForm.COLUMN_UID, fc.getUID());
        values.put(singleForm.COLUMN_DSSID, fc.getDSSID());
        values.put(singleForm.COLUMN_FORMDATE, fc.getFormDate());
        values.put(singleForm.COLUMN_USER, fc.getUser());
        values.put(singleForm.COLUMN_ISTATUS, fc.getIstatus());
        values.put(singleForm.COLUMN_SA, fc.getsA());
        values.put(singleForm.COLUMN_SD, fc.getsD());
        values.put(singleForm.COLUMN_SE, fc.getsE());
        values.put(singleForm.COLUMN_SF, fc.getsF());
        values.put(singleForm.COLUMN_SG, fc.getsG());
        values.put(singleForm.COLUMN_SH, fc.getsH());
        values.put(singleForm.COLUMN_SI, fc.getsI());
        values.put(singleForm.COLUMN_SJ, fc.getsJ());
        values.put(singleForm.COLUMN_SK, fc.getsK());
        values.put(singleForm.COLUMN_SL, fc.getsL());
        values.put(singleForm.COLUMN_SM, fc.getsM());
        values.put(singleForm.COLUMN_GPSLAT, fc.getGpsLat());
        values.put(singleForm.COLUMN_GPSLNG, fc.getGpsLng());
        values.put(singleForm.COLUMN_GPSDATE, fc.getGpsDT());
        values.put(singleForm.COLUMN_GPSACC, fc.getGpsAcc());
        values.put(singleForm.COLUMN_DEVICEID, fc.getDeviceID());
        values.put(singleForm.COLUMN_SYNCED, fc.getSynced());
        values.put(singleForm.COLUMN_SYNCED_DATE, fc.getSynced_date());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsContract.singleForm.TABLE_NAME,
                FormsContract.singleForm.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addHousehold(HouseholdContract hc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(householdForm.COLUMN_PROJECT_NAME, hc.getProjectName());
        values.put(householdForm.COLUMN_UID, hc.getUID());
        values.put(householdForm.COLUMN_HOUSEHOLDID, hc.getHouseholdID());
        values.put(householdForm.COLUMN_FORMDATE, hc.getFormDate());
        values.put(householdForm.COLUMN_USER, hc.getUser());
        values.put(householdForm.COLUMN_GPSLAT, hc.getGpsLat());
        values.put(householdForm.COLUMN_GPSLNG, hc.getGpsLng());
        values.put(householdForm.COLUMN_GPSTIME, hc.getGpsTime());
        values.put(householdForm.COLUMN_GPSACC, hc.getGpsAcc());
        values.put(householdForm.COLUMN_DEVICEID, hc.getDeviceID());
        values.put(householdForm.COLUMN_SYNCED, hc.getSynced());
        values.put(householdForm.COLUMN_SYNCED_DATE, hc.getSynced_date());

        long newRowId;
        newRowId = db.insert(
                householdForm.TABLE_NAME,
                householdForm.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addMembers(MembersContract mc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(singleMember.COLUMN_UID, mc.get_UID());
        values.put(singleMember.COLUMN_FORMDATE, mc.getFormDate());
        values.put(singleMember.COLUMN_DEVICEID, mc.getDeviceId());
        values.put(singleMember.COLUMN_USER, mc.getUser());
        values.put(singleMember.COLUMN_DSS_ID_HH, mc.getDss_id_hh());
        values.put(singleMember.COLUMN_DSS_ID_F, mc.getDss_id_f());
        values.put(singleMember.COLUMN_DSS_ID_M, mc.getDss_id_m());
        values.put(singleMember.COLUMN_DSS_ID_H, mc.getDss_id_h());
        values.put(singleMember.COLUMN_DSS_ID_MEMBER, mc.getDss_id_member());
        values.put(singleMember.COLUMN_PREVS_DSS_ID_MEMBER, mc.getPrevs_dss_id_member());
        values.put(singleMember.COLUMN_SITE_CODE, mc.getSite_code());
        values.put(singleMember.COLUMN_NAME, mc.getName());
        values.put(singleMember.COLUMN_DOB, mc.getDob());
        values.put(singleMember.COLUMN_AGE, mc.getAge());
        values.put(singleMember.COLUMN_GENDER, mc.getGender());
        values.put(singleMember.COLUMN_IS_HEAD, mc.getIs_head());
        values.put(singleMember.COLUMN_RELATION_HH, mc.getRelation_hh());
        values.put(singleMember.COLUMN_CURRENT_STATUS, mc.getCurrent_status());
        values.put(singleMember.COLUMN_CURRENT_DATE, mc.getCurrent_date());
        values.put(singleMember.COLUMN_DOD, mc.getDod());
        values.put(singleMember.COLUMN_M_STATUS, mc.getM_status());
        values.put(singleMember.COLUMN_EDUCATION, mc.getEducation());
        values.put(singleMember.COLUMN_OCCUPATION, mc.getOccupation());
        values.put(singleMember.COLUMN_MEMBER_TYPE, mc.getMember_type());
        values.put(singleMember.COLUMN_UPDATE_FLAG, mc.getUpdate_flag());
        values.put(singleMember.COLUMN_UPDATE_DT, mc.getUpdate_dt());
        values.put(singleMember.COLUMN_SYNCED, mc.getSynced());
        values.put(singleMember.COLUMN_SYNCEDDATE, mc.getSyncedDate());


        long newRowId;
        newRowId = db.insert(
                singleMember.TABLE_NAME,
                singleMember.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public void updateForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SYNCED, true);
        values.put(singleForm.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = singleForm.COLUMN_ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                singleForm.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updateFormID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());

// Which row to update, based on the ID
        String selection = singleForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleForm._ID,


        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.singleForm.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.singleForm.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<MembersContract> getAllMembers() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleMember.COLUMN_ID,
                singleMember.COLUMN_UID,
                singleMember.COLUMN_FORMDATE,
                singleMember.COLUMN_DEVICEID,
                singleMember.COLUMN_USER,
                singleMember.COLUMN_DSS_ID_HH,
                singleMember.COLUMN_DSS_ID_F,
                singleMember.COLUMN_DSS_ID_M,
                singleMember.COLUMN_DSS_ID_H,
                singleMember.COLUMN_DSS_ID_MEMBER,
                singleMember.COLUMN_PREVS_DSS_ID_MEMBER,
                singleMember.COLUMN_SITE_CODE,
                singleMember.COLUMN_NAME,
                singleMember.COLUMN_DOB,
                singleMember.COLUMN_AGE,
                singleMember.COLUMN_GENDER,
                singleMember.COLUMN_IS_HEAD,
                singleMember.COLUMN_RELATION_HH,
                singleMember.COLUMN_CURRENT_STATUS,
                singleMember.COLUMN_CURRENT_DATE,
                singleMember.COLUMN_DOD,
                singleMember.COLUMN_M_STATUS,
                singleMember.COLUMN_EDUCATION,
                singleMember.COLUMN_OCCUPATION,
                singleMember.COLUMN_MEMBER_TYPE,
                singleMember.COLUMN_UPDATE_FLAG,
                singleMember.COLUMN_UPDATE_DT,
                singleMember.COLUMN_SYNCED,
                singleMember.COLUMN_SYNCEDDATE
        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                singleMember.COLUMN_ID + " ASC";

        Collection<MembersContract> allMC = new ArrayList<MembersContract>();
        try {
            c = db.query(
                    singleMember.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                MembersContract fc = new MembersContract();
                allMC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allMC;
    }

    public Collection<FormsContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.singleForm.COLUMN_ID,
                singleForm.COLUMN_UID,
                singleForm.COLUMN_DSSID,
                singleForm.COLUMN_FORMDATE,
                singleForm.COLUMN_USER,
                singleForm.COLUMN_ISTATUS,
                singleForm.COLUMN_SA,
                singleForm.COLUMN_SD,
                singleForm.COLUMN_SE,
                singleForm.COLUMN_SF,
                singleForm.COLUMN_SG,
                singleForm.COLUMN_SH,
                singleForm.COLUMN_SI,
                singleForm.COLUMN_SJ,
                singleForm.COLUMN_SK,
                singleForm.COLUMN_SL,
                singleForm.COLUMN_SM,
                singleForm.COLUMN_GPSLAT,
                singleForm.COLUMN_GPSLNG,
                singleForm.COLUMN_GPSDATE,
                singleForm.COLUMN_GPSACC,
                singleForm.COLUMN_DEVICEID,
                singleForm.COLUMN_SYNCED,
                singleForm.COLUMN_SYNCED_DATE,



        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.singleForm.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.singleForm.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getTodayForms() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.singleForm.COLUMN_ID
        };

        String whereClause = singleForm.COLUMN_DSSID + " LIKE ?";
        String[] whereArgs = {spDateT};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.singleForm.COLUMN_ID + " ASC";

        Collection<FormsContract> formList = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.singleForm.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                formList.add(fc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }


        // return contact list
        return formList;
    }

    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    public int updateSD() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SD, MainApp.fc.getsD());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSE() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SE, MainApp.fc.getsE());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSF() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SF, MainApp.fc.getsF());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSG() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SG, MainApp.fc.getsG());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSH() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SH, MainApp.fc.getsH());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSI() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SI, MainApp.fc.getsI());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSJ() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SJ, MainApp.fc.getsJ());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSK() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SK, MainApp.fc.getsK());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSL() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SL, MainApp.fc.getsL());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSM() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(singleForm.COLUMN_SM, MainApp.fc.getsM());
        values.put(singleForm.COLUMN_UID, MainApp.fc.getUID());


// Which row to update, based on the ID
        String selection = singleForm._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.fc.get_ID())};

        int count = db.update(singleForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

}