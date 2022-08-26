package com.test.mylibrary

class Person {

    var name:String =""
    var age:Int = 0

    init {

    }

    @JvmOverloads constructor(name:String, age:Int = 0){

    }

    fun getDesc():String{
        return ""
    }
}