package com.something.android.latestnews.Fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.something.android.latestnews.Fragment.CategoryAdapter;
import com.something.android.latestnews.R;

public class ViewPagerActivity extends FragmentActivity {

    //ad
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_view_pager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

/*
        MobileAds.initialize(this, "");

        //banner ad
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //interstitial ad
        mInterstitialAd = new InterstitialAd(this);
        // replace adUnitId with your ad id from admob website
        mInterstitialAd.setAdUnitId("");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                finish();
            }
        });
*/

    }


    //ad
    public void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            finish();
        }
    }


    //ad
    @Override
    public void onBackPressed() {
        //show ad of app exit
        //showInterstitial();
    }

}