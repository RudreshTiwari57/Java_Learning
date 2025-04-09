package exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class add_arrays {
    ArrayList remove_dublicate_add(ArrayList<Integer> my_nums,ArrayList<Integer> my_nums1)
    {
        my_nums.addAll(my_nums1);
        ArrayList<Integer> new_my_nums = new ArrayList<>();
        for(int my_int : my_nums)
        {
            if(!new_my_nums.contains(my_int))
            {
                new_my_nums.add(my_int);
            }
        }
        return new_my_nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> my_nums = new ArrayList<>(Arrays.asList(23, 43, 65, 65, 45, 654, 235, 65, 94));
        ArrayList<Integer> my_nums1 = new ArrayList<>(Arrays.asList(34,7657,897,43534,123,88,43,43,22));
        add_arrays addArrays = new add_arrays();
        System.out.println(addArrays.remove_dublicate_add(my_nums,my_nums1));



    }
}
