package id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.detail

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.R
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.databinding.ActivityFirearmDetailBinding
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.main.Firearm

class FirearmDetailActivity : AppCompatActivity() {
    companion object {
        const val FIREARMS_EXTRAS = "firearmExtras"
    }

    private lateinit var binding : ActivityFirearmDetailBinding

    private var firearmData: Firearm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirearmDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportActionBar?.title = "Detail Senjata Api"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        firearmData = intent.getParcelableExtra(FIREARMS_EXTRAS)

        Log.e("TAG", "onCreate: $firearmData")

        binding.apply {
            tvNameFirearmDetail.text = firearmData?.name
            tvCountryFirearmDetail.text = firearmData?.country
            tvCaliberFirearmDetail.text = firearmData?.caliber
            tvCapacityFirearmDetail.text = firearmData?.capacity
            tvDescrptionFirearmDetail.text = firearmData?.detail

            Glide.with(this@FirearmDetailActivity)
                .load(firearmData?.photo)
                .apply(RequestOptions())
                .into(ivPhotoFirearmDetail)

        }



    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}