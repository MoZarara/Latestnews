package com.something.android.latestnews.sync;

import android.app.IntentService;
import android.content.Intent;

import com.something.android.latestnews.R;
import com.something.android.latestnews.utilities.OpenNewsJsonUtils;

/**
 * Created by MOHAMED on 08/11/2018.
 */

public class NewsSyncIntentService extends IntentService {


    public NewsSyncIntentService() {
        super("NewsSyncIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        String mUrl = intent.getAction();
        int number = (int) intent.getSerializableExtra(getString(R.string.News_Name_key));

        switch (number) {

            case R.string.googleNews: {
                NewsSyncTask.fetchEarthquakeData_1(this, mUrl);

                break;
            }

            case R.string.PolicyNews: {
                NewsSyncTask.fetchEarthquakeData_2(this, mUrl);

                break;
            }

            case R.string.SportsNews: {
                NewsSyncTask.fetchEarthquakeData_3(this, mUrl);

                break;
            }
            case R.string.BusinessNews: {
                NewsSyncTask.fetchEarthquakeData_4(this, mUrl);

                break;
            }
            case R.string.HealthNews: {
                NewsSyncTask.fetchEarthquakeData_5(this, mUrl);

                break;
            }
            case R.string.ScienceNews: {
                NewsSyncTask.fetchEarthquakeData_6(this, mUrl);

                break;
            }
            case R.string.EntertainmentNews: {
                NewsSyncTask.fetchEarthquakeData_7(this, mUrl);

                break;
            }
            case R.string.BBCNews: {
                NewsSyncTask.fetchEarthquakeData_8(this, mUrl);

                break;
            }
            case R.string.Al_JazeeraNews: {
                NewsSyncTask.fetchEarthquakeData_9(this, mUrl);

                break;
            }
            case R.string.CNNNews: {
                NewsSyncTask.fetchEarthquakeData_10(this, mUrl);

                break;
            }
            case R.string.ABCNews: {
                NewsSyncTask.fetchEarthquakeData_11(this, mUrl);

                break;
            }
            case R.string.FoxNews: {
                NewsSyncTask.fetchEarthquakeData_12(this, mUrl);

                break;
            }
            case R.string.BBCSportNews: {
                NewsSyncTask.fetchEarthquakeData_13(this, mUrl);

                break;
            }

        }
        //NewsSyncTask.fetchEarthquakeData_1(this, mUrl);
    }
}

