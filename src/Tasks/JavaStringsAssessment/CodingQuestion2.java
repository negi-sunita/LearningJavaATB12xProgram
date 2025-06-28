package Tasks.JavaStringsAssessment;

public class CodingQuestion2 {
    public static void main(String[] args) {
        /*
        Create a program that demonstrates different ways to compare strings in Java,
        including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
        Input - String1: "Hello", String2: "hello", String3: "Hello"
        output - equals(): false, equalsIgnoreCase(): true, compareTo(): -32
         */
        String String1 = "Hello";
        String String2 = "hello";
        //String String3 = "Hello";

        System.out.println("equals(): " +String1.equals(String2));
        System.out.println("equalsIgnoreCase(): " +String1.equalsIgnoreCase(String2));
        System.out.println("compareTo(): "+String1.compareTo(String2));

    }
}
