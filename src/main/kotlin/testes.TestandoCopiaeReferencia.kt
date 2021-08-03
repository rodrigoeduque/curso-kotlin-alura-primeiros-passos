fun main() {
    var numero1 = 100
    var numero2 = numero1

    println("Variavel numero 1 $numero1")
    println("Variavel numero 2 $numero2")


    println()

    val contaTitularJoao = Teste()
    contaTitularJoao.titular = "Joao"

    val contaTitularMaria = Teste()
    contaTitularMaria.titular="MariaJoao"

    println("Conta Joao = ${contaTitularJoao.titular}")
    println("Conta Maria = ${contaTitularMaria.titular}")

    println()

    println(contaTitularJoao)
    println(contaTitularMaria)

}

class Teste {
    var titular = ""
}