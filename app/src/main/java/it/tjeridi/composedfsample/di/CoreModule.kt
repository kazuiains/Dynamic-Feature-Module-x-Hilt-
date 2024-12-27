package it.tjeridi.composedfsample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class CoreModule {
    @Singleton
    @Provides
    fun provideVersionCode(): Int {
        return 1
    }
}