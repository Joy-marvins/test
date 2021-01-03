package com.test.demo.ui.behavior

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BehaviorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is behavior"
    }
    val text: LiveData<String> = _text
}