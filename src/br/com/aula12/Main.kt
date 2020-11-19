package br.com.aula12

fun main() {
    val pessoa1 = Pessoa("Monique",555987156)
    val pessoa2 = Pessoa("Jean",555987156) //ctrl D duplica linha
    println(" Objeto pessoa1 e igual a pessoa2: "+pessoa1.equals(pessoa2))
    //println("Nome{${pessoa1.nome}} e igual a nome{${pessoa2.nome}}: "+pessoa1.nome.equals(pessoa2.nome)) testado nome
    //println("RG{${pessoa1.rg}} e igual a RG{${pessoa2.rg}}: "+pessoa1.rg.equals(pessoa2.rg)) testado RG
}