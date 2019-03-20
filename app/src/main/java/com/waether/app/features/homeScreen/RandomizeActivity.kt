package com.waether.app.features.homeScreen

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.waether.app.R
import com.waether.app.ToggleViewModel
import kotlinx.android.synthetic.main.activity_randomize.*

class RandomizeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_randomize)
        val viewModel = ViewModelProviders.of(this).get(RandomizeViewModel::class.java)
        viewModel.mutableLiveData.observe(this, Observer { tv_random_number.text = it.toString() })

        btn_increment.setOnClickListener { viewModel.incrementNumber() }

        val toggleViewModel = ViewModelProviders.of(this).get(ToggleViewModel::class.java)
        toggleViewModel.toggleStateViewModel.observe(this, Observer { btn_toggle.text = it.toString() })

        btn_toggle.setOnClickListener { btn_toggle.text = toggleViewModel.changeToggleState().toString() }
    }
}
