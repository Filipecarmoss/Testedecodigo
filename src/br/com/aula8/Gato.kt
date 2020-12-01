package br.com.aula8

class Gato(raca: String, nome: String) : Animal(raca,nome){

    fun miar(){

    }
    fun subirMurro(){

    }
    override fun respirar(){
        println("Gato respirando")
        super.respirar()
    }

}