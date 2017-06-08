package com.example.syp.layout;

import android.content.Intent
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

open class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//----------------------------1.两种不同的布局显示-----------------------------------------
//        setContentView(R.layout.activity_main)  //第一种

//        //第二种
//        val view = LayoutInflater.from(this).inflate(R.layout.activity_main, null)
//        setContentView(view)

//----------------------------2.动态添加按钮-----------------------------------------
        buildUI()
    }

    fun buildUI() {
        var layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        setContentView(layout)


        for (i in 0..10) {
            var btn = Button(this)
            btn.text = "Button" + i
            btn.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            layout.addView(btn)
            btn.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        val parent = v?.parent as LinearLayout
        parent.removeView(v)   //移除某个按钮

    }
}
