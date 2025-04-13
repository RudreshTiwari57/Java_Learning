package java_collections;
//------------------------------- 🔹 What is HashSet in Java?
//                HashSet is part of Java Collection Framework.
//                It implements the Set interface, backed by a HashMap.
//                It stores unique elements only (no duplicates).
//                It is unordered – it does not maintain the insertion order.
//                Allows null elements (only one).



//---------------------------------🔹 Internal Working of HashSet
//                Under the Hood:
//                Internally, HashSet uses a HashMap.
//                Every element added to the HashSet is stored as a key in the HashMap, and a constant dummy value (like PRESENT) is used as the value.

//                private transient HashMap<E,Object> map;
//                private static final Object PRESENT = new Object();


//------------------------------ When you do:

//                HashSet<String> set = new HashSet<>();
//                set.add("Rudresh");


//------------------------------ Internally:
//                 map.put("Rudresh", PRESENT);


//-------------------------------------- 🔹 Hashing Mechanism
//                When you add an element:
//                        hashCode() of the object is called.
//                        This value is used to compute the bucket index.
//                        Then, equals() is used to check if the object already exists (to avoid duplicates).
//                So for custom objects, you must override:
//                        hashCode()
//                        equals()


//------------------------------------- 🔹 Time Complexity
//                Operation	    Average Time	Worst Case (Hash Collisions)
//                Add	             O(1)	        O(n)
//                Remove	         O(1)	        O(n)
//                Contains	         O(1)	        O(n)


//--------------------------------------🔹 Constructors

//                                HashSet(); // default capacity 16, load factor 0.75
//                                HashSet(int initialCapacity);
//                                HashSet(int initialCapacity, float loadFactor);
//                                HashSet(Collection<? extends E> c); // creates a set from another collection


//--------------------------------------🔹 Important Methods

//                                        add(E e)
//                                        remove(Object o)
//                                        contains(Object o)
//                                        size()
//                                        clear()
//                                        isEmpty()
//                                        iterator()


//--------------------------🔹 Best Practices
//                        Always override hashCode() and equals() properly for custom objects.
//                        Avoid using mutable objects as keys in sets.
//                        For thread-safe needs, use ConcurrentHashMap.newKeySet().


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset_java {
    public static void main(String[] args) {
        Set<Integer> my_set = new HashSet<>(Set.of(23,45,65,34,66,78,87));
        my_set.add(24);
        System.out.println(my_set);
        Iterator  iterator = my_set.iterator();
        for(int i : my_set)
        {
            System.out.println(i);
        }
    }
}
