package it.tjeridi.df_third

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel

/**
 * It uses LocalViewModelStoreOwner,
 * which means the owner may be Activity, Fragment or NavBackStackEntry
 * For our purposes we are going to use NavBackStackEntry
 */
@Suppress("UNCHECKED_CAST")
@Composable
inline fun <reified T : ViewModel> ViewModelFactory(
    key: String? = null,
    crossinline viewModelInstanceCreator: () -> T
): T =
    viewModel(
        modelClass = T::class.java,
        key = key,
        factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return viewModelInstanceCreator() as T
            }
        }
    )