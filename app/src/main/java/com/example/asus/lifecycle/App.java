package com.example.asus.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Tejas Sherdiwala on 7/3/2017.
 * &copy; Knoxpo
 */

public class App extends Application implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    private static int count;
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Log.d("main" , "OnActivity Created" + activity.getLocalClassName());
        count++;
    }

    @Override
    public void onActivityStarted(Activity activity) {




        Log.d("main" , "Started" + activity.getLocalClassName() + " " + count);

        if(count == 1){
            Log.d("main" , "Start : Sync is  going to start");
        }
    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.d("main" , "Resumed" + activity.getLocalClassName());
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.d("main" , "paused" + activity.getLocalClassName());
    }

    @Override
    public void onActivityStopped(Activity activity) {


            Log.d("main" , "Stop" + activity.getLocalClassName() + " " + count);

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        count--;
        Log.d("main" , "Destroy" + activity.getLocalClassName() + " " + count);
    }
}
