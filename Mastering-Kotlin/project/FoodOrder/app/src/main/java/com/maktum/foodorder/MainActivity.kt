package com.maktum.foodorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)

        val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
        val tvOrder = findViewById<TextView>(R.id.tvOrder)
        //val btnOrder = findViewById<Button>(R.id.btnOrder)
        //val btnOrder = findViewById<Button>(R.id.btnOrder)

        val cbOnions = findViewById<CheckBox>(R.id.cbOnions)
        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)

        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = cbCheese.isChecked
            val onions = cbOnions.isChecked
            val salad = cbSalad.isChecked

            var orderString = "You ordered a burger with:\n" +
                    "${meat.text}" +
                    (if(cheese) "\nCheese" else "") +
                    (if(onions) "\nOnions" else "") +
                    (if(salad) "\nSalad" else "")
            tvOrder.text = orderString
        }
    }
}