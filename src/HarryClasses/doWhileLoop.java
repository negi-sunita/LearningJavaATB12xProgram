package HarryClasses;
import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        System.out.print("Enter number of your choice : ");
        Scanner scanner = new Scanner(System.in);
        int a =1;
        int n =scanner.nextInt();
        do{
            System.out.println(a);
            a++;

        }while(a <= n);
    }
}
