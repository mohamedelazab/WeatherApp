package com.waether.app.features.homeScreen

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

//initial live data of numbericalLiveData is 0

//When I invoke incrementMethod, numerical livedata will increase by 1
class RandomizeViewModelTest {

    @JvmField
    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `init Then Update NumberLiveData To Zero`() {

        //Arrange
        val viewModel = RandomizeViewModel()

        //Act

        //Assert
        val result = viewModel.mutableLiveData.value
        Assert.assertTrue(result == 0)
    }

    @Test
    fun `incrementNumber When NumberLiveData Value equal Zero Then UpdateNumberLiveData To One`() {
        //Arrange
        val viewModel = RandomizeViewModel()

        //Act
        viewModel.incrementNumber()

        //Assert
        val result = viewModel.mutableLiveData.value
        Assert.assertTrue(result == 1)
    }

}