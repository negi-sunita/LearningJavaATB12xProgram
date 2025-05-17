package Tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Enter number of your choice : ");
        Scanner scanner = new Scanner(System.in); //Created scanner object to take user input
        int num = scanner.nextInt();

        for (int i = 1; i<=10;i++){
            System.out.printf("\n%d x %d = %d",num,i, (num*i));
        }
    }
}

