package com.something.android.latestnews.NewsActivity;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.CursorLoader;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.something.android.latestnews.Adapter.NewsRecyclerAdapter;
import com.something.android.latestnews.R;
import com.something.android.latestnews.data.NewsContract;
import com.something.android.latestnews.sync.NewsSyncUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MOHAMED on 16/08/2018.
 */

public class BusinessFragment extends Fragment implements android.support.v4.app.LoaderManager.LoaderCallbacks<Cursor>,
        NewsRecyclerAdapter.ForecastAdapterOnClickHandler {
    //ad
    private InterstitialAd mInterstitialAd;

    private static final int News_LOADER_ID = 2;
    private TextView mEmptyStateTextView;

    private static final String NEWS_REQUEST_URL =
            "https://newsapi.org/v2/top-headlines?country=eg&category=business&apiKey=9441f8222a0049648c09db8ef0c9f6b7";

    public static final String[] MAIN_FORECAST_PROJECTION = {
            NewsContract.NewsEntry_4.COLUMN_NEWS_TITLE_4,
            NewsContract.NewsEntry_4.COLUMN_NEWS_DATE_AND_TIME_4,
            NewsContract.NewsEntry_4.COLUMN_NEWS_IMAGE_4,
            NewsContract.NewsEntry_4.COLUMN_NEWS_URL_4,
    };


    private int mPosition = RecyclerView.NO_POSITION;


    private RecyclerView recyclerView;
    private NewsRecyclerAdapter recyclerAdapter;

    ProgressBar loadingIndicator;


    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.news_list, container, false);

/*

        MobileAds.initialize(getContext(), "");


        //interstitial ad
        mInterstitialAd = new InterstitialAd(getContext());
        // replace adUnitId with your ad id from admob website
        mInterstitialAd.setAdUnitId("");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }
        });

*/

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_id);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerAdapter = new NewsRecyclerAdapter( getContext(), this);
        recyclerView.setAdapter(recyclerAdapter);



        loadingIndicator = (ProgressBar) rootView.findViewById(R.id.loading_indicator);


        showLoading();

        getActivity().getSupportLoaderManager().initLoader(News_LOADER_ID, null, this);

        NewsSyncUtils.startImmediateSync(getContext(), NEWS_REQUEST_URL, getString(R.string.News_Name_key),  R.string.BusinessNews);


        return rootView;
    }

    @Override
    public android.support.v4.content.Loader<Cursor> onCreateLoader(int loaderId, Bundle args) {

        switch (loaderId) {

            case News_LOADER_ID:

                Uri forecastQueryUri = NewsContract.NewsEntry_4.CONTENT_URI_4;

                return new CursorLoader(getContext(),
                        forecastQueryUri,
                        MAIN_FORECAST_PROJECTION,
                        null,
                        null,
                        null);

            default:
                throw new RuntimeException("Loader Not Implemented: " + loaderId);
        }
    }

    @Override
    public void onLoadFinished(android.support.v4.content.Loader<Cursor> loader, Cursor data) {
        recyclerAdapter.swapCursor(data);


        if (mPosition == RecyclerView.NO_POSITION) mPosition = 0;

        recyclerView.smoothScrollToPosition(mPosition);

        if (data.getCount() != 0) showWeatherDataView();

    }

    @Override
    public void onLoaderReset(android.support.v4.content.Loader<Cursor> loader) {
        recyclerAdapter.swapCursor(null);
    }


    private void showLoading() {
        /* Then, hide the weather data */
        recyclerView.setVisibility(View.INVISIBLE);
        /* Finally, show the loading indicator */
        loadingIndicator.setVisibility(View.VISIBLE);
    }


    private void showWeatherDataView() {
        /* First, hide the loading indicator */
        loadingIndicator.setVisibility(View.INVISIBLE);
        /* Finally, make sure the weather data is visible */
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(String position) {

        Uri newsUri = Uri.parse(position);

        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, newsUri);

        startActivity(websiteIntent);
    }



 /*   //ad
    public void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

        showInterstitial();

    }
*/

}
