package com.example.kotlin_commands

fun main(){


    //enum denemem örnek
    fun ucretAl(boyut: Boyut){
        when(boyut){
            Boyut.Kucuk -> println("Ücret: 10 TL")
            Boyut.orta -> println("Ücret: 20 TL")
            Boyut.buyuk -> println("Ücret: 30 TL")

        }
    }

    ucretAl(Boyut.orta)

}