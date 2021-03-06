package com.prog.zhigangwei.cpx_model.app

import android.content.ComponentCallbacks2
import android.support.multidex.MultiDexApplication
import com.base.library.retrofit_rx.RxRetrofitApp
import com.bumptech.glide.Glide
import com.prog.zhigangwei.cpx_model.BuildConfig
import com.squareup.leakcanary.LeakCanary

/**
 *
 *Describe:app入口
 *
 *Created by zhigang wei
 *on 2018/4/18
 *
 *Company :cpx
 */
class MApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        RxRetrofitApp.init(this, BuildConfig.DEBUG)
        initMAT()
    }

    /**
     * 表示应用程序正常运行，并且不会被杀掉。但是目前手机的内存已经非常低了，
     * 我们应该去释放掉一些不必要的资源以提升系统的性能，
     * 同时这也会直接影响到我们应用程序的性能。
     *
     * @param level
     */
    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        if (level == ComponentCallbacks2.TRIM_MEMORY_RUNNING_LOW) {
            Glide.get(this).clearMemory()
        }
        Glide.get(this).trimMemory(level)
    }


    override fun onLowMemory() {
        super.onLowMemory()
        Glide.get(this).clearMemory()
    }

    /**
     * 检测内存泄露
     */
    private fun initMAT() {
        if (!BuildConfig.DEBUG) return
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }
}