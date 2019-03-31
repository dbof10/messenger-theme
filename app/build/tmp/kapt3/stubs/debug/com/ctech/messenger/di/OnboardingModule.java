package com.ctech.messenger.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/ctech/messenger/di/OnboardingModule;", "", "()V", "provideAppcompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/ctech/messenger/view/OnboardingActivity;", "provideMessageRepository", "Lcom/ctech/messenger/repository/MessageRepository;", "provideThreadScheduler", "Lcom/ctech/messenger/utils/ThreadScheduler;", "app_debug"})
@dagger.Module()
public final class OnboardingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @OnboardingScope()
    public final androidx.appcompat.app.AppCompatActivity provideAppcompatActivity(@org.jetbrains.annotations.NotNull()
    com.ctech.messenger.view.OnboardingActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.ctech.messenger.repository.MessageRepository provideMessageRepository(@org.jetbrains.annotations.NotNull()
    com.ctech.messenger.view.OnboardingActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.ctech.messenger.utils.ThreadScheduler provideThreadScheduler() {
        return null;
    }
    
    public OnboardingModule() {
        super();
    }
}