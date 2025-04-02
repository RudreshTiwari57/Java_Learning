package java_advance;
import java.util.*;

//Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP) that helps in data hiding,
//modularity, and maintainability. In Java, encapsulation is achieved using private variables with public getters and setters,
//allowing controlled access to class fields.


//-------------------------------------------1. What is Encapsulation?
//Encapsulation is the process of wrapping data (variables) and methods (functions) together into a single unit,
//i.e., a class. It restricts direct access to class fields, enforcing data hiding and allowing modification only through defined methods.
//
//          Example of Encapsulation in Java
                class BankAccounts {
                    private String accountNumber;
                    private double balance;

                    public BankAccounts(String accountNumber, double balance) {
                        this.accountNumber = accountNumber;
                        this.balance = balance;
                    }

                    public String getAccountNumber() {
                        return accountNumber;
                    }

                    public double getBalance() {
                        return balance;
                    }

                    public void deposit(double amount) {
                        if (amount > 0) {
                            balance += amount;
                        }
                    }

                    public void withdraw(double amount) {
                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                        }
                    }
                }
//Encapsulation Achievements in Above Code:
//            Data Hiding: The accountNumber and balance fields are private, preventing direct modification.
//            Controlled Access: The getBalance(), deposit(), and withdraw() methods allow controlled and secure data modification.


//--------------------------------------------- 2. Benefits of Encapsulation
//            Data Hiding – Prevents unauthorized access to sensitive data.
//            Modularization – Code is more structured and maintainable.
//            Flexibility & Extensibility – Easy to modify and extend without affecting other parts.
//            Increased Security – Fields are protected from accidental modifications.

//--------------------------------------------- 3. How Encapsulation Works with Different Access Modifiers?
//         |   Modifier  |   Within	   |     Within 	 |   Outside Package   |     Outside Package    |
//         |             |    Class    |     Package     |     (Subclass)	   |     (Non-Subclass)     |
//         ----------------------------------------------------------------------------------------------
//         |   private	 |   Yes	   |      No	     |      No	           |          No            |

//         |   default	 |   Yes	   |      Yes	     |      No	           |          No            |

//         |   protected |   Yes	   |      Yes	     |      Yes	           |          No            |

//         |   public    |   Yes	   |      Yes	     |      Yes	           |          Yes           |


//--------------------------------------------------- 4. Encapsulation vs. Data Hiding
//        Feature	           |         Encapsulation	                                         |       Data Hiding
//        -----------------------------------------------------------------------------------------------------------------------------------------
//        Definition	       |         Wrapping data and methods into a single unit (class).	 |       Restricting direct access to data (fields).
//        How?	               |         Using classes, methods, and access modifiers.	         |       Using private access modifier.
//        Goal	               |         Maintainability and reusability.	                     |       Security and controlled access.
//        Example	           |         A class with private fields and getter/setter methods.	 |       Marking fields as private.



//------------------------------------------------------5. Encapsulation in Java with Immutable Classes
//Encapsulation is also used to create immutable classes where data cannot be modified after object creation.
//
//Example of an Immutable Class

final class Employeea {
    private final String name;
    private final int id;

    public Employeea(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}


//-------------------------------------Key Points:
//            final class prevents subclassing.
//            final fields ensure values cannot be modified.
//            No setter methods, ensuring immutability.

//------------------------------6. Encapsulation with Java Beans
//
//        Java Beans follow strict encapsulation principles:
//
//        Private fields.
//        Public getter and setter methods.
//        A no-argument constructor.
//
//        Example:

class Student {
    private String name;
    private int age;

    public Student() {}  // No-argument constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {  // Validation check
            this.age = age;
        }
    }
}


//------------------------------------------- 7. Encapsulation with Collections
//Instead of exposing collections directly, we return unmodifiable views or provide controlled access.
//
//Example: Returning an Unmodifiable List



class Company {
    private List<String> employees = new ArrayList<>();

    public void addEmployee(String name) {
        employees.add(name);
    }

    public List<String> getEmployees() {
        return Collections.unmodifiableList(employees);
    }
}
//        Benefits:
//        Prevents external modification of the employees list.
//        Enhances security and maintains encapsulation.


//--------------------------------------------- 8. Common Mistakes & Best Practices
//              ❌ Bad Practice (Breaking Encapsulation)
                class Carrs {
                    public String model;
                    public double price;
                }


//        Fields are public → Anyone can change them.
//        No control over data modification.

//              ✅ Best Practice (Encapsulation)
                    class Card {
                        private String model;
                        private double price;

                        public String getModel() {
                            return model;
                        }

                        public void setModel(String model) {
                            this.model = model;
                        }

                        public double getPrice() {
                            return price;
                        }

                        public void setPrice(double price) {
                            if (price > 0) {
                                this.price = price;
                            }
                        }
                    }

//----------------------------------------------------- 9. Real-World Applications of Encapsulation
//        Banking System – Account balance should not be modified directly.
//        Medical Systems – Patient records should be accessed securely.
//        Game Development – Player attributes (like health) should not be changed directly.
//        Enterprise Software – Secure APIs use encapsulated data models.



        public class encapsulation {
}
