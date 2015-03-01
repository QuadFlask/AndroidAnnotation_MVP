package com.nobrain.androidannotation_mvp;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
public interface MainActPresenter {

    void setView(View view);

    void onRequestClick();

    interface View {
        void setResultText(String text);
    }
}
