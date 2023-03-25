package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun gradeVal(a: String):Double{
        if(a == "A"){
            return 4.0
        }
        else if(a == "A-"){
            return 3.67
        }
        else if(a == "B+"){
            return 3.33
        }
        else if(a == "B") {
            return 3.00
        }
        else if(a == "B-"){
            return 2.67
        }
        else if(a == "C+"){
            return 2.33
        }
        else if(a == "C"){
            return 2.00
        }
        else if(a == "C-"){
            return 1.67
        }
        else if(a == "D+"){
            return 1.33
        }
        else if(a == "D"){
            return 1.00
        }
        else{
            return 0.0
        }
    }
    private fun sumWeight():Int{

    }
}