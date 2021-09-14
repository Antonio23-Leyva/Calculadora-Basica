package com.example.calculadora_00000132320

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


//editText
lateinit var numeroUno: EditText
lateinit var numeroDos: EditText

// botones
lateinit var operacionSuma: Button
lateinit var operacionResta: Button
lateinit var operacionDivision: Button
lateinit var operacionMultiplicacion: Button

lateinit var resultado: TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numeroUno = findViewById(R.id.edtNumUno)
        numeroDos = findViewById(R.id.edtNumDos)

        operacionSuma = findViewById(R.id.btnSumar)
        operacionResta = findViewById(R.id.btnRestar)
        operacionDivision = findViewById(R.id.btnDividir)
        operacionMultiplicacion = findViewById(R.id.btnMultiplicar)

        resultado = findViewById(R.id.txtResultado)

        operacionSuma.setOnClickListener {
            Suma()
        }
        operacionResta.setOnClickListener {
            Resta()
        }

        operacionDivision.setOnClickListener {
            Division()
        }

        operacionMultiplicacion.setOnClickListener {
            Multiplicacion()
        }
    }


    // Operaciones
    fun Suma() {
        if (numeroUno.text.toString().isEmpty() && numeroDos.text.toString().isEmpty()) {
            Toast.makeText(this, "Campos vacios, ingrese valor", Toast.LENGTH_SHORT).show()
        } else {
            val uno = numeroUno.text.toString().toDouble()
            val dos = numeroDos.text.toString().toDouble()

            var sumaa = uno + dos
            resultado.text = sumaa.toString()
        }
    }


    fun Resta() {
        if (numeroUno.text.toString().isEmpty() && numeroDos.text.toString().isEmpty()) {
            Toast.makeText(this, "Campos vacios, ingrese valor", Toast.LENGTH_SHORT).show()
        } else {
            val uno = numeroUno.text.toString().toDouble()
            val dos = numeroDos.text.toString().toDouble()

            var restaa = uno - dos
            resultado.text = restaa.toString()
        }
    }


    fun Division() {
        if (numeroUno.text.toString().isEmpty() && numeroDos.text.toString().isEmpty()) {
            Toast.makeText(this, "Campos vacios, ingrese valor", Toast.LENGTH_SHORT).show()
        } else {
            val uno = numeroUno.text.toString().toDouble()
            val dos = numeroDos.text.toString().toDouble()

            var divide = uno / dos
            resultado.text = divide.toString()
        }
    }


    fun Multiplicacion() {
        if (numeroUno.text.toString().isEmpty() && numeroDos.text.toString().isEmpty()) {
            Toast.makeText(this, "Campos vacios, ingrese valor", Toast.LENGTH_SHORT).show()
        } else {
            val uno = numeroUno.text.toString().toDouble()
            val dos = numeroDos.text.toString().toDouble()

            var multiplica = uno * dos
            resultado.text = multiplica.toString()
        }
    }
}


