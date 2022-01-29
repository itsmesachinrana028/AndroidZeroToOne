package com.sr028.androidzerotoone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sr028.androidzerotoone.databinding.ActivityMainBinding
import com.sr028.androidzerotoone.databinding.ActivityWithViewBindingBinding

class WithViewBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityWithViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val greeting = "Welcome to View Binding Tutorial"
        val details = "In View Binding we can access view directly¡"
        binding.tvGreetings.text = greeting
        binding.tvDetails.text = details
    }
}