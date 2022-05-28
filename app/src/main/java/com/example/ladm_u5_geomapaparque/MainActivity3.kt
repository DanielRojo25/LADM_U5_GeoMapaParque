package com.example.ladm_u5_geomapaparque

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ladm_u5_geomapaparque.databinding.ActivityMain3Binding
import com.example.ladm_u5_geomapaparque.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            startActivity(Intent(this,ActivityMainBinding::class.java))
        }
    }
}