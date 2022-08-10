/**
 *
 * Com os conhecimentos aplicatos anteriormente,
 * vamos criar uma calculadora que dado dois valores Float? e
 * um número correspondente a operação (constante),
 * retorne e imprima o resultado como Float ou
 * uma mensagem de erro caso um dos valores seja nulo.
 */

fun main() {
    println("Kotlin Calculator")
    askNumbers()
    askOperator()
}

var firstNumber: Float? = null
var secondNumber: Float? = null
var operator = 0

fun askNumbers() {
    println("Inform the first number: ")
    firstNumber = readln().toFloat()
    println("Inform the second number: ")
    secondNumber = readln().toFloat()
}

fun askOperator() {
    println("Select the operator:")
    println("1 - Add    3 - Mult")
    println("2 - Sub    4 - Div")
    operator = readln().toInt()
}
