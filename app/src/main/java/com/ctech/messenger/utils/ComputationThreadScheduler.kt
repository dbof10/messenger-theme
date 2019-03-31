package com.ctech.messenger.utils

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ComputationThreadScheduler private constructor() : ThreadScheduler {

    companion object {
        private var sInstance: ComputationThreadScheduler? = null

        @Synchronized
        @JvmStatic
        fun getInstance(): ThreadScheduler {
            if (sInstance == null) {
                sInstance = ComputationThreadScheduler()
            } else {
                sInstance
            }
            return sInstance!!
        }
    }

    override fun workerThread(): Scheduler {
        return Schedulers.io()
    }

    override fun uiThread(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}