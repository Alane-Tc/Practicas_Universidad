package com.tecmilenio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_firstbookfragment.*
import kotlinx.android.synthetic.main.fragment_secondbookfragment.*


class Secondbookfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secondbookfragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnPlus2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com.mx/Bajo-misma-estrella-Edici%C3%B3n-pel%C3%ADcula/dp/6073123191/ref=sr_1_1?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=32HOC9AH2CG54&dchild=1&keywords=bajo+la+misma+estrella+libro&qid=1599639208&sprefix=bajo+la%2Caps%2C228&sr=8-1"))
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        Boton_MercadoLibre2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://articulo.mercadolibre.com.mx/MLM-643350000-libro-bajo-la-misma-estrella-envio-gratis-_JM#position=1&type=item&tracking_id=81e18379-129f-4ef4-8536-4790539fe921"))
            startActivity(intent)
        }
    }

}