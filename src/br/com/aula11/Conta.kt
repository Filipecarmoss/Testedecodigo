package Santander

open class Conta( var saldo: Double, clientes: Clientes) {

    fun depositarDinheiro(valor:Double) : Double {
        saldo += valor
        return saldo


    }

    fun sacarDinheiro(valor:Double) : Boolean{
        if (valor <= saldo){
            saldo = saldo - valor
            return true
        }
        return false




    }
    fun consultarSaldo(): Double{
        return saldo

    }


}