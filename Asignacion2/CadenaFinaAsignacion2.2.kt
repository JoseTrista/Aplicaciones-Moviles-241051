package com.example.actividades_aplicacionesmoviles2024

 fun String.esFina(): Boolean{
     var cont:Int =0
     if (!(this.contains("bu") || this.contains("be") || this.contains("ba"))) {
            cont++
     }

     val cantVocales = this.count { it.equals('a', ignoreCase = true)|| it.equals('e', ignoreCase = true)|| it.equals('i', ignoreCase = true)|| it.equals('o', ignoreCase = true)|| it.equals('u', ignoreCase = true)}
     if (cantVocales==3){
         cont++
     }

     var let:Char?=null;
     for (letra in this){
         if (letra==let){
             cont++;
             break;
         }
         let=letra;
     }

     if (cont>1){
         return true
     }
     return false
 }

 fun main(args: Array<String>){
     println("bac".esFina())
     println("aza".esFina())
     println("abaca".esFina())
     println("baaa".esFina())
     println("aaab".esFina())
 }