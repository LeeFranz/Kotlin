package com.example.extend

class Money {

    constructor(num:Int) {
        this.number = num
    }

    var number: Int = 0

    //运算符重载，具体的运算符在使用时被转换成实际的函数
    operator fun plus(money: Money): Money {
        number += money.number
        return Money(number)
    }

    operator fun plus(int: Int): Int {
        return number + int
    }

}

fun main() {
    val m1 = Money(2)
    val m2 = Money(2)
    //println((m1 + m2).number)
    println(m1 + 3)


}


