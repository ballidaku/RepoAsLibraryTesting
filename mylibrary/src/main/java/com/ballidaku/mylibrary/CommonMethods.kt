package com.ballidaku.mylibrary

import android.content.Context
import android.widget.Toast

object CommonMethods {

    private var toast: Toast? = null

    fun teraMeraKiRishta(context: Context?,
            message: String?) {
        toast?.cancel()
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast?.show()
    }
}