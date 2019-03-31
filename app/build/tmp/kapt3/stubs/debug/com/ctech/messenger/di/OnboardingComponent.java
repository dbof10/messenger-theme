package com.ctech.messenger.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ctech/messenger/di/OnboardingComponent;", "Ldagger/android/AndroidInjector;", "Lcom/ctech/messenger/view/OnboardingActivity;", "Builder", "app_debug"})
@dagger.Component(modules = {com.ctech.messenger.di.OnboardingModule.class})
@OnboardingScope()
public abstract interface OnboardingComponent extends dagger.android.AndroidInjector<com.ctech.messenger.view.OnboardingActivity> {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ctech/messenger/di/OnboardingComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/ctech/messenger/view/OnboardingActivity;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.ctech.messenger.view.OnboardingActivity> {
        
        public Builder() {
            super();
        }
    }
}