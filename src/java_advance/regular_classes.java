package java_advance;


//A regular class is the most common type of class in Java. It has attributes,
//methods, and can be instantiated (objects can be created from it).


//Example:
class bike {
    String brand;
    int speed;

    // Constructor
    bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed);
    }
}

//-------------------------------------- 2️⃣ Non-Static Inner Class (Instance Inner Class)
//A non-static inner class (also called an instance inner class) requires an instance of the outer class to be created.
//You cannot instantiate it directly using new Outer.Inner().
//
//        ✅ Example:
class Outer {
    class Inner {
        void show() {
            System.out.println("Inside non-static inner class");
        }
    }

}
//🔹 Output:
//Inside non-static inner class

//--------------------------------------------3️⃣ Method-Local Inner Class
//Defined inside a method and can only be used inside that method.
//
//Cannot be instantiated from outside the method.
//
//✅ Example:

class Outer1 {
    void outerMethod() {
        class LocalInner {
            void show() {
                System.out.println("Inside method-local inner class");
            }
        }
        // Creating an instance of the local inner class inside the method
        LocalInner localInner = new LocalInner();
        localInner.show();
    }

    public static void main(String[] args) {

    }
}


//🔹 Output:
//Inside method-local inner class

public class regular_classes {
    public static void main(String[] args) {
        bike myBike = new bike("Tesla", 100);
        myBike.display();

        // Creating an instance of the outer class first
        Outer outer = new Outer();

        // Then creating an instance of the inner class using the outer instance
        Outer.Inner inner = outer.new Inner();
        inner.show();

        Outer1 obj = new Outer1();
        obj.outerMethod();
    }
}
