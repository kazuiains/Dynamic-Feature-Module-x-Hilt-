package it.tjeridi.df_second

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DFSecondViewModel @Inject constructor() : ViewModel() {
    val text:String = "Hayo Tegang!!"
}