package HarryClasses;
import java.util.Scanner;


public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user - String");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.nextLine();
        System.out.println("Printing username: "+UserName);
        System.out.println("Taking input from the user - Marks1");
        int marks1 = sc.nextInt();
        System.out.println("Taking input from the user - Marks2");
        int marks2 = sc.nextInt();
        int sum = marks1+marks2;
        System.out.println("Total marks is : "+sum);

    }
}
