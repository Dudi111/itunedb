package com.example.itunedb.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.itunedb.R
import com.example.itunedb.Repo.mainrepo
import com.example.itunedb.data.ResponseModel
import com.example.itunedb.data.network
import com.example.itunedb.viewmodel.mainviewmodel
import com.example.itunedb.viewmodel.voewModelfactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: mainviewmodel
    lateinit var repository: mainrepo
private var resmodel=ArrayList<ResponseModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songApi=network.getretrofitinstance().create(apiservice::class.java)
        repository=mainrepo(songApi)
        val locationFactory=voewModelfactory(repository)
        viewModel= ViewModelProviders.of(this,locationFactory).get(mainviewmodel::class.java)

        btnSearch.setOnClickListener {
            viewModel.getLocation(etname.text.toString())

            viewModel.location.observe(this, Observer {
               setrecyclerview()
            })


        }
    }
    private fun setrecyclerview(){
        val songadapter=songAdapter(resmodel)
        val linearLayoutManager= GridLayoutManager(this,2)
        recycler.adapter=songadapter
        recycler.layoutManager=linearLayoutManager
    }

}