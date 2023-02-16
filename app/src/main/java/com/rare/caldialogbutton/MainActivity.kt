package com.rare.caldialogbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var etvalue : EditText
    lateinit var btnshow : Button

    var value  = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etvalue = findViewById(R.id.etvalue)
        btnshow = findViewById(R.id.btnshow)

        btnshow.setOnClickListener{
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("ALert!")
            dialog.setMessage("Press on Add to add 10 in number \n Press multi to multiply number by 5\n Press Reset to reset number\n")
            dialog.setPositiveButton("Add"){_,_ ->
                value = value + 10
                etvalue.setText(value.toString())


            }
            dialog.setNegativeButton("multi"){_,_ ->
                value = value * 5
                etvalue.setText(value.toString())

            }
            dialog.setNeutralButton("Reset"){_,_ ->
                value = 0
                etvalue.setText(value.toString())
            }
            dialog.create().show()
        }


    }
}