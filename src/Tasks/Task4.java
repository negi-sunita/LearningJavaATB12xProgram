package Tasks;

public class Task4 {
    public static void main(String[] args) {

        /*
        Question 1 - What will be the output of the following code?
        ERT
        13 | 11 | na
        14 | 11 | 13
        15 | 24
        */
//        int i = 11;
//        i = i++ + ++i;
//        System.out.println(i);

         // Question 2 - Guess the output:

//         int a = 11, b = 22, c;
//         c = a + b + a++ + b++ + ++a + ++b;
//         System.out.println("a=" + a); //13
//         System.out.println("b=" + b); //24
//         System.out.println("c=" + c); // 103
//
//         /*
//         c = 11 + 22 + 11 + 22 + 13 + 24
//          */



         // Question 3
        int i = 1, j = 2, k = 3;
        int m = i-- - j-- - k--;
        System.out.println("i = "+i);//0
        System.out.println("j = "+j);//1
        System.out.println("k = "+k);//2
        System.out.println("m = "+m);//-4
        /*
        m = 1 - 2 - 3
         */
    }
}
