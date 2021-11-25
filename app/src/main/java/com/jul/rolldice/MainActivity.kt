package com.jul.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val dice = Dice(6)
            val luckyNumber = (1..6).random().toString()
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = dice.roll().toString()

            Toast.makeText(this, "You have rolled a ${resultTextView.text}", Toast.LENGTH_SHORT)
                .show()
            if (resultTextView.text == luckyNumber) {
                Toast.makeText(this, "And it's the lucky number!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "But it's not the lucky number!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}