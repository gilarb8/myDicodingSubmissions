package com.subtestdicoding.biographyofmathematician

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val gambarDetailImageView: ImageView = findViewById(R.id.gambarDetailImageView)
        val judulDetailTextView: TextView = findViewById(R.id.judulDetailTextView)
        val deskripsiDetailTextView: TextView = findViewById(R.id.deskripsiDetailTextView)

        val judul = intent.getStringExtra("judul")
        val deskripsi = intent.getStringExtra("deskripsi")
        val gambarResId = intent.getIntExtra("gambar", R.drawable.placeholder_image02)

        judulDetailTextView.text = judul
        deskripsiDetailTextView.text = deskripsi
        gambarDetailImageView.setImageResource(gambarResId)
    }

    fun onBackButtonClick(@Suppress("UNUSED_PARAMETER") view: View) {
        onBackPressedDispatcher.onBackPressed()
    }
}
