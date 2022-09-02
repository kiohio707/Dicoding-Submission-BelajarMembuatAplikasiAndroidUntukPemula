package id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.R
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.main.MainActivity
import java.lang.Exception

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashTimer = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)

                    startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        splashTimer.start()
    }
}