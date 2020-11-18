package com.example.chapter_4

//主构造函数在类名后加括号标示，任何类默认有一个无参主构造函数，主构造函数没有函数体，可以带参数。如果要增加逻辑代码，可以在init代码块中实现
//遵循Java中子类构造函数中必须先调用父类构造函数的规则
//当用主构造函数构建一个子类时，必须指明该类实现类父类的哪个构造函数，这一行为通过父类类名后加括号实现，空括号代表父类的无参构造函数，如果带参数则代表使用了其他构造函数，这一继承行为也可以在init函数体中实现。
/*class Student: Person(){

}
open class Person {

}*/

//一个类中如果同时存在主次构造函数，则次构造函数必须继承主构造函数，至少间接继承

/*class Person(val name:String, val age:Int) {
    constructor(racial: String):this("pdd",24)
    constructor(dna: Long):this("white")
}*/

//有子类中不存在主构造函数的情况，这种情况下其构造函数中必须显式标明调用了父类的构造函数,由于没有主构造函数，也就不需要在父类后添加括号
/*open class Person(val name:String, val age:Int) {}
class Student : Person {
    constructor(className: String):super("pdd",24)
}*/

//总而言之，子类如果有主构造函数，构建子类对象一定要直接or间接调用主构造函数，同时也势必要直接或间接调用父类的主构造函数





