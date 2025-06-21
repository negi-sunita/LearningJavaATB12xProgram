package Tasks.Test;
import java.math.BigInteger;
import java.util.Scanner;

public class CodingQuestion_12 {
    public static void main(String[] args) {
        /*
        Factorial Calculator (While Loop)
Create a program to calculate factorial of a number using while loop.

**Requirements:**
- Read a positive integer from user input
- Use while loop to calculate factorial
- Handle edge case for 0! = 1
- Use appropriate data type to handle large results

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Error: Please enter a non-negative number.");
            return;
        }

        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
