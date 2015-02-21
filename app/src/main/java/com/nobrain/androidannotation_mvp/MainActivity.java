package com.nobrain.androidannotation_mvp;

import android.app.Activity;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @Bean
    MainActPresenter mainActPresenter;

    @Bean
    MainModel mainModel;

    @Click(R.id.btn_01)
    @Background
    void onRequestClick() {
        String result = mainModel.requestData();
        mainActPresenter.setResultText(result);
    }

}
