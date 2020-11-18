package com.example.extend

import kotlin.reflect.KProperty

//常见用法
val name by lazy {
    "Hello"
}

//属性的类型、set和get交给代理类实现
class Agency {
    val parameter1 by JamesBound()
    //对于可变属性，还要添加set方法
    var parameter2 by JamesBound()
}

class JamesBound {
    var realName: String = "JamesBound"
    operator fun getValue(p:Any?, property: KProperty<*>): String {
        return realName
    }

    operator fun setValue(p:Any?, property: KProperty<*>,string: String) {
        realName = string + "pdd"
    }
}

fun main() {
    val agency = Agency()
    println(agency.parameter1)
    println(agency.parameter2)
    agency.parameter2 = "2"//等号会被转义成setValue方法
    println(agency.parameter2)
    println(agency.parameter1.javaClass.simpleName) //String
    println(name)
}