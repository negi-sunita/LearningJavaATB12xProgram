package HarryClasses;
import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age > 56){
//            System.out.println("You are experience");
//        }
//        else if(age >46){
//            System.out.println("You are semi-experience");
//        }
//        else if(age >36){
//            System.out.println("You are semi-semi-experience");
//        }
//        else {
//            System.out.println("You are not experience");
//        }
//        if (age>2){
//            System.out.println("You are not a baby");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade (A–E): ");
        char grade = sc.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("Your grade is A");
                break;
            case 'B':
                System.out.println("Your grade is B");
                break;
            case 'C':
                System.out.println("Your grade is C");
                break;
            case 'D':
                System.out.println("Your grade is D");
                break;
            case 'E':
                System.out.println("Your grade is E");
                break;
            default:
                System.out.println("You have failed");
                break;
        }
    }
}
