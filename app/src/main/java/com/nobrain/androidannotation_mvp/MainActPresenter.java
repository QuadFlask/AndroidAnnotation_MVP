package com.nobrain.androidannotation_mvp;

import android.view.View;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
public interface MainActPresenter {

    void initView(View rootView);

    void setResultText(String text);

    void setCallback(Callback callback);


    interface Callback {
        public void onRequestClick(View view);
    }
}
