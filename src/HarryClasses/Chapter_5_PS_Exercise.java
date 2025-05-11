package HarryClasses;
import java.util.Scanner;

public class Chapter_5_PS_Exercise {
    public static void main(String[] args) {
        /*
        Question 1
        Write a program to print the following pattern
        ****
        ***
        **
        *
        */
        System.out.print("Enter no. of your choice to create the pattern : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i>=n; i--){
            System.out.println(i);
        }


        /*
        Question 2
        Write a program to sum first n even numbers using while loop

        Question 3
        Write a program to print multiplication table of a given n number
         */
    }
}
