package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class word_count_hashmap {

    static Map count_words(String my_string)
    {
        Map<String,Integer> my_map = new HashMap<>();

        List<String> list_my_strings = Arrays.asList(my_string.split(" "));
        for(String string : list_my_strings)
        {

            if(my_map.containsKey(string)) {
                int count = my_map.get(string) + 1;
                my_map.put(string, count);
            }
            else
            {
                my_map.put(string,1);
            }
        }
        return my_map;
    }

    public static void main(String[] args) {
        String my_string = "Collections in Java are in Java are containers that Java Java store that store multiple elements (objects)";
        Map<String,Integer> my_map = word_count_hashmap.count_words(my_string);

        for(String string : my_map.keySet())
        {
            System.out.print(string);
            System.out.println(": "+my_map.get(string));
        }
    }
}
