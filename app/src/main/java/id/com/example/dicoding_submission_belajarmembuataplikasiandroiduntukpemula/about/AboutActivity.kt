package id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "About"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}