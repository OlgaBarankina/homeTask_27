package com.example.hometask_27

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToWhiteColor()
        goToRedColor()
        goToBlueColor()
        goToGreenColor()
        goToCyanColor()
        goToLightGrayColor()
        goToMagentaColor()

    }

        //goToWhiteColor

        fun goToWhiteColor() {
            val context: Context = this
            val BtWhite = findViewById<View>(R.id.tbwhite) as Button
            BtWhite.setOnClickListener {
                val intent = Intent(this, MainActivityWhite::class.java)
                startActivity(intent)
            }
        }

    //goToRedColor

    fun goToRedColor() {
        val context: Context = this
        val BtRed = findViewById<View>(R.id.tbred) as Button
        BtRed.setOnClickListener {
            val intent = Intent(this, MainActivityRed::class.java)
            startActivity(intent)
        }
    }

    //goToBlueColor

    fun goToBlueColor() {
        val context: Context = this
        val BtBlue = findViewById<View>(R.id.tbblue) as Button
        BtBlue.setOnClickListener {
            val intent = Intent(this, MainActivityBlue::class.java)
            startActivity(intent)
        }
    }

    //goToGreenColor

    fun goToGreenColor() {
        val context: Context = this
        val BtGreen = findViewById<View>(R.id.tbgreen) as Button
        BtGreen.setOnClickListener {
            val intent = Intent(this, MainActivityGreen::class.java)
            startActivity(intent)
        }
    }

    //goToCyanColor

    fun goToCyanColor() {
        val context: Context = this
        val BtCyan = findViewById<View>(R.id.tbcyan) as Button
        BtCyan.setOnClickListener {
            val intent = Intent(this, MainActivityCyan::class.java)
            startActivity(intent)
        }
    }

    //goToLightGrayColor

    fun goToLightGrayColor() {
        val context: Context = this
        val BtLGray = findViewById<View>(R.id.tblightgray) as Button
        BtLGray.setOnClickListener {
            val intent = Intent(this, MainActivityLightGray::class.java)
            startActivity(intent)
        }
    }

    //goToMagentaColor

    fun goToMagentaColor() {
        val context: Context = this
        val BtMagenta = findViewById<View>(R.id.tbmagenta) as Button
        BtMagenta.setOnClickListener {
            val intent = Intent(this, MainActivityMagenta::class.java)
            startActivity(intent)
        }
    }



    }
