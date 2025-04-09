package java_collections;

//----------------------------------------- What is a HashSet?
//HashSet is a part of the Java Collections Framework and implements the Set interface. It stores unique
//elements and is backed by a HashMap internally.


//-------------- Declaration
//Set<String> set = new HashSet<>();


//------------------------------------------ Key Characteristics
//                Property	                Description
//                No duplicates	            Stores unique elements only
//                Unordered	                Does not maintain insertion order
//                Allows null	            Can store only one null value
//                Not thread-safe	        Use Collections.synchronizedSet or ConcurrentHashMap.newKeySet() for thread safety



//-------------------------------------------- Important Methods
//                        Method	                    Description
//                        add(E e)	                    Adds an element if it doesn’t exist
//                        remove(Object o)	            Removes element
//                        contains(Object o)	        Checks existence
//                        isEmpty()	                    Checks if empty
//                        size()	                    Returns count


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hastset_java {


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(12,34,25,65));
        set.add(23);
        set.remove(12);
        for(int i : set)
        {
            System.out.println(i);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
