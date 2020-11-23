package com.tecmilenio.etiquetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val productCost:Int = 100
    private var productCounter:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        product_ropa.setOnClickListener(View.OnClickListener {
            Productos();
        })

        Calcetas_boton.setOnClickListener(View.OnClickListener {
            Productos();
        })

        Btn_PrecioRopa.setOnClickListener(View.OnClickListener {
            MensajePresio();
        })

        btn_RopaSpidy.setOnClickListener(View.OnClickListener {
            MensajePresio();

        })
    }

    private fun MensajePresio(){
        val mAlertDialog = AlertDialog.Builder(this@MainActivity)
        mAlertDialog.setIcon(R.mipmap.ic_launcher_round)
        mAlertDialog.setTitle("Precio") //set alertdialog title
        mAlertDialog.setMessage("El Costo de la camisa es de $100, ¿Desea Comprarla?")
        mAlertDialog.setPositiveButton("Sí") { dialog, id ->
        }

        mAlertDialog.setNegativeButton("No") { dialog, id ->
        }
        mAlertDialog.show()
    }

    private fun Productos(){
        if(product_ropa == Calcetas_boton){
        calcTotal_Ropa()
        productCounter+=1;
        }else{
            productCounter+= 1;
            calcTotal_Ropa();

        }

    }
    private fun calcTotal_Ropa() {
        val totalProducts = productCounter * productCost;
        product_total.text = "Total Camisas $"+ totalProducts;
        if (totalProducts == 2000){
            MensajeAD();
            product_ropa.isClickable=false;
            Calcetas_boton.isClickable=false;
        }
    }


    private fun MensajeAD(){
        val mAlertDialog = AlertDialog.Builder(this@MainActivity)
        mAlertDialog.setIcon(R.mipmap.ic_launcher_round)
        mAlertDialog.setTitle("Alerta") //set alertdialog title
        mAlertDialog.setMessage("Usted compro $2000 pesos de ropa, intentelo más tarde" +
                " para comprar más")
        mAlertDialog.setPositiveButton("Ok") { dialog, id ->
        }

        mAlertDialog.show()

    }


}





