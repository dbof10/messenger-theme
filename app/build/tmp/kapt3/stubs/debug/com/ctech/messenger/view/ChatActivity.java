package com.ctech.messenger.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/ctech/messenger/view/ChatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/ctech/messenger/view/ChatAdapter;", "backgroundBitmap", "Landroid/graphics/Bitmap;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ctech/messenger/viewmodel/ItemMessageViewModel;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/ctech/messenger/viewmodel/ChatViewModel;", "getViewModel", "()Lcom/ctech/messenger/viewmodel/ChatViewModel;", "setViewModel", "(Lcom/ctech/messenger/viewmodel/ChatViewModel;)V", "cropBitmap", "bitmap", "rect", "Landroid/graphics/Rect;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupBackground", "setupBinding", "setupRecyclerView", "Companion", "app_debug"})
public final class ChatActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ctech.messenger.viewmodel.ChatViewModel viewModel;
    private com.ctech.messenger.view.ChatAdapter adapter;
    private final kotlin.Lazy diffCallback$delegate = null;
    private android.graphics.Bitmap backgroundBitmap;
    public static final com.ctech.messenger.view.ChatActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctech.messenger.viewmodel.ChatViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.ctech.messenger.viewmodel.ChatViewModel p0) {
    }
    
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ctech.messenger.viewmodel.ItemMessageViewModel> getDiffCallback() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBackground() {
    }
    
    private final void setupBinding() {
    }
    
    private final android.graphics.Bitmap cropBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void setupRecyclerView() {
    }
    
    public ChatActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ctech/messenger/view/ChatActivity$Companion;", "", "()V", "makeIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent makeIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}