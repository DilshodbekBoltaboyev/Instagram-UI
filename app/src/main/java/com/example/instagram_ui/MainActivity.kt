package com.example.instagram_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagram_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            supportFragmentManager.beginTransaction().add(R.id.my_continer, BlankFragment2())
                .commit()

            btnHome.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.my_continer, BlankFragment2()).commit()
            }
            btnProfile.setOnClickListener {
                supportFragmentManager.beginTransaction().replace(R.id.my_continer, BlankFragment())
                    .commit()
            }
        }


    }
}