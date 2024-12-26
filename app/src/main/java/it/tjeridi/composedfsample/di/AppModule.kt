package it.tjeridi.composedfsample.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Singleton
    @Provides
    fun provideVersionName(context: Application): String {
        return context.packageManager.getPackageInfo(context.packageName, 0).versionName
    }
}