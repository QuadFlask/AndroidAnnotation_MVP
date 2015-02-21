package com.nobrain.androidannotation_mvp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private MainModel mainModel;
    private TextView resultTextView;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = getUiHandler();

        mainModel = new MainModel(handler);

        resultTextView = (TextView) findViewById(R.id.text_01);

        findViewById(R.id.btn_01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainModel.requestData();
            }
        });
    }

    public Handler getUiHandler() {
        return new Handler() {
            @Override
            public void handleMessage(Message msg) {
                resultTextView.setText(msg.obj.toString());

            }
        };
    }
}
