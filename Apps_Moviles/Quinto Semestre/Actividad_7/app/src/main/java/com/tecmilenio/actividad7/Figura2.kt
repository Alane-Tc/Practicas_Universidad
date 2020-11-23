package com.tecmilenio.actividad7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_figura2.*

class Figura2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_figura2)

        fButton.setOnClickListener {Toast.makeText(this,"Esto es un circulo",Toast.LENGTH_LONG).show()};

        SButton.setOnClickListener {Toast.makeText(this,"Esto es un ring",Toast.LENGTH_LONG).show()};

    }
}