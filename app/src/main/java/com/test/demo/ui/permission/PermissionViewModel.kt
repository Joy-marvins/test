package com.test.demo.ui.permission

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PermissionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is permission"
    }
    val text: LiveData<String> = _text
}