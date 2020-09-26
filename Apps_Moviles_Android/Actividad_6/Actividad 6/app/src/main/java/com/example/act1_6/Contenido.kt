package com.example.act1_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowId
import android.widget.*
import kotlinx.android.synthetic.main.activity_contenido.*


class Contenido : AppCompatActivity() {
    lateinit var option : Spinner;
    lateinit var result: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contenido)

        option = findViewById(R.id.sp_option) as Spinner
        result = findViewById(R.id.result) as TextView

        val options= arrayOf("Fechas Disponibles", "25/Agosto/2020 - 14:00 Hrs",
            "26/Agosto/2020 - 18:30 Hrs", "27/Agosto/2020 - 10:30 Hrs",
            "28/Agosto/2020 - 13:30 Hrs", "29/Agosto/2020 - 10:30 Hrs",
            "30/Agosto/2020 - 11:00 Hrs","31/Agosto/2020 - 11:30 Hrs",
            "1/Septiembre/2020 - 20:00 Hrs", "2/Septiembre/2020 - 18:00 Hrs",
            "3/Septiembre/2020 - 13:00 Hrs")
        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                result.text = "Selecciona una opción"
            }

            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                result.text = options.get(position)
            }
        }

        Bnt_Confirmacion.setOnClickListener({Toast.makeText(this,"La información ha sido enviado correctamente",Toast.LENGTH_LONG).show()});




    }
}