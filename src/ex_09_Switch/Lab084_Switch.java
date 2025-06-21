package ex_09_Switch;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab084_Switch {
    public static void main(String[] args) {

        System.out.print("Enter number between 1 to 7 to get the days : ");
        Scanner sc = new Scanner(System.in);
        int days = 0;
        boolean isValid = false;
        days = sc.nextByte();

        while(!isValid) {
            try {
                switch (days) {
                    case 1:
                        System.out.println("Monday");
                        isValid = true;
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        isValid = true;
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        isValid = true;
                        break;
                    case 4:
                        System.out.println("Thursday");
                        isValid = true;
                        break;
                    case 5:
                        System.out.println("Friday");
                        isValid = true;
                        break;
                    case 6:
                        System.out.println("Saturday");
                        isValid = true;
                        break;
                    case 7:
                        System.out.println("Sunday");
                        isValid = true;
                        break;
                    default:
                        System.out.println("Entered number is not correct, please enter the correct number");
                        days = sc.nextInt();

                }

            } catch(InputMismatchException e) {
                System.out.println("Not a valid digit, please enter again");
                sc.next();


            }
        }
        sc.close();

    }
}
