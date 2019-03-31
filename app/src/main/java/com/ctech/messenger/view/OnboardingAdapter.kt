package com.ctech.messenger.view

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ctech.livemessage.onboarding.model.MessageType
import com.ctech.messenger.model.AlignPosition
import com.ctech.messenger.view.ItemMessageViewHolder.Companion.VIEW_TYPE_IMAGE_MESSAGE
import com.ctech.messenger.view.ItemMessageViewHolder.Companion.VIEW_TYPE_TEXT_MESSAGE
import com.ctech.messenger.view.ItemMessageViewHolder.Companion.VIEW_TYPE_VIDEO_MESSAGE
import com.ctech.messenger.viewmodel.ItemMessageViewModel

class OnboardingAdapter(diffUtil: DiffUtil.ItemCallback<ItemMessageViewModel>)
    : ListAdapter<ItemMessageViewModel, ViewHolder>(diffUtil) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemMessageViewHolder.create(parent, viewType)
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        if (item is ItemMessageViewModel) {
            return if (item.type == MessageType.IMAGE) {
                if (item.align == AlignPosition.LEFT) {
                    VIEW_TYPE_IMAGE_MESSAGE
                } else {
                    -VIEW_TYPE_IMAGE_MESSAGE
                }
            } else if (item.type == MessageType.VIDEO) {
                if (item.align == AlignPosition.LEFT) {
                    VIEW_TYPE_VIDEO_MESSAGE
                } else {
                    -VIEW_TYPE_VIDEO_MESSAGE
                }
            } else if (item.type == MessageType.TEXT) {
                if (item.align == AlignPosition.LEFT) {
                    VIEW_TYPE_TEXT_MESSAGE
                } else {
                    -VIEW_TYPE_TEXT_MESSAGE
                }
            } else {
                throw IllegalArgumentException("Unsupported message type")
            }
        }
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemMessageViewHolder).bind(getItem(position))
    }

}