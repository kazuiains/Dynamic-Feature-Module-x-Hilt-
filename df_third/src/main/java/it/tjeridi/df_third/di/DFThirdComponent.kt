package it.tjeridi.df_third.di

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import dagger.Component
import dagger.hilt.android.EntryPointAccessors
import it.tjeridi.composedfsample.di.AppModuleDependencies
import it.tjeridi.composedfsample.di.CoreModuleDependencies
import it.tjeridi.df_third.DFThirdViewModel
import it.tjeridi.df_third.ViewModelFactory

@Component(
    dependencies = [AppModuleDependencies::class, CoreModuleDependencies::class],
    modules = [DFThirdModule::class, ViewModelModule::class]
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

@Composable
inline fun <reified VM : ViewModel> daggerViewModel(
    key: String? = null,
    crossinline viewModel: (comp: DFThirdComponent) -> VM
): VM {
    val context = LocalContext.current
    val component = DaggerDFThirdComponent.builder()
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

    return ViewModelFactory(key) {
        viewModel(component)
    }
}