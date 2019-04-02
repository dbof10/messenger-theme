package com.ctech.messenger.viewmodel

import android.net.Uri
import com.ctech.messenger.model.AlignPosition
import com.ctech.messenger.model.MessageType

data class ItemMessageViewModel(val id: Int, val avatarUrl: Uri, val content: String?,
                                val mediaContent: Uri?, val timeStamp: String, val align: AlignPosition,
                                val type: MessageType)