package it.tjeridi.df_fourth

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DFFourthViewModel @Inject constructor(
    versionName: String
) : ViewModel() {
    val text: String = "Hayo punyamu $versionName"
}