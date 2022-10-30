package com.moyshagg.thirdlab

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CatsAdapter(private val items:List<CatsData>): RecyclerView.Adapter<CatsAdapter.CatsViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cats,parent,false)
        return CatsViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: CatsViewHolder, position: Int) {
        holder.bind(items[position])
    }
    override fun getItemCount() = items.size

    inner class CatsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        private val catImage = itemView.findViewById<ImageView>(R.id.imageCat)
        private val publicAvatar = itemView.findViewById<ImageView>(R.id.publicAvatar)
        private val publicName = itemView.findViewById<TextView>(R.id.publicName)
        private val date = itemView.findViewById<TextView>(R.id.date)
        private val comments = itemView.findViewById<TextView>(R.id.comments)
        private val likes = itemView.findViewById<TextView>(R.id.likes)

        fun bind(CatsData: CatsData)
        {
            catImage.setImageResource(CatsData.CatImage)
            publicAvatar.setImageResource(CatsData.publicAvatar)
            publicName.text = CatsData.publicName
            date.text = CatsData.date
            comments.text = CatsData.comments
            likes.text = CatsData.likes
        }
    }
}