package com.something.android.latestnews.Fragment;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.something.android.latestnews.NewsActivity.ABC_News;
import com.something.android.latestnews.NewsActivity.Al_Jazeera_English;
import com.something.android.latestnews.NewsActivity.BBC_News;
import com.something.android.latestnews.NewsActivity.BBC_Sport;
import com.something.android.latestnews.NewsActivity.BusinessFragment;
import com.something.android.latestnews.NewsActivity.CNN;
import com.something.android.latestnews.NewsActivity.EntertainmentFragment;
import com.something.android.latestnews.NewsActivity.Fox_Sports;
import com.something.android.latestnews.NewsActivity.GoogleNewsFragment;
import com.something.android.latestnews.NewsActivity.HealthFragment;
import com.something.android.latestnews.NewsActivity.PolicyFragment;
import com.something.android.latestnews.NewsActivity.ScienceFragment;
import com.something.android.latestnews.NewsActivity.SportsFragment;
import com.something.android.latestnews.R;

/**
 * Created by MOHAMED on 16/08/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GoogleNewsFragment();
        } else if (position == 1) {
            return new PolicyFragment();
        } else if (position == 2) {
            return new SportsFragment();
        } else if (position == 3) {
            return new BusinessFragment();
        }else if (position == 4) {
            return new HealthFragment();
        }else if (position == 5) {
            return new ScienceFragment();
        } else if (position == 6) {
            return new EntertainmentFragment();
            }else if (position == 7) {
            return new BBC_News();
        }else if (position == 8) {
            return new Al_Jazeera_English();
        } else if (position == 9) {
            return new CNN();
        }else if (position == 10) {
            return new ABC_News();
        }else if (position == 11) {
            return new Fox_Sports();
        }  else {
                return new BBC_Sport();
        }
    }

    @Override
    public int getCount() {
        return 13;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Google_news);
        } else if (position == 1) {
            return mContext.getString(R.string.Policy);
        } else if (position == 2) {
            return mContext.getString(R.string.Sports);
        } else if (position == 3) {
            return mContext.getString(R.string.Business);
        }else if (position == 4) {
            return mContext.getString(R.string.Health);
        }else if (position == 5) {
            return mContext.getString(R.string.Science);
        }else if (position == 6) {
            return mContext.getString(R.string.Entertainment);
        }else if (position == 7) {
            return mContext.getString(R.string.BBC_News);
        }else if (position == 8) {
            return mContext.getString(R.string.Al_Jazeera_English);
        }else if (position == 9) {
            return mContext.getString(R.string.CNN);
        }else if (position == 10) {
            return mContext.getString(R.string.ABC_News);
        }else if (position == 11) {
            return mContext.getString(R.string.Fox_Sports);
        }
        else {
            return mContext.getString(R.string.BBC_Sport);
        }
    }
}
