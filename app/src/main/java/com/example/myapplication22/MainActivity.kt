package com.example.myapplication22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication22.databinding.ActivityMainBinding
import com.example.myapplication22.factory.ViewModelDemoActivityViewModelFactory
import com.example.myapplication22.viewModels.ViewModelDemoActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: ViewModelDemoActivity
    lateinit var factory: ViewModelDemoActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        factory = ViewModelDemoActivityViewModelFactory(0)
        viewModel = ViewModelProvider(this, factory)[ViewModelDemoActivity::class.java]
        binding.lifecycleOwner = this
        binding.myViewModel = this.viewModel



    }
}