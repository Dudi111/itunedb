package com.example.itunedb.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.itunedb.Repo.mainrepo
import com.example.itunedb.data.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class mainviewmodel(private val mainrpo:mainrepo):ViewModel() {


    fun getLocation(stringQuery: String){
        viewModelScope.launch (Dispatchers.IO){
            mainrpo.getLocation(stringQuery)
        }
    }
    val location: LiveData<Result>
        get() = mainrpo.livesong


}