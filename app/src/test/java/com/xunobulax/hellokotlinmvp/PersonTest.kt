package com.xunobulax.hellokotlinmvp

import org.junit.Test


class PersonTest {

    private val person = Person()

    @Test
    fun personName_isCorrect() {
        person.firstName = "Bert"
        person.lastName = "De Clercq"
        assert(person.name == "Bert De Clercq")
    }

    @Test
    fun personName_isWrong() {
        person.firstName = "Bert"
        person.lastName = "De Clercq"
        assert(person.name != "De Clercq")
    }

    @Test
    fun personName_isEmpty() {
        assert(person.hasNoName())
    }

    @Test
    fun personName_hasNoLeadingSpace() {
        person.firstName = "Bert"
        person.lastName = "   "
        assert(person.name == "Bert")
    }

    @Test
    fun personName_hasNoTrailingSpace() {
        person.firstName = "   "
        person.lastName = "De Clercq"
        assert(person.name == "De Clercq")
    }

}