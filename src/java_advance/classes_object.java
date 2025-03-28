package java_advance;
//---------------------------------------------- 1️⃣ What is a Class in Java?

//A class is a blueprint for creating objects. It defines attributes (fields/variables) and behaviors (methods).


//Example of a Class

class Car {
    // Attributes (fields)
    String brand;
    int speed;

    // Constructor (initializing attributes)
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Behavior (method)
    void accelerate() {
        speed += 10;
        System.out.println(brand + " is accelerating. Speed: " + speed);
    }
}
//----------------------------------------- 2️⃣ What is an Object?

//An object is an instance of a class. Each object has its own copy of attributes and methods.
//
//Creating and Using an Object
//        ✅ Objects store data and provide behaviors.
//        ✅ new Car("Tesla", 50); → Allocates memory and initializes the object.

public class classes_object {

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 50);  // Creating an object
        myCar.accelerate();  // Calling method
    }
}
