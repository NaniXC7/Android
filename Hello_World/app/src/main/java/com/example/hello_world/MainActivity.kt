package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(){

            val input_nombre = findViewById<TextView>(R.id.nombre)
            val input_mensaje = findViewById<TextView>(R.id.Mensaje)

            input_mensaje.text = "Hola " + input_nombre.text

            val toast = Toast.makeText(applicationContext, "hola "+ input_nombre.text, Toast.LENGTH_LONG)
            toast.show()

        }
    }
}