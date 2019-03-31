package com.ctech.messenger.utils

import io.reactivex.Scheduler

interface ThreadScheduler {
    fun uiThread(): Scheduler

    fun workerThread(): Scheduler
}
