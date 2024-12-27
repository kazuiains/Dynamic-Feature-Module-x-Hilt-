package it.tjeridi.df_third.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import it.tjeridi.df_third.DFThirdRepository
import it.tjeridi.df_third.DFThirdRepositoryImpl
import it.tjeridi.df_third.DFThirdViewModel

@Module
@InstallIn(SingletonComponent::class)
abstract class DFThirdModule {
    @Binds
    abstract fun bindRepository(impl: DFThirdRepositoryImpl): DFThirdRepository
}

@Module
@InstallIn(ViewModelComponent::class)
class ViewModelModule {
    @Provides
    fun provideViewModel(
        repository: DFThirdRepository,
        versionName: String
    ): DFThirdViewModel =
        DFThirdViewModel(
            versionName = versionName,
            repository = repository
        )
}