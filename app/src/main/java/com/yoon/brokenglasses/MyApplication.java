package com.yoon.brokenglasses;

import android.app.Application;
import android.content.Context;

/**
 * Created by Yoon on 2017-12-27.
 */

public class MyApplication extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();

        MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.context;
    }
}
