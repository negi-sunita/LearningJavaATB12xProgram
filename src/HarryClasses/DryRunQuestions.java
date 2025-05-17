package HarryClasses;
import java.util.Scanner;

public class DryRunQuestions {
    /*
    Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        income slab             Tax
        < 2.5L                  0%
        2.5L to 5.0L            5%
        5.0L to 10.0L           20%
        Above 10.0L             30%
     */
    public static void main(String[] args) {
        System.out.print("Enter your yearly income in Lacs : ");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;

        if (income <= 250000){
            tax = 0;
            System.out.println("Your tax liability is : "+tax);
        } else if (income >250000 && income <=500000) {
            tax = tax + (income-250000)*.05f;
            System.out.println("Your tax liability is : "+tax);
        } else if (income >500000 && income <=1000000){
            tax = tax +((500000-250000)*.05f) +((income - 500000)*.2f);
            System.out.println("Your tax liability is : "+tax);
        } else if (income >1000000) {
            tax = tax + ((500000-250000)*.05f) + ((1000000-500000)*.2f)+((income-1000000)*.3f);
            System.out.println("Your tax liability is : "+tax);
        }


    }


}

