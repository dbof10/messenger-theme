package com.ctech.messenger.widget

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.media.AudioManager.AUDIOFOCUS_NONE
import android.media.ThumbnailUtils
import android.os.AsyncTask
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.provider.MediaStore
import android.util.AttributeSet
import android.util.Log
import android.widget.VideoView

class MP4PlayerView : VideoView {

    private var playCount = 0

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    fun initMP4PlayerView(fileName: String) {
        init()
        setVideoPath(fileName)
        setBackground(fileName)
        if (VERSION.SDK_INT >= VERSION_CODES.O) {
            setAudioFocusRequest(AUDIOFOCUS_NONE)
        }

    }

    private fun init() {
        this.playCount = 0
        setOnCompletionListener {
            playCount += 1
            if (playCount < 3) {
                start()
            }
        }
        setOnClickListener { v ->
            if (!isPlaying && playCount == 3) {
                playCount = 0
                start()
            }
        }
    }

    private fun setBackground(fileName: String) {
        AsyncTask.execute {
           val drawable = BitmapDrawable(resources, ThumbnailUtils.createVideoThumbnail(fileName, MediaStore.Images.Thumbnails.MINI_KIND))
            post {
                background = drawable
            }
        }
    }
}
