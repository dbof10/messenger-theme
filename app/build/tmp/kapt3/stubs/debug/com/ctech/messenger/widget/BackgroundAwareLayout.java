package com.ctech.messenger.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ctech/messenger/widget/BackgroundAwareLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "childId", "childRect", "Landroid/graphics/RectF;", "childView", "Landroid/view/View;", "eraser", "Landroid/graphics/Paint;", "radius", "", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "onViewAdded", "view", "setup", "setupEraser", "app_debug"})
public final class BackgroundAwareLayout extends androidx.constraintlayout.widget.ConstraintLayout {
    private int childId;
    private android.view.View childView;
    private android.graphics.Paint eraser;
    private float radius;
    private final android.graphics.RectF childRect = null;
    private java.util.HashMap _$_findViewCache;
    
    private final void setup(android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    public void onViewAdded(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void setupEraser() {
    }
    
    @java.lang.Override()
    public void dispatchDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public BackgroundAwareLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public BackgroundAwareLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public BackgroundAwareLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}