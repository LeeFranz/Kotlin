package com.example.extend

class OutterClass {
    var parameterA: String = "hello"
    inner class InnerClass {
        fun innerFun() {
            println(this@OutterClass.parameterA)
        }
    }
}

fun main() {
    val inner = OutterClass().InnerClass()
    inner.innerFun()
}