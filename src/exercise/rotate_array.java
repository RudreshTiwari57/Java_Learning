package exercise;

import java.util.ArrayList;
import java.util.Arrays;

//Implement a method that rotates the elements of the ArrayList to the right by k steps.
public class rotate_array {
    ArrayList rotate(ArrayList<Integer> my_nums,int steps)
    {
        for(int i = 0;i<steps;i++)
        {
            int element = my_nums.removeFirst();
            my_nums.add(element);
        }
        return my_nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> my_nums = new ArrayList<>(Arrays.asList(23, 43, 65, 65, 45, 654, 235, 65, 94));
        rotate_array rotateArray = new rotate_array();
        System.out.println(rotateArray.rotate(my_nums,3));

    }
}
