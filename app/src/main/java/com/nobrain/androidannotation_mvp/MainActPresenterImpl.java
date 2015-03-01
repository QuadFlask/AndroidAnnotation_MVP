package com.nobrain.androidannotation_mvp;

import android.os.Handler;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
public class MainActPresenterImpl implements MainActPresenter {

    private final Handler handler;
    private final MainModel mainModel;
    private View view;

    public MainActPresenterImpl(Handler handler) {
        this.handler = handler;
        mainModel = new MainModel();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void onRequestClick() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                final String result = mainModel.requestData();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (view != null) {
                            view.setResultText(result);
                        }
                    }
                });
            }
        }).start();
    }

}
