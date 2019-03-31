package com.ctech.messenger.di

import androidx.appcompat.app.AppCompatActivity
import com.ctech.messenger.repository.MessageRepository
import com.ctech.messenger.utils.ComputationThreadScheduler
import com.ctech.messenger.utils.ThreadScheduler
import com.ctech.messenger.view.OnboardingActivity
import dagger.Module
import dagger.Provides

@Module
class OnboardingModule {

    @OnboardingScope
    @Provides
    fun provideAppcompatActivity(activity: OnboardingActivity): AppCompatActivity {
        return activity
    }

    @Provides
    fun provideMessageRepository(activity: OnboardingActivity): MessageRepository {
        return MessageRepository(activity)
    }

    @Provides
    fun provideThreadScheduler(): ThreadScheduler {
        return ComputationThreadScheduler.getInstance()
    }
}
