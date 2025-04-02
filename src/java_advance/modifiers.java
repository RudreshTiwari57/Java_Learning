package java_advance;

//Modifiers in Java define the scope, access control, and behavior of classes, methods, variables, and constructors.
//They are categorized into Access Modifiers and Non-Access Modifiers.

//------------------------------------------ 1. Access Modifiers
//Access modifiers control the visibility of classes, variables, methods, and constructors. Java has four access levels:

//                    |    Modifier	| Class  |    Package   |  Subclass  |   World     |
//                    ------------------------------------------------------------------
//                    |   private	|  yes	 |      no	    |    no	     |    no       |
//                    |   default	|  yes	 |      yes	    |    no	     |    no       |
//                    |   protected	|  yes	 |      yes	    |    yes	 |    no       |
//                    |   public	|  yes	 |      yes	    |    yes	 |    yes      |

//-----------------------------------------1.1 Private
//  Scope: Within the same class only.
//  Use Case: Encapsulation, hiding implementation details.
//
//        Example:
                class Example {
                    private int data = 42; // Not accessible outside this class
                    private void show() {
                        System.out.println("Private Method");
                    }
                }


//-------------------------------------------1.2 Default (No Modifier)
//                Scope: Within the same package.
//                Use Case: Package-level access.
//
//          Example:

                class Examples {
                    int data = 42; // No modifier = package-private
                    void show() {
                        System.out.println("Default Method");
                    }
                }


//--------------------------------------------1.3 Protected
//                Scope: Same package + subclasses (even in different packages via inheritance).
//                Use Case: Allows controlled access in inheritance.
//
//                        Example:

                                class Parent {
                                    protected int data = 42;
                                    protected void show() {
                                        System.out.println("Protected Method");
                                    }
                                }
                                class Child extends Parent {
                                    void display() {
                                        System.out.println(data); // Accessible in subclass
                                    }
                                }

//-----------------------------------------------1.4 Public
//                    Scope: Accessible everywhere.
//                    Use Case: Methods or classes meant to be used globally.
//
//                    Example:

                        class Examplee {
                            public int data = 42;
                            public void show() {
                                System.out.println("Public Method");
                            }
                        }


public class modifiers {
}
