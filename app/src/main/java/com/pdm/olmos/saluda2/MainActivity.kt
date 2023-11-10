package com.pdm.olmos.saluda2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnHello:AppCompatButton =
            findViewById(R.id.btnHello)


        btnHello.setOnClickListener {
            val etName=findViewById<EditText>(R.id.etName)
            val name = etName.text.toString()

            val intentGA = Intent(this, MainActivity2::class.java)
            intentGA.putExtra("EXTRA_NAME", name)
            startActivity(intentGA)



           // Log.i("Test", "Botón pulsado")
           // Toast.makeText(this, "Hola $name!",
           // Toast.LENGTH_LONG).show()

          //  if (name.isNotEmpty()) {
            //    Snackbar.make(btnHello, "Hola $name!", Snackbar.LENGTH_SHORT)
              //      .setAnchorView(btnHello)
                //    .setAction("CLOSE") { finishAffinity() }
                  //  .show()
         //   }


        }


    }




}