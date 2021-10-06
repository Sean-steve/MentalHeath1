package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var titlesList= mutableListOf<String>()
    private var descriptionsList= mutableListOf<String>()
    private var imagesList= mutableListOf<Int>()



    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        var list:RecyclerView=findViewById(R.layout.fragment_item_list)
        list.layoutManager =LinearLayoutManager(this)
        list.adapter=MyilnesslistRecyclerViewAdapter(titlesList,descriptionsList,imagesList)


        val actionBar = getSupportActionBar()
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)


        }


    }
    private fun addToList(title: String,description:String,image:Int){
        titlesList.add(title)
        descriptionsList.add(description)
        imagesList.add(image)
    }
    private fun postToList(){
    for (i: Int in 1..25){
        addToList("Title$i","Description$i",R.mipmap.ic_launcher)}
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home->{
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }

//val layout = findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar_layout)
//val toolbar = findViewById<Toolbar>(R.id.toolbar)
//val navHostFragment =supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//val navController = navHostFragment.navController
//val appBarConfiguration = AppBarConfiguration(navController.graph)
//layout.setupWithNavController(toolbar, navController, appBarConfiguration)
//
//override fun onSupportNavigateUp(): Boolean {
//    val navController = findNavController(R.id.nav_host_fragment)
//    return navController.navigateUp(appBarConfiguration)
//            || super.onSupportNavigateUp()
//
//}
}