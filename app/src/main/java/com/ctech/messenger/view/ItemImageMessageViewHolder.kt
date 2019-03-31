package com.ctech.messenger.view

import androidx.core.view.ViewCompat
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ctech.messenger.R
import com.ctech.messenger.viewmodel.ItemMessageViewModel

class ItemImageMessageViewHolder(view: View) : ItemMessageViewHolder(view) {

    private var ivAvatar: ImageView? = null
    private val ivPhoto: ImageView

    init {
        ivAvatar = view.findViewById(R.id.ivAvatar)
        ivPhoto = view.findViewById(R.id.ivPhoto)
    }

    override fun bind(viewModel: ItemMessageViewModel) {
        if (ivAvatar != null) {
            val target = ivAvatar!!
            Glide.with(target)
                    .load(viewModel.avatarUrl)
                    .apply(RequestOptions().override(getResources().getDimensionPixelSize(R.dimen.onboarding_avatar_size)))
                    .into(target)

        }

        ViewCompat.setTransitionName(ivPhoto, viewModel.mediaContent!!.toString())

        Glide.with(ivPhoto)
                .load(viewModel.mediaContent)
                .into(ivPhoto)
        tvTimeStamp.text = viewModel.timeStamp
    }

}