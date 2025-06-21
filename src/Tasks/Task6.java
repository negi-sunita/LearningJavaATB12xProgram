package Tasks;
import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        /* Question 1 - Write a program to reverse a string without using inbuilt functions. -> forloop
        System.out.print("Enter the string which you want to reverse ");
        Scanner sc = new Scanner(System.in);
        String enteredString = sc.nextLine();
        for (int i = enteredString.length()-1;i>=0;i--){
            System.out.print(enteredString.charAt(i));
        }

        //Question 2 - Write a program to reverse a string by using an inbuilt function. -> StringBuffer - reverse()
        System.out.println();

        System.out.print("Enter the string which you want to reverse ");
        Scanner sc1 = new Scanner(System.in);
        String enteredString1 = sc1.nextLine();
        StringBuilder sb = new StringBuilder(enteredString1);
        System.out.println("Reversed string is "+ sb.reverse());


         */

//        System.out.print("Enter the string4: ");
//        Scanner sc4 = new Scanner(System.in);
//        String enteredString2 = sc4.nextLine();
//        String result = reversefunction(enteredString2);
//        System.out.println("Reversed string is: " + result);


        /* Question 4 - Count the Number of Words in a String (replaceAll)
        System.out.print("Enter the string5: ");
        Scanner sc4 = new Scanner(System.in);
        String string4 = sc5.nextLine();
        String normalizedString = string4.replaceAll("\\s+", " ");
        String[] words = normalizedString.trim().split(" ");
        int wordsLength = words.length;
        if(wordsLength <=1){
            System.out.println("The number of word is "+ wordsLength);
        }
        else{
            System.out.println("The number of words are "+ wordsLength);
        }
        */

        /* Question 5 - String is a Palindrome

        System.out.print("Enter the string5: ");
        Scanner sc5 = new Scanner(System.in);
        String string5 = sc5.nextLine();
        string5 = string5.trim().toLowerCase(Locale.ROOT);
        String output ="";
        for (int i = string5.length()-1;i>=0;i--){
            output = output+string5.charAt(i);
        }
        System.out.println(output);

        if (string5.equals(output)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
        boolean isPalindrome = true;
        for (int i = 0; i<string5.length()/2;i++){
            if(string5.charAt(i) !=string5.charAt(string5.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
        */

        /*
        Question 6 - First Letter of Each Word in a String
         */
        System.out.print("Enter string 6: ");
        Scanner sc = new Scanner(System.in);
        String string6 = sc.nextLine();
        String stringWithoutSpaces = string6.replaceAll("\\s+", " ");
        System.out.println("String without spaces "+ stringWithoutSpaces);
        String [] words = stringWithoutSpaces.trim().split(" ");
        for (int i = 0;i<words.length;i++){

                System.out.println(words[i].charAt(0));

        }


    }

    // Question 3 - Write a program to reverse a string without using a loop without using an inbuilt function. -> recursive functions

//        System.out.print("Enter the string which you want to reverse ");
//        Scanner sc2 = new Scanner(System.in);
//        String enteredString2 = sc2.nextLine();

//

//        public static String reversefunction(String name){
//        if (name.length() <=1){
//            return name;
//        }
//        return reversefunction(name.substring(1)) + name.charAt(0);
//
//    }


}
