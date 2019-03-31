package com.ctech.messenger.viewmodel

import android.net.Uri
import com.ctech.livemessage.onboarding.model.MessageType
import com.ctech.messenger.model.AlignPosition

data class ItemMessageViewModel(val id: Int, val avatarUrl: Uri, val content: String?,
                                val mediaContent: Uri?, val timeStamp: String, val align: AlignPosition,
                                val type: MessageType)