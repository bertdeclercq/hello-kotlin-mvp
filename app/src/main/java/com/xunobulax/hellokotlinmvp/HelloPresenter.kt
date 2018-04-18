package com.xunobulax.hellokotlinmvp


class HelloPresenter(val view: HelloContract.View) : HelloContract.Presenter {

    private val person = Person()

    override fun loadMessage() {
        if (person.hasNoName()) {
            view.showMessage("")
            view.showError("Person has no name.")
        } else {
            view.showMessage("Hi ${person.name}!")
        }
    }

    override fun saveName(firstName: String, lastName: String) {
        person.firstName = firstName
        person.lastName = lastName
    }
}