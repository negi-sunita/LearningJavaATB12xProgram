package HarryClasses;

public class OperatorsPrecidence {
    public static void main(String[] args) {
//        int a = 6*5 - 34/2;
//        int b = 60/5 - 34*2;
//        /*
//        =12 - 32*2
//        =12 - 68
//        = -56
//         */
//        System.out.println(a);
//        System.out.println(b);

        int a = 5;
        int b = 1;
        int c = 4;
        int k = b * b - (4 * a * c)/(2*a);
        /*
        = 1  - 4 * a * c/2*a;
        = 1 - 4 * 5 * 4/2*a;
        = 1 - 80/2 * 5;
        = 1 - 80 /10;
        = 1 - 8;
        = - 7
         */
        System.out.println(k);
        // Precidence and Associativity
    }
}
