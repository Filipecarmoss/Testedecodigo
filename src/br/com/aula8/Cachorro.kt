package br.com.aula8

class Cachorro(raca: String, nome: String) : Animal(raca, nome){                // sem o var deixa de ser variavel  e passa ser um parametro


    fun latir(){

    }
    fun cavaBuraco(){

    }
    override fun respirar(){               // sobrescrever o método da classe pai ex vou querer que esse nome respirar
        println("Cachorro Respirou") // execute outra função com mesmo nome da classe pai
        super.respirar() // super vai executar oq está na minha classe pai por padrão

    }
}