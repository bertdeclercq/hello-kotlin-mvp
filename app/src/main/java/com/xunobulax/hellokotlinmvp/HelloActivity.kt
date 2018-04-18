package com.xunobulax.hellokotlinmvp

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : AppCompatActivity(), HelloContract.View, View.OnClickListener {

    private val presenter = HelloPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
    }

    override fun showMessage(message: String) {
        textViewMessage.text = message
    }

    override fun showError(error: String) {
        Snackbar.make(constraintLayout, error, Snackbar.LENGTH_SHORT).show()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonShowMessage -> {
                hideKeyboard()
                createMessage()
            }
        }
    }

    private fun hideKeyboard() {
        (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(currentFocus.windowToken, 0)
    }

    private fun createMessage() {
        presenter.saveName(editTextFirstName.text.toString(), editTextLastName.text.toString())
        presenter.loadMessage()
    }
}
