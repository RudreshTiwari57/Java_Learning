package java_print;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class array_java {

    public void main(String[] args)
    {
//        -------------------------------------------- 1. Understanding Arrays in Java
//        Definition:
    //        An array in Java is a container object that holds a fixed number of values of a single data type. Arrays in Java are dynamically
    //        allocated and are objects stored in the heap memory.
//
//        Syntax:

//                dataType[] arrayName;   // Recommended syntax
//                dataType arrayName[];   // Also valid, but less common


//        Declaration, Instantiation, and Initialization:

//                int[] numbers;           // Declaration
//                numbers = new int[5];    // Instantiation (allocating memory)
//                numbers[0] = 10;         // Initialization

        // Declaration + Instantiation + Initialization in one step
                int[] values = {1, 2, 3, 4, 5};



//       --------------------------------------------------- 2. Types of Arrays in Java
    //        a) One-Dimensional Arrays (1D Array)
    //              A simple array storing elements in a linear structure.
                    String[] names = new String[3];
                    names[0] = "John";
                    names[1] = "Alice";
                    names[2] = "Bob";



//      ---------------------------------------------------- b) Multi-Dimensional Arrays (2D and 3D Arrays)
//            Arrays within arrays, useful for representing matrices and tables.
//
//                2D Array Example:
                        int[][] matrix = {
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        };

                        System.out.println(matrix[1][2]);  // Output: 6

//            Jagged Array (Irregular Rows in a 2D Array)

                    int[][] jaggedArray = new int[3][];
                    jaggedArray[0] = new int[]{1, 2};
                    jaggedArray[1] = new int[]{3, 4, 5};
                    jaggedArray[2] = new int[]{6, 7, 8, 9};



//       ------------------------------------------- c) 3D Arrays

                    int[][][] cube = new int[2][2][2];  // 3D array with 2x2x2 structure
                    cube[0][1][1] = 42;
                    System.out.println(cube[0][1][1]);  // Output: 42



//      ----------------------------------------------  3. Array Memory Management in Java

//            Stored in heap memory.
//            Each element in an array has a fixed memory allocation based on the data type.
//            Arrays in Java are objects, so they have an associated class (java.lang.reflect.Array).
//            Garbage Collector cleans up arrays when they are no longer referenced.


//       ---------------------------------------------- 4. Common Array Operations
//            a) Traversing Arrays

                    int[] arr = {10, 20, 30, 40};
                    // Using for-loop
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                    }
                    // Using enhanced for-loop (for-each)
                    for (int num : arr) {
                        System.out.println(num);
                    }

//            b) Sorting Arrays

//                import java.util.Arrays;
                int[] numbers = {5, 3, 8, 1};
                Arrays.sort(numbers);  // {1, 3, 5, 8}


//        ---------------------------------------------------------- 5. Immutable Arrays
//        Java does not have a built-in immutable array, but we can use List from Collections.unmodifiableList() to achieve immutability.


//                    import java.util.Arrays;
//                    import java.util.Collections;
//                    import java.util.List;

                    List<Integer> list = Arrays.asList(1, 2, 3);
                    List<Integer> immutableList = Collections.unmodifiableList(list);
//        --------------------------------------------------- 6. Common Mistakes and Best Practices


//        ---------------------------------------- a) ArrayIndexOutOfBoundsException
//        Occurs when accessing an index beyond the array's size.
                    int[] arrr = new int[5];
                    System.out.println(arrr[5]);  // Exception! (valid indices: 0-4)


//        -------------------------------------------- b) Null Pointer Exception
//        Occurs when an array is declared but not initialized.

                    int[] are = null;
                    System.out.println(are.length);  // NullPointerException

//        ---------------------------------------- c) Prefer ArrayList Over Arrays When Size is Not Fixed
//        If you need dynamic resizing, use ArrayList instead of arrays.

                    ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(10);
//        -------------------------------------- 7. Arrays vs Collections (List, Set, Map)


//                    ---------------------------------------------------------------------------
//                    |    Feature	        |   Arrays	    |   Collections (List, Set, Map)    |
//                    ---------------------------------------------------------------------------
//                    |    Fixed Size	    |   Yes	        |   No                              |
//                    |    Performance	    |   Faster	    |   Slower (More flexible)          |
//                    |    Memory	        |   Less	    |   More (Resizing Overhead)        |
//                    |    Methods	        |   Limited	    |   Rich API in Collections         |
//                    ---------------------------------------------------------------------------



//
    }








}
