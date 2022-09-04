package id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.main

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.R
import id.com.example.dicoding_submission_belajarmembuataplikasiandroiduntukpemula.detail.FirearmDetailActivity

class FirearmAdapter(private val listFirearm: ArrayList<Firearm>) :
    RecyclerView.Adapter<FirearmAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name_item_firearm)
        var tvCountry: TextView = itemView.findViewById(R.id.tv_country_item_firearm)
        var ivPhoto: ImageView = itemView.findViewById(R.id.iv_item_firearm)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_firearm, parent,false )
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, photo, country, caliber, capacity, detail) = listFirearm[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.ivPhoto)

        holder.tvName.text = name
        holder.tvCountry.text = country

        holder.itemView.setOnClickListener {
            val detailIntent = Intent(holder.itemView.context, FirearmDetailActivity::class.java)

            detailIntent.putExtra(FirearmDetailActivity.FIREARMS_EXTRAS, Firearm(
                name,
                photo,
                country,
                caliber,
                capacity,
                detail
            ))

            holder.itemView.context.startActivity(detailIntent)
        }
    }

    override fun getItemCount(): Int {
        return listFirearm.size
    }
}