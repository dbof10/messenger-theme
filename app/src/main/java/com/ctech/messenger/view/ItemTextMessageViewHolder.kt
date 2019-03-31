package com.ctech.messenger.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ctech.messenger.R
import com.ctech.messenger.viewmodel.ItemMessageViewModel

class ItemTextMessageViewHolder(view: View) : ItemMessageViewHolder(view) {


    private var ivAvatar: ImageView? = null
    private val tvContent: TextView

    init {
        ivAvatar = view.findViewById(R.id.ivAvatar)
        tvContent = view.findViewById(R.id.tvContent)
    }


    override fun bind(viewModel: ItemMessageViewModel) {
        if (ivAvatar != null) {
            val target = ivAvatar!!
            Glide.with(target)
                    .load(viewModel.avatarUrl)
                    .apply(RequestOptions().override(getResources().getDimensionPixelSize(R.dimen.onboarding_avatar_size)))
                    .into(target)

        }

        tvContent.text = viewModel.content
        tvTimeStamp.text = viewModel.timeStamp
    }

}