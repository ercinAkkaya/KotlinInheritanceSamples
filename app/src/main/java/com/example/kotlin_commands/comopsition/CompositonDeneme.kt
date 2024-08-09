package com.example.kotlin_commands.comopsition

fun main(){

    var kategori = Kategoriler(1,"Dram")
    var yonetmen = Yonetmenler(1,"Quentin Tarantino")
    var filmler = Filmler(1,"Django",201, kategori, yonetmen)


    println(filmler.kategori.kategoriAd)

}