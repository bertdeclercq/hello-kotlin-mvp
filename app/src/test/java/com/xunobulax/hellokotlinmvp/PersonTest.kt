package com.xunobulax.hellokotlinmvp

import com.xunobulax.hellokotlinmvp.model.Person
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
        assert(person.name != "Bert De Clercq")
    }

    @Test
    fun personName_isEmpty() {
        assert(person.hasNoName())
    }

    @Test
    fun personName_hasNoLeadingSpaces() {
        person.firstName = "   "
        person.lastName = "De Clercq"
        assert(person.name == "De Clercq")
    }

    @Test
    fun personName_hasNoTrailingSpaces() {
        person.firstName = "Bert"
        person.lastName = "   "
        assert(person.name == "Bert")
    }

}