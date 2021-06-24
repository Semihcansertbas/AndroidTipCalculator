package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        totalText.visibility = View.INVISIBLE
        totalTipText.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            // Bill
            val bill = billAmountNumberEdit.text.toString().toDouble()

            // Tip Percentage
            val tipPercentage = tipPercentageNumberEdit.text.toString().toDouble() / 100

            // Tip
            val tip = bill * tipPercentage

            // Total
            val total = bill + tip

            // Make Total's visible
            totalText.visibility = View.VISIBLE
            totalText.text = "Total: \$${total}"
            totalTipText.visibility = View.VISIBLE
            totalTipText.text = "Tip: \$${tip}"


        }


    }
}