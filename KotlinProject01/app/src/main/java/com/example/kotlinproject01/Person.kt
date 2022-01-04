package com.example.kotlinproject01

/*
class Person(var name:String?, var age:Int=0) {

    init {
        if (name.isNullOrBlank()) name = "No Name"
        age+=1
    }

}
 */

data class Person(var name:String, var age:Int)
{

}

//class Person(name:String)
//{
//    constructor(name:String, age:Int):this(name)
//}
