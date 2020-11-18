package com.example.extend

enum class EnumTest(val id:Int) {
    //相当于这个类在初始化时候初始化了四个EnumTest对象，每个对象都有id这个成员
    DEBUG(1), VERBOSE(2), WARNING(3), ERROR(4);

    fun getTag():String{
        return "$id, $name, $ordinal"
    }
}

fun main() {
    //因为要初始化对象，所以使用枚举必然有一定性能和内存开销
    println(EnumTest.DEBUG.getTag())
    println(EnumTest.VERBOSE.id)

}