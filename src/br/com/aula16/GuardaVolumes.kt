//package br.com.aula16
//
//class GuardaVolumes {
//    val dicionariosPecas = mutableListOf<Int, List<Peca>>()
//    val contador = 0
//    fun guardarPecas(pecas: MutableList<Peca>) : Int{
//        dicionariosPecas[contador] = pecas
//        return  contador ++
//    }
//    fun mostrarPecas(){
//        dicionariosPecas.forEach{ posicao: Int, pecas: List<Pecas> ->
//            pecas. forEach{ peca ->
//                println("Posição $posicao e peça $peca")
//
//            }
//        }
//        fun mostrarPecas(posicao: Int){
//            dicionariosPecas[posicao]?.forEach { peca ->
//                println("Peça $peca")
//            }
//        }
//    }
//}