package Tasks.Test;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CodingQuestion_6 {
    public static void main(String[] args) {

        System.out.print("Enter number of your choice: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        try {
            if (num < 0){
                System.out.println(+num +" is negative");
            } else if (num>0) {
                System.out.println(+num +" is positive");

            }
            else {
                System.out.println(+num +" is zero");
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }

    }
}
