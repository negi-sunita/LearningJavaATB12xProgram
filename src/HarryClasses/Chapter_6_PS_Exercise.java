package HarryClasses;

import java.util.Arrays;

public class Chapter_6_PS_Exercise {
    public static void main(String[] args) {

        /*
        Question 1 - create an array of 5 floats and calculate their sum

        float sum = 0f;
        float [] price = new float [5];
        price[0] = 18.5f;
        price[1] = 21.5f;
        price[2] = 32.5f;
        price[3] = 41.5f;
        price[4] = 55.5f;
        for (float element :price){
            sum= sum+element;
        }
        System.out.println("The value of sum is " +sum);
        */
        /*
        Question 2 - Write a program to find out whether a given integer is present in an array or not

        int [] marks = {60,65,78,81,100,40};
        int givenMarks = 61;
        boolean isInArray = false;

        for (int element : marks){
            if(givenMarks==element){
                isInArray= true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is in the Array "+ givenMarks);
        }
        else{
            System.out.println("The value is not in the Array "+ givenMarks);
        }

        Question 3 - Calculate the average marks from an array containing marks of all the students in physics using for each loop

        int [] physicsMarks = {60,65,78,81,40};
        float sum = 0;
        float average =0f;
        for(float element : physicsMarks){

//            System.out.println(physicsMarks.length);
            sum = sum +element;
            average = sum/ physicsMarks.length;


        }
        System.out.println(sum);
        System.out.println(average);

        Question 4 - Create a Java program to add two matrix of size  2 x 3

        int [] [] mat1 = {
                {50,60,70}, {20,30,25}};
        int [] [] mat2 = {
                {8,9,10},{60,50,70}
        };
        int [] [] result = {
                {0,0,0},{0,0,0}
        };

        for (int i = 0; i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                result[i][j] = mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        Question 5 - Write a java program to reverse an array

        int [] marks = {54,76,42,79,100,83,90};
        int l = marks.length;
        int temp;
        for (int i = 0;i<marks.length/2; i++){
            temp = marks[i];
            marks[i] = marks[l-i-1];
            marks[l-i-1] = temp;
        }
        for (int element : marks){
            System.out.println(element);
        }
        Question 6 - Write a java program to find the maximum element in an array

        int [] marks = {54,76,42,105,100,83,90,-4322};
        int max = Integer.MIN_VALUE;
        for (int element : marks){
            if(element>max){
                max = element;
            }
        }
        System.out.println("The value of maximum no. in this array is " +max);
        Question 7 - Write a java program to find the minimum element in an array

        int [] marks = {-54,76,42,105,100,-283,90,-32};
        int min = Integer.MAX_VALUE;
        for (int element : marks){
            if(element<min){
                min = element;
            }
        }
        System.out.println(min);

        Question 8 - Write a java program to find whether an array is sorted or not
         */
        int [] marks = {1,5,10,15,18,34,5};
        boolean isSorted = true;

        for (int i = 0; i< marks.length-1; i++){
            if(marks[i]>marks[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
