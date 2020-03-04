package com.something.android.latestnews.utilities;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.text.TextUtils;
import android.util.Log;

import com.something.android.latestnews.data.NewsContract;

import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by MOHAMED on 08/11/2018.
 */

public class OpenNewsJsonUtils {

    private static final String TAG = OpenNewsJsonUtils.class.getSimpleName();


    public static ContentValues[] extractNews_1(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_1.COLUMN_NEWS_TITLE_1, title);
                newsValues.put(NewsContract.NewsEntry_1.COLUMN_NEWS_DATE_AND_TIME_1, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_1.COLUMN_NEWS_IMAGE_1, img);
                newsValues.put(NewsContract.NewsEntry_1.COLUMN_NEWS_URL_1, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_2(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_2.COLUMN_NEWS_TITLE_2, title);
                newsValues.put(NewsContract.NewsEntry_2.COLUMN_NEWS_DATE_AND_TIME_2, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_2.COLUMN_NEWS_IMAGE_2, img);
                newsValues.put(NewsContract.NewsEntry_2.COLUMN_NEWS_URL_2, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_3(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_3.COLUMN_NEWS_TITLE_3, title);
                newsValues.put(NewsContract.NewsEntry_3.COLUMN_NEWS_DATE_AND_TIME_3, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_3.COLUMN_NEWS_IMAGE_3, img);
                newsValues.put(NewsContract.NewsEntry_3.COLUMN_NEWS_URL_3, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_4(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_4.COLUMN_NEWS_TITLE_4, title);
                newsValues.put(NewsContract.NewsEntry_4.COLUMN_NEWS_DATE_AND_TIME_4, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_4.COLUMN_NEWS_IMAGE_4, img);
                newsValues.put(NewsContract.NewsEntry_4.COLUMN_NEWS_URL_4, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_5(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_5.COLUMN_NEWS_TITLE_5, title);
                newsValues.put(NewsContract.NewsEntry_5.COLUMN_NEWS_DATE_AND_TIME_5, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_5.COLUMN_NEWS_IMAGE_5, img);
                newsValues.put(NewsContract.NewsEntry_5.COLUMN_NEWS_URL_5, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_6(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_6.COLUMN_NEWS_TITLE_6, title);
                newsValues.put(NewsContract.NewsEntry_6.COLUMN_NEWS_DATE_AND_TIME_6, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_6.COLUMN_NEWS_IMAGE_6, img);
                newsValues.put(NewsContract.NewsEntry_6.COLUMN_NEWS_URL_6, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_7(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_7.COLUMN_NEWS_TITLE_7, title);
                newsValues.put(NewsContract.NewsEntry_7.COLUMN_NEWS_DATE_AND_TIME_7, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_7.COLUMN_NEWS_IMAGE_7, img);
                newsValues.put(NewsContract.NewsEntry_7.COLUMN_NEWS_URL_7, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_8(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_8.COLUMN_NEWS_TITLE_8, title);
                newsValues.put(NewsContract.NewsEntry_8.COLUMN_NEWS_DATE_AND_TIME_8, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_8.COLUMN_NEWS_IMAGE_8, img);
                newsValues.put(NewsContract.NewsEntry_8.COLUMN_NEWS_URL_8, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_9(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_9.COLUMN_NEWS_TITLE_9, title);
                newsValues.put(NewsContract.NewsEntry_9.COLUMN_NEWS_DATE_AND_TIME_9, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_9.COLUMN_NEWS_IMAGE_9, img);
                newsValues.put(NewsContract.NewsEntry_9.COLUMN_NEWS_URL_9, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_10(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_10.COLUMN_NEWS_TITLE_10, title);
                newsValues.put(NewsContract.NewsEntry_10.COLUMN_NEWS_DATE_AND_TIME_10, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_10.COLUMN_NEWS_IMAGE_10, img);
                newsValues.put(NewsContract.NewsEntry_10.COLUMN_NEWS_URL_10, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_11(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_11.COLUMN_NEWS_TITLE_11, title);
                newsValues.put(NewsContract.NewsEntry_11.COLUMN_NEWS_DATE_AND_TIME_11, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_11.COLUMN_NEWS_IMAGE_11, img);
                newsValues.put(NewsContract.NewsEntry_11.COLUMN_NEWS_URL_11, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_12(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_12.COLUMN_NEWS_TITLE_12, title);
                newsValues.put(NewsContract.NewsEntry_12.COLUMN_NEWS_DATE_AND_TIME_12, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_12.COLUMN_NEWS_IMAGE_12, img);
                newsValues.put(NewsContract.NewsEntry_12.COLUMN_NEWS_URL_12, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


    //------------------------------------------------------------------------------------




    public static ContentValues[] extractNews_13(String newsJson) {

        if (TextUtils.isEmpty(newsJson)) {
            return null;
        }

        //List<News> arrayList = new ArrayList<>();
        ContentValues[] weatherContentValues = null;

        try {


            JSONObject mainObject = new JSONObject(newsJson);
            JSONArray newsJSONArray = mainObject.getJSONArray("articles");

            weatherContentValues = new ContentValues[newsJSONArray.length()];

            for (int i = 0; i < newsJSONArray.length(); i++) {

                JSONObject newsObject = newsJSONArray.getJSONObject(i);

                String title = newsObject.getString("title");
                String url = newsObject.getString("url");
                String img = newsObject.getString("urlToImage");
                String dateAndTime = newsObject.getString("publishedAt");


                ContentValues newsValues = new ContentValues();
                newsValues.put(NewsContract.NewsEntry_13.COLUMN_NEWS_TITLE_13, title);
                newsValues.put(NewsContract.NewsEntry_13.COLUMN_NEWS_DATE_AND_TIME_13, dateAndTime);
                newsValues.put(NewsContract.NewsEntry_13.COLUMN_NEWS_IMAGE_13, img);
                newsValues.put(NewsContract.NewsEntry_13.COLUMN_NEWS_URL_13, url);

                weatherContentValues[i] = newsValues;


                /*News news = new News(dateAndTime, title, url, img);
                arrayList.add(news);*/
            }

        } catch (JSONException e) {
            Log.e("QueryUtils صفحه", "مشكله في تحليل نتائج اخبار جيسون", e);
        }

        return weatherContentValues;
    }


}

