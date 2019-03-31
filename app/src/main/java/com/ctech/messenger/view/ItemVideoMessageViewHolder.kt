package com.ctech.messenger.view

import android.view.View
import com.ctech.messenger.R
import com.ctech.messenger.viewmodel.ItemMessageViewModel
import com.ctech.messenger.widget.MP4PlayerView

class ItemVideoMessageViewHolder(view: View) : ItemMessageViewHolder(view) {

    private val vVideo: MP4PlayerView

    init {
        vVideo = view.findViewById(R.id.vVideo)
    }

    override fun bind(viewModel: ItemMessageViewModel) {
        vVideo.initMP4PlayerView(viewModel.mediaContent!!.toString())
        tvTimeStamp.text = viewModel.timeStamp
    }
}