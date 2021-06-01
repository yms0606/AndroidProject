package com.example.androidproject_team;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MyDiary.db";
    public static final String Diary_TABLE = "diary";
    public static final String Diary_ID = "id";

    public static final String DiaryTitle = "title";
    public static final String DiaryContent = "content";

    public static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        // invoke super constructor.
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // create two tables, vertices and triangles
        db.execSQL("create table diary " + " (id integer primary key, title text, content text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // drop the two tables, vertices and triangles
        db.execSQL("DROP TABLE IF EXISTS diary");
        onCreate(db);
    }

    public boolean addDiary(String title, String content) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("title", title);
        contentValues.put("content", content);

        db.insert("diary", null, contentValues);
        return true;
    }

    public Cursor getData(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from Diary where id=" + id + "", null);
        return res;
    }

    public int numberOfRows() {
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, Diary_TABLE);
        return numRows;
    }

    public boolean updateDiary(Integer id, String title, String content) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", title);
        contentValues.put("content", content);
        db.update("Diary", contentValues, "id = ? " , new String[] {Integer.toString(id)});
        return true;
    }

    public Integer deleteDiary(Integer id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("diary", "id=?", new String[] {Integer.toString(id)});
    }

    public ArrayList getAllDiary() {
        ArrayList array_list = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from diary", null);
        res.moveToFirst();
        while(res.isAfterLast() ==false) {
            array_list.add(res.getString(res.getColumnIndex(DiaryTitle)));
            res.moveToNext();
        }
        return array_list;
    }
}
