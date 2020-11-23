package com.tecmilenio.actividad7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Figura 1
        Btn_Figura1.setOnClickListener(){
            val intent: Intent = Intent(this, Figuras::class.java);
            startActivity(intent);
        }
        //Figura 2
        Btn_Figura2.setOnClickListener(){
            val intent: Intent = Intent(this, Figura2::class.java);
            startActivity(intent);
        }

    }
}