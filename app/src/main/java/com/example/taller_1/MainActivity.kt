package com.example.taller_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mayorEdad()
        multiplicar()
        list()
        autos()
    }

    fun mayorEdad() {
        var edad = 20

        if (edad >= 18) {
            println("Usted es mayor de edad")
        } else {
            println("Usted no es mayor de edad")
        }
    }

    fun multiplicar() {
        val num = 5

        for (i in 1..12) {
            val resul = num * i
            println("$num * $i = $resul")
        }
        for (j in 12 downTo 1) {
            val resul2 = num * j
            println("$num * $j = $resul2")
        }
    }

    data class listado(var nombre: String, var subGrupo: Int)

    fun list() {
        val nombres = mutableListOf(
            listado("Isaias", 2), listado("Pablo", 2),
            listado("Anthonny", 3), listado("Carlos", 4)
        )
        nombres.sortBy { it.subGrupo }
        nombres.forEach { (println(it)) }
    }
    class autos{
        var traccion: String = "manual"
        var motor: Int = 2400
        var tipo: String = "sedan"
        var capacidad: String = "4 personas"

    }




}
