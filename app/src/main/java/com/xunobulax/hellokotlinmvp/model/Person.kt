package com.xunobulax.hellokotlinmvp.model


data class Person(var firstName: String = "", var lastName: String = "") {

    var name = ""
        get() = "${firstName.trim()} ${lastName.trim()}".trim()
        private set

    fun hasNoName() = name.isBlank()

}