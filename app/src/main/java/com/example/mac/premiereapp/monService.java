package com.example.mac.premiereapp;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class monService extends Service {
    public monService() {
    }
    Handler hand;
    Runnable run;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        run = new Runnable() {
            @Override
            public void run() {
                Log.d("test", "je suis un service");
                hand.postDelayed(run, 1000);
            }
        };
                hand.postDelayed(run,1000);
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
