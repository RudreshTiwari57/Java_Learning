package java_collections;

//----------------------------------------------- What is a TreeMap?
//        TreeMap is a Red-Black Tree based NavigableMap implementation. It stores key-value pairs in ascending order of keys by default.
//
//        ✅ Key Characteristics

//        Feature	        Description
//        Ordering	        Sorted based on the natural ordering of keys or by a custom Comparator.
//        Null Keys	        Does not allow null keys (throws NullPointerException).
//        Null Values	    Allows multiple null values.
//        Thread Safety	    Not synchronized. Use Collections.synchronizedSortedMap() for thread safety.
//        Performance	    O(log n) time complexity for operations like put, get, remove, etc.


import java.util.Map;
import java.util.TreeMap;

public class treemap_j {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>(Map.of("D",4,"B",2,"A",1,"C",3));
        for(String string : treeMap.keySet())
        {
            System.out.println(treeMap.get(string));
        }

    }
}


//----------------------------------------------- Important Methods
//
//                        Method	                        Description
//                        put(K key, V value)	            Inserts key-value pair.
//                        get(Object key)	                Retrieves value for given key.
//                        remove(Object key)	            Removes entry for given key.
//                        firstKey() / lastKey()	        Returns smallest / largest key.
//                        ceilingKey(K key)	                ≥ given key
//                        floorKey(K key)	                ≤ given key
//                        higherKey(K key)	                > given key
//                        lowerKey(K key)	                < given key
//                        headMap(K toKey)	                Keys < toKey
//                        tailMap(K fromKey)	            Keys ≥ fromKey
//                        subMap(K fromKey, K toKey)	    Keys fromKey (inclusive) to toKey (exclusive)