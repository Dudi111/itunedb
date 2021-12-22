package com.example.itunedb.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.itunedb.Repo.mainrepo

class voewModelfactory(private val repo:mainrepo):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return mainviewmodel(repo)as T    }
}