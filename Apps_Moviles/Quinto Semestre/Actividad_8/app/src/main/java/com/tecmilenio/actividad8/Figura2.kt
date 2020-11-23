package com.tecmilenio.actividad8


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_figura2.*



class Figura2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_figura2)

        fButton.setOnClickListener{
            val callIntent: Intent = Uri.parse("tel:8117281139").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent);
        }
    }



}

