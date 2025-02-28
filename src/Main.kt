//FUNCTION BASED CALCULATOR

/*
Create a calculator program using function and lambdas.
* Implement functions for add, subtract, multiply, divide.
* Use higher-order functions to call these functions dynamically.
* Use lambdas for each operation.
*/

/*
//Step 1 : Define Basic Arithmatic Functions
fun add(a: Double, b: Double) = a + b
fun subtract(a: Double, b: Double) = a - b
fun multiply(a: Double, b: Double) = a * b
fun modulus(a: Double, b: Double) = a % b
fun exponent(a: Double, b: Double) = Math.pow(a,b)
fun divide(a: Double, b: Double): Double {
    return if (b != 0.0) a/b
    else {
        println("Error: Cannot divide by zero")
        0.0
    }
}

//Step 2 : Create a Higher-Order Function
fun calculate(a: Double, b: Double, operation: (Double, Double) -> Double): Double {
    return operation(a,b)
}

//Step 3 : Get User Input
fun main() {
    println("Welcome to Calculator.com")
    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Invalid input. Please enter valid numbers.")
        return
    }

    print("Choose operation (+,-,*,/): ")
    val operator = readLine()

    val result = when (operator) {
        "+" -> calculate(num1, num2, ::add)
        "-" -> calculate(num1, num2, ::subtract)
        "*" -> calculate(num1, num2, ::multiply)
        "/" -> calculate(num1, num2, ::divide)
        "%" -> calculate(num1, num2, ::modulus)
        "^" -> calculate(num1, num2, ::exponent)
        else -> {
            println("Invalid operator! Please use +,-,*,/,%, or ^")
            return
        }
    }
    println("Result: $result")
}
*/

//Use Lambda Function for Operation
fun main() {
    println("Welcome to Calculator.com")
    val operations: Map<String, (Double,Double) -> Double> = mapOf(
        "+" to {a,b -> a+b},
        "-" to {a,b -> a-b},
        "*" to {a,b -> a*b},
        "/" to { a, b ->
            if (b != 0.0) a / b else {
                println("Error: Cannot divide by zero!")
                0.0
            }
        },
        "%" to {a,b -> a % b},
        "^" to {a,b -> Math.pow(a,b)}
    )
    while(true) {
        print("Enter your first number: ")
        val num1 = readLine()?.toDoubleOrNull()
        print("Enter your second number: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Invalid input. Please enter valid numbers.")
            return
        }

        print("Choose operation (+,-,*,/): ")
        val operator = readLine()

        val operation = operations[operator]

        if (operation != null) {
            val result = operation(num1, num2)
            println("Result: $result")
        } else {
            println("Invalid operator! Please use +,-,*,/,%, or ^")
        }

        print("Do you want to perform another calculation? (yes/no): ")
        val choice = readLine()?.lowercase()
        if (choice != "yes") break
    }
}