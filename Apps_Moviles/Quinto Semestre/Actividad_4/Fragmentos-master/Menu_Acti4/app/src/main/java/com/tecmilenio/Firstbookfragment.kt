package com.tecmilenio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_firstbookfragment.*

class Firstbookfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_firstbookfragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnPlus.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com.mx/Guerra-mundial-Z-max-brooks/dp/8492516089/ref=sr_1_3?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=16XJ7TRZZX3US&dchild=1&keywords=guerra+mundial+z+libro&qid=1599636562&sprefix=guerra+mun%2Caps%2C227&sr=8-3"))
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        Boton_MercadoLibre.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://articulo.mercadolibre.com.mx/MLM-803549366-libro-guerra-mundial-z-_JM"))
            startActivity(intent)
        }




    }

}