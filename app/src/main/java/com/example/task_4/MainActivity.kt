package com.example.task_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var firstNumber: EditText
    lateinit var secondNumber: EditText
    lateinit var buttonPlus: Button
    lateinit var buttonMinus: Button
    lateinit var buttonMulti: Button
    lateinit var buttonDiv: Button
    lateinit var texResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber = findViewById(R.id.et_1)
        secondNumber = findViewById(R.id.et_2)
        buttonPlus = findViewById(R.id.btn_plus)
        buttonMinus = findViewById(R.id.btn_minus)
        buttonMulti = findViewById(R.id.btn_multi)
        buttonDiv = findViewById(R.id.btn_div)
        texResult = findViewById(R.id.tv_result)


        buttonPlus.setOnClickListener(this)
        buttonMinus.setOnClickListener(this)
        buttonMulti.setOnClickListener(this)
        buttonDiv.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        var result = 0.0
        if (firstNumber.text.isNotEmpty() && secondNumber.text.isNotEmpty()) {
            when (view.id) {
                R.id.btn_plus -> result =
                    firstNumber.text.toString().toDouble() + secondNumber.text.toString().toDouble()
                R.id.btn_minus -> result =
                    firstNumber.text.toString().toDouble() - secondNumber.text.toString().toDouble()
                R.id.btn_multi -> result =
                    firstNumber.text.toString().toDouble() * secondNumber.text.toString().toDouble()
                R.id.btn_div -> if (secondNumber.text.toString().toDouble() != 0.0)
                    result = firstNumber.text.toString().toDouble() / secondNumber.text.toString()
                        .toDouble()

            }
            tv_result.text = result.toString()
        }else tv_result.text = "Input Numbers"
    }
    //charger
}