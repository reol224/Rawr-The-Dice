package com.jul.rolldice

class Dice(private val numSides: Int) {
    var luckyNumber = (1..numSides).random()
    fun roll(): Int {
        return (1..numSides).random()
    }
}