package com.example.kotlinproject01

open class Figure(var vertex:Int):FinishDraw{
    override var distance:Int
    get() = vertex
    set(value){}

    override fun onFinishDraw() {

    }
}

class Triangle:Figure{
    constructor():super(3)

    override fun onFinishDraw() {
        super.onFinishDraw()
    }
}