package it.tjeridi.df_third

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DFThirdViewModel(
    versionName: String,
    repository: DFThirdRepository
) : ViewModel() {
    val text: String = "Hayo punyamu $versionName"

    init {
        Log.i("COMPNAVILOG", "Screen2ViewModel.init")

        // Launch timer to see how our VM works in "background"
        // when we change screens
        viewModelScope.launch {
            repository.startCounter()
                .collect { _ -> }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("COMPNAVILOG", "Screen2ViewModel.onCleared()")
    }
}