package com.example.ditfit;

import android.app.Application;
import android.content.Context;

public class WalkCount extends Application {
    public static int currentSteps=0;
    public static int mCounterSteps = 0;

    @Override
    public void onCreate(){
        super.onCreate();
    }


}
