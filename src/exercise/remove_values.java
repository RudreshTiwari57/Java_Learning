package exercise;

//Remove all elements that start with a specific letter (e.g., "A").


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_values {
    List remove_values_startingwith(List<String> my_list, String to_be_remove)
    {
        List<String> new_my_list = new ArrayList<>();
        for(int i =0 ; i<my_list.size();i++){
            if(!my_list.get(i).startsWith(to_be_remove)){
                new_my_list.add(my_list.get(i));
            }
        }

        return new_my_list;
    }
    public static void main(String[] args) {
        List<String> my_list = new ArrayList<>(Arrays.asList("shami","Tirari","ritu","rudra"));
        remove_values removeValues = new remove_values();
        System.out.println(removeValues.remove_values_startingwith(my_list,"r"));


    }
}
