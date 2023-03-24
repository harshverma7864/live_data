package com.example.myapplication22.factory

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication22.viewModels.ViewModelDemoActivity

class ViewModelDemoActivityViewModelFactory(private var input:Int): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelDemoActivityViewModelFactory::class.java)){
            return ViewModelDemoActivity(input) as T
        }
        throw IllegalArgumentException("Unknown viewmodel class")
    }
}