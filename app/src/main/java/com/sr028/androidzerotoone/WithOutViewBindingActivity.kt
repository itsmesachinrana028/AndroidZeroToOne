package com.sr028.androidzerotoone

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WithOutViewBindingActivity : AppCompatActivity() {
    //  Boilerplate
    lateinit var tvTextView1: TextView
    lateinit var tvTextView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_out_view_binding)
//        Boilerplate
        tvTextView1 = findViewById(R.id.tv_textView1)
        tvTextView2 = findViewById(R.id.tv_textView2)
    }
}