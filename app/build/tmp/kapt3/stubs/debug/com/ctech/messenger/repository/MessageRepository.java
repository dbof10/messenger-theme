package com.ctech.messenger.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ctech/messenger/repository/MessageRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "friend", "Lcom/ctech/livemessage/onboarding/model/User;", "loggedUser", "getLoggedUser", "getMessages", "Lio/reactivex/Observable;", "", "Lcom/ctech/livemessage/onboarding/model/Message;", "page", "", "getMessagesList", "app_debug"})
public final class MessageRepository {
    private final com.ctech.livemessage.onboarding.model.User loggedUser = null;
    private final com.ctech.livemessage.onboarding.model.User friend = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctech.livemessage.onboarding.model.User getLoggedUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.ctech.livemessage.onboarding.model.Message>> getMessages(int page) {
        return null;
    }
    
    private final java.util.List<com.ctech.livemessage.onboarding.model.Message> getMessagesList(int page) {
        return null;
    }
    
    public MessageRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}