package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.add) //더하기 버튼
        val minus = findViewById<Button>(R.id.sub) //빼기 버튼
        val multi = findViewById<Button>(R.id.mul) //곱하기 버튼
        val divide = findViewById<Button>(R.id.div) //나누기 버튼

        val num1 = findViewById<EditText>(R.id.num1) //숫자 1 에딧텍스트
        val num2 = findViewById<EditText>(R.id.num2) //숫자 2 에딧텍스트

        var number1 : Long
        var number2 : Long

        val math = findViewById<TextView>(R.id.math) //계산 과정 보여주는 텍스트
        val result = findViewById<TextView>(R.id.result) //계산 결과 보여주는 텍스트

        plus.setOnClickListener { // 더하기
            number1 = num1.text.toString().toLong() //
            number2 = num2.text.toString().toLong()
            math.text = getString(R.string.plus).format(number1, number2)
            result.text = getString(R.string.result).format(number1 + number2)
        }
        minus.setOnClickListener { // 빼기
            number1 = num1.text.toString().toLong()
            number2 = num2.text.toString().toLong()
            math.text = getString(R.string.minus).format(number1, number2)
            result.text = getString(R.string.result).format(number1 - number2)
        }
        multi.setOnClickListener { // 곱하기
            number1 = num1.text.toString().toLong()
            number2 = num2.text.toString().toLong()
            math.text = getString(R.string.multi).format(number1, number2)
            result.text = getString(R.string.result).format(number1 * number2)
        }
        divide.setOnClickListener { //나누기
            number1 = num1.text.toString().toLong()
            number2 = num2.text.toString().toLong()
            math.text = getString(R.string.divide).format(number1, number2)
            result.text = getString(R.string.result).format(number1 / number2)
        }

    }
}