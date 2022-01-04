package com.example.kotlinproject01

import android.app.AlertDialog
import android.content.Context

class CustomDialog:AlertDialog{
    constructor(context:Context):super(context, android.R.style.Theme_NoTitleBar_Fullscreen)
    constructor(context:Context, themeId:Int):super(context, themeId)
}