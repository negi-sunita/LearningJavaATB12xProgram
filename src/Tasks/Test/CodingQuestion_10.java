package Tasks.Test;
import java.util.Scanner;

public class CodingQuestion_10 {
    public static void main(String[] args) {
        /*
        Simple Calculator (Switch Statement)
Write a program to create a simple calculator using switch statement.

**Requirements:**
- Read two numbers and an operator (+, -, *, /)
- Use switch statement to perform the operation
- Handle division by zero
- Display the result

        input - 15.5 4.5 +
        output - Result: 20.0
        input - 10.0 0.0 /
        output - Error: Division by zero
        input - 8.0 2.0 %
        output - Invalid operator

         */
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0.0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
