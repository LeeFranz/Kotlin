package com.example.chapter_3

fun main() {
    val list = listOf<String>("a", "b", "c", "d")
//    for (indexvalue in list.withIndex()) {
//        println("${indexvalue.index} ${indexvalue.value}")
//    }
//    for ((index, value) in list.withIndex()) {
//        println("$index $value")
//    }
    //break 跳出循环 return 结束整个函数  continue 结束单次循环
    for(element in list) {
        if(element == "b") {
            continue
        }
        println(element)
    }
    println("pdd")

}

