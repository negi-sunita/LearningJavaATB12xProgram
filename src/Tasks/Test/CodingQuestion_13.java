package Tasks.Test;

public class CodingQuestion_13 {
    public static void main(String[] args) {
/*
Multiplication Table (Nested Loops)
Write a program to print multiplication tables using nested loops.
**Requirements:**
- Print multiplication tables for numbers 1 to 5
- Each table should show multiplications from 1 to 10
- Use nested for loops
- Format output clearly
Table of 1: 1 x 1 = 1 1 x 2 = 2 ...
Table of 2: 2 x 1 = 2 2 x 2 = 4 ...
 */

        for (int i = 1; i <= 5; i++) {
            System.out.print("Table of " + i + ": ");

            // Inner loop for multipliers 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j));

                // Add space between entries
                if (j < 10) {
                    System.out.print("  ");
                }
            }

            // Move to next line after each table
            System.out.println();
        }
    }
}

