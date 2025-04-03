package java_advance;
//Polymorphism is a fundamental concept of Object-Oriented Programming (OOP) in Java.
//It allows one interface to be used for different data types, enabling code reusability
//and flexibility.


//------------------------------------------ 1. What is Polymorphism?
//Polymorphism means "many forms" and allows a single entity (method, operator, or object) to behave
//in different ways.
//
//------------------------------------- Types of Polymorphism in Java
//                          1.  Compile-time Polymorphism (Method Overloading)
//                          2.  Runtime Polymorphism (Method Overriding)

//--------------------------------------------2. Compile-Time Polymorphism (Method Overloading)
//            Method Overloading allows multiple methods in the same class to have the same name but different
//            parameter lists. The compiler determines the method to be called at compile time.
//Example of Method Overloading


class MathUtill {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


//
//Rules for Method Overloading
//            ✔ Methods must have the same name but different parameter lists
//            ✔ Can change the number of parameters
//            ✔ Can change the data types of parameters
//            ✔ Return type alone does NOT differentiate methods

//                class Example {
//                    int show(int x) { return x; }
//                    double show(int x) { return x; }  ❌ Compilation error (same method signature)
//                }


//--------------------------------------------- 3. Runtime Polymorphism (Method Overriding)
//            Method Overriding allows a subclass to override a method of its superclass.
//            The method call is resolved at runtime using dynamic method dispatch.
//
//Example of Method Overriding


class Parent5 {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child5 extends Parent5 {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}


//
//------------------------------------- Rules for Method Overriding
//                ✔ Method signature (name and parameters) must be exactly the same
//                ✔ Access modifier cannot be more restrictive (e.g., public method in parent cannot be private in child)
//                ✔ Cannot override static, final, or private methods
//                ✔ Return type must be the same or a subclass (covariant return type)


//--------------------------------------------------4. Differences Between Method Overloading and Overriding
//            |    Feature	            Method Overloading	                        Method Overriding
//            ----------------------------------------------------------------------------------------------------------
//            |    Definition	        Multiple methods with the same              Redefining a method in a subclass
//                                      name but different parameters

//            |    Type	                Compile-time Polymorphism	                Runtime Polymorphism

//            |    Parameters	            Must be different	                    Must be the same

//            |    Return Type	            Can be different	                    Must be the same or a covariant
//                                                                                  return type

//            |    Access Modifier	        Can be changed	                        Cannot be more restrictive

//            |    Static Methods	        Can be overloaded	                    Cannot be overridden
//                                                                                  (method hiding happens instead)

public class polymorphism {

    public static void main(String[] args) {
        MathUtill obj = new MathUtill();
        System.out.println(obj.add(5, 3));       // Calls int add(int, int)
        System.out.println(obj.add(5.5, 3.3));   // Calls double add(double, double)
        System.out.println(obj.add(1, 2, 3));    // Calls int add(int, int, int)
//🔹 Here, the add() method is overloaded with different argument types and numbers.


        Parent5 objz = new Child5(); // Upcasting
        objz.show();  // Calls Child's show() method at runtime
        //🔹 The method call objz.show() executes the child class method at runtime, even though the reference is of Parent type.
    }
}
