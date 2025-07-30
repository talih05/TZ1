package com.example.tz1

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MyViewModel2(savedStateHandle: SavedStateHandle): ViewModel() {
    private val _textView:MutableLiveData<String> = savedStateHandle.getLiveData("text_view_VM")
    val textView:LiveData<String> = _textView

    fun setTextView(text: String) {
        _textView.value = text
    }
}