package com.example.taller_1

class ClaseMotor(
    val motor: Array<TipoMotor>,
    val traccion: String,
    val tipo: String,
    val capacidad: String
) {
    enum class TipoMotor {
        Gasolina,
        Diesel
    }

    fun vehiculo() {
        for (motor in motor) {
            println("El tipo de motor es: " + motor)
        }
    }
}