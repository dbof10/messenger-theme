package com.ctech.messenger.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ctech.messenger.R
import com.ctech.messenger.di.DaggerOnboardingComponent
import com.ctech.messenger.viewmodel.ChatViewModel
import com.ctech.messenger.viewmodel.ItemMessageViewModel
import kotlinx.android.synthetic.main.activity_onboarding.ivAvatar
import javax.inject.Inject

class OnboardingActivity : AppCompatActivity() {


    @Inject
    lateinit var viewModel: ChatViewModel

    private lateinit var adapter: OnboardingAdapter

    companion object {
        fun makeIntent(context: Context): Intent {
            return Intent(context, OnboardingActivity::class.java)
        }
    }

    private val rvMessages by lazy {
        findViewById<RecyclerView>(R.id.rvMessages)
    }

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        DaggerOnboardingComponent.builder()
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
        viewModel.getMessages()
    }

    private fun setupBinding() {
        viewModel.items.observe(this, Observer {
            adapter.submitList(it)
            rvMessages.layoutManager!!.scrollToPosition(it.size - 1)
        })
    }

    override fun onDestroy() {
        viewModel.onDestroy()
        super.onDestroy()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        adapter = OnboardingAdapter(diffCallback)
        rvMessages.layoutManager = layoutManager
        rvMessages.adapter = adapter

    }


}