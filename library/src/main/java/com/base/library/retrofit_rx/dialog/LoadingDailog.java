package com.base.library.retrofit_rx.dialog;

import android.content.Context;
import android.widget.TextView;

import com.base.library.R;
import com.base.muslim.base.dialog.BaseDialog;


/**
 * 进度加载框
 *
 * @author WZG
 */
public class LoadingDailog extends BaseDialog {
    private TextView tv;

    public LoadingDailog(Context context) {
        super(context, R.style.progress_dialog, false);
        init(R.layout.view_load_more);
    }

    @Override
    protected void initResource() {
    }

    @Override
    protected void initWidget() {
        tv = findViewById(R.id.tv_load);
    }

    public void showLoading(String title) {
        if (tv != null) {
            tv.setText(title);
        }
        if (!isShowing()) {
            show();
        }
    }

}
