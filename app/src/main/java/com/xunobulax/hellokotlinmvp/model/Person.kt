package com.xunobulax.hellokotlinmvp.model


interface Person {

    var firstName: String
    var lastName: String
    var name: String

    fun hasName(): Boolean

}