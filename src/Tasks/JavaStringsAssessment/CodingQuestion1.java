package Tasks.JavaStringsAssessment;

public class CodingQuestion1 {
    public static void main(String[] args) {
        /*
        Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.
        Input - Hello World
        Output - Length: 11, First char: H, Substring: World
         */

        String text = "Hello World";
        System.out.println("Length: "+text.length());
        System.out.println("First char: "+text.charAt(0));
        System.out.println("Substring: "+text.substring(6));
    }
}
