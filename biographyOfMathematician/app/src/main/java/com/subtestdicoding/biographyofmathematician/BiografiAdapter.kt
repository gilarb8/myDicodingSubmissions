package com.subtestdicoding.biographyofmathematician

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BiografiAdapter(private val biografiList: List<Biografi>, private val listener: (Biografi) -> Unit) :
    RecyclerView.Adapter<BiografiAdapter.BiografiViewHolder>() {

    inner class BiografiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val judulTextView: TextView = itemView.findViewById(R.id.judulTextView)
        private val gambarImageView: ImageView = itemView.findViewById(R.id.gambarImageView)

        fun bind(biografi: Biografi) {
            judulTextView.text = biografi.judul
            gambarImageView.setImageResource(biografi.gambarResId)

            itemView.setOnClickListener { listener(biografi) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BiografiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_biografi, parent, false)
        return BiografiViewHolder(view)
    }

    override fun onBindViewHolder(holder: BiografiViewHolder, position: Int) {
        holder.bind(biografiList[position])
    }

    override fun getItemCount(): Int {
        return biografiList.size
    }
}
