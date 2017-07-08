package com.example.asus.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Tejas Sherdiwala on 7/3/2017.
 * &copy; Knoxpo
 */

public interface ActivityLifecycleCallback {
    public void onActivityStopped(Activity activity);
    public void onActivityStarted(Activity activity);
    public void onActivitySaveInstanceState(Activity activity, Bundle outState);
    public void onActivityResumed(Activity activity);
    public void onActivityPaused(Activity activity);
    public void onActivityDestroyed(Activity activity);
    public void onActivityCreated(Activity activity, Bundle savedInstanceState);
}
