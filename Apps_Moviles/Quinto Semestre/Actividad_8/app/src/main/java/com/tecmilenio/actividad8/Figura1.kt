package com.tecmilenio.actividad8

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_figura1.*


class Figura1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_figura1)
        //Figura 1
         firstButton.setOnClickListener {
           val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://miportaltecmilenio.com.mx/"))
           startActivity(intent)
       }

       SecondButton.setOnClickListener {
           val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.mx/"))
           startActivity(intent)
       }


        }







}