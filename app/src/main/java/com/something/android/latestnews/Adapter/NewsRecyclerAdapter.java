package com.something.android.latestnews.Adapter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.something.android.latestnews.R;
import com.something.android.latestnews.data.NewsContract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by MOHAMED on 08/11/2018.
 */

public class NewsRecyclerAdapter extends RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolder>  {

    private final Context context;
    private Cursor mCursor;

    private final ForecastAdapterOnClickHandler mClickHandler;

    public interface ForecastAdapterOnClickHandler {
        void onClick(String position);
    }

    public NewsRecyclerAdapter(@NonNull Context context, ForecastAdapterOnClickHandler clickHandler) {
        this.context = context;
        mClickHandler = clickHandler;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imgImageView;
        public TextView timeTextView;
        public TextView dateTextView;
        public TextView titleTextView;
        public LinearLayout shareButton;
        public TextView emptyView;


        public ViewHolder(View itemView) {
            super(itemView);

            imgImageView = (ImageView)itemView.findViewById(R.id.image_view);
            timeTextView = (TextView) itemView.findViewById(R.id.time_view);
            dateTextView = (TextView) itemView.findViewById(R.id.date_view);
            titleTextView = (TextView) itemView.findViewById(R.id.title_view);

            shareButton = (LinearLayout) itemView.findViewById(R.id.share_view);
            emptyView = (TextView) itemView.findViewById(R.id.empty);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            final int index = getAdapterPosition();

            mCursor.moveToPosition(index);

            int position_1 = mCursor.getColumnIndex(NewsContract.NewsEntry_1.COLUMN_NEWS_URL_1);
            int position_2 = mCursor.getColumnIndex(NewsContract.NewsEntry_2.COLUMN_NEWS_URL_2);
            int position_3 = mCursor.getColumnIndex(NewsContract.NewsEntry_3.COLUMN_NEWS_URL_3);
            int position_4 = mCursor.getColumnIndex(NewsContract.NewsEntry_4.COLUMN_NEWS_URL_4);
            int position_5 = mCursor.getColumnIndex(NewsContract.NewsEntry_5.COLUMN_NEWS_URL_5);
            int position_6 = mCursor.getColumnIndex(NewsContract.NewsEntry_6.COLUMN_NEWS_URL_6);
            int position_7 = mCursor.getColumnIndex(NewsContract.NewsEntry_7.COLUMN_NEWS_URL_7);
            int position_8 = mCursor.getColumnIndex(NewsContract.NewsEntry_8.COLUMN_NEWS_URL_8);
            int position_9 = mCursor.getColumnIndex(NewsContract.NewsEntry_9.COLUMN_NEWS_URL_9);
            int position_10 = mCursor.getColumnIndex(NewsContract.NewsEntry_10.COLUMN_NEWS_URL_10);
            int position_11 = mCursor.getColumnIndex(NewsContract.NewsEntry_11.COLUMN_NEWS_URL_11);
            int position_12 = mCursor.getColumnIndex(NewsContract.NewsEntry_12.COLUMN_NEWS_URL_12);
            int position_13 = mCursor.getColumnIndex(NewsContract.NewsEntry_13.COLUMN_NEWS_URL_13);


            final String getUrl1 = mCursor.getString(position_1);
            final String getUrl2 = mCursor.getString(position_2);
            final String getUrl3 = mCursor.getString(position_3);
            final String getUrl4 = mCursor.getString(position_4);
            final String getUrl5 = mCursor.getString(position_5);
            final String getUrl6 = mCursor.getString(position_6);
            final String getUrl7 = mCursor.getString(position_7);
            final String getUrl8 = mCursor.getString(position_8);
            final String getUrl9 = mCursor.getString(position_9);
            final String getUrl10 = mCursor.getString(position_10);
            final String getUrl11 = mCursor.getString(position_11);
            final String getUrl12 = mCursor.getString(position_12);
            final String getUrl13 = mCursor.getString(position_13);


            String urlPosition = null;

            if (getUrl1 != null){
                urlPosition = getUrl1;
            } else if (getUrl2 != null){
                urlPosition = getUrl2;
            }  else if (getUrl3 != null){
                urlPosition = getUrl3;
            } else if (getUrl4 != null){
                urlPosition = getUrl4;
            } else if (getUrl5 != null){
                urlPosition = getUrl5;
            } else if (getUrl6 != null){
                urlPosition = getUrl6;
            } else if (getUrl7 != null){
                urlPosition = getUrl7;
            } else if (getUrl8 != null){
                urlPosition = getUrl8;
            } else if (getUrl9 != null){
                urlPosition = getUrl9;
            } else if (getUrl10 != null){
                urlPosition = getUrl10;
            } else if (getUrl11 != null){
                urlPosition = getUrl11;
            } else if (getUrl12 != null){
                urlPosition = getUrl12;
            } else if (getUrl13 != null){
                urlPosition = getUrl13;
            }

            mClickHandler.onClick(urlPosition);
            //mClickHandler.onClick(getUrl2);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Context imageContext = holder.imgImageView.getContext();


        mCursor.moveToPosition(position);

        holder.setIsRecyclable(false);



        int titleColumnIndex = mCursor.getColumnIndex(NewsContract.NewsEntry_1.COLUMN_NEWS_TITLE_1);
        String getTitle = mCursor.getString(titleColumnIndex);
        holder.titleTextView.setText(getTitle);

        int imageColumnIndex = mCursor.getColumnIndex(NewsContract.NewsEntry_1.COLUMN_NEWS_IMAGE_1);
        String getStringImage = mCursor.getString(imageColumnIndex);

        if (holder.imgImageView == null && getStringImage == null || getStringImage.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {

            Glide.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.get().load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);

        }



        int dateAndTimeColumnIndex = mCursor.getColumnIndex(NewsContract.NewsEntry_1.COLUMN_NEWS_DATE_AND_TIME_1);
        String getdateAndTime = mCursor.getString(dateAndTimeColumnIndex);

        String dateObject = new String(getdateAndTime);

        String formatteTime = formatTime(dateObject);
        holder.dateTextView.setText(formatteTime);


        String formattedDate = formatDate(dateObject);
        holder.timeTextView.setText(formattedDate);


        int urlColumnIndex = mCursor.getColumnIndex(NewsContract.NewsEntry_1.COLUMN_NEWS_URL_1);
        final String getUrl = mCursor.getString(urlColumnIndex);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl);
            }
        });






        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_2 = mCursor.getColumnIndex(NewsContract.NewsEntry_2.COLUMN_NEWS_TITLE_2);
        String getTitle_2 = mCursor.getString(titleColumnIndex_2);
        holder.titleTextView.setText(getTitle_2);

        int imageColumnIndex_2 = mCursor.getColumnIndex(NewsContract.NewsEntry_2.COLUMN_NEWS_IMAGE_2);
        String getStringImage_2 = mCursor.getString(imageColumnIndex_2);

        if (holder.imgImageView == null && getStringImage_2 == null || getStringImage_2.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {

            Glide.with(imageContext).load(getStringImage_2).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);
        }


        int dateAndTimeColumnIndex_2 = mCursor.getColumnIndex(NewsContract.NewsEntry_2.COLUMN_NEWS_DATE_AND_TIME_2);
        String getdateAndTime_2 = mCursor.getString(dateAndTimeColumnIndex_2);

        String dateObject_2 = new String(getdateAndTime_2);

        String formatteTime_2 = formatTime(dateObject_2);
        holder.dateTextView.setText(formatteTime_2);


        String formattedDate_2 = formatDate(dateObject_2);
        holder.timeTextView.setText(formattedDate_2);


        int urlColumnIndex_2 = mCursor.getColumnIndex(NewsContract.NewsEntry_2.COLUMN_NEWS_URL_2);
        final String getUrl_2 = mCursor.getString(urlColumnIndex_2);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_2);
            }
        });




        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_3 = mCursor.getColumnIndex(NewsContract.NewsEntry_3.COLUMN_NEWS_TITLE_3);
        String getTitle_3 = mCursor.getString(titleColumnIndex_3);
        holder.titleTextView.setText(getTitle_3);

        int imageColumnIndex_3 = mCursor.getColumnIndex(NewsContract.NewsEntry_3.COLUMN_NEWS_IMAGE_3);
        String getStringImage_3 = mCursor.getString(imageColumnIndex_3);

        if (holder.imgImageView == null && getStringImage_3 == null || getStringImage_3.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {

            Glide.with(imageContext).load(getStringImage_3).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);
        }


        int dateAndTimeColumnIndex_3 = mCursor.getColumnIndex(NewsContract.NewsEntry_3.COLUMN_NEWS_DATE_AND_TIME_3);
        String getdateAndTime_3 = mCursor.getString(dateAndTimeColumnIndex_3);

        String dateObject_3 = new String(getdateAndTime_3);

        String formatteTime_3 = formatTime(dateObject_3);
        holder.dateTextView.setText(formatteTime_3);


        String formattedDate_3 = formatDate(dateObject_3);
        holder.timeTextView.setText(formattedDate_3);


        int urlColumnIndex_3 = mCursor.getColumnIndex(NewsContract.NewsEntry_3.COLUMN_NEWS_URL_3);
        final String getUrl_3 = mCursor.getString(urlColumnIndex_3);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_3);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_4 = mCursor.getColumnIndex(NewsContract.NewsEntry_4.COLUMN_NEWS_TITLE_4);
        String getTitle_4 = mCursor.getString(titleColumnIndex_4);
        holder.titleTextView.setText(getTitle_4);

        int imageColumnIndex_4 = mCursor.getColumnIndex(NewsContract.NewsEntry_4.COLUMN_NEWS_IMAGE_4);
        String getStringImage_4 = mCursor.getString(imageColumnIndex_4);

        if (holder.imgImageView == null && getStringImage_4 == null || getStringImage_4.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Glide.with(imageContext).load(getStringImage_4).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);
        }


        int dateAndTimeColumnIndex_4 = mCursor.getColumnIndex(NewsContract.NewsEntry_4.COLUMN_NEWS_DATE_AND_TIME_4);
        String getdateAndTime_4 = mCursor.getString(dateAndTimeColumnIndex_4);

        String dateObject_4 = new String(getdateAndTime_4);

        String formatteTime_4 = formatTime(dateObject_4);
        holder.dateTextView.setText(formatteTime_4);


        String formattedDate_4 = formatDate(dateObject_4);
        holder.timeTextView.setText(formattedDate_4);


        int urlColumnIndex_4 = mCursor.getColumnIndex(NewsContract.NewsEntry_4.COLUMN_NEWS_URL_4);
        final String getUrl_4 = mCursor.getString(urlColumnIndex_4);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_4);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_5 = mCursor.getColumnIndex(NewsContract.NewsEntry_5.COLUMN_NEWS_TITLE_5);
        String getTitle_5 = mCursor.getString(titleColumnIndex_5);
        holder.titleTextView.setText(getTitle_5);

        int imageColumnIndex_5 = mCursor.getColumnIndex(NewsContract.NewsEntry_5.COLUMN_NEWS_IMAGE_5);
        String getStringImage_5 = mCursor.getString(imageColumnIndex_5);

        if (holder.imgImageView == null && getStringImage_5 == null || getStringImage_5.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {

            Glide.with(imageContext).load(getStringImage_5).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);

        }


        int dateAndTimeColumnIndex_5 = mCursor.getColumnIndex(NewsContract.NewsEntry_5.COLUMN_NEWS_DATE_AND_TIME_5);
        String getdateAndTime_5 = mCursor.getString(dateAndTimeColumnIndex_5);

        String dateObject_5 = new String(getdateAndTime_5);

        String formatteTime_5 = formatTime(dateObject_5);
        holder.dateTextView.setText(formatteTime_5);


        String formattedDate_5 = formatDate(dateObject_5);
        holder.timeTextView.setText(formattedDate_5);


        int urlColumnIndex_5 = mCursor.getColumnIndex(NewsContract.NewsEntry_5.COLUMN_NEWS_URL_5);
        final String getUrl_5 = mCursor.getString(urlColumnIndex_5);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_5);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_6 = mCursor.getColumnIndex(NewsContract.NewsEntry_6.COLUMN_NEWS_TITLE_6);
        String getTitle_6 = mCursor.getString(titleColumnIndex_6);
        holder.titleTextView.setText(getTitle_6);

        int imageColumnIndex_6 = mCursor.getColumnIndex(NewsContract.NewsEntry_6.COLUMN_NEWS_IMAGE_6);
        String getStringImage_6 = mCursor.getString(imageColumnIndex_6);

        if (holder.imgImageView == null && getStringImage_6 == null || getStringImage_6.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Glide.with(imageContext).load(getStringImage_6).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);

        }


        int dateAndTimeColumnIndex_6 = mCursor.getColumnIndex(NewsContract.NewsEntry_6.COLUMN_NEWS_DATE_AND_TIME_6);
        String getdateAndTime_6 = mCursor.getString(dateAndTimeColumnIndex_6);

        String dateObject_6 = new String(getdateAndTime_6);

        String formatteTime_6 = formatTime(dateObject_6);
        holder.dateTextView.setText(formatteTime_6);


        String formattedDate_6 = formatDate(dateObject_6);
        holder.timeTextView.setText(formattedDate_6);


        int urlColumnIndex_6 = mCursor.getColumnIndex(NewsContract.NewsEntry_6.COLUMN_NEWS_URL_6);
        final String getUrl_6 = mCursor.getString(urlColumnIndex_6);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_6);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_7 = mCursor.getColumnIndex(NewsContract.NewsEntry_7.COLUMN_NEWS_TITLE_7);
        String getTitle_7 = mCursor.getString(titleColumnIndex_7);
        holder.titleTextView.setText(getTitle_7);

        int imageColumnIndex_7 = mCursor.getColumnIndex(NewsContract.NewsEntry_7.COLUMN_NEWS_IMAGE_7);
        String getStringImage_7 = mCursor.getString(imageColumnIndex_7);

        if (holder.imgImageView == null && getStringImage_7 == null || getStringImage_7.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Glide.with(imageContext).load(getStringImage_7).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);

        }


        int dateAndTimeColumnIndex_7 = mCursor.getColumnIndex(NewsContract.NewsEntry_7.COLUMN_NEWS_DATE_AND_TIME_7);
        String getdateAndTime_7 = mCursor.getString(dateAndTimeColumnIndex_7);

        String dateObject_7 = new String(getdateAndTime_7);

        String formatteTime_7 = formatTime(dateObject_7);
        holder.dateTextView.setText(formatteTime_7);


        String formattedDate_7 = formatDate(dateObject_7);
        holder.timeTextView.setText(formattedDate_7);


        int urlColumnIndex_7 = mCursor.getColumnIndex(NewsContract.NewsEntry_7.COLUMN_NEWS_URL_7);
        final String getUrl_7 = mCursor.getString(urlColumnIndex_7);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_7);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_8 = mCursor.getColumnIndex(NewsContract.NewsEntry_8.COLUMN_NEWS_TITLE_8);
        String getTitle_8 = mCursor.getString(titleColumnIndex_8);
        holder.titleTextView.setText(getTitle_8);

        int imageColumnIndex_8 = mCursor.getColumnIndex(NewsContract.NewsEntry_8.COLUMN_NEWS_IMAGE_8);
        String getStringImage_8 = mCursor.getString(imageColumnIndex_8);

        if (holder.imgImageView == null && getStringImage_8 == null || getStringImage_8.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Glide.with(imageContext).load(getStringImage_8).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);

        }


        int dateAndTimeColumnIndex_8 = mCursor.getColumnIndex(NewsContract.NewsEntry_8.COLUMN_NEWS_DATE_AND_TIME_8);
        String getdateAndTime_8 = mCursor.getString(dateAndTimeColumnIndex_8);

        String dateObject_8 = new String(getdateAndTime_8);

        String formatteTime_8 = formatTime(dateObject_8);
        holder.dateTextView.setText(formatteTime_8);


        String formattedDate_8 = formatDate(dateObject_8);
        holder.timeTextView.setText(formattedDate_8);


        int urlColumnIndex_8 = mCursor.getColumnIndex(NewsContract.NewsEntry_8.COLUMN_NEWS_URL_8);
        final String getUrl_8 = mCursor.getString(urlColumnIndex_8);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_8);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_9 = mCursor.getColumnIndex(NewsContract.NewsEntry_9.COLUMN_NEWS_TITLE_9);
        String getTitle_9 = mCursor.getString(titleColumnIndex_9);
        holder.titleTextView.setText(getTitle_9);

        int imageColumnIndex_9 = mCursor.getColumnIndex(NewsContract.NewsEntry_9.COLUMN_NEWS_IMAGE_9);
        String getStringImage_9 = mCursor.getString(imageColumnIndex_9);

        if (holder.imgImageView == null && getStringImage_9 == null || getStringImage_9.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Glide.with(imageContext).load(getStringImage_9).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);
        }


        int dateAndTimeColumnIndex_9 = mCursor.getColumnIndex(NewsContract.NewsEntry_9.COLUMN_NEWS_DATE_AND_TIME_9);
        String getdateAndTime_9 = mCursor.getString(dateAndTimeColumnIndex_9);

        String dateObject_9 = new String(getdateAndTime_9);

        String formatteTime_9 = formatTime(dateObject_9);
        holder.dateTextView.setText(formatteTime_9);


        String formattedDate_9 = formatDate(dateObject_9);
        holder.timeTextView.setText(formattedDate_9);


        int urlColumnIndex_9 = mCursor.getColumnIndex(NewsContract.NewsEntry_9.COLUMN_NEWS_URL_9);
        final String getUrl_9 = mCursor.getString(urlColumnIndex_9);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_9);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_10 = mCursor.getColumnIndex(NewsContract.NewsEntry_10.COLUMN_NEWS_TITLE_10);
        String getTitle_10 = mCursor.getString(titleColumnIndex_10);
        holder.titleTextView.setText(getTitle_10);

        int imageColumnIndex_10 = mCursor.getColumnIndex(NewsContract.NewsEntry_10.COLUMN_NEWS_IMAGE_10);
        String getStringImage_10 = mCursor.getString(imageColumnIndex_10);

        if (holder.imgImageView == null && getStringImage_10 == null || getStringImage_10.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {

            Glide.with(imageContext).load(getStringImage_10).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);

        }


        int dateAndTimeColumnIndex_10 = mCursor.getColumnIndex(NewsContract.NewsEntry_10.COLUMN_NEWS_DATE_AND_TIME_10);
        String getdateAndTime_10 = mCursor.getString(dateAndTimeColumnIndex_10);

        String dateObject_10 = new String(getdateAndTime_10);

        String formatteTime_10 = formatTime(dateObject_10);
        holder.dateTextView.setText(formatteTime_10);


        String formattedDate_10 = formatDate(dateObject_10);
        holder.timeTextView.setText(formattedDate_10);


        int urlColumnIndex_10 = mCursor.getColumnIndex(NewsContract.NewsEntry_10.COLUMN_NEWS_URL_10);
        final String getUrl_10 = mCursor.getString(urlColumnIndex_10);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_10);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_11 = mCursor.getColumnIndex(NewsContract.NewsEntry_11.COLUMN_NEWS_TITLE_11);
        String getTitle_11 = mCursor.getString(titleColumnIndex_11);
        holder.titleTextView.setText(getTitle_11);

        int imageColumnIndex_11 = mCursor.getColumnIndex(NewsContract.NewsEntry_11.COLUMN_NEWS_IMAGE_11);
        String getStringImage_11 = mCursor.getString(imageColumnIndex_11);

        if (holder.imgImageView == null && getStringImage_11 == null || getStringImage_11.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Glide.with(imageContext).load(getStringImage_11).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);
        }


        int dateAndTimeColumnIndex_11 = mCursor.getColumnIndex(NewsContract.NewsEntry_11.COLUMN_NEWS_DATE_AND_TIME_11);
        String getdateAndTime_11 = mCursor.getString(dateAndTimeColumnIndex_11);

        String dateObject_11 = new String(getdateAndTime_11);

        String formatteTime_11 = formatTime(dateObject_11);
        holder.dateTextView.setText(formatteTime_11);


        String formattedDate_11 = formatDate(dateObject_11);
        holder.timeTextView.setText(formattedDate_11);


        int urlColumnIndex_11 = mCursor.getColumnIndex(NewsContract.NewsEntry_11.COLUMN_NEWS_URL_11);
        final String getUrl_11 = mCursor.getString(urlColumnIndex_11);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_11);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_12 = mCursor.getColumnIndex(NewsContract.NewsEntry_12.COLUMN_NEWS_TITLE_12);
        String getTitle_12 = mCursor.getString(titleColumnIndex_12);
        holder.titleTextView.setText(getTitle_12);

        int imageColumnIndex_12 = mCursor.getColumnIndex(NewsContract.NewsEntry_12.COLUMN_NEWS_IMAGE_12);
        String getStringImage_12 = mCursor.getString(imageColumnIndex_12);

        if (holder.imgImageView == null && getStringImage_12 == null || getStringImage_12.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Glide.with(imageContext).load(getStringImage_12).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);
        }


        int dateAndTimeColumnIndex_12 = mCursor.getColumnIndex(NewsContract.NewsEntry_12.COLUMN_NEWS_DATE_AND_TIME_12);
        String getdateAndTime_12 = mCursor.getString(dateAndTimeColumnIndex_12);

        String dateObject_12 = new String(getdateAndTime_12);

        String formatteTime_12 = formatTime(dateObject_12);
        holder.dateTextView.setText(formatteTime_12);


        String formattedDate_12 = formatDate(dateObject_12);
        holder.timeTextView.setText(formattedDate_12);


        int urlColumnIndex_12 = mCursor.getColumnIndex(NewsContract.NewsEntry_12.COLUMN_NEWS_URL_12);
        final String getUrl_12 = mCursor.getString(urlColumnIndex_12);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_12);
            }
        });


        //-------------------------------------------------------------------------------------------------------



        int titleColumnIndex_13 = mCursor.getColumnIndex(NewsContract.NewsEntry_13.COLUMN_NEWS_TITLE_13);
        String getTitle_13 = mCursor.getString(titleColumnIndex_13);
        holder.titleTextView.setText(getTitle_13);

        int imageColumnIndex_13 = mCursor.getColumnIndex(NewsContract.NewsEntry_13.COLUMN_NEWS_IMAGE_13);
        String getStringImage_13 = mCursor.getString(imageColumnIndex_13);

        if (holder.imgImageView == null && getStringImage_13 == null || getStringImage_13.equals("")){
            Glide.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {

            Glide.with(imageContext).load(getStringImage_13).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
            //Picasso.with(imageContext).load(getStringImage).into(holder.imgImageView);
        }


        int dateAndTimeColumnIndex_13 = mCursor.getColumnIndex(NewsContract.NewsEntry_13.COLUMN_NEWS_DATE_AND_TIME_13);
        String getdateAndTime_13 = mCursor.getString(dateAndTimeColumnIndex_13);

        String dateObject_13 = new String(getdateAndTime_13);

        String formatteTime_13 = formatTime(dateObject_13);
        holder.dateTextView.setText(formatteTime_13);


        String formattedDate_13 = formatDate(dateObject_13);
        holder.timeTextView.setText(formattedDate_13);


        int urlColumnIndex_13 = mCursor.getColumnIndex(NewsContract.NewsEntry_13.COLUMN_NEWS_URL_13);
        final String getUrl_13 = mCursor.getString(urlColumnIndex_13);

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doShareLink("oooooo", getUrl_13);
            }
        });




        holder.emptyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




