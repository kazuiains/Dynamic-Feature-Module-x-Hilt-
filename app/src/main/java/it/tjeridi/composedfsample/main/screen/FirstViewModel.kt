package it.tjeridi.composedfsample.main.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val versionName: String
) : ViewModel() {
    val version: String get() = versionName
}