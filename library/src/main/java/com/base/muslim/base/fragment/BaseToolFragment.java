package com.base.muslim.base.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.base.library.R;
import com.base.library.utils.AbStrUtil;
import com.base.library.utils.FirebaseUtils;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;


/**
 * fragment基础工具类
 * Created by WZG on 2016/1/28.
 */
public class BaseToolFragment extends BaseFragmentManagerFragment {
    /**
     * 加载动画
     */
    private ProgressDialog loadingDailog;


    /**
     * 更新ui
     * 手动更新避免卡顿
     * 当前Fragment显示才update
     * 非常重要
     */
    public void updateUi(Object o) {
    }

    protected void showLoading(boolean cancel, String title) {
        if (loadingDailog == null) {
            loadingDailog = ProgressDialog.show(getRxActivity(), null, AbStrUtil.isEmpty(title) ? getString(R.string.Loading) :
                    title);
            loadingDailog.setCancelable(cancel);
        } else if (loadingDailog != null && !loadingDailog.isShowing()) {
            loadingDailog.show();
        }
    }

    protected void closeLoading() {
        if (loadingDailog != null && loadingDailog.isShowing()) {
            loadingDailog.dismiss();
        }
    }


    /**
     * 显示基本信息
     *
     * @param msg
     */
    protected void showToast(int msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示基本信息
     *
     * @param msg
     */
    protected void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 跳转到指定的activity
     *
     * @param cls
     */
    public void jumpActivity(Class cls) {
        Intent intent = new Intent(getActivity(), cls);
        startActivity(intent);
    }

    /**
     * 带参数跳转到指定的activity
     *
     * @param cls
     * @param bundle
     */
    public void jumpActivity(Class cls, Bundle bundle) {
        Intent intent = new Intent(getActivity(), cls);
        intent.putExtras(bundle);
        startActivity(intent);
    }


    /**
     * 统计埋点
     *
     * @param key
     */
    public void collectionFireabse(@NonNull int key) {
        FirebaseUtils.getInstance().report(getString(key));
    }

    /**
     * 统计埋点
     *
     * @param key
     * @param bundle
     */
    public void collectionFireabse(@NonNull int key, Bundle bundle) {
        FirebaseUtils.getInstance().report(getString(key), bundle);
    }

    protected RxAppCompatActivity getRxActivity() {
        return (RxAppCompatActivity) getContext();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (null != loadingDailog) {
            loadingDailog.dismiss();
        }

    }

}