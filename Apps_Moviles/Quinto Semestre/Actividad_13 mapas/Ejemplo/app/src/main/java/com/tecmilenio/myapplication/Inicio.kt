package com.tecmilenio.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.gms.maps.SupportMapFragment

class Inicio : AppCompatActivity() {
    lateinit var editTextLatitud : EditText;
    lateinit var editTextLongutud : EditText;
    lateinit var botonBuscar : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        editTextLatitud=findViewById(R.id.name_country);
        editTextLongutud=findViewById(R.id.name_country2)
        botonBuscar=findViewById(R.id.Btn_buscar)


        botonBuscar.setOnClickListener(){
            val intent = Intent(this@Inicio,MapsActivity::class.java)
            intent.putExtra("lat",  editTextLatitud.text.toString())
            intent.putExtra("long", editTextLongutud.text.toString())
            startActivity(intent)

        }
    }
}