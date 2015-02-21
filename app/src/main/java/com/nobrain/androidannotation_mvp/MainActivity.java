package com.nobrain.androidannotation_mvp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Handler handler;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        resultTextView = (TextView) findViewById(R.id.text_01);

        findViewById(R.id.btn_01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final String result = requestData();
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                resultTextView.setText(result);
                            }
                        });
                    }
                }).start();
            }
        });
    }

    private String requestData() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "result";
    }

}
