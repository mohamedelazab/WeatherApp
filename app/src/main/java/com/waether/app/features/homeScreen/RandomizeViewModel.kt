package com.waether.app.features.homeScreen

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import usecase.usecases.Ticker
import usecase.usecases.numberIncrementer
import usecase.usecases.randomNumberGeneration

private const val DEFAULT_VALUE = 0

class RandomizeViewModel : ViewModel() {

    //    private val ticker = initializeTicker()
    var mutableLiveData = MutableLiveData<Int>()
//
//    init {
//        mutableLiveData.value = DEFAULT_VALUE
//        ticker.start()
//    }

//    private fun initializeTicker() = Ticker {
//        mutableLiveData.postValue(randomNumberGeneration().toInt())
//    }
//
//    override fun onCleared() {
//        super.onCleared()
//        ticker.cancel()
//    }

    init {
        mutableLiveData.value = DEFAULT_VALUE
    }

    fun incrementNumber(){
        numberIncrementer(mutableLiveData)
    }
}