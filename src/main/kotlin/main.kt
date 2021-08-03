fun main() {
    println("Bem vindo ao ByteBank")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.00
    println("Titular: ${contaAlex.titular}")
    println("Numero Conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")

    println()

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.00
    println("Titular: ${contaFran.titular}")
    println("Numero Conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

private fun testeWhile() {
    var i = 0
    while (i < 5) {


        i++
    }
}

private fun testaFor() {
    for (i in 5 downTo 1 step 1) {
        if (i == 2) {
            println(" ---------------------------------- pulei o $i")
            continue
        }
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}