package java_print;

public class methods {
//    Java methods are a fundamental part of object-oriented programming in Java. Let's break down Java methods in-depth,
//    covering their types, overloading, overriding, special methods, functional interfaces, and advanced concepts.

    public static void main(String[] args) {
//        ----------------------------------------------------------- 1. Basics of Java Methods
//        A method in Java is a block of code that performs a specific task. It is part of a class and can be called when needed.
//
//        Syntax of a Java Method
//                    returnType methodName(parameter1, parameter2, ...) {
//                        // method body
//                        return value; // optional
//                    }

//                returnType: Specifies the type of data the method returns. Use void if it does not return anything.
//                methodName: A unique identifier for the method.
//                parameters: Inputs to the method.
//                return: Ends the method execution and returns a value.
//        Example:

//                public int add(int a, int b) {
//                    return a + b;
//                }


//        ------------------------------------------------------------ 2. Types of Methods in Java
//        ---------------------- A. Instance Methods
//                                Require an object of the class to be called.
//                                Operate on instance variables.

                                    class MathOperations {
                                        int multiply(int x, int y) {  // Instance method
                                            return x * y;
                                        }
                                    }
                                    MathOperations obj = new MathOperations();
                                    int result = obj.multiply(4, 5);


//        ---------------------- B. Static Methods
//                                Declared using the static keyword.
//                                Belong to the class rather than any instance.
//                                Can be called without creating an object.

                                    class MathOperation {
                                        static int square(int x) {
                                            return x * x;
                                        }
                                    }
                                    int results = MathOperation.square(5);


//        -------------------------- C. Abstract Methods

//                                    Defined in an abstract class or interface.
//                                    Does not have a body; it must be implemented by subclasses.

                                    abstract class Animal {
                                        abstract void makeSound();  // Abstract method
                                    }



//        ---------------------------- D. Final Methods
//
//                                        Cannot be overridden by subclasses.

                                    class Parent {
                                        final void show() {
                                            System.out.println("This method cannot be overridden.");
                                        }
                                    }


//        ----------------------------- E. Native Methods
//                                        Implemented in another language like C or C++ using JNI (Java Native Interface).

        //                                public class NativeExample {
        //                                    public native void nativeMethod();
        //                                }



//        --------------------------------------------- 3. Method Overloading (Compile-Time Polymorphism)
//
//        Multiple methods in the same class with the same name but different parameters.
//        Resolved at compile-time.


                        class MathOperationss {
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


                        MathOperationss objj = new MathOperationss();
                        System.out.println(objj.add(3, 5));  // Calls first method
                        System.out.println(objj.add(2.5, 3.5));  // Calls second method
                        System.out.println(objj.add(1, 2, 3));  // Calls third method



//        ---------------------------------------------- 4. Varargs (Variable Arguments)
//
//        Allows passing a variable number of arguments.


                            class VarargsExample {
                                static void display(String... values) {
                                    for (String s : values) {
                                        System.out.println(s);
                                    }
                                }
                            }

                            VarargsExample.display("Hello", "World", "Java");




//        -------------------------------------------- 5. Pass by Value (Call by Value)

//                        In Java, method arguments are always passed by value.
//
//                        class Example {
//                            void modify(int num) {
//                                num = num + 5;
//                            }
//                        }
//
//                        public class Test {
//                            public static void main(String[] args) {
//                                int x = 10;
//                                Example obj = new Example();
//                                obj.modify(x);
//                                System.out.println(x);  // Still 10, because Java passes primitives by value
//                            }
//                        }


//        ------------------------------------------------------ 6. Recursive Methods
//                    A method that calls itself.


        class RecursionExample {
            static int factorial(int n) {
                if (n == 0) return 1;
                return n * factorial(n - 1);
            }
        }
        Usage:
        System.out.println(RecursionExample.factorial(5));  // Output: 120

    }
}
