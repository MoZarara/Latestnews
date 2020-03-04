package com.something.android.latestnews.sync;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.something.android.latestnews.data.NewsContract;
import com.something.android.latestnews.utilities.NetworkUtils;
import com.something.android.latestnews.utilities.OpenNewsJsonUtils;

import java.io.IOException;
import java.net.URL;

/**
 * Created by MOHAMED on 12/11/2018.
 */

public class NewsSyncTask {

    private static final String TAG = NewsSyncTask.class.getSimpleName();



    synchronized public static void fetchEarthquakeData_1(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_1(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_1.CONTENT_URI_1,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_1.CONTENT_URI_1,
                    weatherValues);
        }

    }



    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_2(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/



        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_2(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_2.CONTENT_URI_2,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_2.CONTENT_URI_2,
                    weatherValues);
        }

    }


    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_3(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/



        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_3(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_3.CONTENT_URI_3,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_3.CONTENT_URI_3,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_4(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/



        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_4(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_4.CONTENT_URI_4,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_4.CONTENT_URI_4,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_5(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/



        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_5(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_5.CONTENT_URI_5,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_5.CONTENT_URI_5,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_6(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_6(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_6.CONTENT_URI_6,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_6.CONTENT_URI_6,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_7(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_7(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_7.CONTENT_URI_7,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_7.CONTENT_URI_7,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_8(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_8(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_8.CONTENT_URI_8,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_8.CONTENT_URI_8,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_9(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/



        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_9(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_9.CONTENT_URI_9,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_9.CONTENT_URI_9,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_10(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_10(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_10.CONTENT_URI_10,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_10.CONTENT_URI_10,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_11(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_11(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_11.CONTENT_URI_11,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_11.CONTENT_URI_11,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_12(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_12(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_12.CONTENT_URI_12,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_12.CONTENT_URI_12,
                    weatherValues);
        }

    }

    //---------------------------------------------------------------------------------------


    synchronized public static void fetchEarthquakeData_13(Context context, String requestUrl) {

  /*      try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        URL url = NetworkUtils.createUrl(requestUrl);

        String jsonResponse = null;
        try {
            jsonResponse = NetworkUtils.makeHttpRequest(url);
            //jsonResponse = NetworkUtils.getResponseFromHttpUrl(url);

        } catch (IOException e) {
            Log.e(TAG, "Problem making the HTTP request.", e);
        }

        ContentValues[] weatherValues = OpenNewsJsonUtils.extractNews_13(jsonResponse);

        if (weatherValues != null && weatherValues.length != 0) {
                /* Get a handle on the ContentResolver to delete and insert data */
            ContentResolver sunshineContentResolver = context.getContentResolver();

                /* Delete old weather data because we don't need to keep multiple days' data */
            sunshineContentResolver.delete(
                    NewsContract.NewsEntry_13.CONTENT_URI_13,
                    null,
                    null);

                /* Insert our new weather data into Sunshine's ContentProvider */
            sunshineContentResolver.bulkInsert(
                    NewsContract.NewsEntry_13.CONTENT_URI_13,
                    weatherValues);
        }

    }

}
