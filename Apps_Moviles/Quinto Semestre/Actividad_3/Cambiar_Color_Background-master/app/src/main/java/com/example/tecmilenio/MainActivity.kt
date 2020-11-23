package com.example.tecmilenio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button
import android.support.v4.content.ContextCompat

class MainActivity : AppCompatActivity() {
    lateinit var boton1 : Button;
    lateinit var layout: View;
    lateinit var boton2 : Button;
    lateinit var boton3 : Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton1=findViewById(R.id.boton1);
        layout=findViewById(R.id.Fondo_Pantalla);
        boton2=findViewById(R.id.botonn2);


        boton1.setOnClickListener(){
            CambiarFondo();
        }

        boton2.setOnClickListener(){
            CambiarFondo2();
        }



    }


    private fun CambiarFondo(){
       layout.background = ContextCompat.getDrawable(this, R.color.colorAccent);

    }
    private fun CambiarFondo2(){
        layout.background=ContextCompat.getDrawable(this,R.color.Fondo2);
    }

}






