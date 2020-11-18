package com.example.extend

//拓展函数，最好定义在顶层方法，这样能被全局引用
//拓展函数的基本语法如下
fun String.letterCount(): Int {
    var count = 0
    for (char in this) {
        if(char.isLetter()) {
            count ++
        }
    }
    return count
}

fun main() {
    val str = "asdas2r3"
    println(str.letterCount())
}