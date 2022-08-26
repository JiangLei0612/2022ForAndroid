package com.test.mylibrary

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val age : String = "10";
    var tvTest : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toInt = age.toInt()

        appendString("11","222","3333")

        tvTest = findViewById(R.id.tv_test)
        tvTest!!.setOnClickListener { print("1111111") }
        tvTest!!.setOnClickListener {
            Toast.makeText(this, "2222222", Toast.LENGTH_SHORT).show()
        }

        Log.e("",toInt.toString())
        var desc = Person("1111", 1).getDesc()
        desc.length
    }

    fun test():Unit{
        val goodMutSet:Set<String> = setOf("iPhone","Mate10")

        //for循环
        for(item in goodMutSet){
            var desc = ""

        }

        //forEach遍历
        goodMutSet.forEach {

        }

        //迭代器遍历
        val iterator = goodMutSet.iterator()
        while (iterator.hasNext()){
            val next = iterator.next()

        }
    }
}