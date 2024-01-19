package com.example.actividades_aplicacionesmoviles2024

 fun String?.esVaciaONula(): Boolean{
    if(this.equals("") || this.equals(null)){
        return true
    }
     return false
 }

 fun main(args: Array<String>){
     val s1: String? = null
     val s2: String? = ""
     println(s1.esVaciaONula())
     println(s2.esVaciaONula())

     val s3= "   "
     println(s3.esVaciaONula())
 }