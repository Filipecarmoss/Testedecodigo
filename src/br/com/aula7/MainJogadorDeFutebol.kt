package br.com.aula7

fun main() {
    val jogador1 = JogadorDeFutebol("Filipe",80,80,50)

      // jogador1.fazerGols()  //Executar uma função (.) estancia
    //jogador1.correr()
    val sessaoDeTreinamento = SessaoDeTreinamento()

    sessaoDeTreinamento.treinarA(jogador1)
    sessaoDeTreinamento.treinarA(jogador1)

    println(" A energia ${jogador1.energia}, alegria ${jogador1.alegria}, experiencia ${jogador1.experiencia}, experiencia ${jogador1.experiencia}")
}