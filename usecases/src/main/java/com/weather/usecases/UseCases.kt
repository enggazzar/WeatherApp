package com.weather.usecases

import android.arch.lifecycle.MutableLiveData

fun randomNumberGenerator() = Math.random() * 1000
fun numberIncrement(liveData: MutableLiveData<Int>,increment: Int=1){
    val oldValue=liveData.value?:0
    liveData.postValue(oldValue+increment)
}

