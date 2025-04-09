package java_collections;


//---------------------------------------------------- What is HashMap?
//A HashMap is part of Java’s Collections Framework, used to store key-value pairs. It allows null keys and multiple null
//values and is not thread-safe.


//---------------------------------------------- Time Complexity (Average Case)
//                                Operation	        Time Complexity
//                                get()	                O(1)
//                                put()	                O(1)
//                                remove()	            O(1)
//Worst case (if all hashCodes collide and form a linked list): O(n)


//------------------------------------------------ Important Methods
//                            put(K key, V value) – Adds or updates a value.
//                            get(Object key) – Returns value for a key.
//                            remove(Object key) – Deletes entry.
//                            containsKey(Object key) – Checks if key exists.
//                            containsValue(Object value) – Checks if value exists.
//                            keySet(), values(), entrySet() – Useful for iteration.


//------------------------------------------------ Core Characteristics of HashMap
//                    Characteristic	                    Description
//                    Key-Value Pair Storage	            Stores data as a mapping from keys to values.
//                    Allows null keys/values	            One null key and multiple null values allowed.
//                    Non-synchronized	                    Not thread-safe; use Collections.synchronizedMap() or ConcurrentHashMap for multi-threading.
//                    No Ordering	                        Does not guarantee any order of elements (insertion, access, etc.).
//                    Hashing Based	                        Uses key’s hashCode() and equals() for storing and retrieving values.
//                    Constant Time                         Performance	On average, O(1) time complexity for put(), get(), remove() operations.
//                    Resizable	                            Automatically resizes (rehashes) when load factor is exceeded.
//                    Load Factor	                        Default is 0.75; controls resizing threshold.
//                    Buckets	                            Uses an array of buckets, where each bucket is a linked list or a red-black tree (Java 8+).
//                    Collision Handling	                Handles hash collisions using chaining (linked list) or treeification.
//                    Fail-Fast Iterator	                Throws ConcurrentModificationException if modified during iteration (except through iterator).


import java.util.HashMap;
import java.util.Map;

public class hashmap_java {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(Map.of(1,"Rudresh",2,"Tiwari",3,"Ritu",4,"Kumari"));
        map.put(5,"Jiya");
        map.remove(3);
        for(int i : map.keySet())
        {
            System.out.println(map.get(i));
        }
        System.out.println(map.size());

    }
}
