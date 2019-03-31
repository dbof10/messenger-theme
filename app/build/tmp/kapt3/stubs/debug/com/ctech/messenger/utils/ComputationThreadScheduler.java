package com.ctech.messenger.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/ctech/messenger/utils/ComputationThreadScheduler;", "Lcom/ctech/messenger/utils/ThreadScheduler;", "()V", "uiThread", "Lio/reactivex/Scheduler;", "workerThread", "Companion", "app_debug"})
public final class ComputationThreadScheduler implements com.ctech.messenger.utils.ThreadScheduler {
    private static com.ctech.messenger.utils.ComputationThreadScheduler sInstance;
    public static final com.ctech.messenger.utils.ComputationThreadScheduler.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler workerThread() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler uiThread() {
        return null;
    }
    
    private ComputationThreadScheduler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final synchronized com.ctech.messenger.utils.ThreadScheduler getInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ctech/messenger/utils/ComputationThreadScheduler$Companion;", "", "()V", "sInstance", "Lcom/ctech/messenger/utils/ComputationThreadScheduler;", "getInstance", "Lcom/ctech/messenger/utils/ThreadScheduler;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.ctech.messenger.utils.ThreadScheduler getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}