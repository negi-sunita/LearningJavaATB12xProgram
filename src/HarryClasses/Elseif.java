package HarryClasses;
import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 56){
            System.out.println("You are experience");
        }
        else if(age >46){
            System.out.println("You are semi-experience");
        }
        else if(age >36){
            System.out.println("You are semi-semi-experience");
        }
        else {
            System.out.println("You are not experience");
        }
        if (age>2){
            System.out.println("You are not a baby");
        }
    }
}
