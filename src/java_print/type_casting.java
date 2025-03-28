package java_print;

public class type_casting {

    public static void main(String[] args)
    {
//        Java Type Casting

//        Type casting in Java is the process of converting one data type into another.
//        Java supports two types of type casting:

//
//    ------------------------------------- 1. Implicit Casting (Widening)
//        Happens automatically when converting a smaller data type to a larger data type.
//        No data loss occurs.
//        Example: byte → short → int → long → float → double
//
//        Example:

        int num = 10;
        double d = num; // Implicit widening
        System.out.println("Integer: " + num);
        System.out.println("Double: " + d); // output: Integer: 10 Double: 10.0

//        double doub = 10;
//        int num = doub; // Implicit widening
//        System.out.println("Integer: " + num);
//        System.out.println("Double: " + doub); // output: gives error as we cant type cast higher data type to lower
//

//    ------------------------------------- 2. Explicit Casting (Narrowing)

//        Needs to be explicitly specified using (type).
//        Data loss may occur if converting from a larger type to a smaller type.
//        Example: double → float → long → int → short → byte
//
//        Example:

        double dou = 9.78;
        int nume = (int) d; // Explicit narrowing
        System.out.println("Double: " + dou);
        System.out.println("Integer: " + nume); // Output: Double: 9.78 Integer: 10

//        The decimal part (0.78) is lost during narrowing.


//        Key Differences Between Widening and Narrowing Casting

        
//        -----------------------------------------------------------------------------------------------
//        |   Feature	        |   Widening Casting (Implicit)	  |      Narrowing Casting (Explicit)   |
//        -----------------------------------------------------------------------------------------------
//        |   Conversion	    |   Smaller type → Larger type	  |         Larger type → Smaller type  |
//        |   Data Loss	        |        No	                      |          Possible                   |
//        |   Explicit Cast	    |    Not required	              |         Required (type)             |
//        |   Example	        |    int → double	              |          double → int               |
//        -----------------------------------------------------------------------------------------------

    }
}
