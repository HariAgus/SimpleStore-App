package com.hariagus.storesimple_app.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.view.inputmethod.InputMethodManager
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class MyHelpers {

    fun hideSoftKeyboard(activity: Activity) {
        if (activity.currentFocus != null) {
            val inputMethodManager = activity.getSystemService(
                Activity.INPUT_METHOD_SERVICE
            ) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(
                activity.currentFocus!!.windowToken, 0
            )
        }
    }

    fun rupiahFormat(number: Long): String {
        val localeId = Locale("in",  "ID")
        val formatIdr = NumberFormat.getCurrencyInstance(localeId)
        return formatIdr.format(number)
    }

    @SuppressLint("SimpleDateFormat")
    fun dateFormat(date: String?): String {
        val localeId = Locale("in",  "ID")
        val formatIncoming  = SimpleDateFormat("EEE dd/MM/yyyy")
        val timeZone = TimeZone.getTimeZone("Asia/Jakarta")

        formatIncoming.timeZone = timeZone
        val createFormat = formatIncoming.format(formatIncoming.parse("2018-10-04 17:30:21"))
        return createFormat
    }

}