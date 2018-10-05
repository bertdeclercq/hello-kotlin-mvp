package com.xunobulax.hellokotlinmvp.ui

import com.xunobulax.hellokotlinmvp.model.Person
import javax.inject.Inject


class HelloPresenter @Inject constructor(private val person: Person) : HelloContract.Presenter {

    private lateinit var view: HelloActivity

    override fun loadMessage() {
        if (person.hasName()) {
            view.showMessage("Hi ${person.name}!")
        } else {
            view.showMessage("")
            view.showError("Person has no name.")
        }
    }

    override fun saveName(firstName: String, lastName: String) {
        person.firstName = firstName
        person.lastName = lastName
    }

    override fun setView(view: HelloActivity) {
        this.view = view
    }
}