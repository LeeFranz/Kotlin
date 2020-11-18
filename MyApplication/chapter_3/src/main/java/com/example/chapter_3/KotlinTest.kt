package com.example.chapter_3

fun main() {
    val list = arrayListOf<Int>(1,2,3)
    val array = intArrayOf(1, 3, 5)
    function(1, 2, 3, 4, str = "adsa")
    //这里也用到了具名参数，可以避免传参数时候产生歧义，具名参数能够在调换函数参数的位置时使函数正常运行
    function(*array, str = "adsa")//这里使用了operator只支持数组
    sayHello(str = "asdasd")
}

fun function(vararg ints: Int, str: String) {
    ints.forEach { println(it) }
    println(str)
}

//默认参数
fun sayHello(startTime: Double = 1.2, str:String) {
    println(startTime)
    println(str)
}

