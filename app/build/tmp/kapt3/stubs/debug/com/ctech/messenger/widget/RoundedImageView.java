package com.ctech.messenger.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\n\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002J&\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015J.\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u0017\u001a\u00020\t2\b\b\u0001\u0010\u0018\u001a\u00020\tJ\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0012\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/ctech/messenger/widget/RoundedImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDrawable", "Landroid/graphics/drawable/Drawable;", "mRadii", "", "mResource", "drawableStateChanged", "", "resolveResource", "setCorners", "leftTop", "", "rightTop", "rightBottom", "leftBottom", "setImageBitmap", "bm", "Landroid/graphics/Bitmap;", "setImageDrawable", "drawable", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "updateDrawable", "RoundedCornerDrawable", "app_debug"})
public final class RoundedImageView extends androidx.appcompat.widget.AppCompatImageView {
    private int mResource;
    private android.graphics.drawable.Drawable mDrawable;
    private float[] mRadii;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void drawableStateChanged() {
    }
    
    @java.lang.Override()
    public void setImageDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @java.lang.Override()
    public void setImageBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bm) {
    }
    
    @java.lang.Override()
    public void setImageResource(int resId) {
    }
    
    @java.lang.Override()
    public void setImageURI(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    public final void setCorners(@androidx.annotation.DimenRes()
    int leftTop, @androidx.annotation.DimenRes()
    int rightTop, @androidx.annotation.DimenRes()
    int rightBottom, @androidx.annotation.DimenRes()
    int leftBottom) {
    }
    
    public final void setCorners(float leftTop, float rightTop, float rightBottom, float leftBottom) {
    }
    
    private final android.graphics.drawable.Drawable resolveResource() {
        return null;
    }
    
    private final void updateDrawable() {
    }
    
    public RoundedImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public RoundedImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public RoundedImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\bH\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\bH\u0016J\u0012\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0017\u0010\'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0016H\u0000\u00a2\u0006\u0002\b)J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0012H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/ctech/messenger/widget/RoundedImageView$RoundedCornerDrawable;", "Landroid/graphics/drawable/Drawable;", "mBitmap", "Landroid/graphics/Bitmap;", "r", "Landroid/content/res/Resources;", "(Landroid/graphics/Bitmap;Landroid/content/res/Resources;)V", "mBitmapHeight", "", "mBitmapPaint", "Landroid/graphics/Paint;", "mBitmapRect", "Landroid/graphics/RectF;", "mBitmapShader", "Landroid/graphics/BitmapShader;", "mBitmapWidth", "mBounds", "mBoundsConfigured", "", "mPath", "Landroid/graphics/Path;", "mRadii", "", "applyScaleToRadii", "", "m", "Landroid/graphics/Matrix;", "configureBounds", "canvas", "Landroid/graphics/Canvas;", "draw", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "setCornerRadii", "radii", "setCornerRadii$app_debug", "setDither", "dither", "setFilterBitmap", "filter", "Companion", "app_debug"})
    static final class RoundedCornerDrawable extends android.graphics.drawable.Drawable {
        private final android.graphics.RectF mBounds = null;
        private final android.graphics.RectF mBitmapRect = null;
        private final int mBitmapWidth = 0;
        private final int mBitmapHeight = 0;
        private final android.graphics.Paint mBitmapPaint = null;
        private final android.graphics.BitmapShader mBitmapShader = null;
        private final float[] mRadii = null;
        private final android.graphics.Path mPath = null;
        private boolean mBoundsConfigured;
        private final android.graphics.Bitmap mBitmap = null;
        public static final com.ctech.messenger.widget.RoundedImageView.RoundedCornerDrawable.Companion Companion = null;
        
        private final void configureBounds(android.graphics.Canvas canvas) {
        }
        
        private final void applyScaleToRadii(android.graphics.Matrix m) {
        }
        
        @java.lang.Override()
        public void draw(@org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas) {
        }
        
        public final void setCornerRadii$app_debug(@org.jetbrains.annotations.Nullable()
        float[] radii) {
        }
        
        @java.lang.Override()
        public int getOpacity() {
            return 0;
        }
        
        @java.lang.Override()
        public void setAlpha(int alpha) {
        }
        
        @java.lang.Override()
        public void setColorFilter(@org.jetbrains.annotations.Nullable()
        android.graphics.ColorFilter cf) {
        }
        
        @java.lang.Override()
        public void setDither(boolean dither) {
        }
        
        @java.lang.Override()
        public void setFilterBitmap(boolean filter) {
        }
        
        @java.lang.Override()
        public int getIntrinsicWidth() {
            return 0;
        }
        
        @java.lang.Override()
        public int getIntrinsicHeight() {
            return 0;
        }
        
        private RoundedCornerDrawable(android.graphics.Bitmap mBitmap, android.content.res.Resources r) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\r"}, d2 = {"Lcom/ctech/messenger/widget/RoundedImageView$RoundedCornerDrawable$Companion;", "", "()V", "drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "fromBitmap", "Lcom/ctech/messenger/widget/RoundedImageView$RoundedCornerDrawable;", "bitmap", "r", "Landroid/content/res/Resources;", "fromDrawable", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.ctech.messenger.widget.RoundedImageView.RoundedCornerDrawable fromBitmap(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
            android.content.res.Resources r) {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.drawable.Drawable fromDrawable(@org.jetbrains.annotations.Nullable()
            android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.NotNull()
            android.content.res.Resources r) {
                return null;
            }
            
            private final android.graphics.Bitmap drawableToBitmap(android.graphics.drawable.Drawable drawable) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}