package com.xunobulax.hellokotlinmvp.dagger

import com.xunobulax.hellokotlinmvp.ui.HelloActivity
import dagger.Component


@Component(modules = [
    HelloPresenterModule::class])
interface HelloComponent {

    fun inject(target: HelloActivity)
}