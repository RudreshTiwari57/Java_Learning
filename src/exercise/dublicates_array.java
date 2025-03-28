package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class dublicates_array {
//    Remove Duplicates from an Array
//    Write a program to remove duplicate values from an integer array.

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(23, 54, 64, 35, 35, 35, 24, 54, 67));
        for(int i =0;i<array.size();i++)
        {
            int count = 0;
            for(int j = 0;j<array.size();j++)
            {
                if (array.get(i) == array.get(j))
                {
                    count += 1;
                }
            }
            if(count>1)
            {
                array.remove(array.get(i));
            }
        }
        System.out.println(array);

    }
}
