package Tasks;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Problem 1 - Check whether a given number is even or odd
//        System.out.print("Enter number of your choice : ");
//        Scanner scanner = new Scanner(System.in);
//        int givenNumber = scanner.nextInt();
//        String result = (givenNumber % 2 ==0)? "Number is even" : "Number is odd";
//        System.out.println(result);
//
//        // Problem 2 - Use the ternary operator, nested ternary operator. If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.
//        int n1 = 14;
//        int n2 = 85;
//        int n3 = 61;
//        String max = (n1 > n2 && n1 > n3) ? "n1 is greater" : (n2> n1 && n2 > n3) ? "n2 is greater" : "n3 is greater";
//
//        System.out.println(max);

        /*
        Problem 3 - Again, use the nested ternary. You have to figure it out if I am an adult, minor, or senior. What is the condition?
        The condition is very simple. If my age is greater than 18, then I can be minor or adult or senior.
        But if my age is greater than 65, then I am a senior. If I am between 18 to 65, then I am an adult.
         */
//        System.out.print("Enter your age: ");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        String status = age >=18 && age <65 ? "You are an adult" : age >= 65 ? "You are a senior citizen" : "You are a minor";
//        System.out.println(status);


        //using CLI inputs

        String user_input = args[2];
        int age = Integer.parseInt(user_input);


        String status = age >=18 && age <65 ? "You are an adult" : age >= 65 ? "You are a senior citizen" : "You are a minor";
        System.out.println(status);



    }
}
