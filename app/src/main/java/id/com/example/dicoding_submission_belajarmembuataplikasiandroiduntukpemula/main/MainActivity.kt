package id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvFirearm: RecyclerView
    private var list: ArrayList<Firearm> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Senjata Api"


    }
}