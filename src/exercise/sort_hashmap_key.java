package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sort_hashmap_key {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>(Map.of("D",4,"B",2,"A",1,"C",3));
        SortedMap<String,Integer> sortedMap = new TreeMap<>(hashMap);
        System.out.println(sortedMap.keySet());
    }
}
