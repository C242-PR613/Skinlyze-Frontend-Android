package com.dicoding.skinlyze

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.dicoding.skinlyze11.MainActivity
import com.dicoding.skinlyze11.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_welcome1)  // Pastikan layout_welcome1.xml digunakan

        // Menghubungkan tombol "Masuk" yang benar
        val btnMasuk = findViewById<Button>(R.id.btnMasuk1) // Menggunakan ID btnMasuk1

        // Menangani klik tombol "Masuk"
        btnMasuk.setOnClickListener {
            // Arahkan ke MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Opsional: Menutup Activity Welcome setelah navigasi
            finish()
        }
    }
}
