package uz.gita.composecantactapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.composecantactapp.crud.AppRepository
import uz.gita.composecantactapp.crud.AppRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindAppRepository(impl: AppRepositoryImpl): AppRepository
}