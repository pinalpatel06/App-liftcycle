package com.example.asus.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Tejas Sherdiwala on 7/3/2017.
 * &copy; Knoxpo
 */

public class MyApplication extends Application implements ActivityLifecycleCallback {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.d("Application Resumed " , activity.getLocalClassName());
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.d("Application paused" , activity.getLocalClassName());
    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
