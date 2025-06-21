package ex_11_While;
import java.util.*;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        /*
         Factorial Program
         The logic building formula
         Step 1, we have to figure out what is the data type for input and output.
         Step 2, write a rough logic around this.
         Step 3, write a proper logic around this.
         Step 4, optimize.
         Step 5, edge cases.
         */

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program");
        System.out.println("Enter the number, whose factorial you want!");

        if(!scanner.hasNextInt()){
            System.out.println("Enter the int,rerun the program");
        }

        int number = scanner.nextInt();
        int factorial = 1;

        if(number == 0){
            System.out.println("factorial is -> "+factorial);
        }

        if(number >  Integer.MAX_VALUE){
            System.out.println("Can't get the factorial as out of bound!(int)");
        }

        int i = 1;
        while(i<=number){
            factorial = factorial*i;
            i++;
        }

        System.out.println("factorial is -> "+factorial);

    }
}