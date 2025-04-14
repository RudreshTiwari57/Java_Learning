package java_collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//------------------------------------------------ What is LinkedHashMap?
//        LinkedHashMap is a hash table + linked list implementation of the Map interface. It maintains a doubly linked list running through its
//        entries to preserve the insertion order or access order, unlike HashMap which does not guarantee order.


//----------------------------------------------- Key Features
//                    Feature	                Description
//                    Ordering	                Maintains insertion or access order (configurable).
//                    Nulls	                    Allows one null key and multiple null values.
//                    Performance	            Similar to HashMap, but slightly slower due to overhead of maintaining order.
//                    Not Thread-safe	        Needs external synchronization if used in multithreaded context.
//                    Load Factor & Capacity	Supports similar tuning as HashMap.




//---------------------------------------------- Internal Structure
//                    LinkedHashMap extends HashMap and overrides some methods to maintain a doubly-linked list:
//                    public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>

//---------------------------------------------  Internal Node Structure
//                    static class Entry<K,V> extends HashMap.Node<K,V> {
//                        Entry<K,V> before, after;
//                    }
//                  Each node keeps track of the previous and next entries (doubly linked list), maintaining order.

//----------------------------------------------- Constructors
//--------------------------------------- Default (insertion-order)
//                    LinkedHashMap<K, V> map = new LinkedHashMap<>();
//                    // With initial capacity and load factor
//                    LinkedHashMap<K, V> map = new LinkedHashMap<>(16, 0.75f);
//                    // With ordering mode
//                    LinkedHashMap<K, V> map = new LinkedHashMap<>(16, 0.75f, true); // access-order


//--------------------------------------- Ordering: Insertion vs Access
//                Insertion-order (default): Order in which keys are inserted is maintained.
//                Access-order (true): When get() or put() is called, the accessed entry is moved to the end.

//--------------------------------------- Eviction Policy (LRU Cache)
//              Using removeEldestEntry, you can implement an LRU cache easily.
//                LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(16, 0.75f, true) {
//                    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
//                        return size() > 5;
//                    }
//                };
//              This will automatically remove the least recently used entry when size exceeds 5.

//---------------------------------------- Time Complexity
//                Operation	            Complexity
//                get(key)	                O(1)
//                put(key, value)	        O(1)
//                remove(key)	            O(1)
//                iteration	                O(n) (in order)

//              Slightly slower than HashMap due to overhead of maintaining links.

//----------------------------------------- Use Cases
//                LRU Cache implementation
//                Maintaining predictable iteration order
//                Session history
//                Access-tracking applications


//------------------------------------------ Differences: HashMap vs LinkedHashMap
//                Feature	                HashMap	            LinkedHashMap
//                Ordering	                No	                Yes (insertion or access)
//                Memory Overhead	        Lower	            Higher (due to extra pointers)
//                Iteration Order	        Unpredictable	    Predictable
//                LRU Cache Support	        No	                Yes (via override)



public class linkedhashmap {
    public static void main(String[] args) {
//        Example:
                LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
                map.put(1, "A");
                map.put(2, "B");
                map.put(3, "C");

                map.get(1);  // Access 1
                System.out.println(map.keySet()); // Output: [2, 3, 1]
                LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>(16, 0.75f, true);
                map1.put(1, "One");
                map1.put(2, "Two");
                map1.put(3, "Three");

                map1.get(1); // Access key 1

                for (Map.Entry<Integer, String> entry : map1.entrySet()) {
                    System.out.println(entry.getKey() + " => " + entry.getValue());
                }


    }

}
