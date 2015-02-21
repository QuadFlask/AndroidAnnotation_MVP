package com.nobrain.androidannotation_mvp;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
public class MainViewModel {
    private final Activity activity;

    private TextView resultTextView;
    private Handler handler;
    private MainModel mainModel;

    public MainViewModel(Activity activity) {

        this.activity = activity;
        handler = getUiHandler();
        mainModel = new MainModel(handler);
    }

    public void initView() {
        resultTextView = (TextView) activity.findViewById(R.id.text_01);

        activity.findViewById(R.id.btn_01).setOnClickListener(new View.OnClickListener() {
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
