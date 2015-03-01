package com.nobrain.androidannotation_mvp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity implements MainActPresenter.View {

    private MainActPresenter mainActPresenter;


    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = (TextView) findViewById(R.id.text_01);

        mainActPresenter = new MainActPresenterImpl(new Handler());
        mainActPresenter.setView(this);

        findViewById(R.id.btn_01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActPresenter.onRequestClick();
            }
        });

    }

    @Override
    public void setResultText(String text) {
        resultTextView.setText(text);
    }
}
