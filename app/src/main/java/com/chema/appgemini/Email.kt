package com.chema.appgemini

class Email(val direccion: String) {
    init {
        if (!direccion.contains("@")) {
            throw IllegalArgumentException("La dirección de correo debe contener '@'")
        }
    }
}
