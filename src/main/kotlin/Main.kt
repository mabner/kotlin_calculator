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
    println("1 - Addition    3 - Multiplication")
    println("2 - Subtraction    4 - Division")
    operator = readln().toInt()
}

fun exit() {
    println("Restart? Y / N")
    restart = readln().uppercase()
    if (restart == "Y") {
        main()
    } else if (restart == "N") {
        exitProcess(1)
    } else {
        println("Invalid option. Choose either Y or N")
        exit()
    }
}

fun calculation() {
    val operatorSign = when (operator) {
        1 -> "+"
        2 -> "-"
        3 -> "*"
        4 -> "/"
        else -> "Invalid operator"
    }

    val result = when (operator) {
        1 -> firstNumber + secondNumber
        2 -> firstNumber - secondNumber
        3 -> firstNumber * secondNumber
        4 -> firstNumber / secondNumber
        else -> println("Please select a valid operator option.")
    }
    println("$firstNumber $operatorSign $secondNumber = $result")
    exit()
}