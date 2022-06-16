package com.example.calculatorassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tvCalculator:TextView
    lateinit var tilFirstNumber:TextInputLayout
    lateinit var etFirstNumber:TextInputEditText
    lateinit var tilSecondNumber:TextInputLayout
    lateinit var etSecondNumber:TextInputEditText
    lateinit var btnCalculate:Button
    lateinit var tvResults:TextView
    lateinit var btnAdd:Button
    lateinit var btnSubtraction:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
    }

    fun castViews(){
        tvCalculator=findViewById(R.id.tvCalculator)
        tilFirstNumber=findViewById(R.id.tilFirstNumber)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        tilSecondNumber=findViewById(R.id.tilSecondNumber)
        etSecondNumber=findViewById(R.id.etSecondNumber)
        btnCalculate=findViewById(R.id.btnCalculate)
        tvResults=findViewById(R.id.tvResults)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivision=findViewById(R.id.btnDivision)
        btnSubtraction=findViewById(R.id.btnSubtraction)
        btnModulus=findViewById(R.id.btnModulus)
        btnAdd.setOnClickListener {
            var number1=etFirstNumber.text.toString().toInt()
            var number2=etSecondNumber.text.toString().toInt()
            addition(number1, number2)
        }
        btnSubtraction.setOnClickListener {
            var number1=etFirstNumber.text.toString().toInt()
            var number2=etSecondNumber.text.toString().toInt()
            subtraction(number1, number2)
        }
        btnDivision.setOnClickListener {
            var number1=etFirstNumber.text.toString().toInt()
            var number2=etSecondNumber.text.toString().toInt()
            division(number1, number2)
        }
        btnModulus.setOnClickListener {
            var number1=etFirstNumber.text.toString().toInt()
            var number2=etSecondNumber.text.toString().toInt()
            modulus(number1, number2)
        }
        btnCalculate.setOnClickListener {validate()}

    }
    fun addition(number1:Int,number2:Int){
        var sum=number1+number2
        tvResults.text=sum.toString()
    }
    fun subtraction(number1: Int,number2: Int){
        var subtract=number1-number2
        tvResults.text=subtract.toString()
    }
    fun division(number1: Int,number2: Int){
        var divide=number1/number2
        tvResults.text=divide.toString()
    }
    fun modulus(number1: Int,number2: Int){
        var modulus=number1%number2
        tvResults.text=modulus.toString()
    }
    fun validate(){
        var error=false
        tilFirstNumber.error=null
        tilSecondNumber.error=null
        var firstNumber=etFirstNumber.text.toString()
        if (firstNumber.isBlank())
            tilFirstNumber.error="first number is required "
        }
        var secondNumber=etSecondNumber.text.toString()
        if (secondNumber.isBlank()){
            tilSecondNumber.error="Second number is required"
        }

    }


}