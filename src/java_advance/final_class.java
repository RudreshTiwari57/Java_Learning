package java_advance;

//A final class in Java is a class that cannot be subclassed (inherited).
//It is declared using the final keyword.

final class FinalExample {
    void display() {
        System.out.println("This is a final class");
    }
}

//If another class attempts to extend FinalExample, it results in a compilation error:

//class Child extends FinalExample { // Compilation error
//}
//----------------------------------- 1. Why Use Final Classes?
//---------------------------- a) Security & Immutability
//
//            Prevents accidental modification or overriding of behavior, ensuring data integrity.
//            Commonly used in immutable classes like String in Java.

//------------------------------ b) Performance Optimization

//            The JVM can perform optimizations like inlining method calls since it knows there are no subclasses.

//------------------------------ c) Design Restriction

//            Prevents inheritance when extending a class does not make sense.

//------------------------------------ 2. Real-World Examples
//            Example 1: Java's Built-in Final Classes
//            Many Java classes are declared final, such as:
//
//                    String
//                    Integer
//                    Double

//Example:

        final class BankAccount {
             final private String accountNumber;

            public BankAccount(String accountNumber) {
                this.accountNumber = accountNumber;
            }

            public String getAccountNumber() {
                return accountNumber;
            }
        }


//-------------------------------------- 4. Can a Final Class Have Static Methods?

// Yes! Static methods belong to the class itself, and since a final class cannot be inherited,
// static methods cannot be overridden.

final class MathUtilss {
    static int square(int num) {
        return num * num;
    }
}


//----------------------------------------- 5. Can a Final Class Have Final Variables?
// Yes! A final class can have final variables (constants), ensuring they are assigned once.

final class Constants {
    final int MAX_USERS = 100;
}

//----------------------------------------- 6. Final Class vs Abstract Class

//                |       Feature	              |      Final Class	 |       Abstract Class  |
//                --------------------------------------------------------------------------------
//                |   Can be inherited?	          |      ❌ No	         |          ✅ Yes       |
//                |   Can be instantiated?	      |      ✅ Yes	         |          ❌ No        |
//                |   Can have abstract methods?  |      ❌ No	         |          ✅ Yes       |



//------------------------------------------- 7. Misconceptions About Final Classes
//
//                "Final class improves performance drastically" – While optimizations may occur, it depends on the JVM.
//                "Final class means all methods are final" – No, only methods explicitly marked final are.
//                "Final class prevents object modification" – No, it only prevents inheritance. You need final variables for immutability.

//-------------------------------------------- 8. When Should You Use a Final Class?
//
//        ✅ When creating immutable objects.
//        ✅ When designing utility/helper classes.
//        ✅ When you want to restrict inheritance for security or design reasons.
//
//-------------------------------------------- 9. When Not to Use a Final Class?
//
//        ❌ If you expect future extension of the class.
//        ❌ If the class is part of an extensible framework/library.


public class final_class {
    public static void main(String[] args) {

    }
}
