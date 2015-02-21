package com.nobrain.androidannotation_mvp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;


public class MainActivity extends Activity implements MainActPresenterImpl.Callback {

    private MainActPresenter mainActPresenter;
    private MainModel mainModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainModel = new MainModel(getUiHandler());
        mainActPresenter = new MainActPresenterImpl();
        mainActPresenter.initView(getWindow().getDecorView());
        mainActPresenter.setCallback(this);

    }

    @Override
    public void onRequestClick(View view) {
        mainModel.requestData();
    }

    private Handler getUiHandler() {
        return new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);

                mainActPresenter.setResultText(msg.obj.toString());
            }
        };
    }
}
