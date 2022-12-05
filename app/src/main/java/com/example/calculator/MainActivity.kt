package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    // Binding
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view) // link layout
        // TODO [1] add listener when the user click on "Calculate VAT" button
        binding.plusButton.setOnClickListener {
            plusOP()
        }
        binding.MinusButton.setOnClickListener {
            minusOP()
        }
        binding.dividedButton.setOnClickListener {
            dividedOP()
        }

        }

    private fun plusOP() {
        // TODO [2] get the input from the user
        // get the input from EditeText
        val stringFristNumber = binding.etFirstNumber.text.toString()
        // convert the value from string to double
        val firstNumber = stringFristNumber.toDouble()
        val stringSecondNumber = binding.etSecondNumber.text.toString()
        // convert the value from string to double
        val secondNumber = stringSecondNumber.toDouble()
        var result = firstNumber+secondNumber
        printResult(firstNumber,secondNumber,"+",result)
    }

    private fun minusOP() {
        var firstNum = binding.etFirstNumber.text.toString()
        var firstNumber = firstNum.toDouble()
        var secondNum = binding.etSecondNumber.text.toString()
        var secondNumber = secondNum.toDouble()
        var result = firstNumber - secondNumber
            //firstNumber - secondNumber
        printResult(firstNumber,secondNumber,"-",result)

    }

    private fun dividedOP() {
        // get the input from EditeText
        val stringFristNumber = binding.etFirstNumber.text.toString()
        // convert the value from string to double
        val firstNumber = stringFristNumber.toDouble()
        val stringSecondNumber = binding.etSecondNumber.text.toString()
        // convert the value from string to double
        val secondNumber = stringSecondNumber.toDouble()
        var result = firstNumber/secondNumber
        printResult(firstNumber,secondNumber,"/",result)    }

    private fun printResult(firstNumber : Double,secondNumber : Double , operation: String, result: Double ) {
        // format the output depending on the format in the strings.xml file
        // show the result in the textView
        binding.clculateResultView.text = getString(R.string.result,firstNumber.toString(),operation,secondNumber.toString(),result.toString())
    }
}