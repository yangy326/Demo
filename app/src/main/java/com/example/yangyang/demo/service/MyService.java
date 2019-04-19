package com.example.yangyang.demo.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

import com.example.yangyang.demo.broadcastreciever.PhoneReceiver;

public class MyService extends Service {
    PhoneReceiver phoneReceiver;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        IntentFilter intentfilter =new IntentFilter();
        intentfilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
        intentfilter.addAction("android.intent.action.PHONE_STATE");
        intentfilter.setPriority(Integer.MAX_VALUE);
        phoneReceiver = new PhoneReceiver();
        registerReceiver(phoneReceiver, intentfilter);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Log.d(LogCat.TAG,"onStartCommand");

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(phoneReceiver);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
