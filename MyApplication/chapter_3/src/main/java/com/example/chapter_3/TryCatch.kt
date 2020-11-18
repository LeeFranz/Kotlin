package com.example.chapter_3

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    val list = listOf<Int>(1,2)
//    try {
//        println(list[2])
//    }catch (e:ArrayIndexOutOfBoundsException) {
//        e.printStackTrace()
//        println("yjj")
//    }
//    println("pdd")

    val result = try {
        1/0
    }catch (e:Exception) {
        13
    }//try catch 也可以当作表达式来使用
    println(result)

}





































