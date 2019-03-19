package com.waether.app.features.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.weather.usecases.Ticker
import com.weather.usecases.numberIncrement
import com.weather.usecases.randomNumberGenerator

private const val DEFAULT_VALUE = 0

class RandomizerViewModel : ViewModel() {

    // private val ticker = initializeTicker()
    val numberLiveData = MutableLiveData<Int>()

    init {
        numberLiveData.value = DEFAULT_VALUE
        //   ticker.start()
    }

    fun incrementNumber() {
        numberIncrement(numberLiveData,2)
    }

    private fun initializeTicker() = Ticker {
        //donot need it from thread
        numberLiveData.postValue(randomNumberGenerator().toInt())
    }


    override fun onCleared() {
        super.onCleared()
        //  ticker.cancel()
    }
}