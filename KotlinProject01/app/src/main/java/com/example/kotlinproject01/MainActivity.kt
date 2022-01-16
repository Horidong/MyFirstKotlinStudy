package com.example.kotlinproject01

import android.content.Context
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast

interface Shape{
    fun onDraw()
}

class MainActivity : AppCompatActivity() {

    //3개 모두 같은 의미
    //fun add(x:Int, y:Int) : Int { return x+y }
    //fun add(x:Int, y:Int) : Int = x+y
    //fun add(x:Int, y:Int) = x+y

    //fun add(x:Int, y:Int = 10) = x+y

    fun reformat(str:String, normalizeCase: Boolean = true, upperCaseFirstLetter: Boolean = true, divideByCamelHumps: Boolean = false, wordSeparator: Char = ' ') {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var person:Person = Person("jame", 30)
        val oldone:Person = person.copy(age=45)

        /*
        val webView = WebView(mCtx)
        webView.setWebViewClient(object: WebViewClient(){
            override fun onPageStarted(view:WebView?, url:String?, favicon: Bitmap?){
                super.onPageStarted(view, url, favicon)
            }
        })
        */

        val triangle = object:Shape{
            override fun onDraw(){}
        }

        //함수 기본값 정의 가능
        //reformat(str)
        //reformat(str, true, true, false, '_')
        //reformat(str, wordSeparator = '_')

        //자료형 자동변경 불가능
        var intVal:Int = 10
        var d:Double = intVal.toDouble()
        val i: Int = 32
        val char2Int:Char = i.toChar()

        //비트연산도 함수로 표기
        var x:Int = 10
        x.shl(2)
        x shl(2)
        32.shl(2)
        x.inv()
        2.inv()

        //변수형 선언 없이 변수타입 지정 가능
        val int = 12
        val hex = 0x12
        val long = 3L
        val double = 3.5
        val float = 3.5F
        val temp = "Hello World"
        val char = temp[1]

        //다양한 변수값을 하나의 변수로 전달 키워드 vararg
        fun add(vararg numbers:Int):Int{
            var total:Int = 0
            for(n in numbers)
                total+=n
            return total
        }

        add(1,2,3,4,5,6,7)
        add(1)

        //반복문
        for(i in 2..9){}
        for(i in 9 downTo 2){}
        for(i in 2..9 step 2){}
        for(i in 10 downTo 1 step 2){}
        //for(i in 0..data.size-1){}

        var nameList:Array<String> = arrayOf("Tom", "Bill")
        for(name:String in nameList){}

        //Readonly List
        val nameLists = listOf("Mike", "Victoria")
        for(i in 0..nameLists.size-1){nameLists.get(i)}

        //Mutable List
        var namesList = mutableListOf<String>()
        namesList.add("Mike")
        namesList.add("Victoria")


    }

    //switch문
    fun showToast(array:ArrayList<String>)
    {
        when
        {
            array.size == 0 ->{
                Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show()
            }
            (0<array.size) and (array.size <10)->{
                Toast.makeText(this, "Good", Toast.LENGTH_SHORT).show()
            }
            array.size>10 ->{
                Toast.makeText(this, "Out of size", Toast.LENGTH_SHORT).show()
            }

        }
    }

    //list and map +-
    fun printMap()
    {
        val map = mapOf(1 to "one", 2 to "two")
        var newMap = map-1
        Log.d("Example", "minus lsit : $newMap")
        newMap += 3 to "three"
        Log.d("Example", "plus list : $newMap")

        val list = listOf("one", "two", "three")
        var newList = list - "one"
        Log.d("Example", "minus list : $newList")
        newList += "four"
        Log.d("Example", "plus list : $newList")
    }

    //is & as
    fun setLayoutParam(view: View)
    {
        if(view is LinearLayout)
        {
            var param : LinearLayout.LayoutParams = view.layoutParams as LinearLayout.LayoutParams
            param.gravity = Gravity.BOTTOM
            view.layoutParams = param
        }
        else if(view is RelativeLayout)
        {
            var param : RelativeLayout.LayoutParams = view.layoutParams as RelativeLayout.LayoutParams
            param.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
            view.layoutParams = param
        }
    }

}