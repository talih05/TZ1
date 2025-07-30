package com.example.tz1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MyViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {
   private val _editTextVM:MutableLiveData<String> = savedStateHandle.getLiveData("edit_text_VM")
    val editTextVM:LiveData<String> = _editTextVM

    fun setEditText(newText:String){
        _editTextVM.value = newText
    }

}