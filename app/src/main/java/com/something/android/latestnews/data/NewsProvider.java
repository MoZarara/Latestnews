package com.something.android.latestnews.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by MOHAMED on 08/11/2018.
 */

public class NewsProvider extends ContentProvider {

    private static final String TAG = NewsProvider.class.getSimpleName();



    public static final int CODE_NEWS_1 = 101;
    public static final int CODE_NEWS_2 = 102;
    public static final int CODE_NEWS_3 = 103;
    public static final int CODE_NEWS_4 = 104;
    public static final int CODE_NEWS_5 = 105;
    public static final int CODE_NEWS_6 = 106;
    public static final int CODE_NEWS_7 = 107;
    public static final int CODE_NEWS_8 = 108;
    public static final int CODE_NEWS_9 = 109;
    public static final int CODE_NEWS_10 = 110;
    public static final int CODE_NEWS_11 = 111;
    public static final int CODE_NEWS_12 = 112;
    public static final int CODE_NEWS_13 = 113;


    //public static final int CODE_WEATHER_WITH_DATE = 101;

    private static final UriMatcher sUriMatcher = buildUriMatcher();
    private NewsDbHelper mOpenHelper;


    public static UriMatcher buildUriMatcher() {

        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
        final String authority = NewsContract.CONTENT_AUTHORITY;


        matcher.addURI(authority, NewsContract.PATH_NEWS_1, CODE_NEWS_1);
        matcher.addURI(authority, NewsContract.PATH_NEWS_2, CODE_NEWS_2);
        matcher.addURI(authority, NewsContract.PATH_NEWS_3, CODE_NEWS_3);
        matcher.addURI(authority, NewsContract.PATH_NEWS_4, CODE_NEWS_4);
        matcher.addURI(authority, NewsContract.PATH_NEWS_5, CODE_NEWS_5);
        matcher.addURI(authority, NewsContract.PATH_NEWS_6, CODE_NEWS_6);
        matcher.addURI(authority, NewsContract.PATH_NEWS_7, CODE_NEWS_7);
        matcher.addURI(authority, NewsContract.PATH_NEWS_8, CODE_NEWS_8);
        matcher.addURI(authority, NewsContract.PATH_NEWS_9, CODE_NEWS_9);
        matcher.addURI(authority, NewsContract.PATH_NEWS_10, CODE_NEWS_10);
        matcher.addURI(authority, NewsContract.PATH_NEWS_11, CODE_NEWS_11);
        matcher.addURI(authority, NewsContract.PATH_NEWS_12, CODE_NEWS_12);
        matcher.addURI(authority, NewsContract.PATH_NEWS_13, CODE_NEWS_13);


        //matcher.addURI(authority, NewsContract.PATH_NEWS_1 + "/#", CODE_WEATHER_WITH_DATE);




        return matcher;
    }

    @Override
    public boolean onCreate() {
        mOpenHelper = new NewsDbHelper(getContext());
        return true;
    }


