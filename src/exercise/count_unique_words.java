package exercise;


//ake a sentence as input and print the number of unique words using HashSet.

//Example:
//            Input: "Java is awesome and Java is powerful"
//            Output: 5


import java.util.*;

public class count_unique_words {

    public static void main(String[] args) {
        String my_string = "Java is awesome and Java is powerful";
        List<String> my_list = new ArrayList(List.of(my_string.split(" ")));
        Set<String> my_set = new HashSet<>();
        for(String words : my_list)
        {
            my_set.add(words);
        }
        System.out.println(my_set.size());
    }


}
