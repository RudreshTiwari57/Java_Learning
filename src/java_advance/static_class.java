package java_advance;
//In Java, a class cannot be declared as static at the top level. However, static nested classes and static members are allowed.
//Let’s explore static classes, static methods, and their use cases in Java.



//-------------------------------------- 1. Static Class in Java
// Java does not support top-level static classes, but inner (nested) classes can be static.


public class static_class {
//    --------------------------------------- Characteristics of a Static Nested Class
//                                        ✔ Declared static inside another class.
//                                        ✔ Can access only static members of the outer class.
//                                        ✔ Does not require an instance of the outer class.
//                                        ✔ Cannot access non-static (instance) members of the outer class.



    static class StaticNested {
         void display() {
            System.out.println("Inside static nested class");
        }
    }


//    ----------------------------------------------------- 2. Static Methods and Static Variables
//    Java allows static members in both static and non-static classes.

    class MathUtils {

        static int add(int a, int b) {
            return a + b;
        }
    }

//    Characteristics of Static Methods
//            ✔ Can be accessed without an object (ClassName.methodName()).
//            ✔ Cannot access instance (non-static) variables.
//            ✔ Cannot use this or super inside a static method.


//-------------------------------------- 3. Static Variables (Class Variables)
//    Static variables belong to the class rather than any instance.


    class Counter {
        static int count = 0;

        Counter() {
            count++;
        }

        void showCount() {
            System.out.println("Count: " + count);
        }
    }

//    ✔ All instances share the same count variable.
//    ✔ Used for global values, constants, and shared data.


//   ---------------------------------------------------- 4. Static Blocks
//    A static block is executed only once, when the class is loaded.

    static String appName;

    static {
        appName = "MyApp";
        System.out.println("Static block executed");
    }


//    ✔ Runs once when the class is loaded into memory.
//    ✔ Useful for initializing static variables.


//    -------------------------------------------- 5. Singleton vs Static Class

//    |       Feature	      |      Static Class	              |     Singleton                               |
//    -----------------------------------------------------------------------------------------------------------
//    |   Instantiation	      |     ❌ Not allowed	              |    ✅ Only one instance                     |
//    |   State Management    |     No state, only static methods |     Can maintain state                      |
//    |   Memory Usage	      |     No instance memory used	      |     Requires memory for the instance        |
//    |   Use Case	          |     Utility/helper functions	  |     Managing global state, configurations   |


//    Singleton Example:

    class Singleton {
        private static Singleton instance;

        private Singleton() {} // Private constructor

        public static Singleton getInstance() {
            if (instance == null) {
                static_class staticClass = new static_class();
                instance = staticClass.new Singleton();
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Singleton instance");
        }
    }

//    ✔ Ensures only one instance is created.
//    ✔ Uses lazy initialization to create the instance only when needed.

    public static void main(String[] args) {
        static_class.StaticNested obj = new static_class.StaticNested();
        obj.display();


        System.out.println(MathUtils.add(5, 3)); // Output: 8

        static_class staticClass = new static_class();
        static_class.Counter c1 = staticClass.new Counter();
        static_class.Counter c2 = staticClass.new Counter();
        static_class.Counter c3 = staticClass.new Counter();

        c3.showCount(); // Output: Count: 3


        System.out.println(static_class.appName);


        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

    }
}