/*

        final News currentNews = dataList.get(position);
        Context imageContext = holder.imgImageView.getContext();

        if (holder.imgImageView == null || currentNews.getmImg() == null || holder.imgImageView.equals("")){

            Picasso.with(imageContext).load(R.drawable.noimageavailable).into(holder.imgImageView);

        } else {
            Picasso.with(imageContext).load(currentNews.getmImg()).placeholder(R.drawable.noimageavailable).into(holder.imgImageView);
        }


*/
    }

    @Override
    public int getItemCount() {

        if (null == mCursor) return 0;
        return mCursor.getCount();
    }

    @Override
    public int getItemViewType(int position) {

        return mCursor.getPosition();
    }



    public static String formatDate(String dateObject) {
        String DATE_FORMAT_I = "yyyy-MM-dd'T'HH:mm:ss";
        String DATE_FORMAT_O = "dd LLL, yyyy";
/*
        formatOutput.setTimeZone(TimeZone.getTimeZone("Asia/Dubai"));
        //formatOutput.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
*/

        SimpleDateFormat sourceFormat = new SimpleDateFormat(DATE_FORMAT_I);
        sourceFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date parsed = null; // => Date is in UTC now
        try {
            parsed = sourceFormat.parse(dateObject);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        TimeZone tz = TimeZone.getTimeZone("Africa/Cairo");
        SimpleDateFormat destFormat = new SimpleDateFormat(DATE_FORMAT_O);
        destFormat.setTimeZone(tz);

        String dateString = destFormat.format(parsed);

        return dateString;
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    public static String formatTime(String dateObject) {

        String DATE_FORMAT_I = "yyyy-MM-dd'T'HH:mm:ss";
        String DATE_FORMAT_O = "h:mm a";
/*
        formatOutput.setTimeZone(TimeZone.getTimeZone("Asia/Dubai"));
        //formatOutput.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
*/

        SimpleDateFormat sourceFormat = new SimpleDateFormat(DATE_FORMAT_I);
        sourceFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date parsed = null; // => Date is in UTC now
        try {
            parsed = sourceFormat.parse(dateObject);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        TimeZone tz = TimeZone.getTimeZone("Africa/Cairo");
        SimpleDateFormat destFormat = new SimpleDateFormat(DATE_FORMAT_O);
        destFormat.setTimeZone(tz);

        String dateString = destFormat.format(parsed);

        return dateString;
    }



    private void doShareLink(String text, String link) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        Intent chooserIntent = Intent.createChooser(shareIntent, context.getString(R.string.share_message));

        // for 21+, we can use EXTRA_REPLACEMENT_EXTRAS to support the specific case of Facebook
        // (only supports a link)
        // >=21: facebook=link, other=text+link
        // <=20: all=link
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            shareIntent.putExtra(Intent.EXTRA_TEXT, text + " " + link);
            Bundle facebookBundle = new Bundle();
            facebookBundle.putString(Intent.EXTRA_TEXT, link);
            Bundle replacement = new Bundle();
            replacement.putBundle("com.facebook.katana", facebookBundle);
            chooserIntent.putExtra(Intent.EXTRA_REPLACEMENT_EXTRAS, replacement);
        } else {
            shareIntent.putExtra(Intent.EXTRA_TEXT, link);
        }

        chooserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(chooserIntent);
    }




    public void swapCursor(Cursor newCursor) {
        mCursor = newCursor;
//      COMPLETED (12) After the new Cursor is set, call notifyDataSetChanged
        notifyDataSetChanged();
    }



/*
    public News getItem(int position) {
        News news = dataList.get(position);
        return news;
    }
*/
/*
    public void addAll(List<News> items){
        if(this.dataList == null){
            this.dataList = new ArrayList<>();
        }
        this.dataList.addAll(items);
        notifyDataSetChanged();
    }
*/
/*
    public void clear(){
        if(dataList != null){
            dataList.clear();
            notifyDataSetChanged();
        }
    }
    */
}
