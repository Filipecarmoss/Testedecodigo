package Santander.digitalhouse.aula11

class Contrato( override val nome: String) : Imprimivel {
    override val tipo = "Contrato"
    override fun imprimir() {
        println(" Eu sou um $tipo, e seu nome é $nome")
    }
}