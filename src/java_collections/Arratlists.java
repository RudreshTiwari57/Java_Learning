package java_collections;


//----------------------------------- 1. Overview of ArrayList
//ArrayList is part of Java’s Collections Framework and is an implementation of the List interface. It is a resizable array-based data structure.
//Key Features:
//            Dynamic Resizing: Unlike arrays, ArrayList grows dynamically.
//            Maintains Insertion Order: Elements are stored in the order they were added.
//            Allows Duplicates & Nulls: Supports duplicate elements and allows null values.
//            Random Access (O(1) Time Complexity): Uses an internal array, so accessing elements is very fast.
//            Not Thread-Safe: ArrayList is not synchronized, making it unsuitable for multi-threaded environments.

//--------------------------------- 2. Internal Implementation of ArrayList
//Class Definition:

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable;


//Internal Structure:
//        Uses an array (Object[] elementData) to store elements.
//        When capacity is exceeded, a new larger array is created, and elements are copied over.
//Capacity Doubling Mechanism:
//        Default capacity: 10
//        When full, capacity grows to 1.5x (previous capacity + (previous capacity / 2)).
//
//Key Internal Fields:
        //transient Object[] elementData; // Internal array for storing elements
        //private int size; // Number of elements in the ArrayList


//------------------------------------3. Constructing an ArrayList
public class Arratlists {
    public static void main(String[] args) {
        // Default constructor (initial capacity = 10)
        ArrayList<Integer> list1 = new ArrayList<>();

        // Specifying initial capacity
        ArrayList<Integer> list2 = new ArrayList<>(20);

        // Creating a list from another collection
        List<Integer> existingList = Arrays.asList(1, 2, 3);
        ArrayList<Integer> list3 = new ArrayList<>(existingList);

//--------------------------------------------- 4. Adding Elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Mango"); // Insert at index 1
        System.out.println(list); // [Apple, Mango, Banana]

//        add(E e): Appends the element to the end of the list.
//        add(int index, E element): Inserts at the specified index.

//--------------------------------------------- 5. Accessing Elements

        String fruit = list.get(1); // Get element at index 1
        System.out.println(fruit); // Mango

//        Uses O(1) time complexity because it directly accesses the array index.

// -------------------------------------------- 6. Updating Elements
        list.set(1, "Orange"); // Replaces element at index 1
        System.out.println(list); // [Apple, Orange, Banana]

//        set(index, element): Replaces an element at the specified index.

// -------------------------------------------- 7. Removing Elements
        list.remove(1); // Removes element at index 1
        list.remove("Banana"); // Removes first occurrence of "Banana"
        System.out.println(list); // [Apple]


//        remove(index): Removes element at the given index (O(n) time complexity).
//        remove(object): Removes the first occurrence of the specified element.

//--------------------------------------------- 8. Searching Elements

        boolean containsApple = list.contains("Apple"); // true
        int index = list.indexOf("Apple"); // 0
        int lastIndex = list.lastIndexOf("Apple"); // Returns last occurrence index

//        contains(E e): Returns true if element exists.
//        indexOf(E e): Returns the first index of e, or -1 if not found.
//        lastIndexOf(E e): Returns the last index of e.

// ------------------------------------------ 9. Iterating Over ArrayList
//        Using for-each Loop
        for (String fruits : list) {
            System.out.println(fruits);
        }

//        Using for Loop (index-based)

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        Using Iterator

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        Using ListIterator (for Bi-directional Traversal)
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
//------------------------------------------ 11. Converting ArrayList to Array

        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array)); // [Apple, Orange]

//
//----------------------------------------- 12. Synchronizing ArrayList
//        Since ArrayList is not thread-safe, use:
//        ------------------------------- 1. Using Collections.synchronizedList()

        List<String> syncList = Collections.synchronizedList(new ArrayList<>());

//        2. Using CopyOnWriteArrayList (Better for Read-heavy Use Cases)

        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<>();



    }
}
