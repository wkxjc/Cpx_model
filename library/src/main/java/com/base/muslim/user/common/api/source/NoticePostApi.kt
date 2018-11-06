package com.base.muslim.user.common.api.source

import com.base.library.retrofit_rx.Api.BaseApi
import com.base.library.utils.AbAppUtil
import com.base.muslim.user.common.api.UserService
import retrofit2.Retrofit
import io.reactivex.Observable

/**
 * 通知中通过post请求发送token到服务器的api
 */

class NoticePostApi constructor(var token: String?) : BaseApi() {
    val terminal_type: String
    val device_id: String

    init {
        isShowProgress = false
        terminal_type = "android"
        device_id = AbAppUtil.getMacID()
    }

    override fun getObservable(): Observable<*> {
        val service = retrofit!!.create(UserService::class.java)
        return service.postNotice(this)
    }
}