package com.xunobulax.hellokotlinmvp.dagger

import com.xunobulax.hellokotlinmvp.ui.HelloContract
import dagger.Module
import dagger.Provides


@Module
class HelloPresenterModule(val view: HelloContract.View) {

    @Provides
    fun provideHelloView() = view
}