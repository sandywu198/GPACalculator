package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview = findViewById<TextView>(R.id.Results)
        val button = findViewById<Button>(R.id.CalButton)
        textview.text = ""
        button.setOnClickListener{
            textview.text = calculate().toString()
        }
    }
    private fun calculate(): Double{
        val gradeWeight1 = creditWeight(gradeVal(findViewById<EditText>(R.id.grade1).text.toString()),findViewById<EditText>(R.id.weight1).text.toString().toDouble())
        val gradeWeight2 = creditWeight(gradeVal(findViewById<EditText>(R.id.grade2).text.toString()),findViewById<EditText>(R.id.weight2).text.toString().toDouble())
        val gradeWeight3 = creditWeight(gradeVal(findViewById<EditText>(R.id.grade3).text.toString()),findViewById<EditText>(R.id.weight3).text.toString().toDouble())
        val gradeWeight4 = creditWeight(gradeVal(findViewById<EditText>(R.id.grade4).text.toString()),findViewById<EditText>(R.id.weight4).text.toString().toDouble())
        val gradeWeight5 = creditWeight(gradeVal(findViewById<EditText>(R.id.grade5).text.toString()),findViewById<EditText>(R.id.weight5).text.toString().toDouble())
        val gradeWeight = gradeWeight1 + gradeWeight2 + gradeWeight3 + gradeWeight4 + gradeWeight5
        val results = gradeWeight/totalCredit()
        val solution = String.format("%.2f", results)
        return solution.toDouble()
    }
    private fun totalCredit():Double{
        return findViewById<EditText>(R.id.weight1).text.toString().toDouble() + findViewById<EditText>(R.id.weight2).text.toString().toDouble() + findViewById<EditText>(R.id.weight3).text.toString().toDouble() +
                findViewById<EditText>(R.id.weight4).text.toString().toDouble() + findViewById<EditText>(R.id.weight5).text.toString().toDouble()
    }
    private fun creditWeight(x: Double, y: Double): Double {
        return x*y
    }
//    private fun creditVal(a:EditText): Double{
//        if(a.equals("4")){
//            return 4.0
//        }
//        else if(a.equals("3")){
//            return 3.0
//        }
//        else if(a.equals("2")){
//            return 2.0
//        }
//        else if(a.equals("1")){
//            return 1.0
//        }
//        else{
//            return 0.0
//        }
//    }
    private fun gradeVal(a: String): Double {
        if (a.equals("A")) {
            return 4.0
        } else if (a.equals("A-")) {
            return 3.67
        } else if (a.equals("B+")) {
            return 3.33
        } else if (a.equals("B")) {
            return 3.00
        } else if (a.equals("B-")) {
            return 2.67
        } else if (a.equals("C+")) {
            return 2.33
        } else if (a.equals("C")) {
            return 2.00
        } else if (a.equals("C-")) {
            return 1.67
        } else if (a.equals("D+")) {
            return 1.33
        } else if (a.equals("D")) {
            return 1.00
        } else {
            return 0.0
        }
    }

}
