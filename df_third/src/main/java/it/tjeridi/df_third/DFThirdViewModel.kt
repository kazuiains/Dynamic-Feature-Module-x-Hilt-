package it.tjeridi.df_third

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DFThirdViewModel @Inject constructor(
    versionName: String
) : ViewModel() {
    val text: String = "Hayo punyamu $versionName"
}