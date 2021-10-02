package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1=findViewById<EditText>(R.id.txt_nombre)
        val res=findViewById<TextView>(R.id.textR)
        val btn_sal=findViewById<Button>(R.id.btn_saludar)

        btn_sal.setOnClickListener {
            res.setText("HOLA "+(n1.text.toString()))
        }
    }
}