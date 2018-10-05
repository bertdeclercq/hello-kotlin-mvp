package com.xunobulax.hellokotlinmvp.di

import com.xunobulax.hellokotlinmvp.model.Person
import com.xunobulax.hellokotlinmvp.model.PersonImpl
import dagger.Module
import dagger.Provides


@Module
class PersonModule {

    @Provides
    fun providesPerson(): Person = PersonImpl()
}