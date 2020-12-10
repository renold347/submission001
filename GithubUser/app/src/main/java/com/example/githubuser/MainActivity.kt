package com.example.githubuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Club>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_Club.setHasFixedSize(true)
        list.addAll(getListClub())
        showRecyclerList()
    }
    private fun getListClub(): ArrayList<Club>{
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listClub = ArrayList<Club>()
        for (position in dataName.indices){
            val club = Club(
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listClub.add(club)
        }
        return listClub
    }
    private fun showRecyclerList(){
        rv_Club.layoutManager = LinearLayoutManager(this)
        val listClubAdapter = ListClubAdapter(list)
        rv_Club.adapter = listClubAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.tentang_saya){
            val  openAboutIntent = Intent(this@MainActivity,AboutActivity::class.java)
            startActivity(openAboutIntent)
        }
        return super.onOptionsItemSelected(item)

    }

}