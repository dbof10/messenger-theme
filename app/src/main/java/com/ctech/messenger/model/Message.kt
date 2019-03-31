package com.ctech.livemessage.onboarding.model

import android.net.Uri

data class Message(val id: Int, val user: User,
                   val content: String,
                   val mediaContent: Uri?,
                   val type: MessageType = MessageType.TEXT,
                   val timeStamp: String)