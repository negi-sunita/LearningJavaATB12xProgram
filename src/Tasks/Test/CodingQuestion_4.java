package Tasks.Test;

public class CodingQuestion_4 {
    public static void main(String[] args) {

        int i = 5;
        System.out.println("Original: " + i);

        // Pre-increment
        int preInc = ++i;  // i becomes 6, then returned
        System.out.println("Pre-increment: " + preInc);  // 6

        // Post-increment

        // Pre-decrement
        int preDec = --i;  // i becomes 6, then returned
        System.out.println("Pre-decrement: " + preDec);  // 6

        // Post-decrement
        int postDec = i--; // i is returned as 6, then becomes 5
        System.out.println("Post-decrement: " + postDec + " (returned " + postDec + ")");



    }
}
