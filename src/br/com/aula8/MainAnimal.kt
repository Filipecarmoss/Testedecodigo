package br.com.aula8

fun main() {
    val cachorro = Cachorro("vira-lata","Freddy")
    val gato = Gato("Lindo", "Miau")


    cachorro.andar()
    cachorro.cavaBuraco()
    cachorro.respirar()

    gato.andar()
    gato.miar()
    gato.respirar()


}