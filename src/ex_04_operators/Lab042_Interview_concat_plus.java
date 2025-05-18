package ex_04_operators;

public class Lab042_Interview_concat_plus {
    public static void main(String[] args) {
        String s1 = "Sunita ";
        String s2 = "Negi";
        System.out.println(s1+s2); //joins

        int a = 10;
        int b = 10;
        System.out.println(a+b); // Math

        System.out.println(s1+s2+a+b);
        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+(a+b));
        // + -> behave differently with the data type.
        // + -> operator overloading
    }
}
