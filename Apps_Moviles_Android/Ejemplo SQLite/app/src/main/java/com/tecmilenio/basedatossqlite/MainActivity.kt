package com.tecmilenio.basedatossqlite

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val codeEditText: EditText = findViewById(R.id.code)
        val descriptionEditText: EditText = findViewById(R.id.description)
        val priceEditText: EditText = findViewById(R.id.price)
        val addButton: Button = findViewById(R.id.add)
        val codeSearchButton: Button = findViewById(R.id.code_search)
        val descriptionSearchButton: Button = findViewById(R.id.description_search)
        val deleteButton: Button = findViewById(R.id.code_delete)
        val updateButton: Button = findViewById(R.id.update)

        addButton.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this,"admin", null, 1)
            val bd = admin.writableDatabase
            val register = ContentValues()
            register.put("code",  codeEditText.text.toString())
            register.put("description", descriptionEditText.text.toString())
            register.put("price", priceEditText.text.toString())
            bd.insert("article", null, register)
            bd.close()
            codeEditText.setText("")
            descriptionEditText.setText("")
            priceEditText.setText("")
            Toast.makeText(this, "Se agrego el articulo a la base de datos los datos", Toast.LENGTH_SHORT).show()
        }

        codeSearchButton.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "admin", null, 1)
            val bd = admin.writableDatabase
            val row = bd.rawQuery("select description, price from article where code=${codeEditText.text}", null)
            if (row.moveToFirst()) {
                descriptionEditText.setText(row.getString(0))
                priceEditText.setText(row.getString(1))
            } else
                Toast.makeText(this, "No existe un artículo con dicho código",  Toast.LENGTH_SHORT).show()
            bd.close()
        }

        descriptionSearchButton.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "admin", null, 1)
            val bd = admin.writableDatabase
            val row = bd.rawQuery("select code, price from article where description='${descriptionEditText.text}'", null)
            if (row.moveToFirst()) {
                codeEditText.setText(row.getString(0))
                priceEditText.setText(row.getString(1))
            } else
                Toast.makeText(this, "No existe un artículo con dicha descripción", Toast.LENGTH_SHORT).show()
            bd.close()
        }

        deleteButton.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "admin", null, 1)
            val bd = admin.writableDatabase
            val cant = bd.delete("article", "code=${codeEditText.text}", null)
            bd.close()
            codeEditText.setText("")
            descriptionEditText.setText("")
            priceEditText.setText("")
            if (cant == 1)
                Toast.makeText(this, "Se borró el artículo con dicho código", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "No existe un artículo con dicho código", Toast.LENGTH_SHORT).show()
        }

        updateButton.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "admin", null, 1)
            val bd = admin.writableDatabase
            val register = ContentValues()
            register.put("description", descriptionEditText.text.toString())
            register.put("price", priceEditText.text.toString())
            val cant = bd.update("article", register, "code=${codeEditText.text}", null)
            bd.close()
            if (cant == 1)
                Toast.makeText(this, "se modificaron los datos", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "no existe un artículo con el código ingresado", Toast.LENGTH_SHORT).show()
        }
    }
}