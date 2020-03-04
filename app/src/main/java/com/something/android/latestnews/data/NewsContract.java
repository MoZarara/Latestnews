package com.something.android.latestnews.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by MOHAMED on 08/11/2018.
 */

public class NewsContract {

    public NewsContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.something.android.latestnews";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_NEWS_1 = "news1";
    public static final String PATH_NEWS_2 = "news2";
    public static final String PATH_NEWS_3 = "news3";
    public static final String PATH_NEWS_4 = "news4";
    public static final String PATH_NEWS_5 = "news5";
    public static final String PATH_NEWS_6 = "news6";
    public static final String PATH_NEWS_7 = "news7";
    public static final String PATH_NEWS_8 = "news8";
    public static final String PATH_NEWS_9 = "news9";
    public static final String PATH_NEWS_10 = "news10";
    public static final String PATH_NEWS_11 = "news11";
    public static final String PATH_NEWS_12 = "news12";
    public static final String PATH_NEWS_13 = "news13";




    public static final class NewsEntry_1 implements BaseColumns {


        public static Uri CONTENT_URI_1 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_1)
                .build();



        public final static String TABLE_NAME_1 = "news1";

        public final static String _ID_1 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_1 = "title";
        public final static String COLUMN_NEWS_URL_1 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_1 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_1 = "urlToImage";

    }


    public static final class NewsEntry_2 implements BaseColumns {


        public static Uri CONTENT_URI_2 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_2)
                .build();


        public final static String TABLE_NAME_2 = "news2";

        public final static String _ID_2 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_2 = "title";
        public final static String COLUMN_NEWS_URL_2 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_2 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_2 = "urlToImage";

    }


    public static final class NewsEntry_3 implements BaseColumns {


        public static Uri CONTENT_URI_3 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_3)
                .build();


        public final static String TABLE_NAME_3 = "news3";

        public final static String _ID_3 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_3 = "title";
        public final static String COLUMN_NEWS_URL_3 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_3 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_3 = "urlToImage";

    }

    public static final class NewsEntry_4 implements BaseColumns {


        public static Uri CONTENT_URI_4 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_4)
                .build();


        public final static String TABLE_NAME_4 = "news4";

        public final static String _ID_4 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_4 = "title";
        public final static String COLUMN_NEWS_URL_4 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_4 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_4 = "urlToImage";

    }

    public static final class NewsEntry_5 implements BaseColumns {


        public static Uri CONTENT_URI_5 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_5)
                .build();


        public final static String TABLE_NAME_5 = "news5";

        public final static String _ID_5 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_5 = "title";
        public final static String COLUMN_NEWS_URL_5 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_5 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_5 = "urlToImage";

    }

    public static final class NewsEntry_6 implements BaseColumns {


        public static Uri CONTENT_URI_6 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_6)
                .build();


        public final static String TABLE_NAME_6 = "news6";

        public final static String _ID_6 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_6 = "title";
        public final static String COLUMN_NEWS_URL_6 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_6 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_6 = "urlToImage";

    }

    public static final class NewsEntry_7 implements BaseColumns {


        public static Uri CONTENT_URI_7 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_7)
                .build();


        public final static String TABLE_NAME_7 = "news7";

        public final static String _ID_7 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_7 = "title";
        public final static String COLUMN_NEWS_URL_7 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_7 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_7 = "urlToImage";

    }

    public static final class NewsEntry_8 implements BaseColumns {


        public static Uri CONTENT_URI_8 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_8)
                .build();


        public final static String TABLE_NAME_8 = "news8";

        public final static String _ID_8 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_8 = "title";
        public final static String COLUMN_NEWS_URL_8 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_8 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_8 = "urlToImage";

    }

    public static final class NewsEntry_9 implements BaseColumns {


        public static Uri CONTENT_URI_9 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_9)
                .build();


        public final static String TABLE_NAME_9 = "news9";

        public final static String _ID_9 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_9 = "title";
        public final static String COLUMN_NEWS_URL_9 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_9 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_9 = "urlToImage";

    }

    public static final class NewsEntry_10 implements BaseColumns {


        public static Uri CONTENT_URI_10 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_10)
                .build();


        public final static String TABLE_NAME_10 = "news10";

        public final static String _ID_10 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_10 = "title";
        public final static String COLUMN_NEWS_URL_10 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_10 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_10 = "urlToImage";

    }

    public static final class NewsEntry_11 implements BaseColumns {


        public static Uri CONTENT_URI_11 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_11)
                .build();


        public final static String TABLE_NAME_11 = "news11";

        public final static String _ID_11 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_11 = "title";
        public final static String COLUMN_NEWS_URL_11 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_11 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_11 = "urlToImage";

    }

    public static final class NewsEntry_12 implements BaseColumns {


        public static Uri CONTENT_URI_12 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_12)
                .build();


        public final static String TABLE_NAME_12 = "news12";

        public final static String _ID_12 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_12 = "title";
        public final static String COLUMN_NEWS_URL_12 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_12 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_12 = "urlToImage";

    }

    public static final class NewsEntry_13 implements BaseColumns {


        public static Uri CONTENT_URI_13 = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NEWS_13)
                .build();


        public final static String TABLE_NAME_13 = "news13";

        public final static String _ID_13 = BaseColumns._ID;

        public final static String COLUMN_NEWS_TITLE_13 = "title";
        public final static String COLUMN_NEWS_URL_13 = "url";
        public final static String COLUMN_NEWS_DATE_AND_TIME_13 = "publishedAt";
        public final static String COLUMN_NEWS_IMAGE_13 = "urlToImage";

    }

}
