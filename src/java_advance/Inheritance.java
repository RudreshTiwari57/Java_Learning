package java_advance;
//Inheritance is one of the core pillars of Object-Oriented Programming (OOP) in Java. It enables a child class (subclass)
//to inherit fields and methods from a parent class (superclass). This promotes code reusability and logical hierarchy.


//----------------------------------------------------------1. Key Concepts of Inheritance
//--------------------------------------------------------------1.1 Basic Syntax

class Parents {
    void display() {
        System.out.println("This is the Parent class");
    }
}

class Childs extends Parents {
    void show() {
        System.out.println("This is the Child class");
    }
}

//                        🔹 The extends keyword is used to inherit from a superclass.
//                        🔹 The subclass gets all non-private members of the superclass.


//--------------------------------------------------------------2. Types of Inheritance in Java
//Java supports single, multilevel, and hierarchical inheritance but does NOT support multiple inheritance with
// classes due to the Diamond Problem.
//
//------------------------------------------------------------------2.1 Single Inheritance
//A single child inherits from a single parent.

class A {
    void methodA() { System.out.println("Class A method"); }
}
class B extends A {
    void methodB() { System.out.println("Class B method"); }
}


//-------------------------------------------------------------2.2 Multilevel Inheritance
//A class inherits from another class, forming a chain.
class AA {
    void methodA() { System.out.println("Class A method"); }
}
class BB extends AA {
    void methodB() { System.out.println("Class B method"); }
}
class C extends BB {
    void methodC() { System.out.println("Class C method"); }
}

//-------------------------------------------------------------2.3 Hierarchical Inheritance
//Multiple classes inherit from the same parent class.


class A1 {
    void methodA() { System.out.println("Class A method"); }
}
class B1 extends A1 {
    void methodB() { System.out.println("Class B method"); }
}
class C1 extends A1 {
    void methodC() { System.out.println("Class C method"); }
}


//--------------------------------------2.4 Why Java Doesn't Support Multiple Inheritance with Classes
//Java doesn’t support multiple inheritance using classes to avoid the Diamond Problem:

//                                        class A {
//                                            void show() { System.out.println("Class A method"); }
//                                        }
//                                        class B extends A {
//                                            void show() { System.out.println("Class B method"); }
//                                        }
//                                        class C extends A, B { // Compilation error
//                                            void show() { System.out.println("Class C method"); }
//                                        }


//Instead, Java allows multiple inheritance using interfaces.


//---------------------------------------------------------3. Method Overriding
//Method overriding allows a subclass to provide a specific implementation of a method already defined in its parent class.
//
//---------------------------------------------------3.1 Rules for Method Overriding
//                    ✔ The method in the child class must have the same name, return type, and parameters as the parent method.
//                    ✔ The child class method cannot have a weaker access modifier (e.g., protected → private is not allowed).
//                    ✔ The method cannot be overridden if it's final, static, or private.


class Parent1 {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child1 extends Parent1 {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}


//---------------------------------------------------------- 4. Super Keyword
//🔹 The super keyword is used to access parent class members.
//
//--------------------------------------------------4.1 Access Parent Class Methods

class Parent2 {
    void display() { System.out.println("Parent class method"); }
}
class Child2 extends Parent2 {
    void display() {
        super.display(); // Calls parent method
        System.out.println("Child class method");
    }
}


//------------------------------------------------- 4.2 Access Parent Class Constructor


class Parent3 {
    Parent3() { System.out.println("Parent Constructor"); }
}
class Child3 extends Parent3 {
    Child3() {
        super(); // Calls Parent constructor
        System.out.println("Child Constructor");
    }
}


//------------------------------------------------ 5. Final Keyword in Inheritance
//The final keyword is used to restrict inheritance and method overriding.
//
//---------------------------------------------------5.1 Final Class (Prevents Inheritance)


final class A2 {
    void show() { System.out.println("Final class method"); }
}
// class B extends A {} // Compilation error


//-------------------------------------------------- 5.2 Final Method (Prevents Overriding)


class Parent4 {
    final void display() { System.out.println("Final method"); }
}
class Child4 extends Parent4 {
    // void display() {}  // Compilation error
}



//----------------------------------------------------6. Abstract Classes and Inheritance
//🔹 Abstract classes allow method definitions without implementation (forcing subclasses to implement them).
//
//-------------------------------------------6.1 Abstract Class Example


abstract class Animal1 {
    abstract void makeSound(); // Abstract method
}
class Dog1 extends Animal1 {
    void makeSound() {
        System.out.println("Dog barks");
    }
}


//----------------------------------------------------------7. Multiple Inheritance with Interfaces
//                  🔹 Since Java doesn't support multiple inheritance with classes, interfaces allow it.
interface AB {
    void methodA();
}
interface BA {
    void methodB();
}
class CB implements AB, BA {
    public void methodA() { System.out.println("Method A"); }
    public void methodB() { System.out.println("Method B"); }
}

//-----------------------------------------8. Object Class and Inheritance
//🔹 In Java, every class implicitly extends Object, which provides methods like:
//                toString()
//                hashCode()
//                equals()
//                clone()


class A3 {
    void display() {
        System.out.println("Class A");
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Childs obj = new Childs();
        obj.display();  // Inherited method
        obj.show();     // Child class method



        Parent1 obj1 = new Child1();
        obj1.display();  // Child class display method


        A3 obj2 = new A3();
        System.out.println(obj2.toString()); // Prints class name + hashcode
    }
}
