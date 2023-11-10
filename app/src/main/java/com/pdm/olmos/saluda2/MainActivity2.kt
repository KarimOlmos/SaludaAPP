package com.pdm.olmos.saluda2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvGreeting:TextView = findViewById(R.id.tvGreeting)
       // val name:String = Intent.extras?.getString("EXTRA_NAME").orEmpty()
        val name = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvGreeting.text = "Hola $name"


    }
}