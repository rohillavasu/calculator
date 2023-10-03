package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addition = findViewById<Button>(R.id.btnAdd)
        val Substraction = findViewById<Button>(R.id.btnSub)
        val multiply = findViewById<Button>(R.id.btnMlty)
        val divide = findViewById<Button>(R.id.btnDiv)
        val first = findViewById<EditText>(R.id.EdtNo1)
        val second = findViewById<EditText>(R.id.edtNo2)

        addition.setOnClickListener {
            if (first.text.toString() != "" && second.text.toString() != "") {
                val no1 = first.text.toString().toInt()
                val no2 = second.text.toString().toInt()
                val sum = no1 + no2

                Toast.makeText(this, "the sum is" + sum, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "please enter the value", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        Substraction.setOnClickListener {
            if (first.text.toString() != "" && second.text.toString() != "") {
                val no1 = first.text.toString().toInt()
                val no2 = second.text.toString().toInt()
               val difference = no1-no2

                Toast.makeText(this, "the sum is" + difference, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "please enter the value", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        multiply.setOnClickListener {
            if (first.text.toString() != "" && second.text.toString() != "") {
                val no1 = first.text.toString().toInt()
                val no2 = second.text.toString().toInt()
                val product = no1*no2

                Toast.makeText(this, "the sum is" + product, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "please enter the value", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        divide.setOnClickListener {
            if (first.text.toString() != "" && second.text.toString() != "") {
                val no1 = first.text.toString().toInt()
                val no2 = second.text.toString().toInt()
                val divi = no1/no2

                Toast.makeText(this, "the sum is" +divi , Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "please enter the value", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }
}