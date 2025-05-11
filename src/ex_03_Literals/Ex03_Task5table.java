package ex_03_Literals;
import java.util.Scanner;

public class Ex03_Task5table {

    public static void main(String[] args) {
        System.out.print("Enter number of your choice : ");
        Scanner scanner = new Scanner(System.in); //Created scanner object to take user input
        int num = scanner.nextInt();

        System.out.printf("%d x 1 = 5",num);
        System.out.printf("\n%d x 2 = 10",num);
        System.out.printf("\n%d x 3 = 15",num);
        System.out.printf("\n%d x 4 = 20",num);
        System.out.printf("\n%d x 5 = 25",num);
        System.out.printf("\n%d x 6 = 30",num);
        System.out.printf("\n%d x 7 = 35",num);
        System.out.printf("\n%d x 8 = 40",num);
        System.out.printf("\n%d x 9 = 45",num);
        System.out.printf("\n%d x 10 = 50",num);

    }
}
