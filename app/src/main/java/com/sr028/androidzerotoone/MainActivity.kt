package com.sr028.androidzerotoone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sr028.androidzerotoone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val greeting = "Welcome to View Binding Tutorial"
        val details = "In View Binding we can access view directly with out using findViewById()"
        binding.tvGreetings.text = greeting
        binding.tvDetails.text = details
    }
}