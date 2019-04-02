package com.ctech.messenger.di

import com.ctech.messenger.view.ChatActivity
import dagger.Component
import dagger.android.AndroidInjector

@Component(modules = [ChatModule::class])
interface ChatComponent : AndroidInjector<ChatActivity> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ChatActivity>() {
    }
}