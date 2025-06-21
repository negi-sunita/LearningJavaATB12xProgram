package ex_16_Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");
        int size = scanner.nextInt();

        String[] names =  new String[size];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the elements -> " + i);
            names[i] = scanner.next();
        }

        System.out.println(" --- Print the values");

        for(String name : names){
            System.out.println(name);
        }

        scanner.close();



    }
}
