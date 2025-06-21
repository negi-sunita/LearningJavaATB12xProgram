package ex_16_Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers = {99, 34, 10, 1, 10, 3, 4, 95,95,32};
        int highest =0;
        int secondHighest = 0;

        for (int num : numbers){
            if (num > highest)
            {
                secondHighest = highest;
                highest = num;

            }
            else if (num > secondHighest && num != highest){
                secondHighest = num;
            }
        }

        System.out.println("Highest number is: "+highest);
        System.out.println("Second highest number is: "+ secondHighest);

    }
}
