package com.ctech.messenger.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ctech/messenger/viewmodel/ChatViewModel;", "", "repository", "Lcom/ctech/messenger/repository/MessageRepository;", "threadScheduler", "Lcom/ctech/messenger/utils/ThreadScheduler;", "(Lcom/ctech/messenger/repository/MessageRepository;Lcom/ctech/messenger/utils/ThreadScheduler;)V", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ctech/messenger/viewmodel/ItemMessageViewModel;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "getMessages", "Lio/reactivex/disposables/Disposable;", "onDestroy", "", "toViewModel", "user", "Lcom/ctech/livemessage/onboarding/model/User;", "it", "Lcom/ctech/livemessage/onboarding/model/Message;", "app_debug"})
public final class ChatViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ctech.messenger.viewmodel.ItemMessageViewModel>> items = null;
    private final com.ctech.messenger.repository.MessageRepository repository = null;
    private final com.ctech.messenger.utils.ThreadScheduler threadScheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ctech.messenger.viewmodel.ItemMessageViewModel>> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable getMessages() {
        return null;
    }
    
    private final com.ctech.messenger.viewmodel.ItemMessageViewModel toViewModel(com.ctech.livemessage.onboarding.model.User user, com.ctech.livemessage.onboarding.model.Message it) {
        return null;
    }
    
    public final void onDestroy() {
    }
    
    @javax.inject.Inject()
    public ChatViewModel(@org.jetbrains.annotations.NotNull()
    com.ctech.messenger.repository.MessageRepository repository, @org.jetbrains.annotations.NotNull()
    com.ctech.messenger.utils.ThreadScheduler threadScheduler) {
        super();
    }
}