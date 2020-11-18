package com.example.chapter_3

import java.lang.Exception
import java.lang.UnsupportedOperationException

fun main() {
    val input = readLine()
    input?.let {
        try {
            val splits = it.split(" ")
            println(splits)
            val left = splits[0].toDouble()
            val caculator = splits[1]
            val right = splits[2].toDouble()
            println(
                "caculate $left  $caculator  $right --> ${Caculator(caculator).apply(
                    left = left,
                    right = right
                )}"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}


class Caculator(op: String) {
    val operator: (left: Double, right: Double) -> Double

    init {
        operator = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            else -> {
                throw UnsupportedOperationException()
            }
        }
    }

    fun apply(left: Double, right: Double):Double {
        return operator(left, right)
    }
}