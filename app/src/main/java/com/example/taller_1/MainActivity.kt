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
        iva()
        verificarCI()
        propietario()

    }

    //Validar si una persona es mayor o menor de edad
    fun mayorEdad() {
        var edad = 20

        if (edad >= 18) {
            println("Usted es mayor de edad")
        } else {
            println("Usted no es mayor de edad")
        }
    }

    //Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
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

    //Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados).
    data class listado(var nombre: String, var subGrupo: Int)

    fun list() {
        val nombres = mutableListOf(
            listado("Isaias", 2), listado("Pablo", 2),
            listado("Anthonny", 3), listado("Carlos", 4)
        )
        nombres.sortBy { it.subGrupo }
        nombres.forEach { (println(it)) }
    }

    //Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
    fun propietario() {
        val carro = ClaseMotor(
            arrayOf(ClaseMotor.TipoMotor.Diesel), traccion = "Delantera",
            tipo = "Sedan", capacidad = "5 personas"
        )
        carro.vehiculo()
        println("traccion: " + carro.traccion)
        println("tipo de carro: " + carro.tipo)
        println("capacidad: " + carro.capacidad)
    }

    //Algoritomo de cálculo de IVA 12%
    fun iva() {
        val total = 13
        val valorIva = total * 0.12
        val totalIva = total + valorIva
        println(
            "Precio sin IVA: $" + total + "\nPrecio incluido IVA: $" + totalIva
        )
    }

    //Validación de la cedula
    private fun verificarCI() {
        val val1 = mutableListOf(2, 1, 2, 1, 2, 1, 2, 1, 2)
        var val2 = mutableListOf(2, 1, 2, 1, 2, 1, 2, 1, 2)
        var numeroCI = "1150097861"
        var aux1 = 0
        val comprobar = numeroCI.map(Character::getNumericValue).toIntArray()
        for (i in comprobar) {
            if (aux1 < comprobar.size - 1) {
                var aux2 = i * val1[aux1]
                if (aux2.toString().length > 1) {
                    val comprobar2 = aux2.toString().map(Character::getNumericValue).toIntArray()
                    aux2 = 0
                    for (x in comprobar2) {
                        aux2 += x
                    }
                }
                val2[aux1] = aux2
                aux1 += 1
            }
        }
        var validacion = comprobar.sum() - val2.sum()
        println("Si el número es igual a la suma la cédula es correcta")
        println("total número cédula:" + validacion)
    }


}






