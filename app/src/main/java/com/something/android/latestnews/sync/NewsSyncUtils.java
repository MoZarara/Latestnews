package com.something.android.latestnews.sync;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

/**
 * Created by MOHAMED on 08/11/2018.
 */

public class NewsSyncUtils {

    private static final String TAG = NewsSyncUtils.class.getSimpleName();

    public static void startImmediateSync(@NonNull final Context context, String requestUrl, String name,int number) {
        Intent intentToSyncImmediately = new Intent(context, NewsSyncIntentService.class);
        intentToSyncImmediately.setAction(requestUrl);
        intentToSyncImmediately.putExtra(name, number);
        context.startService(intentToSyncImmediately);
    }

}
