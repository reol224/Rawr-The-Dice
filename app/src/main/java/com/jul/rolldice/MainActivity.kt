package com.jul.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val dice = Dice(6)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val defaultImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = R.drawable.dice_1
        defaultImage.setImageResource(drawableResource)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            aVeryChonkyRoll()
        }

    }

    fun aVeryChonkyRoll() {
        val diceRoll = dice.roll()
        val luckyNumber = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        Toast.makeText(this, "You have rolled a $diceRoll", Toast.LENGTH_SHORT)
            .show()
        if (luckyNumber == diceRoll) {
            Toast.makeText(this, "And it's the lucky number as well!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "But it's not the lucky number!", Toast.LENGTH_SHORT).show()
        }
    }
}