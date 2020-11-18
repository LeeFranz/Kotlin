package com.example.chapter_3

fun main() {

    sum_2(1,2)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum_1(a: Int, b: Int) = a + b // 返回类型可以省略

val sum_2 = fun(a: Int, b: Int): Int {
    println("sum_2 is invoked")
    return a + b
}

val sum_3 = fun(a: Int, b: Int): Int = a + b // 返回类型可以省略

//lambda表达式
//其实就是匿名函数
//调用时候sum_4(1,2) 等效于 sum.invoke(1,2)
//带参数
val sum_4 = { a: Int, b: Int -> a + b }

//不带参数
val sum_5 = { println("pddddd") }

//多行表达式中，lambda表达式的返回值类型取决于最后一行
val sum_6 = { a: Int, b: Int ->
    println("pdd is good")
    a + b
}

//函数的类型表达
// ::sum 对具名函数sum(a: Int, b: Int)的引用，sum_2或lambda表达式引用sum_4 就是这个作用
//函数也具备具体类型 FunctionX 可以简写成 (Int,Int) -> Int (以sum_4为例子)

//函数本身也可以作为参数
fun superSum(arg1: Int, arg2:(Int) -> Long):String {
    arg2.invoke(1)
    return "pdd $arg1"
}
//调用函数时候，如果最后一个参数是函数，可以把该参数移出()并用{}包裹， 如果参数列表只有一个,()可以省略
















































