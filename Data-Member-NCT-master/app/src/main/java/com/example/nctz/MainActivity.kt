package com.example.nctz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nctz.Onboarding.OnBoardingActivity
import com.example.nctz.config.AppPrefs

class MainActivity : AppCompatActivity() {
    private lateinit var rvNctz: RecyclerView
    private var list: ArrayList<NctMember> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title=("Member List")

        rvNctz = findViewById(R.id.rv_nctz)
        rvNctz.setHasFixedSize(true)

        list.addAll(NctData.listData)
        showRecyclerList()

        if (AppPrefs(this).isFirstTimeLaunch()) {
            startActivity(Intent(this, OnBoardingActivity::class.java))
            finish()
        }
        setContentView(R.layout.activity_main)


    }


    private fun showRecyclerList() {
        rvNctz.layoutManager = LinearLayoutManager(this)
        val listNctAdapter = ListNctAdapter(list)
        rvNctz.adapter = listNctAdapter
        listNctAdapter.setOnItemClickCallback(object : ListNctAdapter.OnItemClickCallback {
            override fun onItemClicked(data: NctMember) {
                showSelectedNct(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvNctz.layoutManager = GridLayoutManager(this, 2)
        val gridNctAdapter = GridNctAdapter(list)
        rvNctz.adapter = gridNctAdapter
        gridNctAdapter.setOnItemClickCallback(object : GridNctAdapter.OnItemClickCallback {
            override fun onItemClicked(data: NctMember) {
                showSelectedNct(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Member List"
                showRecyclerList()
                supportActionBar?.title = (title)
            }

            R.id.action_grid -> {
                title = "Member Grid"
                showRecyclerGrid()
                supportActionBar?.title = (title)
            }

            R.id.action_cardview -> {
                title = "Member CardView"
                showRecyclerCardView()
                supportActionBar?.title = (title)
            }
        }
    }

    private fun showRecyclerCardView() {
        rvNctz.layoutManager = LinearLayoutManager(this)
        val cardViewNctAdapter = CardViewNctAdapter(list)
        rvNctz.adapter = cardViewNctAdapter
    }

    private fun showSelectedNct(nctmember : NctMember) {
        Toast.makeText(this, "Kamu memilih " + nctmember.name, Toast.LENGTH_SHORT).show()
    }
}