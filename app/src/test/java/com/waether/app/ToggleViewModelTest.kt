package com.waether.app

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class ToggleViewModelTest {

    @JvmField
    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `initialize then update button text to false state`() {

        //arrange and act
        val toggleViewModel = ToggleViewModel()

        //assert
        val result = toggleViewModel.toggleStateViewModel.value
        assertTrue(result == false)
    }

    @Test
    fun `change Toggle state value to be The Opposite of Previous One`() {
        //arrange
        val toggleViewModel = ToggleViewModel()

        //act
        toggleViewModel.changeToggleState()

        //assert
        val result = toggleViewModel.toggleStateViewModel.value
        assertTrue(result == true)
    }
}