package java_advance;


//An abstract class is a class that cannot be instantiated (you cannot create objects from it directly).
//It can have abstract methods (methods without a body) and concrete methods (methods with a body).
//



//------------------------------------------------- type of methods in abstract class





abstract class Animal {
    //------------------------------------------- 1. Abstract Methods (Unimplemented Methods)
//            Declared without a body (only a method signature).
//            Must be implemented by the subclasses (unless the subclass is also abstract).
//            Purpose: Enforces a contract that subclasses must follow.

//            ✅ Forces subclasses to implement essential functionality.
//            ✅ Ensures consistency across multiple child classes.

    abstract void makeSound(); // Abstract method (no body)


//   ----------------------------------------------- 2. Concrete Methods (Implemented Methods)
//                Has a body (implementation is provided in the abstract class).
//                Can be overridden by subclasses (optional).
//                Purpose: Provides common functionality that all subclasses can use.
//                ✅ Provides default behavior that subclasses can use.
//                ✅ Reduces code duplication in subclasses.
    void sleep() { // Concrete method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
//--------------------------------------- 3. Static Methods

//            Can be called without creating an object.
//            Belongs to the abstract class, not instances.
//            Purpose: Provides utility methods that do not require object state.
//           ✅ Useful for utility functions.
//           ✅ No need to create an object to access the method.

//Example:
abstract class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

// ----------------------------------- 4. Final Methods
//                    Cannot be overridden by subclasses.
//                    Purpose: Ensures that a method’s implementation remains unchanged.
//                    ✅ Protects critical methods from being modified.
//                    ✅ Ensures a standard implementation for all subclasses.

abstract class Vehicle {
    final void fuelType() {
        System.out.println("Uses Petrol or Diesel.");
    }
}

class Carr extends Vehicle {
    // This will cause an error:
    // void fuelType() { System.out.println("Electric Car."); } ❌ ERROR!
}


//--------------------------------------------- 5. Private Methods (Java 9+)
//        Cannot be accessed or overridden by subclasses.
//        Purpose: Used for internal logic inside the abstract class.
//
//Example:
abstract class Machine {
    abstract void start();

    private void logStatus() { // Private method
        System.out.println("Logging Machine Status...");
    }

    void performCheck() { // Public method calling private method
        logStatus();
    }
}

class Engine extends Machine {
    void start() {
        System.out.println("Engine Started.");
    }
}

//----------------------------------------- 6. Synchronized Methods
//
//        Ensures thread safety when multiple threads access the method.
//        Purpose: Useful in multithreading environments.
//        ✅ Prevents race conditions in multi-threaded applications.
//        ✅ Ensures that only one thread accesses the method at a time.
//
//Example:

abstract class Counter {
    private int count = 0;

    synchronized void increment() { // Synchronized method
        count++;
        System.out.println("Count: " + count);
    }
}

class MyCounter extends Counter {}

public class abstract_class {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Bark! Bark!
        dog.sleep(); // Sleeping...

        System.out.println(MathUtils.square(5)); // Output: 25


        Carr myCar = new Carr();
        myCar.fuelType(); // Output: Uses Petrol or Diesel.


        Engine myEngine = new Engine();
        myEngine.start();
        myEngine.performCheck(); // Calls private method internally


        MyCounter counter = new MyCounter();
        counter.increment();
    }
}



//      |  Method Type	        |  Description	                                                      |   Can Subclass Override?
//      ----------------------------------------------------------------------------------------------------------------------------
//      |  Abstract Method	    |  Declared without a body, must be implemented by subclass	          |       ✅ Yes (Required)
//      |  Concrete Method	    |  Has implementation in abstract class	                              |       ✅ Yes (Optional)
//      |  Static Method	    |  Belongs to the class, not objects	                              |       ❌ No
//      |  Final Method	        |  Cannot be overridden by subclasses	                              |       ❌ No
//      |  Private Method	    |  Cannot be accessed by subclasses (Java 9+)	                      |       ❌ No
//      |  Synchronized Method  |  Thread-safe method (ensures only one thread accesses it at a time) |	      ✅ Yes (if not final)
