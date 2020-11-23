package com.tecmilenio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_secondbookfragment.*
import kotlinx.android.synthetic.main.fragment_threebookfragment.*

class Threebookfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_threebookfragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnPlus3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com.mx/Lugares-asombrosos-Traves%C3%ADas-ins%C3%B3litas-extra%C3%B1as/dp/607318445X/ref=sr_1_1?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2K9HUQDPNXF6M&dchild=1&keywords=luisito+comunica+libro&qid=1599640036&sprefix=luisi%2Caps%2C249&sr=8-1"))
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        Boton_MercadoLibre3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://articulo.mercadolibre.com.mx/MLM-731499352-original-lugares-asombrosos-luisito-comunica-nuevo-_JM?quantity=1#position=1&type=item&tracking_id=456e7310-7a26-479c-9fe0-9e606fcacbfa"))
            startActivity(intent)
        }
    }

}