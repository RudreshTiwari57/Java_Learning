package java_advance;


//Interfaces in Java are a fundamental part of Object-Oriented Programming (OOP).
//They enable abstraction, multiple inheritance, and define a contract for implementing classes.

//1. What is an Interface?
//    An interface in Java is a blueprint for a class that defines abstract methods (methods without implementation) and
//    constants. A class that implements an interface must provide implementations for all its methods.
//
//1.1 Syntax of an Interface


            interface Animal4 {
                void makeSound(); // Abstract method (no implementation)
            }
            class Dog4 implements Animal4 {
                public void makeSound() {
                    System.out.println("Dog barks");
                }
            }

//            Key Points:
//                ✔ Uses the interface keyword
//                ✔ Cannot have instance variables (only static final constants)
//                ✔ Methods are implicitly public and abstract
//                ✔ A class implements an interface using the implements keyword
//                ✔ Supports multiple inheritance in Java


//-------------------------------------------- 2. Why Use Interfaces?

//            Multiple Inheritance Support (Unlike classes, Java allows multiple interfaces)
//            Abstraction (Defines behavior without implementation)
//            Loose Coupling (Reduces dependencies between classes)
//            Standardization (Defines a contract that multiple classes follow)
//            Flexibility & Scalability (Allows plug-and-play behavior)


//-------------------------------------------- 3. Key Features of Interfaces
//-------------------------------------------3.1 Interface Variables
//            Implicitly public, static, and final
//            Cannot be modified after initialization
                interface Database {
                    int TIMEOUT = 5000; // Equivalent to: public static final int TIMEOUT = 5000;
                }
//-------------------------------------------3.2 Interface Methods
//            Before Java 8: Only abstract methods
//            Since Java 8: Default and static methods introduced
//            Since Java 9: Private methods inside interfaces


            interface Vehicle1 {
                void start(); // Abstract method (implicitly public and abstract)
            }


//------------------------------------4. Multiple Inheritance with Interfaces
//                    Unlike classes, Java supports multiple inheritance using interfaces.
//
//------------------------------------4.1 Example: A Class Implementing Multiple Interfaces


                interface Engine2 {
                    void startEngine();
                }
                interface Wheels2 {
                    void rotateWheels();
                }
                class Car2 implements Engine2, Wheels2 {
                    public void startEngine() { System.out.println("Engine started"); }
                    public void rotateWheels() { System.out.println("Wheels are rotating"); }
                }

//              🔹 The class Car implements both Engine and Wheels, avoiding the diamond problem.

//---------------------------------------------------------- 5. Java 8 Enhancements in Interfaces
//--------------------------------------------------- 5.1 Default Methods
//            Provides a default implementation in interfaces
//            Allows adding new functionality without breaking existing implementations

interface Printer {

    default void print() {
        System.out.println("Default print method");
    }

//    Same as
//    public default void print() {
//        System.out.println("Default print method");
//}
}
class InkjetPrinter implements Printer {
     public void print() {
        System.out.println("Default print method");
    }

} // No need to override print()

//---------------------------------------------------5.2 Static Methods
//            Defined inside an interface
//            Cannot be overridden
//            Called using the interface name

interface MathUtil {
    static int square(int x) {
        return x * x;
    }
}

//---------------------------------------------------- 5.3 Why Default and Static Methods?
//                    ✔ Backward Compatibility (Adds new features without affecting older implementations)
//                    ✔ Code Reusability (Common implementations can be shared)


//------------------------------------------ 6. Java 9 - Private Methods in Interfaces
//            Helps in avoiding code duplication
//            Accessible only within the interface


interface Logger {
    private void log(String message) {
        System.out.println("Logging: " + message);
    }

    default void info(String msg) {
        log("INFO: " + msg);
    }

    default void error(String msg) {
        log("ERROR: " + msg);
    }
}

//🔹 The log() method is private and used inside info() and error().

//------------------------------------------------------------ 7. Functional Interfaces and Lambda Expressions
//-------------------------------------------------------7.1 What is a Functional Interface?
//            An interface with only one abstract method
//            Introduced in Java 8
//            Allows Lambda Expressions

            @FunctionalInterface
            interface Calculator {
                int add(int a, int b);
            }



//---------------------------------------------------------7.2 Lambda Expression Example
//        Calculator sum = (a, b) -> a + b;
//        System.out.println(sum.add(5, 3)); // Output: 8

//            🔹 @FunctionalInterface annotation ensures that only one abstract method exists.


//------------------------------------------------------ 8. Marker Interfaces
//            Interfaces with no methods
//            Used for tagging a class to provide metadata
//            Examples: Serializable, Cloneable, Remote

                interface MarkerInterface {}
                class MyClass implements MarkerInterface {}

//🔹 The presence of MarkerInterface indicates a special behavior at runtime.

////---------------------------------------------------------- 9. Interface vs Abstract Class
//       |    Feature	            |   Interface	                     |   Abstract Class             |
////     ----------------------------------------------------------------------------------------------
//       |    Multiple Inheritance  |       Yes	                         |       No                     |
//       |    Constructors	        |       No	                         |       Yes                    |
//       |    Variables	            |   public static final	             |       Any access modifier    |
//       |    Methods	            |   Only abstract (before Java 8),   |    Can have both abstract    |
//       |                          |   default/static (since Java 8)	 |   and concrete methods       |

//       |    Performance	        |   Slower (indirect calls)	         |       Faster (direct calls)  |

public class interfaces implements MathUtil{

    public static void main(String[] args) {
        InkjetPrinter printer = new InkjetPrinter();
        printer.print(); // Calls the default method

        System.out.println(MathUtil.square(5));


        Calculator sum = (a, b) -> a + b;
        System.out.println(sum.add(5, 3)); // Output: 8
    }
}
