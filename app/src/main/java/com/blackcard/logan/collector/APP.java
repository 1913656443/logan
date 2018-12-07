package com.blackcard.logan.collector;

import android.app.Application;

import com.logan.bluetoothlibrary.BleConfig;
import com.logan.bluetoothlibrary.BleHelper;

/**
 * Created by Logan on 2018/11/6.
 */
public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BleHelper.getInstance().init(this,new BleConfig()
                .setShowLog(true)
                .setRepeatConnect(true)
                .setIntervals(10000)
                .setCyclePower(true));
    }
}
