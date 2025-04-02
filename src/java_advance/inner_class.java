package java_advance;


//A Member Inner Class is a type of inner class in Java that is defined inside another class
//but outside any method, constructor, or block. It behaves like a member of the outer class
//and has access to its private members.

//--------------------------------------------- Key Characteristics:
//            It is non-static by default.
//            It can access all members (including private) of the outer class.
//            It requires an instance of the outer class to be instantiated.


class OuterClass {
    private String message = "Hello from Outer Class";

    // Member Inner Class
    class InnerClass {
        void display() {
            System.out.println(message);  // Accessing private member of OuterClass
        }
    }
}
//
//--------------------------------------------------------- Instantiating a Member Inner Class:
//Since a member inner class is tied to an instance of the outer class, it cannot be instantiated directly.
//It requires an outer class instance for its creation.


//---------------------------------- Use Cases of Member Inner Class:
//                Encapsulation – Hides inner implementation details.
//                Logical Grouping – If a class is used only inside another class, keeping it inside improves modularity.
//                Code Readability – Improves clarity by grouping related logic inside an outer class.
//        ✅ Can access private members of the outer class.
//        ✅ Used when a class is only relevant inside another class.



public class inner_class {

    public static void main(String[] args) {
        // Create an instance of OuterClass
        OuterClass outer = new OuterClass();

        // Create an instance of InnerClass using the outer class instance
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Call method of inner class
        inner.display();  //Hello from Outer Class
    }

}
