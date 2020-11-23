package com.example.act1_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Boton Inicio*/
        Btn_Inicio.setOnClickListener(){
            val intent:Intent = Intent(this, Contenido::class.java);
            startActivity(intent);
        }
    }
}