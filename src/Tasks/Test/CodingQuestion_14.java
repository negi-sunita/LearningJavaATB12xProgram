package Tasks.Test;
import java.util.Scanner;

public class CodingQuestion_14 {
    public static void main(String[] args) {
        /*
        Star Pattern Printing
Create a program to print various star patterns using nested loops.

**Requirements:**
- Print a right triangle pattern of stars
- Print a pyramid pattern of stars
- Use nested loops for pattern generation
- Make patterns scalable based on input size

Right Triangle:
*
**
***
****
Pyramid:
 *
 ***
 *****
 *******
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Right Triangle Pattern
        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // move to next line
        }

        // Pyramid Pattern
        System.out.println("\nPyramid:");
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();  // move to next line
        }
    }
}
