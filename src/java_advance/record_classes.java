package java_advance;
import java.io.*;
//-------------------------------------------1️⃣ What is a Record in Java?
//A record in Java is a special class designed to store immutable data. It automatically generates:
//            Constructors
//            Getters
//            equals()
//            hashCode()
//            toString()


//🔹 Syntax:

//public record RecordName(Type field1, Type field2, ...) {}

//Example:
    record Person(String name, int age) {}


//    This is equivalent to:

    final class Persona {
        private final String name;
        private final int age;

        public Persona(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String name() { return name; }
        public int age() { return age; }

//        @Override
//        public boolean equals(Object o) { ... }
//        @Override
//        public int hashCode() { ... }
        @Override
        public String toString() { return "Person[name=" + name + ", age=" + age + "]"; }
    }


//--------------------------------2️⃣ Features of Record Classes


//                Immutable – All fields are final (cannot be changed after object creation).
//                Concise Syntax – No need to write boilerplate code.
//                Automatically generated methods:
//                    Constructor
//                    Getters (name() instead of getName())
//                    equals()
//                    hashCode()
//                    toString()
//                Final Class – You cannot extend a record.
//                Can Implement Interfaces – Records can implement interfaces.

//--------------------------------3️⃣ Constructors in Records
//    Canonical Constructor (Default)
//    By default, a constructor is generated that initializes all fields.


record Employee(String name, double salary) {}

//    Equivalent to:

//     public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }


//---------------------------------------Custom Constructor
//    You can define a custom constructor:

record Employeee(String name, double salary) {
    public Employeee {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }
}

//⚠️ Note: You don't need this.name = name; because Java automatically initializes fields.



//-------------------------------------4️⃣ Getters in Records
//    Unlike normal classes, records do not use getters with "get" prefix.

record Product(String name, double price) {}



//-------------------------------------5️⃣ Methods in Records
//    Records allow you to override methods like toString(), hashCode(), and equals().

record Care(String brand, int speed) {
    @Override
    public String toString() {
        return "Car Brand: " + brand + ", Speed: " + speed + " km/h";
    }
}

//------------------------------------ 6️⃣ Static Fields & Methods
//🔹 Records allow static fields and methods, but not instance fields.

    record Cars(String brand, int speed) {
        static int wheels = 4;  // ✅ Allowed
        static void display()
        {
            System.out.println("All cars have " + wheels + " wheels.");
        }
    }
//    ❌ Instance fields (Non-final) are NOT allowed

//    public record Car(String brand, int speed) {
//        private int gear;  // ❌ ERROR: Cannot declare instance fields in records
//    }


//------------------------------------- 7️⃣ Implementing Interfaces
//    Records can implement interfaces, but cannot extend classes.

interface Driveable {
    void drive();
}

record Carw(String brand, int speed) implements Driveable {
    @Override
    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}


//---------------------------------------8️⃣ Nesting Records
//    Records can be nested inside another class or another record.

class School {
    public record Student(String name, int rollNo) {}
}



//---------------------------------------9️⃣ Serialization with Records
//    Records are serializable, but all fields must be serializable.




record Employees(String name, double salary) implements Serializable {}


//---------------------------------------🔟 When to Use Records?
//        ✅ Use records when:
//                    You need a data container with immutable fields.
//                    You want to avoid boilerplate code for getters, toString(), equals(), etc.
//                    You don’t need additional instance fields.

//        ❌ Avoid records when:
//                    You need mutable fields.
//                    You want to extend another class (records cannot extend).
//                    You need custom setters (records don’t allow setters).



    public class record_classes {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Product p = new Product("Laptop", 1500.99);
        System.out.println(p.name());  // No getName(), use name()
        System.out.println(p.price()); // No getPrice(), use price()




        School.Student s = new School.Student("Alice", 101);
        System.out.println(s.name()); // Alice


        Employees emp = new Employees("John", 5000);

        // Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"));
        oos.writeObject(emp);
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"));
        Employees deserializedEmp = (Employees) ois.readObject();
        ois.close();

        System.out.println(deserializedEmp);

    }

}
