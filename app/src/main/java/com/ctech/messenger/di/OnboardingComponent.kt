package com.ctech.messenger.di

import com.ctech.messenger.view.OnboardingActivity
import dagger.Component
import dagger.android.AndroidInjector

@OnboardingScope
@Component(modules = [OnboardingModule::class])
interface OnboardingComponent : AndroidInjector<OnboardingActivity> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<OnboardingActivity>() {
    }
}