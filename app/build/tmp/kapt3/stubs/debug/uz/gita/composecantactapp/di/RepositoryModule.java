package uz.gita.composecantactapp.di;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import uz.gita.composecantactapp.crud.AppRepository;
import uz.gita.composecantactapp.crud.AppRepositoryImpl;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Luz/gita/composecantactapp/di/RepositoryModule;", "", "bindAppRepository", "Luz/gita/composecantactapp/crud/AppRepository;", "impl", "Luz/gita/composecantactapp/crud/AppRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract interface RepositoryModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.composecantactapp.crud.AppRepository bindAppRepository(@org.jetbrains.annotations.NotNull
    uz.gita.composecantactapp.crud.AppRepositoryImpl impl);
}