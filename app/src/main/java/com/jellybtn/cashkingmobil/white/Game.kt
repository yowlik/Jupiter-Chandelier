package com.jellybtn.cashkingmobil.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView
import com.jellybtn.cashkingmobil.R
import com.jellybtn.cashkingmobil.databinding.ActivityGameBinding
import kotlin.Result

class Game : AppCompatActivity() {
    val roll=mutableListOf<String>("1","2","3","4")
    var scr=0
    var i1:String="0"
    var i2:String="0"
    var i3:String="0"
    var i4:String="0"
    lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val text=findViewById<TextView>(androidx.core.R.id.text)
        binding.im1.setOnClickListener {
            if(i1=="0"){
                i1=roll.random()
                checkWin(i1,i2,i3,i4, text)
                check(i1,binding.im1)}
        }
        binding.im2.setOnClickListener {
            if(i2=="0"){
                i2=roll.random()
                checkWin(i1,i2,i3,i4, text)
                check(i2,binding.im2)
            }
        }
        binding.im3.setOnClickListener {
            if(i3=="0"){
                i3=roll.random()
                checkWin(i1,i2,i3,i4, text)
                check(i3,binding.im3)}
        }
        binding.im4.setOnClickListener {
            if(i4=="0"){
                i4=roll.random()
                checkWin(i1,i2,i3,i4, text)
                check(i4,binding.im4)}
        }

        binding.button.setOnClickListener {
            text.text=""
            i1="0"
            i2="0"
            i3="0"
            i4="0"
            binding.im1.setImageResource(R.drawable.sretchremovebg)
            binding.im2.setImageResource(R.drawable.sretchremovebg)
            binding.im3.setImageResource(R.drawable.sretchremovebg)
            binding.im4.setImageResource(R.drawable.sretchremovebg)
        }


    }



    fun check(i:String,im: ImageView) {
        if (i == "1") {
            im.setImageResource(R.drawable.wal)
        } else if (i == "2") {
            im.setImageResource(R.drawable.queen)

        }
        else if(i=="3") {
            im.setImageResource(R.drawable.king)
        }
        else {
            im.setImageResource(R.drawable.ace)
        }
    }
    fun checkWin(i1:String,i2:String,i3:String,i4:String,text: TextView) {
        if (i1 == "1" && i2 == "1") {
            text.text = "You win : 100 point "
        } else if (i1 == "2" && i2 == "2") {
            text.text = "You win : 200 point"
        } else if (i1 == "3" && i2 == "3") {
            text.text = "You win : 300 point"
        } else if (i1 == "4" && i2 == "4") {
            text.text = "You win : 400 point"
        } else if (i1 == "1" && i3 == "1") {
            text.text = "You win : 100 point "
        } else if (i1 == "2" && i3 == "2") {
            text.text = "You win : 200 point"
        } else if (i1 == "3" && i3 == "3") {
            text.text = "You win : 300 point"
        } else if (i1 == "4" && i3 == "4") {
            text.text = "You win : 400 point"
        } else if (i1 == "1" && i4 == "1") {
            text.text = "You win : 100 point "
        } else if (i1 == "2" && i4 == "2") {
            text.text = "You win : 200 point"
        } else if (i1 == "3" && i4 == "3") {
            text.text = "You win : 300 point"
        } else if (i1 == "4" && i4 == "4") {
            text.text = "You win : 400 point"
        } else if (i2 == "1" && i3 == "1") {
            text.text = "You win : 100 point "
        } else if (i2 == "2" && i3 == "2") {
            text.text = "You win : 200 point"
        } else if (i2 == "3" && i3 == "3") {
            text.text = "You win : 300 point"
        } else if (i2 == "4" && i3 == "4") {
            text.text = "You win : 400 point"
        } else if (i2 == "1" && i4 == "1") {
            text.text = "You win : 100 point "
        } else if (i2 == "2" && i4 == "2") {
            text.text = "You win : 200 point"
        } else if (i2 == "3" && i4 == "3") {
            text.text = "You win : 300 point"
        } else if (i2 == "4" && i4 == "4") {
            text.text = "You win : 400 point"
        }
        else if (i3 == "1" && i4 == "1") {
            text.text = "You win : 100 point "
        } else if (i3 == "2" && i4 == "2") {
            text.text = "You win : 200 point"
        } else if (i3 == "3" && i4 == "3") {
            text.text = "You win : 300 point"
        } else if (i3 == "4" && i4 == "4") {
            text.text = "You win : 400 point"
        }

    }
}