package com.base.library.retrofit_rx.http.func;


import com.alibaba.fastjson.JSONObject;
import com.base.library.retrofit_rx.Api.BaseApi;
import com.base.library.retrofit_rx.Api.resulte.BaseResulte;
import com.base.library.retrofit_rx.exception.HttpTimeException;
import com.base.library.retrofit_rx.http.cookie.CookieResulte;
import com.base.library.retrofit_rx.utils.CookieDbUtil;
import com.base.library.utils.AbStrUtil;

import io.reactivex.functions.Function;

/**
 * 服务器返回数据判断
 * Created by WZG on 2017/3/23.
 */

public class ResulteFunc implements Function<Object, Object> {
    private BaseApi basePar;

    public ResulteFunc(BaseApi basePar) {
        this.basePar = basePar;
    }

    @Override
    public Object apply(Object o) {
        if (o == null || "".equals(o.toString())) {
            throw new HttpTimeException(HttpTimeException.CHACHE_HTTP_ERROR, "error service");
        }

        if (basePar.isIgnorJudge()) {
            return o.toString();
        }

        /*数据回调格式统一判断*/
        BaseResulte resulte = JSONObject.parseObject(o.toString(), BaseResulte.class);
        if (resulte.getCode() == 0) {
            if (AbStrUtil.isEmpty(resulte.getData())) return "";
            /*缓存处理*/
            CookieResulte cookieRes = CookieDbUtil.getInstance().queryCookieBy(basePar.getCacheUrl());
            long time = System.currentTimeMillis();
            if (cookieRes == null && basePar.isCache()) {
                cookieRes = new CookieResulte(basePar.getCacheUrl(), resulte.getData(), time);
                CookieDbUtil.getInstance().saveCookie(cookieRes);
            }
            if (cookieRes != null) {
                cookieRes.setResulte(resulte.getData());
                cookieRes.setTime(time);
                CookieDbUtil.getInstance().updateCookie(cookieRes);
            }

            return resulte.getData();
        } else {
            throw new HttpTimeException(HttpTimeException.CHACHE_HTTP_POST_ERROR, AbStrUtil.isEmpty(resulte.getMsg()) ? "error " +
                    "data" : resulte.getMsg());
        }

    }
}
