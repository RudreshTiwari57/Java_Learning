package exercise;

import java.security.Key;
import java.util.*;

public class sort_hashmap_values {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>(Map.of("D",7,"B",9,"A",77,"C",98));

        List <Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
//        Collections.reverse(list);

        for (Map.Entry<String,Integer> entry: list)
        {
            System.out.print(entry.getValue());
            System.out.print(" : ");
            System.out.println(entry.getKey());
        }

    }

}
