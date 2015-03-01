package com.nobrain.androidannotation_mvp;

import android.widget.TextView;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Steve SeongUg Jung on 15. 2. 21..
 */
@EBean
public class MainActView {

    @ViewById(R.id.text_01)
    TextView resultTextView;

    @UiThread
    public void setResultText(String text) {
        resultTextView.setText(text);
    }

}
