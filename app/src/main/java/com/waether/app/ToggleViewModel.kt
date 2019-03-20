package com.waether.app

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import usecase.usecases.toggleChanger

class ToggleViewModel : ViewModel() {

    var toggleStateViewModel = MutableLiveData<Boolean>()

    init {
        toggleStateViewModel.value = false
    }

    fun changeToggleState(){
        toggleChanger(toggleStateViewModel)
    }
}