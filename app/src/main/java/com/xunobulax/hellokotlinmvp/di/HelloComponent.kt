package com.xunobulax.hellokotlinmvp.di

import com.xunobulax.hellokotlinmvp.ui.HelloActivity
import dagger.Component


@Component(modules = [
    AppModule::class,
    HelloPresenterModule::class,
    PersonModule::class
    ])
interface HelloComponent {

    // This will inject any dependency we define into HelloActivity
    fun inject(target: HelloActivity)
}