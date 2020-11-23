package com.tecmilenio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main,menu)
        return true
    }
       
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
       menu?.getItem(3)?.setVisible(false)
        menu?.getItem(4)?.setVisible(false)
        menu?.getItem(5)?.setVisible(false)

        return super.onPrepareOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
          var selectedOption = ""
       when(item?.itemId){
          /*R.id.libro1 -> selectedOption = "Libro1"
           R.id.libro2 -> selectedOption = "Libro2"
           R.id.libro3 -> selectedOption = "Libro3"

           //Items
           R.id.item1-> selectedOption = "Item1"
           R.id.item2 -> selectedOption = "Item2"
           R.id.item3 -> selectedOption = "Item3"*/
       }
        if(item.itemId == R.id.libro1){ //Primer Libro
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, Firstbookfragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        } else if(item.itemId == R.id.libro2){ //Segundo Libro
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, Secondbookfragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        if(item.itemId == R.id.libro3){ //Tercer Libro
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, Threebookfragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

       // Toast.makeText(this,"Option :"+selectedOption, Toast.LENGTH_SHORT).show()

        return super.onOptionsItemSelected(item)
    }
}