package it.tjeridi.df_third.di

import android.content.Context
import dagger.Component
import dagger.hilt.android.EntryPointAccessors
import it.tjeridi.composedfsample.di.AppModuleDependencies
import it.tjeridi.composedfsample.di.CoreModuleDependencies
import it.tjeridi.df_third.DFThirdViewModel

@Component(
    dependencies = [AppModuleDependencies::class, CoreModuleDependencies::class],
    modules = [DFThirdModule::class]
)
interface DFThirdComponent {

    @Component.Builder
    interface Builder {
        fun appDependency(
            appModuleDependencies: AppModuleDependencies,
        ): Builder

        fun coreDependency(
            coreModuleDependencies: CoreModuleDependencies
        ): Builder

        fun build(): DFThirdComponent
    }

    fun getViewModel(): DFThirdViewModel
}

fun inject(context: Context): DFThirdComponent {
    return DaggerDFThirdComponent.builder()
        .appDependency(
            EntryPointAccessors.fromApplication(
                context, AppModuleDependencies::class.java
            )
        )
        .coreDependency(
            EntryPointAccessors.fromApplication(
                context, CoreModuleDependencies::class.java
            )
        )
        .build()
}