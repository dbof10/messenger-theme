package com.ctech.messenger.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/ctech/messenger/view/ItemMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "tvTimeStamp", "Landroid/widget/TextView;", "getTvTimeStamp", "()Landroid/widget/TextView;", "bind", "", "viewModel", "Lcom/ctech/messenger/viewmodel/ItemMessageViewModel;", "getResources", "Landroid/content/res/Resources;", "Companion", "app_debug"})
public abstract class ItemMessageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final android.widget.TextView tvTimeStamp = null;
    public static final int VIEW_TYPE_TEXT_MESSAGE = 131;
    public static final int VIEW_TYPE_IMAGE_MESSAGE = 132;
    public static final int VIEW_TYPE_VIDEO_MESSAGE = 133;
    public static final com.ctech.messenger.view.ItemMessageViewHolder.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.widget.TextView getTvTimeStamp() {
        return null;
    }
    
    public abstract void bind(@org.jetbrains.annotations.NotNull()
    com.ctech.messenger.viewmodel.ItemMessageViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.res.Resources getResources() {
        return null;
    }
    
    public ItemMessageViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/ctech/messenger/view/ItemMessageViewHolder$Companion;", "", "()V", "VIEW_TYPE_IMAGE_MESSAGE", "", "VIEW_TYPE_TEXT_MESSAGE", "VIEW_TYPE_VIDEO_MESSAGE", "create", "Lcom/ctech/messenger/view/ItemMessageViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "getView", "Landroid/view/View;", "layoutId", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ctech.messenger.view.ItemMessageViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        private final android.view.View getView(android.view.ViewGroup parent, @androidx.annotation.LayoutRes()
        int layoutId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}