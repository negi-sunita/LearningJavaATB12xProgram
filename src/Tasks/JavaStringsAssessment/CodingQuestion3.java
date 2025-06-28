package Tasks.JavaStringsAssessment;

public class CodingQuestion3 {
    public static void main(String[] args) {
        /*
Write a program that demonstrates the performance difference between String concatenation, StringBuilder, and StringBuffer for multiple string operations.
Input - 1000 iterations
Output - String: 150ms, StringBuilder: 5ms, StringBuffer: 8ms
         */

        int iterations = 1000;

        // String concatenation test
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ms");

        // StringBuilder test
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");

        // StringBuffer test
        startTime = System.currentTimeMillis();
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sBuffer.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
    }
}
