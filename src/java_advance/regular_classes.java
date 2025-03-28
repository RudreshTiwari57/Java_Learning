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



public class regular_classes {
    public static void main(String[] args) {
        bike myBike = new bike("Tesla", 100);
        myBike.display();
    }
}
