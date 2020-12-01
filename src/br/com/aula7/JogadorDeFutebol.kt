package br.com.aula7

class JogadorDeFutebol( val nome: String, var energia: Int, var alegria: Int, var experiencia: Int) {
    var gols = 0
    fun fazerGols(){
        energia -= 5
        alegria += 10
        gols += 1
        println("Goooool!")

    }

    fun correr(){
        energia -= 10
        println("Cansei :S")

    }
}