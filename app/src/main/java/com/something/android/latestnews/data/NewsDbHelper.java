package com.something.android.latestnews.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MOHAMED on 08/11/2018.
 */

public class NewsDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "news.db";

    private static final int DATABASE_VERSION = 1;

    private final static String CREATE_SQL_DATABASE_1 = "CREATE TABLE " + NewsContract.NewsEntry_1.TABLE_NAME_1 + "("
            + NewsContract.NewsEntry_1._ID_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_1.COLUMN_NEWS_TITLE_1 + " TEXT, "
            + NewsContract.NewsEntry_1.COLUMN_NEWS_URL_1 + " TEXT, "
            + NewsContract.NewsEntry_1.COLUMN_NEWS_DATE_AND_TIME_1 + " TEXT, "
            + NewsContract.NewsEntry_1.COLUMN_NEWS_IMAGE_1 + " TEXT);";


    private final static String CREATE_SQL_DATABASE_2 = "CREATE TABLE " + NewsContract.NewsEntry_2.TABLE_NAME_2 + "("
            + NewsContract.NewsEntry_2._ID_2 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_2.COLUMN_NEWS_TITLE_2 + " TEXT, "
            + NewsContract.NewsEntry_2.COLUMN_NEWS_URL_2 + " TEXT, "
            + NewsContract.NewsEntry_2.COLUMN_NEWS_DATE_AND_TIME_2 + " TEXT, "
            + NewsContract.NewsEntry_2.COLUMN_NEWS_IMAGE_2 + " TEXT);";


    private final static String CREATE_SQL_DATABASE_3 = "CREATE TABLE " + NewsContract.NewsEntry_3.TABLE_NAME_3 + "("
            + NewsContract.NewsEntry_3._ID_3 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_3.COLUMN_NEWS_TITLE_3 + " TEXT, "
            + NewsContract.NewsEntry_3.COLUMN_NEWS_URL_3 + " TEXT, "
            + NewsContract.NewsEntry_3.COLUMN_NEWS_DATE_AND_TIME_3 + " TEXT, "
            + NewsContract.NewsEntry_3.COLUMN_NEWS_IMAGE_3 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_4 = "CREATE TABLE " + NewsContract.NewsEntry_4.TABLE_NAME_4 + "("
            + NewsContract.NewsEntry_4._ID_4 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_4.COLUMN_NEWS_TITLE_4 + " TEXT, "
            + NewsContract.NewsEntry_4.COLUMN_NEWS_URL_4 + " TEXT, "
            + NewsContract.NewsEntry_4.COLUMN_NEWS_DATE_AND_TIME_4 + " TEXT, "
            + NewsContract.NewsEntry_4.COLUMN_NEWS_IMAGE_4 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_5 = "CREATE TABLE " + NewsContract.NewsEntry_5.TABLE_NAME_5 + "("
            + NewsContract.NewsEntry_5._ID_5 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_5.COLUMN_NEWS_TITLE_5 + " TEXT, "
            + NewsContract.NewsEntry_5.COLUMN_NEWS_URL_5 + " TEXT, "
            + NewsContract.NewsEntry_5.COLUMN_NEWS_DATE_AND_TIME_5 + " TEXT, "
            + NewsContract.NewsEntry_5.COLUMN_NEWS_IMAGE_5 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_6 = "CREATE TABLE " + NewsContract.NewsEntry_6.TABLE_NAME_6 + "("
            + NewsContract.NewsEntry_6._ID_6 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_6.COLUMN_NEWS_TITLE_6 + " TEXT, "
            + NewsContract.NewsEntry_6.COLUMN_NEWS_URL_6 + " TEXT, "
            + NewsContract.NewsEntry_6.COLUMN_NEWS_DATE_AND_TIME_6 + " TEXT, "
            + NewsContract.NewsEntry_6.COLUMN_NEWS_IMAGE_6 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_7 = "CREATE TABLE " + NewsContract.NewsEntry_7.TABLE_NAME_7 + "("
            + NewsContract.NewsEntry_7._ID_7 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_7.COLUMN_NEWS_TITLE_7 + " TEXT, "
            + NewsContract.NewsEntry_7.COLUMN_NEWS_URL_7 + " TEXT, "
            + NewsContract.NewsEntry_7.COLUMN_NEWS_DATE_AND_TIME_7 + " TEXT, "
            + NewsContract.NewsEntry_7.COLUMN_NEWS_IMAGE_7 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_8 = "CREATE TABLE " + NewsContract.NewsEntry_8.TABLE_NAME_8 + "("
            + NewsContract.NewsEntry_8._ID_8 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_8.COLUMN_NEWS_TITLE_8 + " TEXT, "
            + NewsContract.NewsEntry_8.COLUMN_NEWS_URL_8 + " TEXT, "
            + NewsContract.NewsEntry_8.COLUMN_NEWS_DATE_AND_TIME_8 + " TEXT, "
            + NewsContract.NewsEntry_8.COLUMN_NEWS_IMAGE_8 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_9 = "CREATE TABLE " + NewsContract.NewsEntry_9.TABLE_NAME_9 + "("
            + NewsContract.NewsEntry_9._ID_9 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_9.COLUMN_NEWS_TITLE_9 + " TEXT, "
            + NewsContract.NewsEntry_9.COLUMN_NEWS_URL_9 + " TEXT, "
            + NewsContract.NewsEntry_9.COLUMN_NEWS_DATE_AND_TIME_9 + " TEXT, "
            + NewsContract.NewsEntry_9.COLUMN_NEWS_IMAGE_9 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_10 = "CREATE TABLE " + NewsContract.NewsEntry_10.TABLE_NAME_10 + "("
            + NewsContract.NewsEntry_10._ID_10 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_10.COLUMN_NEWS_TITLE_10 + " TEXT, "
            + NewsContract.NewsEntry_10.COLUMN_NEWS_URL_10 + " TEXT, "
            + NewsContract.NewsEntry_10.COLUMN_NEWS_DATE_AND_TIME_10 + " TEXT, "
            + NewsContract.NewsEntry_10.COLUMN_NEWS_IMAGE_10 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_11 = "CREATE TABLE " + NewsContract.NewsEntry_11.TABLE_NAME_11 + "("
            + NewsContract.NewsEntry_11._ID_11 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_11.COLUMN_NEWS_TITLE_11 + " TEXT, "
            + NewsContract.NewsEntry_11.COLUMN_NEWS_URL_11 + " TEXT, "
            + NewsContract.NewsEntry_11.COLUMN_NEWS_DATE_AND_TIME_11 + " TEXT, "
            + NewsContract.NewsEntry_11.COLUMN_NEWS_IMAGE_11 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_12 = "CREATE TABLE " + NewsContract.NewsEntry_12.TABLE_NAME_12 + "("
            + NewsContract.NewsEntry_12._ID_12 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_12.COLUMN_NEWS_TITLE_12 + " TEXT, "
            + NewsContract.NewsEntry_12.COLUMN_NEWS_URL_12 + " TEXT, "
            + NewsContract.NewsEntry_12.COLUMN_NEWS_DATE_AND_TIME_12 + " TEXT, "
            + NewsContract.NewsEntry_12.COLUMN_NEWS_IMAGE_12 + " TEXT);";

    private final static String CREATE_SQL_DATABASE_13 = "CREATE TABLE " + NewsContract.NewsEntry_13.TABLE_NAME_13 + "("
            + NewsContract.NewsEntry_13._ID_13 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NewsContract.NewsEntry_13.COLUMN_NEWS_TITLE_13 + " TEXT, "
            + NewsContract.NewsEntry_13.COLUMN_NEWS_URL_13 + " TEXT, "
            + NewsContract.NewsEntry_13.COLUMN_NEWS_DATE_AND_TIME_13 + " TEXT, "
            + NewsContract.NewsEntry_13.COLUMN_NEWS_IMAGE_13 + " TEXT);";




    public NewsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_SQL_DATABASE_1);
        db.execSQL(CREATE_SQL_DATABASE_2);
        db.execSQL(CREATE_SQL_DATABASE_3);
        db.execSQL(CREATE_SQL_DATABASE_4);
        db.execSQL(CREATE_SQL_DATABASE_5);
        db.execSQL(CREATE_SQL_DATABASE_6);
        db.execSQL(CREATE_SQL_DATABASE_7);
        db.execSQL(CREATE_SQL_DATABASE_8);
        db.execSQL(CREATE_SQL_DATABASE_9);
        db.execSQL(CREATE_SQL_DATABASE_10);
        db.execSQL(CREATE_SQL_DATABASE_11);
        db.execSQL(CREATE_SQL_DATABASE_12);
        db.execSQL(CREATE_SQL_DATABASE_13);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_1.TABLE_NAME_1);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_2.TABLE_NAME_2);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_3.TABLE_NAME_3);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_4.TABLE_NAME_4);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_5.TABLE_NAME_5);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_6.TABLE_NAME_6);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_7.TABLE_NAME_7);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_8.TABLE_NAME_8);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_9.TABLE_NAME_9);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_10.TABLE_NAME_10);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_11.TABLE_NAME_11);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_12.TABLE_NAME_12);
        db.execSQL("DROP TABLE IF EXISTS " + NewsContract.NewsEntry_13.TABLE_NAME_13);

        onCreate(db);
    }
}
