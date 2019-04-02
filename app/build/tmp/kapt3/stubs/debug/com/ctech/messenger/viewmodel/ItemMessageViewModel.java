package com.ctech.messenger.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lcom/ctech/messenger/viewmodel/ItemMessageViewModel;", "", "id", "", "avatarUrl", "Landroid/net/Uri;", "content", "", "mediaContent", "timeStamp", "align", "Lcom/ctech/messenger/model/AlignPosition;", "type", "Lcom/ctech/messenger/model/MessageType;", "(ILandroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Lcom/ctech/messenger/model/AlignPosition;Lcom/ctech/messenger/model/MessageType;)V", "getAlign", "()Lcom/ctech/messenger/model/AlignPosition;", "getAvatarUrl", "()Landroid/net/Uri;", "getContent", "()Ljava/lang/String;", "getId", "()I", "getMediaContent", "getTimeStamp", "getType", "()Lcom/ctech/messenger/model/MessageType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ItemMessageViewModel {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.net.Uri avatarUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String content = null;
    @org.jetbrains.annotations.Nullable()
    private final android.net.Uri mediaContent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timeStamp = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ctech.messenger.model.AlignPosition align = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ctech.messenger.model.MessageType type = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getAvatarUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getMediaContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctech.messenger.model.AlignPosition getAlign() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctech.messenger.model.MessageType getType() {
        return null;
    }
    
    public ItemMessageViewModel(int id, @org.jetbrains.annotations.NotNull()
    android.net.Uri avatarUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    android.net.Uri mediaContent, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull()
    com.ctech.messenger.model.AlignPosition align, @org.jetbrains.annotations.NotNull()
    com.ctech.messenger.model.MessageType type) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctech.messenger.model.AlignPosition component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctech.messenger.model.MessageType component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctech.messenger.viewmodel.ItemMessageViewModel copy(int id, @org.jetbrains.annotations.NotNull()
    android.net.Uri avatarUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    android.net.Uri mediaContent, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull()
    com.ctech.messenger.model.AlignPosition align, @org.jetbrains.annotations.NotNull()
    com.ctech.messenger.model.MessageType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}