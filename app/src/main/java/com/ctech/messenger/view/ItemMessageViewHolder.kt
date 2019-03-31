package com.ctech.messenger.view

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.ctech.messenger.R
import com.ctech.messenger.viewmodel.ItemMessageViewModel

abstract class ItemMessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    protected val tvTimeStamp: TextView = view.findViewById(R.id.tvTimeStamp)

    companion object {
        const val VIEW_TYPE_TEXT_MESSAGE: Int = 131
        const val VIEW_TYPE_IMAGE_MESSAGE: Int = 132
        const val VIEW_TYPE_VIDEO_MESSAGE: Int = 133

        fun create(parent: ViewGroup, viewType: Int): ItemMessageViewHolder {
            when (viewType) {
                VIEW_TYPE_TEXT_MESSAGE -> return ItemTextMessageViewHolder(getView(parent, R.layout.item_incoming_text_message))
                -VIEW_TYPE_TEXT_MESSAGE -> return ItemTextMessageViewHolder(getView(parent, R.layout.item_outgoing_text_message))
                VIEW_TYPE_IMAGE_MESSAGE -> return ItemImageMessageViewHolder(getView(parent, R.layout.item_incoming_image_message))
                -VIEW_TYPE_IMAGE_MESSAGE -> return ItemImageMessageViewHolder(getView(parent, R.layout.item_outgoing_image_message))
                -VIEW_TYPE_VIDEO_MESSAGE -> return ItemVideoMessageViewHolder(getView(parent, R.layout.item_outgoing_video_message))
            }
            throw IllegalStateException("Wrong message view type")
        }

        private fun getView(parent: ViewGroup, @LayoutRes layoutId: Int): View {
            return LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        }
    }


    abstract fun bind(viewModel: ItemMessageViewModel)

    protected fun getResources(): Resources = itemView.resources

}