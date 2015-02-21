package com.nobrain.androidannotation_mvp;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
public class MainActPresenterImpl implements MainActPresenter {

    private TextView resultTextView;
    private Callback callback;

    @Override
    public void initView(View rootView) {
        resultTextView = (TextView) rootView.findViewById(R.id.text_01);

        rootView.findViewById(R.id.btn_01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (callback != null) {
                    callback.onRequestClick(v);
                }
            }
        });
    }

    @Override
    public void setResultText(String text) {
        resultTextView.setText(text);
    }

    @Override
    public void setCallback(Callback callback) {
        this.callback = callback;
    }

}
