package com.toaster.mylibrary

import android.content.Context
import android.widget.Toast

object Toaster {

    private var toast: Toast? = null

    fun teraMeraKiRishta(context: Context?,
            message: String?) {
        toast?.cancel()
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast?.show()
    }
}