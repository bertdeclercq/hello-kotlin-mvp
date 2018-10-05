package com.xunobulax.hellokotlinmvp.ui


interface HelloContract {

    interface View {

        fun showMessage(message: String)

        fun showError(error: String)
    }

    interface Presenter {

        fun loadMessage()

        fun saveName(firstName: String, lastName: String)

        fun setView(view: HelloActivity)
    }
}