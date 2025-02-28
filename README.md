# SimpleCalculator

A basic calculator built using Kotlin that performs arithmetic operations. This project is part of my Kotlin learning journey.

## Features

1. Supports basic arithmetic operations (+, -, ×, ÷, %, ^).
2. Uses higher-order functions and lambda functions for calculations.
3. Allows continuous calculations using a while loop without restarting the program.
4. Beginner-friendly Kotlin project with clean and modular code.



## Technologies Used

1. Kotlin
2. IntelliJ IDEA



## How to Run the Project?

* Clone the Repository
git clone [https://github.com/yourusername/Kotlin_SimpleCalculator.git](https://github.com/Omkar3101/Kotlin4_SimpleCalculator.git)

* Open in IntelliJ IDEA

* Select Open Project and navigate to the cloned repository

* Run the Project

* Open Main.kt file

* Click on Run or use Shift + F10


### Use the Calculator

1. Enter two numbers when prompted.
2. Select an operation (+, -, ×, ÷, %, ^).
3. The calculator will display the result and prompt for another calculation.


## Code Overview
``` Kotlin 
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
```

## Future Improvement
* Support for advanced functions (square root, trigonometry, logarithms).
* Error handling improvements for invalid inputs.
* GUI-based version instead of console-based input.


## License
This project is licensed under the MIT License – see the [LICENSE](https://github.com/Omkar3101/Kotlin4_SimpleCalculator/blob/main/LICENSE) file for details.

## Let's Connect
* [Linkedin](https://www.linkedin.com/in/omkar3101)  
* [Github]( https://github.com/Omkar3101 )  
