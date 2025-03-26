package java_print;

public class conditional_statements {

    public static void main(String[] args)
    {
//        Java Conditional Statements
//         in Java allow the program to make decisions based on conditions.
//        Java provides the following conditional statements:
//
//        --------------------------------- 1. if Statement
//        The "if" statement executes a block of code only if a specified condition is true.
//        Syntax:
//                if (condition) {
//                    // Code to execute if the condition is true
//                }

//        Example:
            int num = 10;
            if (num > 0) {
                System.out.println("Positive number");
            }
            // Output: Positive number


//        ------------------------------------------- 2. if-else Statement
//        The if-else statement executes one block if the condition is true, and another block
//        if the condition is false.
//        Syntax:
//                if (condition) {
//                    // Code to execute if the condition is true
//                } else {
//                    // Code to execute if the condition is false
//                }
//        Example:


                int nume = -5;
                if (nume > 0) {
                    System.out.println("Positive number");
                } else {
                    System.out.println("Negative number");
                }
            // Output: Negative number

//        -------------------------------------------------------- 3. if-else-if Ladder
//        Used when there are multiple conditions to check.
//
//        Syntax:
//                if (condition1) {
//                    // Code if condition1 is true
//                } else if (condition2) {
//                    // Code if condition2 is true
//                } else {
//                    // Code if none of the conditions are true
//                }

//        Example:
                int marks = 85;
                if (marks >= 90) {
                    System.out.println("Grade A");
                } else if (marks >= 75) {
                    System.out.println("Grade B");
                } else if (marks >= 60) {
                    System.out.println("Grade C");
                } else {
                    System.out.println("Grade F");
                }
                // Output: Grade B
//        -------------------------------------- 4. Nested if
//        An if statement inside another if statement.
//
//            Syntax:

//                    if (condition1) {
//                        if (condition2) {
//                            // Code to execute if both conditions are true
//                        }
//
//              Example:
                        int numd = 10;
                        if (numd > 0) {
                            if (numd % 2 == 0) {
                                System.out.println("Positive even number");
                            }
                        }
                        // Output: Positive even number


//        ----------------------------------------------------------- 5. switch Statement
//        The switch statement executes one block of code based on the value of a variable.
//
//            Syntax:
//                        switch (expression) {
//                            case value1:
//                                // Code to execute if expression == value1
//                                break;
//                            case value2:
//                                // Code to execute if expression == value2
//                                break;
//                            default:
//                                // Code to execute if none of the cases match
//                        }

//              Example:
                        int day = 3;
                        switch (day) {
                            case 1:
                                System.out.println("Monday");
                                break;
                            case 2:
                                System.out.println("Tuesday");
                                break;
                            case 3:
                                System.out.println("Wednesday");
                                break;
                            default:
                                System.out.println("Invalid day");
                        }
                // Output: Wednesday

//        Note: The break statement is used to exit the switch. If omitted, execution continues to the next case.


//        ---------------------------------------- 6. Ternary Operator (?:)
//        A shorthand for if-else.
//
//        Syntax:
//              variable = (condition) ? value_if_true : value_if_false;

//        Example:
                    int a = 10, b = 5;
                    int min = (a < b) ? a : b;
                    System.out.println("Minimum: " + min);
            // Output: Minimum: 5

//
//        ------------------------------------------ Comparison of if-else and switch



//        ---------------------------------------------------------------------------------------------------------------
//        |     Feature	       |     if-else	                    |          switch                                   |
//        ---------------------------------------------------------------------------------------------------------------
//        |     Works with	   |     Any boolean condition	        |      Integer, char, string, enums                 |
//        |     Readability    | 	Complex with many conditions	|    More readable for multiple cases               |
//        |     Performance	   |     Slower for many conditions	    |    Faster for multiple cases with constant values |
//        ---------------------------------------------------------------------------------------------------------------


    }




    }
