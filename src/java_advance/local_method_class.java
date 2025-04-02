package java_advance;

//A Local Inner Class is a type of inner class that is defined inside a method,
//constructor, or block. It is local to the enclosing method and cannot be accessed outside of it.


//-------------------------------------- Key Characteristics:


//                    Declared inside a method or block and is local to it.
//                    Cannot have access modifiers (e.g., public, private, protected) since it is not a member of the outer class.
//                    Can access local variables of the enclosing method only if they are final or effectively final (unchanged after assignment).
//                    Can access all members (including private members) of the outer class.

//Syntax:

class OuterClasses {
    private String message = "Hello from OuterClass";

    void outerMethod() {
        // Local Inner Class inside a method
        class LocalInner {
            void display() {
                System.out.println(message);  // Accessing outer class private member
            }
        }

        // Creating an instance of LocalInner inside the method
        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    //    ---------------------------------------- Accessing Local Variables of the Method
//    A Local Inner Class can access final or effectively final variables of the enclosing method.

    void displayMessage() {
         String localVar = "Local Variable";  // Effectively final

        class LocalInner {
            void printMessage() {
                System.out.println(localVar); // Allowed
            }
        }

        LocalInner inner = new LocalInner();
        inner.printMessage();
    }
//
//    Use Cases of Local Inner Class
//            Encapsulation – Keeps helper classes hidden from the rest of the program.
//            Logical Grouping – Useful when the inner class is only relevant inside a specific method.
//            Event Handling in GUI applications – Often used in Java Swing for event handling.
}

public class local_method_class {

//    ------------------------------------- Instantiating a Local Inner Class
//    Since a Local Inner Class is declared inside a method, it can only be instantiated within that method.

    public static void main(String[] args) {
        OuterClasses outer = new OuterClasses();
        outer.outerMethod();  // Calling the method that contains the Local Inner Class
//        OUTPUT:
//        Hello from OuterClass

        outer.displayMessage();


    }
}
