package com.loomverse.app.ui.screens.chat;

import com.loomverse.app.data.repository.ChatRepository;
import com.loomverse.app.data.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class UserMessagesViewModel_Factory implements Factory<UserMessagesViewModel> {
  private final Provider<ChatRepository> chatRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public UserMessagesViewModel_Factory(Provider<ChatRepository> chatRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.chatRepositoryProvider = chatRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UserMessagesViewModel get() {
    return newInstance(chatRepositoryProvider.get(), userRepositoryProvider.get());
  }

  public static UserMessagesViewModel_Factory create(
      Provider<ChatRepository> chatRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new UserMessagesViewModel_Factory(chatRepositoryProvider, userRepositoryProvider);
  }

  public static UserMessagesViewModel newInstance(ChatRepository chatRepository,
      UserRepository userRepository) {
    return new UserMessagesViewModel(chatRepository, userRepository);
  }
}
