# Simple Java Calculator

## Overview
This project represents a basic calculator application implemented in Java. It provides a graphical user interface (GUI) for users to perform basic arithmetic calculations. The project consists of three main components (java programs): `CalculatorUI`, `Calculator`, and `CalculatorLogic`.

## CalculatorUI
The `CalculatorUI` class is responsible for creating the graphical user interface (UI) of the calculator. It includes the display area, buttons for digits and operators, and event handling to perform calculations. This class serves as the user-facing part of the calculator.

### Features
- User-friendly GUI with clear display.
- Supports standard arithmetic operations (addition, subtraction, multiplication, division).
- Error handling for invalid inputs and arithmetic errors.

### Usage
1. Clone or download the repository
[Clone the Basic Java Calculator Project](https://github.com/thesahirahmed/basic-java-calculator.git)
2. Compile and run the `Calculator` class to launch the calculator application.
3. Use the calculator by clicking on the on-screen buttons to input numbers and perform calculations.

## Calculator
The `Calculator` class serves as the entry point for running the calculator application. It creates an instance of the `CalculatorUI` class and initializes the user interface.

## CalculatorLogic
The `CalculatorLogic` class handles the actual arithmetic calculations. It takes an expression as input, parses it, performs the requested operation, and returns the result. It provides support for addition, subtraction, multiplication, division, and percentage calculations.

### Usage
To perform calculations, use the `calculate` method, providing a space-separated expression as the input. For example:
```java
CalculatorLogic calculatorLogic = new CalculatorLogic();
String expression = "5 + 3";
String result = calculatorLogic.calculate(expression);
System.out.println("Result: " + result);
```

## Future Enhancements
- Extend the calculator with more advanced functions and scientific operations.
- Implement memory storage and history tracking.
- Create a mobile app version for greater accessibility.

## Credits
Develped By : [Sahir Ahmed](https://www.linkedin.com/in/sahir-ahmed/) & [Pratham Chauhan](https://www.linkedin.com/in/pratham-chauhan-265a8b15a/)

This project is a collaborative effort, and I want to acknowledge the dedication and hard work of my close friend Pratham who made it possible:

- **Pratham**  has been instrumental in the design and user interface development of this calculator application. His creativity and attention to detail have greatly enhanced the user experience.

Together, Pratham and me have combined our skills and passion for programming to create a valuable tool for users to perform basic calculations with ease. This project stands as a testament of our  collaboration and commitment to delivering such a creative designed calculator.

## License
This project is open-source and available under the [MIT License](LICENSE).
