package Tasks.Test;
import java.util.Scanner;

public class CodingQuestion_11 {
    public static void main(String[] args) {
        /*
        Write a program to print numbers from 1 to N using a for loop.

**Requirements:**
- Read the value of N from user input
- Use for loop to print numbers from 1 to N
- Print numbers in a single line separated by spaces
         */
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++){
            System.out.print(i +" ");
        }

    }
}
