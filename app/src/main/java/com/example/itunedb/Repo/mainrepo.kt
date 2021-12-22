package com.example.itunedb.Repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.itunedb.UI.apiservice
import com.example.itunedb.data.Result

class mainrepo(private val callapi:apiservice) {

    private val songData= MutableLiveData<Result>()
    val livesong: LiveData<Result>
        get() = songData

    suspend fun getLocation(queryString: String){
        val result=callapi.posts(queryString)
        if (result.body()!=null){
            songData.postValue(result.body())
        }
    }
}