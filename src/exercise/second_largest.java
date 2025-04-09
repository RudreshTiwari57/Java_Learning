package exercise;

//Write a function that returns the second-largest element in an ArrayList.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class second_largest {
    int second_largest_num(ArrayList<Integer> my_nums)
    {
        int largest = 0;
        int second_larg = 0;
        for(int num : my_nums)
        {
            if(num>largest)
            {
                second_larg = largest;
                largest = num;
            }
            else if (num>second_larg & num !=largest) {
                second_larg = num;

            }
        }
        return second_larg;

    }
    public static void main(String[] args) {
        ArrayList<Integer> my_nums = new ArrayList<>(Arrays.asList(23, 43, 65, 65, 45, 654, 235, 65, 94));
        second_largest secondLargest = new second_largest();
        System.out.println(secondLargest.second_largest_num(my_nums));




    }
}
