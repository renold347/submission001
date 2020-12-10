package com.example.githubuser

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_row_club.view.*

class ListClubAdapter (private val listClub : ArrayList<Club>):RecyclerView.Adapter<ListClubAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(club : Club) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(club.photo)
                    .apply(RequestOptions().override(55, 55))
                    .into(img_item_photo)
                tv_item_name.text = club.name
                tv_item_description.text = club.description

            }
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
       val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_club, viewGroup , false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listClub[position])
    }

    override fun getItemCount(): Int = listClub.size

    }
