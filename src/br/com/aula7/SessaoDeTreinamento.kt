package br.com.aula7

class SessaoDeTreinamento {

    fun treinarA(jogador: JogadorDeFutebol){
        var experienciaInicial = jogador.experiencia
        jogador.correr()
        jogador.fazerGols()
        jogador.correr()

        jogador.experiencia ++ // Quando eu quero aumentar 1 ou diminuir 1 uso o ++ ou --

        println("A experiencia inicial era $experienciaInicial e a experiencia final é  ${jogador.experiencia}")


    }
}