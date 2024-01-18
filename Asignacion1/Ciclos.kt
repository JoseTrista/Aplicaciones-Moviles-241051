package com.example.actividades_aplicacionesmoviles2024

fun validacion(c: String): Boolean {
    if(c.equals("")){
        return false
    }

    val primeraLetra = c[0]
    if(primeraLetra == '_' || primeraLetra.isLetter()){
        for (caracter in c) {
            if (!(caracter.isLetterOrDigit() || caracter == '_')) {
                return false
            }
        }
        return true
    }

    return false
}

fun main(args: Array<String>) {
    println(validacion("nombre")) // true
    println(validacion("_nombre")) // true
    println(validacion("_12")) // true
    println(validacion("")) // false
    println(validacion("012")) // false
    println(validacion("no$")) // false
}
