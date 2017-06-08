package com.example.syp.layout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

/**
 * Created by syp on 17-5-22.
 */
open class Second : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)  //①
//
//        //②
//        val view = LayoutInflater.from(this).inflate(R.layout.activity_main, null)
//          setContentView(view)

        buildUI()
    }

    fun buildUI() {
        var layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        setContentView(layout)

        for (i in 0..10) {
            var btn = Button(this)
            btn.text = "按钮" + i
            btn.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            layout.addView(btn)
            btn.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        var parent = v?.parent as LinearLayout
        parent.removeView(v)
    }

}