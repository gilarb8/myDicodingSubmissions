package com.subtestdicoding.biographyofmathematician

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BiografiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biografi)

        // Using data from Biografi.kt
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = BiografiAdapter(matematikawanList) { biografi ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("judul", biografi.judul)
            intent.putExtra("deskripsi", biografi.deskripsi)
            intent.putExtra("gambar", biografi.gambarResId)
            startActivity(intent)
        }

        // Inisialisasi tombol "About"
        val aboutButton: Button = findViewById(R.id.aboutButton)
        aboutButton.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        // tombol About di bagian atas sebelah kanan
        val params = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT,
        )
        params.addRule(RelativeLayout.ALIGN_PARENT_END, RelativeLayout.TRUE)
        params.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE)
        aboutButton.layoutParams = params
        aboutButton.layoutParams.width = 150 // lebar tombol sesuai keinginan Anda
    }
}
