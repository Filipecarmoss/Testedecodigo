package Santander.digitalhouse.aula11

fun main() {
    val documento = Documento("Contrato de Trabalho")
    val foto = Foto(" Selfie 16/11/2020")
    val contrato = Contrato ("Documento fiscal")
    val impressora = Impressora()
    impressora.novoItem(documento)
    impressora.novoItem(foto)
    impressora.novoItem(contrato)
    impressora.imprimirTodos()
}