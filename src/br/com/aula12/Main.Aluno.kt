package br.com.aula12

fun main() {
    val aluno1 = Aluno("Filipe",123)
    val aluno2 = Aluno("Jean",124)
    val aluno3 = Aluno("Gabriel",125)
    val aluno4 = Aluno("Monique",126)
    val aluno = Aluno("Lucas",126)
    var lista = mutableListOf<Aluno>()
    lista.add(aluno1)
    lista.add(aluno2)
    lista.add(aluno3)
    lista.add(aluno4)
    lista.contains(aluno)
    println("Contém? "+lista.contains(aluno))

}