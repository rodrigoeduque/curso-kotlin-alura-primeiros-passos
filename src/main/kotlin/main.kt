fun main() {
    println("Bem vindo ao ByteBank")

    val contaAlex = Conta("Alex", 1000)

    val contaFran = Conta("Fran", 1001)

//    contaAlex.deposita(1500.00)


    contaFran.imprimeExtrato()
    println()
    contaAlex.imprimeExtrato()


}

class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set(value) {
            if (value > 0) {
                field = value
            }
        }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (valor > this.saldo && valor > 0) println("Saldo insuficiente") else {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        return if (valor > this.saldo && valor > 0) {
            false
        } else {
            this.saca(valor)
            contaDestino.deposita(valor)
            true
        }

    }

    fun imprimeExtrato() {
        println("Nome: ${this.titular}")
        println("Numero: ${this.numero}")
        println("Saldo : ${this.saldo}")
    }
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