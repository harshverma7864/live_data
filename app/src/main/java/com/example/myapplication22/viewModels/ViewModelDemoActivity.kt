package com.example.myapplication22.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelDemoActivity(private var inputValue: Int): ViewModel() {
    private var _count: MutableLiveData<Int> = MutableLiveData()
    val totalCount: LiveData<Int> = _count


    init {
        _count.value = inputValue
    }

    fun updateCount() {
        _count.value = _count.value?.plus(1)
    }
}