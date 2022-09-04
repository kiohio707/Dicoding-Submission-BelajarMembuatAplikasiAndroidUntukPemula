package id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.R
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.about.AboutActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rvFirearm: RecyclerView
    private var list: ArrayList<Firearm> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Senjata Api"

        rvFirearm = findViewById(R.id.rv_firearm)
        rvFirearm.setHasFixedSize(true)

        list.addAll(FirearmData.listFirearm)

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvFirearm.layoutManager = LinearLayoutManager(this)

        val firearmAdapter = FirearmAdapter(list)
        rvFirearm.adapter = firearmAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        aboutIntent(item.itemId)

        return super.onOptionsItemSelected(item)
    }

    private fun aboutIntent(itemId: Int) {
        when (itemId) {
            R.id.menu_about -> {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
            }
        }
    }
}