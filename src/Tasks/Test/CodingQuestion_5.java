package Tasks.Test;

public class CodingQuestion_5 {
    public static void main(String[] args) {

        int numInt = 10;
        double numDouble = 3.5;
        int result = (numInt * 2) + (int) numDouble;
        System.out.println("Result: " + result);
        double implicitCasting = numInt + numDouble;
        System.out.println("Implicit casting: "+implicitCasting);
        int explicitCasting = (int) numDouble + numInt;
        System.out.println("Explicit casting: "+explicitCasting);
    }
}
