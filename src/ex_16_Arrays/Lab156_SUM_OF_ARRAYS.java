package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10,0,50};
        int sum = 0;

        for (int num :numbers){
            sum = sum+num;
        }
        System.out.println("Sum is: " +sum);
    }
}
