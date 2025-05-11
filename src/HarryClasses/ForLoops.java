package HarryClasses;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        System.out.print("Enter number of your choice : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
                System.out.println(2*i+1);
            }
        }
    }

