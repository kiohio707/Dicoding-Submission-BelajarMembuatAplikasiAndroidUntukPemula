package id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.main

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Firearm(
    var name: String = "",
    var photo: Int = 0,
    var country: String = "",
    var caliber: String = "",
    var capacity: String = "",
    var detail: String = ""
): Parcelable