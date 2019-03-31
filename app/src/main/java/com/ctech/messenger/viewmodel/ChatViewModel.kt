package com.ctech.messenger.viewmodel

import androidx.lifecycle.MutableLiveData
import com.ctech.livemessage.onboarding.model.Message
import com.ctech.livemessage.onboarding.model.User
import com.ctech.messenger.model.AlignPosition
import com.ctech.messenger.repository.MessageRepository
import com.ctech.messenger.utils.ThreadScheduler
import io.reactivex.disposables.Disposable
import timber.log.Timber
import javax.inject.Inject

class ChatViewModel @Inject constructor(
        private val repository: MessageRepository,
        private val threadScheduler: ThreadScheduler) {

    val items: MutableLiveData<List<ItemMessageViewModel>> = MutableLiveData()

    fun getMessages(): Disposable {
        val user = repository.getLoggedUser()
        return repository
                .getMessages(0)
                .subscribeOn(threadScheduler.workerThread())
                .observeOn(threadScheduler.uiThread())
                .map { it ->
                    it.map {
                        toViewModel(user, it)
                    }
                }
                .subscribe({
                    items.value = it
                }, Timber::e)
    }


    private fun toViewModel(user: User, it: Message): ItemMessageViewModel {
        return ItemMessageViewModel(it.id, it.user.avatarUrl, it.content, it.mediaContent, it.timeStamp,
                if (it.user.id == user.id) AlignPosition.RIGHT else AlignPosition.LEFT,
                it.type)
    }

    fun onDestroy() {

    }

}