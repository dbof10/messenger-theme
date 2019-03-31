package com.ctech.messenger.utils

import android.content.Context
import android.net.Uri


object ResourcesUtils {

    fun getUri(context: Context, rawRes: Int): Uri {
        val path = "android.resource://" + context.packageName + "/" + rawRes
        return Uri.parse(path)
    }
}