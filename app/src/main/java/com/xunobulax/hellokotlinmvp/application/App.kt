package com.xunobulax.hellokotlinmvp.application

import android.app.Application
import com.xunobulax.hellokotlinmvp.di.AppModule
import com.xunobulax.hellokotlinmvp.di.DaggerHelloComponent
import com.xunobulax.hellokotlinmvp.di.HelloComponent


class App : Application() {

    lateinit var component: HelloComponent

    override fun onCreate() {
        super.onCreate()
        component = initDagger(this)
    }

    private fun initDagger(app: App): HelloComponent =
            DaggerHelloComponent.builder()
                    .appModule(AppModule(app))
                    .build()


}