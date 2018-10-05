package com.xunobulax.hellokotlinmvp.model


data class PersonImpl(override var firstName: String = "", override var lastName: String = "") : Person {

    override var name = ""
        get() = "${firstName.trim()} ${lastName.trim()}".trim()

    override fun hasName() = !name.isBlank()

}