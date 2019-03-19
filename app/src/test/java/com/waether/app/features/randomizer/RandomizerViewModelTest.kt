package com.waether.app.features.randomizer

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test



/**
 * Ahmed Elmokadim
 * Elmokadim@gmail.com
 * 19/03/2019
 */

// unit test for public
class RandomizerViewModelTest {
    @JvmField
    @Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()
    // unit test

    @Test
    fun initThenupdateLiveNumberDataToZero() {
        // init defualt vlaue
        // arrange
        val viewModel=RandomizerViewModel()

        //act
        //assert
        val result=viewModel.numberLiveData.value
        Assert.assertTrue(result==0)

    }

    @Test
    fun `increment NumberWhen ZeroToOne`() {
// when click increment
        // arrange

        //act

        //assert

    }

}