    @Override
    public int bulkInsert(@NonNull Uri uri, @NonNull ContentValues[] values) {
        final SQLiteDatabase db = mOpenHelper.getWritableDatabase();

        int rowsInserted = 0;

        switch (sUriMatcher.match(uri)) {

            case CODE_NEWS_1:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_1 = db.insert(NewsContract.NewsEntry_1.TABLE_NAME_1, null, value);
                        if (_id_1 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }


            case CODE_NEWS_2:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_2 = db.insert(NewsContract.NewsEntry_2.TABLE_NAME_2, null, value);
                        if (_id_2 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }


            case CODE_NEWS_3:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_3 = db.insert(NewsContract.NewsEntry_3.TABLE_NAME_3, null, value);
                        if (_id_3 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_4:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_4 = db.insert(NewsContract.NewsEntry_4.TABLE_NAME_4, null, value);
                        if (_id_4 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_5:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_5 = db.insert(NewsContract.NewsEntry_5.TABLE_NAME_5, null, value);
                        if (_id_5 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_6:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_6 = db.insert(NewsContract.NewsEntry_6.TABLE_NAME_6, null, value);
                        if (_id_6 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_7:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_7 = db.insert(NewsContract.NewsEntry_7.TABLE_NAME_7, null, value);
                        if (_id_7 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_8:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_8 = db.insert(NewsContract.NewsEntry_8.TABLE_NAME_8, null, value);
                        if (_id_8 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_9:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_9 = db.insert(NewsContract.NewsEntry_9.TABLE_NAME_9, null, value);
                        if (_id_9 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_10:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_10 = db.insert(NewsContract.NewsEntry_10.TABLE_NAME_10, null, value);
                        if (_id_10 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_11:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_11 = db.insert(NewsContract.NewsEntry_11.TABLE_NAME_11, null, value);
                        if (_id_11 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_12:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_12 = db.insert(NewsContract.NewsEntry_12.TABLE_NAME_12, null, value);
                        if (_id_12 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }

            case CODE_NEWS_13:
                db.beginTransaction();
                rowsInserted = 0;
                try {
                    for (ContentValues value : values) {

                        long _id_13 = db.insert(NewsContract.NewsEntry_13.TABLE_NAME_13, null, value);
                        if (_id_13 != -1) {
                            rowsInserted++;
                        }
                    }
                    db.setTransactionSuccessful();
                } finally {
                    db.endTransaction();
                }




                if (rowsInserted > 0) {
                    getContext().getContentResolver().notifyChange(uri, null);
                }

                return rowsInserted;

            default:
                return super.bulkInsert(uri, values);
        }
    }


    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection,
                        @Nullable String[] selectionArgs, @Nullable String sortOrder) {

        Cursor cursor;


        switch (sUriMatcher.match(uri)) {


        /*    case CODE_WEATHER_WITH_DATE: {


                String normalizedUtcDateString = uri.getLastPathSegment();


                String[] selectionArguments = new String[]{normalizedUtcDateString};

                cursor = mOpenHelper.getReadableDatabase().query(
                        /* Table we are going to query */
       /*                 NewsContract.NewsEntry_1.TABLE_NAME_1,
                        projection,
                        NewsContract.NewsEntry_1.COLUMN_NEWS_DATE_AND_TIME_1 + " = ? ",
                        selectionArguments,
                        null,
                        null,
                        sortOrder);

                break;
            }*/


            case CODE_NEWS_1: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_1.TABLE_NAME_1,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }


            case CODE_NEWS_2: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_2.TABLE_NAME_2,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }


            case CODE_NEWS_3: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_3.TABLE_NAME_3,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_4: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_4.TABLE_NAME_4,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_5: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_5.TABLE_NAME_5,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_6: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_6.TABLE_NAME_6,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_7: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_7.TABLE_NAME_7,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_8: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_8.TABLE_NAME_8,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_9: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_9.TABLE_NAME_9,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_10: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_10.TABLE_NAME_10,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_11: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_11.TABLE_NAME_11,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_12: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_12.TABLE_NAME_12,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }

            case CODE_NEWS_13: {
                cursor = mOpenHelper.getReadableDatabase().query(
                        NewsContract.NewsEntry_13.TABLE_NAME_13,
                        projection,
                        selection,
                        selectionArgs,
                        null,
                        null,
                        sortOrder);

                break;
            }


            default:
                throw new UnsupportedOperationException("Unknown uri: " + uri);
        }

        cursor.setNotificationUri(getContext().getContentResolver(), uri);
        return cursor;
    }



    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        throw new RuntimeException(
                "We are not implementing insert in Sunshine. Use bulkInsert instead");
    }



    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {

        int numRowsDeleted;

        if (null == selection) selection = "1";

        switch (sUriMatcher.match(uri)) {

            case CODE_NEWS_1:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_1.TABLE_NAME_1,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_2:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_2.TABLE_NAME_2,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_3:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_3.TABLE_NAME_3,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_4:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_4.TABLE_NAME_4,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_5:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_5.TABLE_NAME_5,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_6:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_6.TABLE_NAME_6,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_7:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_7.TABLE_NAME_7,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_8:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_8.TABLE_NAME_8,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_9:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_9.TABLE_NAME_9,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_10:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_10.TABLE_NAME_10,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_11:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_11.TABLE_NAME_11,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_12:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_12.TABLE_NAME_12,
                        selection,
                        selectionArgs);

                break;

            case CODE_NEWS_13:
                numRowsDeleted = mOpenHelper.getWritableDatabase().delete(
                        NewsContract.NewsEntry_13.TABLE_NAME_13,
                        selection,
                        selectionArgs);

                break;


            default:
                throw new UnsupportedOperationException("Unknown uri: " + uri);
        }

        /* If we actually deleted any rows, notify that a change has occurred to this URI */
        if (numRowsDeleted != 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }

        return numRowsDeleted;
    }




    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        throw new RuntimeException("We are not implementing update in Sunshine");
    }


    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        throw new RuntimeException("We are not implementing getType in Sunshine.");
    }


}
