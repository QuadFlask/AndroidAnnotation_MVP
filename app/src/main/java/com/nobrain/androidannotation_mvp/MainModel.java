package com.nobrain.androidannotation_mvp;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
public class MainModel {

    public String requestData() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "result";
    }

}
