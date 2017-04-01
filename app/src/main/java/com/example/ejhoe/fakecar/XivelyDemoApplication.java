package com.example.ejhoe.fakecar;

/**
 * Created by ejhoe on 4/1/2017.
 */

import android.app.Application;

public class XivelyDemoApplication extends Application {

    private static XivelyDemoApplication instance;

    public static XivelyDemoApplication get() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        XiSettings.init(this);
    }
}