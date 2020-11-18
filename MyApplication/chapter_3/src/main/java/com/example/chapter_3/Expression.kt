package com.example.chapter_3

class Man {

    infix fun function(args: String) {
        println(args)
    }
}

fun main() {
    //中缀表达式，当函数只有一个参数的时候，能够不用.()的方式调用
    Man() function "pdd"

    val name = if(2>3) {
        "pdd"
    } else {
        "yjj"
    }
    val arrays = listOf<String>("adc","adb","pdd")
    val newName = "pddHL"

    //when的用法
    when(name) {
        "pdd","yjj" -> println("I love you")
        is String -> println("I hate you")
        in arrays -> println("I want you")
        newName -> println("I find you")
    }
    //when替代if的用法
    val favoriateSong = when {
        2>3 -> "pdd"
        else -> "yjj"
    }


}














