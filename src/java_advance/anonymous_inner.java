package java_advance;


//An Anonymous Inner Class is a type of inner class that does not have a name and is declared and instantiated in a single expression.
//It is usually used when you need to override methods of a class or an interface on the spot.

//----------------------------------------- Key Characteristics:
//                        No explicit class name – It is defined at the point of instantiation.
//                        Declared inside a method or as a field – Usually used for short-lived implementations.
//                        Can extend a class or implement an interface, but not both at the same time.
//                        Commonly used in event handling and multithreading.


//------------------------------------------ 1️⃣ Anonymous Inner Class Extending a Class
//We can create an anonymous subclass by extending an existing class.
//
//Example:
class Animals {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


//        --------------------------------------------- 2️⃣ Anonymous Inner Class Implementing an Interface
//        If a class needs to implement an interface, we can define an anonymous inner class that provides the implementation.
//
//        Example:

interface Greeting {
     void sayHello();
}



//--------------------------------------------- 3️⃣ Anonymous Inner Class in Method Arguments
//Anonymous inner classes are often used as method arguments, especially in event handling.
//
//Example (Runnable for Threads):



public class anonymous_inner {

    public static void main(String[] args) {
        // Anonymous inner class extending Animal
        Animals myAnimal = new Animals() {
            void makeSound() {
                System.out.println("Dog barks");
            }
        };

        myAnimal.makeSound();  // Calls overridden method in anonymous class            //Dog barks


        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        greeting.sayHello();        //Hello, World!

        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running...");         //Thread is running...
            }
        });

        myThread.start();

    }
}


//----------------------------------------- Use Cases of Anonymous Inner Class
//        ✔ Event handling in GUI applications (e.g., ActionListener in Swing).
//        ✔ Multithreading (Runnable) – Quickly creating thread tasks.
//        ✔ Simplifying code when a class is needed only once.
