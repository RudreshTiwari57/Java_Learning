package exercise;

import java.util.Arrays;

public class max_min_array {
    public static void main(String[] args) {
//        Find the Maximum and Minimum Element in an Array
//        Given an array, write a program to find the maximum and minimum elements.



        int [] array = {12,43,53,453,535,535,24,43};
        int min = array[0];
        int max = array[0];

        for(int i =0 ;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
            if(array[i]<min)
            {
                min = array[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
