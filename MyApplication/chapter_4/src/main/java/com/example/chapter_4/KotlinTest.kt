package com.example.chapter_4

fun main() {
    RealA(1).hh()
    println(RealB().dd)
}

//抽象类可以有变量状态，也可以有函数的默认实现,不能被多继承
abstract class B {
    var dd: Int = 1
}

class RealB : B() {

}

//接口不能有变量状态，可以有函数的默认实现，可以被多继承
interface A {
    var pp: Int // 实际上是定义了pp的get和set方法
    fun hello() {
        println("pdd")
    }
}

class RealA(override var pp: Int) : A {
    fun hh() {
        hello()
    }

}
//kotlin中默认的类或者方法都是final的
//类如果想被继承，需要先open，方法如果需要被覆盖，需要open
//覆盖方法的时候一定需要override关键字