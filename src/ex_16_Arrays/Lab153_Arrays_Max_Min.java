package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];

        for (int i = 0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }

        System.out.println("Max number is "+max);

        int min = array[0];
        for (int i = 0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Min number is "+ min);




    }
}