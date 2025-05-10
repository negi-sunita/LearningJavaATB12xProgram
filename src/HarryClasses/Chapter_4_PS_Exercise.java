package HarryClasses;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Chapter_4_PS_Exercise {
    public static void main(String[] args) {
        //Question 2
        /*
        Write a program to find out whether a student is pass or fail, it requires total 40% and at least 33% in each subject to pass.
        Assume 3 subjects and take marks as an input from the user
         */
//        Scanner sc = new Scanner(System.in);
//        int totalMarks = 300;
//        System.out.print("Enter marks for 1st Subject. Entered marks should be between 0-100: ");
//        int subject1 = sc.nextInt();
//        System.out.print("Enter marks for 2nd Subject. Entered marks should be between 0-100: ");
//        int subject2 = sc.nextInt();
//        System.out.print("Enter marks for 3rd Subject. Entered marks should be between 0-100: ");
//        int subject3 = sc.nextInt();
//        float totalStudentMarks = subject1 + subject2 + subject3;
//        float studentPercentage = (totalStudentMarks/totalMarks)*100;
//        System.out.println(studentPercentage+" Percentage");
//        if (subject1>=33 && subject2>=33 && subject3>=33 && studentPercentage>=40){
//            System.out.println("You are pass");
//        }
//        else{
//            System.out.println("You are fail");
//        }

        // Question 3
        /*
        Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        income slab             Tax
        2.5L to 5.0L            5%
        5.0L to 10.0L           20%
        Above 10.0L             30%
         */
        // question 4
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter number for the day of your choice : ");
//      byte day = sc.nextByte();
//
//      switch (day){
//          case 1:
//              System.out.println("Monday");
//              break;
//          case 2:
//              System.out.println("Tuesday");
//              break;
//          case 3:
//              System.out.println("Wednesday");
//              break;
//          case 4:
//              System.out.println("Thursday");
//              break;
//          case 5:
//              System.out.println("Friday");
//              break;
//          case 6:
//              System.out.println("Saturday");
//              break;
//          case 7:
//              System.out.println("Sunday");
//              break;
//          default:
//              System.out.println("You have entered a wrong number");
//              break;
//      }
// question 5
        /*
        Write a program to find out whether a year entered by the user is leap year or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        if (year % 4 == 0){
            System.out.println("Entered year is a leap year");
        }
        else {
            System.out.println("Entered year is not a leap year");
        }
        */
        /*
        Question 6
        Write a program to find out the type of website from the url
        .com - Commercial website
        .org - Organization website
        .in  - Indian website
         */
        System.out.print("Enter website URL : ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (website.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Website url is not correct");
        }

    }
}
