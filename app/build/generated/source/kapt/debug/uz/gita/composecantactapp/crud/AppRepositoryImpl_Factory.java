// Generated by Dagger (https://dagger.dev).
package uz.gita.composecantactapp.crud;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.composecantactapp.data.local.room.dao.ContactDao;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppRepositoryImpl_Factory implements Factory<AppRepositoryImpl> {
  private final Provider<ContactDao> daoProvider;

  public AppRepositoryImpl_Factory(Provider<ContactDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public AppRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static AppRepositoryImpl_Factory create(Provider<ContactDao> daoProvider) {
    return new AppRepositoryImpl_Factory(daoProvider);
  }

  public static AppRepositoryImpl newInstance(ContactDao dao) {
    return new AppRepositoryImpl(dao);
  }
}
