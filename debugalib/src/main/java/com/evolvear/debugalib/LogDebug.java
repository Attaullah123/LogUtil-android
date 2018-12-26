package com.evolvear.debugalib;

import android.util.Log;

public class LogDebug {

    private static final String TAG ="DUMMYLOG";

    public static void d(String string){
        Log.d(TAG, string);
    }
}
