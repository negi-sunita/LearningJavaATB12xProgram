package HarryClasses;
import java.util.Scanner;

public class Chapter_1_PS_Exercise {
    public static void main(String[] args) {
        float totalMarks = 500;
        System.out.println("This program is to calculate % of student's marks");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int subject1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = sc.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int subject4 = sc.nextInt();
        System.out.print("Enter marks for subject 5: ");
        int subject5 = sc.nextInt();
        float TotalStudentMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println("Total student's marks: "+ TotalStudentMarks);
        float percentage = (TotalStudentMarks / totalMarks)*100;
        System.out.println("Total percentage is : "+ percentage);

        //Question 2
//        int marks1 = 65;
//        int marks2 = 85;
//        int marks3 = 95;
//        float average = (marks1+marks2+marks3)/3f;
//        float cgpa = average/10f;
//        System.out.println("Student's CGPA is : "+cgpa);

        //Question 3
//        System.out.print("Enter your name : ");
//        String name = sc.next();
//        System.out.println("Hello "+ name + " Have a good Day");

        //Question 4 - Write a Java program to convert kilometers to miles

//        float kilometers = 4f;
//        float miles = 0.621371f * kilometers;
//
//        System.out.println("Miles is : "+ miles);

//Question 5  - Check whether the no. entered by user is a integer or not
//        System.out.print("Enter number of your choice : ");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());

    }
}

