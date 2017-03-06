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

import edu.aku.hassannaqvi.dss_census.FormsContract.singleForm;
import edu.aku.hassannaqvi.dss_census.MembersContract.singleMember;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT );";
    private static final String DATABASE_NAME = "dss-census.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormsContract.singleForm.TABLE_NAME + "("
            + FormsContract.singleForm.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + singleForm.COLUMN_UID + " TEXT," +
            singleForm.COLUMN_DSSID + " TEXT," +
            singleForm.COLUMN_FORMDATE + " TEXT," +
            singleForm.COLUMN_INTERVIEWER + " TEXT," +
            singleForm.COLUMN_ISTATUS + " TEXT," +
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
            singleForm.COLUMN_GPSLAT + " TEXT," +
            singleForm.COLUMN_GPSLNG + " TEXT," +
            singleForm.COLUMN_GPSTIME + " TEXT," +
            singleForm.COLUMN_GPSACC + " TEXT," +
            singleForm.COLUMN_DEVICEID + " TEXT," +
            singleForm.COLUMN_SYNCED + " TEXT," +
            singleForm.COLUMN_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + UsersContract.singleUser.TABLE_NAME;
    private static final String SQL_DELETE_FORMS =
            "DROP TABLE IF EXISTS " + FormsContract.singleForm.TABLE_NAME;
    private final String TAG = "DatabaseHelper";
    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());


    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FORMS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_FORMS);
    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersContract.singleUser.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");


                ContentValues values = new ContentValues();

                values.put(UsersContract.singleUser.ROW_USERNAME, userName);
                values.put(UsersContract.singleUser.ROW_PASSWORD, password);
                db.insert(UsersContract.singleUser.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncMembers(JSONArray memberslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(singleMember.TABLE_NAME, null, null);
        try {
            JSONArray jsonArray = memberslist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectEC = jsonArray.getJSONObject(i);

                MembersContract mc = new MembersContract();
                mc.Sync(jsonObjectEC);

                ContentValues values = new ContentValues();

                values.put(singleMember.COLUMN_UID, mc.get_UID());
                values.put(singleMember.COLUMN_FORMDATE, mc.getFormDate());
                values.put(singleMember.COLUMN_INTERVIEWER, mc.getInterviewer());
                values.put(singleMember.COLUMN_DSSID, mc.getDssID());
                values.put(singleMember.COLUMN_ISTATUS, mc.getIstatus());
                values.put(singleMember.COLUMN_FMNAME, mc.getFmName());
                values.put(singleMember.COLUMN_FMRHH, mc.getFmRHH());
                values.put(singleMember.COLUMN_FMDSSIDF, mc.getFmDssIdF());
                values.put(singleMember.COLUMN_FMDSSIDM, mc.getFmDssIdM());
                values.put(singleMember.COLUMN_FMMARITALSTATUS, mc.getFmMaritalStatus());
                values.put(singleMember.COLUMN_FMGENDER, mc.getFmGender());
                values.put(singleMember.COLUMN_FMEDUCATION, mc.getFmEducation());
                values.put(singleMember.COLUMN_FMOCCUPATION, mc.getFmOccupation());
                values.put(singleMember.COLUMN_FMDOB, mc.getFmDOB());
                values.put(singleMember.COLUMN_FMAGEY, mc.getFmAgeY());
                values.put(singleMember.COLUMN_FMAGEM, mc.getFmAgeM());
                values.put(singleMember.COLUMN_FMAGED, mc.getFmAgeD());
                values.put(singleMember.COLUMN_FMCURSTATUS, mc.getFmCurStatus());
                values.put(singleMember.COLUMN_FMCSDATE, mc.getFmCSDate());
                values.put(singleMember.COLUMN_FMREMARKS, mc.getFmRemarks());
                values.put(singleMember.COLUMN_GPSLAT, mc.getGpsLat());
                values.put(singleMember.COLUMN_GPSLNG, mc.getGpsLng());
                values.put(singleMember.COLUMN_GPSTIME, mc.getGpsTime());
                values.put(singleMember.COLUMN_GPSACC, mc.getGpsAcc());
                values.put(singleMember.COLUMN_DEVICEID, mc.getDeviceID());
                values.put(singleMember.COLUMN_SYNCED, mc.getSynced());
                values.put(singleMember.COLUMN_SYNCED_DATE, mc.getSynced_date());


                db.insert(singleMember.TABLE_NAME, null, values);
            }


        } catch (Exception e) {
        } finally {
            db.close();
        }
    }

    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + UsersContract.singleUser.TABLE_NAME;
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

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersContract.singleUser.TABLE_NAME + " WHERE " + UsersContract.singleUser.ROW_USERNAME + "=? AND " + UsersContract.singleUser.ROW_PASSWORD + "=?", new String[]{username, password});
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
        values.put(singleForm.COLUMN_UID, fc.getUID());
        values.put(singleForm.COLUMN_DSSID, fc.getDSSID());
        values.put(singleForm.COLUMN_FORMDATE, fc.getFormDate());
        values.put(singleForm.COLUMN_INTERVIEWER, fc.getInterviewer());
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
        values.put(singleForm.COLUMN_GPSTIME, fc.getGpsTime());
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

    public void updateForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.singleForm.COLUMN_SYNCED, true);
        values.put(FormsContract.singleForm.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsContract.singleForm.COLUMN_ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsContract.singleForm.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.singleForm._ID,


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

    public Collection<FormsContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.singleForm.COLUMN_ID,
                singleForm.COLUMN_UID,
                singleForm.COLUMN_DSSID,
                singleForm.COLUMN_FORMDATE,
                singleForm.COLUMN_INTERVIEWER,
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
                singleForm.COLUMN_GPSTIME,
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
}