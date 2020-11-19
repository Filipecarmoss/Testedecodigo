package Santander

class Cachorro(raca: String, var nome: String, ) : Animal(raca, nome) {

    override var raca = "Ale"

    fun latir(){

    }
    fun cavarBuraco(){

    }

    override fun respirar(){
        println("Cachorro respirou")                 // override reecreve o método

        super.respirar()                             // chamar no final o excecuta como esta feito na outra classe
    }
}