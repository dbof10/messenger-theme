package com.ctech.messenger.model

import android.net.Uri
import com.ctech.livemessage.onboarding.model.User

data class Message(val id: Int, val user: User,
                   val content: String,
                   val mediaContent: Uri?,
                   val type: MessageType = MessageType.TEXT,
                   val timeStamp: String)