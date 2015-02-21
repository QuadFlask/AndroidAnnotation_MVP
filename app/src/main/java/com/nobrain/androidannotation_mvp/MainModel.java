package com.nobrain.androidannotation_mvp;

import android.os.Handler;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
public class MainModel {
    private final Handler handler;

    public MainModel(Handler handler) {
        this.handler = handler;
    }

    public void requestData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.sendMessage(handler.obtainMessage(0, "result"));
            }
        }).start();
    }

}
