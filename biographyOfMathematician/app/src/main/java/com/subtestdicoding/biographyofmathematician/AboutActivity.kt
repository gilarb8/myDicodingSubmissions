package com.subtestdicoding.biographyofmathematician

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val fotoProfilImageView: ImageView = findViewById(R.id.fotoProfilImageView)
        val namaTextView: TextView = findViewById(R.id.namaTextView)
        val emailTextView: TextView = findViewById(R.id.emailTextView)

        val nama = "Name: Gillar Ajie Prasatya"
        val email = "Contact: gilarc@tuta.io"
        val fotoProfil = R.drawable.author_photo

        namaTextView.text = nama
        emailTextView.text = email
        fotoProfilImageView.setImageResource(fotoProfil)
    }
}
