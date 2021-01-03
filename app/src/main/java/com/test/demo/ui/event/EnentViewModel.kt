package com.test.demo.ui.event

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EnentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is enent"
    }
    val text: LiveData<String> = _text
}