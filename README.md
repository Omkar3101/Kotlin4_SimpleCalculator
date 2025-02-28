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
git clone https://github.com/yourusername/Kotlin_SimpleCalculator.git

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
    while (true) {  
        println("Enter first number:")  
        val num1 = readLine()?.toDoubleOrNull() ?: break  
        
        println("Enter second number:")  
        val num2 = readLine()?.toDoubleOrNull() ?: break  

        println("Choose operation (+, -, *, /, %, ^):")  
        val operation = readLine()  

        val result = when (operation) {  
            "+" -> num1 + num2  
            "-" -> num1 - num2  
            "*" -> num1 * num2  
            "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"  
            "%" -> num1 % num2  
            "^" -> Math.pow(num1, num2)  
            else -> "Invalid operation"  
        }  

        println("Result: $result")  

        println("Do you want to continue? (yes/no)")  
        val choice = readLine()  
        if (choice?.lowercase() != "yes") break  
    }  
}
```

## Future Improvement
* Support for advanced functions (square root, trigonometry, logarithms).
* Error handling improvements for invalid inputs.
* GUI-based version instead of console-based input.


## License
This project is licensed under the MIT License – see the LICENSE file for details.

## Let's Connect
* [Linkedin](https://www.linkedin.com/in/omkar3101)  
* [Github]( https://github.com/Omkar3101 )  
