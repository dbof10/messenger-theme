// Generated by Dagger (https://google.github.io/dagger).
package com.ctech.messenger.di;

import com.ctech.messenger.repository.MessageRepository;
import com.ctech.messenger.view.ChatActivity;
import com.ctech.messenger.view.ChatActivity_MembersInjector;
import com.ctech.messenger.viewmodel.ChatViewModel;
import dagger.internal.Preconditions;

public final class DaggerChatComponent implements ChatComponent {
  private ChatModule chatModule;

  private ChatActivity seedInstance;

  private DaggerChatComponent(Builder builder) {
    initialize(builder);
  }

  public static ChatComponent.Builder builder() {
    return new Builder();
  }

  private MessageRepository getMessageRepository() {
    return ChatModule_ProvideMessageRepositoryFactory.proxyProvideMessageRepository(
        chatModule, seedInstance);
  }

  private ChatViewModel getChatViewModel() {
    return new ChatViewModel(
        getMessageRepository(),
        ChatModule_ProvideThreadSchedulerFactory.proxyProvideThreadScheduler(chatModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.chatModule = builder.chatModule;
    this.seedInstance = builder.seedInstance;
  }

  @Override
  public void inject(ChatActivity arg0) {
    injectChatActivity(arg0);
  }

  private ChatActivity injectChatActivity(ChatActivity instance) {
    ChatActivity_MembersInjector.injectViewModel(instance, getChatViewModel());
    return instance;
  }

  private static final class Builder extends ChatComponent.Builder {
    private ChatModule chatModule;

    private ChatActivity seedInstance;

    @Override
    public ChatComponent build() {
      if (chatModule == null) {
        this.chatModule = new ChatModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(ChatActivity.class.getCanonicalName() + " must be set");
      }
      return new DaggerChatComponent(this);
    }

    @Override
    public void seedInstance(ChatActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }
}