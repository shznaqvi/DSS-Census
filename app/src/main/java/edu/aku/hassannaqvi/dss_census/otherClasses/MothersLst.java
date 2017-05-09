package edu.aku.hassannaqvi.dss_census.otherClasses;

import android.database.Cursor;

/**
 * Created by ali.azaz on 5/8/2017.
 */

public class MothersLst {
   String child_name, child_id, mother_name, mother_id, date_of_birth, no_of_children;

    public String getChild_name() {
        return child_name;
    }

    public String getChild_id() {
        return child_id;
    }

    public String getMother_name() {
        return mother_name;
    }

    public String getMother_id() {
        return mother_id;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getNo_of_children() {
        return no_of_children;
    }

    public MothersLst Hydrate(Cursor cursor) {
        this.child_name = cursor.getString(cursor.getColumnIndex("child_name"));
        this.child_id = cursor.getString(cursor.getColumnIndex("child_id"));
        this.mother_name = cursor.getString(cursor.getColumnIndex("mother_name"));
        this.mother_id = cursor.getString(cursor.getColumnIndex("mother_id"));
        this.date_of_birth = cursor.getString(cursor.getColumnIndex("date_of_birth"));

        return this;
    }

    public MothersLst(MothersLst m) {
        this.child_name = m.child_name;
        this.child_id = m.child_id;
        this.mother_name = m.mother_name;
        this.mother_id = m.mother_id;
        this.date_of_birth = m.date_of_birth;
    }

    public MothersLst() {
    }
}
