package com.ctech.messenger.view

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.doOnLayout
import androidx.core.view.doOnPreDraw
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ctech.messenger.R
import com.ctech.messenger.di.DaggerChatComponent
import com.ctech.messenger.viewmodel.ChatViewModel
import com.ctech.messenger.viewmodel.ItemMessageViewModel
import com.ctech.messenger.widget.KeyboardAwareImageView.OnKeyboardShowHideListener
import kotlinx.android.synthetic.main.activity_onboarding.ivAvatar
import kotlinx.android.synthetic.main.activity_onboarding.ivBackground
import kotlinx.android.synthetic.main.activity_onboarding.rvMessages
import javax.inject.Inject


class ChatActivity : AppCompatActivity() {


    @Inject
    lateinit var viewModel: ChatViewModel

    private lateinit var adapter: ChatAdapter


    private val diffCallback: DiffUtil.ItemCallback<ItemMessageViewModel> by lazy {
        return@lazy object : DiffUtil.ItemCallback<ItemMessageViewModel>() {
            override fun areItemsTheSame(oldItem: ItemMessageViewModel, newItem: ItemMessageViewModel): Boolean {
                return oldItem.id == newItem.id

            }

            override fun areContentsTheSame(oldItem: ItemMessageViewModel, newItem: ItemMessageViewModel): Boolean {
                return oldItem == newItem
            }

        }
    }

    private lateinit var backgroundBitmap: Bitmap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        DaggerChatComponent.builder()
                .create(this)
                .inject(this)
        Glide.with(ivAvatar)
                .load(R.drawable.ic_avatar_user2)
                .apply(RequestOptions()
                        .override(resources.getDimensionPixelSize(R.dimen.onboarding_avatar_size))
                )
                .into(ivAvatar)

        setupRecyclerView()
        setupBinding()
        setupBackground()
        viewModel.getMessages()
    }

    private fun setupBackground() {
        ivBackground.doOnLayout {
            if (!::backgroundBitmap.isInitialized) {
                val background = ContextCompat.getDrawable(this, R.drawable.chat_background) as GradientDrawable
                background.setSize(it.width, it.height)
                backgroundBitmap = background.toBitmap()
                ivBackground.setImageBitmap(backgroundBitmap)
            }
        }
    }

    private fun setupBinding() {
        viewModel.items.observe(this, Observer {
            adapter.submitList(it)
            rvMessages.layoutManager!!.scrollToPosition(it.size - 1)
        })

        ivBackground.setKeyboardListener(object : OnKeyboardShowHideListener {
            override fun onToggle(visible: Boolean, height: Int) {
                rvMessages.layoutManager!!.scrollToPosition(adapter.itemCount - 1)
                if (::backgroundBitmap.isInitialized) {
                    if (visible) {
                        val cropped = cropBitmap(backgroundBitmap, Rect(0, 0, ivBackground.width, height))
                        ivBackground.setImageBitmap(cropped)
                    } else {
                        ivBackground.setImageBitmap(backgroundBitmap)
                    }
                }
            }

        })
    }

    private fun cropBitmap(bitmap: Bitmap, rect: Rect): Bitmap {
        val w = rect.right - rect.left
        val h = rect.bottom - rect.top
        val ret = Bitmap.createBitmap(w, h, bitmap.config)
        val canvas = Canvas(ret)
        canvas.drawBitmap(bitmap, -rect.left.toFloat(), -rect.top.toFloat(), null)
        return ret
    }

    override fun onDestroy() {
        viewModel.onDestroy()
        super.onDestroy()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        adapter = ChatAdapter(diffCallback)
        rvMessages.layoutManager = layoutManager
        rvMessages.adapter = adapter
    }


}