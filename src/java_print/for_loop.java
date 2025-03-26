package java_print;

public class for_loop {
    public static void main(String[] args){

//        The for loop in Java is one of the most commonly used loops for executing a block of code multiple times with a known
//        number of iterations.

//        Syntax of for loop:
//                for (initialization; condition; update) {
//                    // Code to be executed
//                }
//        Breakdown:
//                Initialization → Initializes loop control variable(s) (executes once).
//                Condition → The loop executes as long as this condition is true.
//                Update → Increments or decrements loop control variable(s) after each iteration.\


//        Basic Example
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Iteration: " + i);
                }


//        Output:
//                Iteration: 1
//                Iteration: 2
//                Iteration: 3
//                Iteration: 4
//                Iteration: 5


//        ------------------------------------------Types of For Loops in Java
//        Java provides different ways to use for loops, including simple for loop, enhanced for loop, and nested loops.
//
//        Standard For Loop
//        Used when you know the exact number of iterations.

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

//        output:
//                0 1 2 3 4 5 6 7 8 9


//       -------------------------------------------- For Loop with Multiple Variables

        for (int i = 1, j = 5; i <= 5 && j >= 1; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
//        Output:
//                i = 1, j = 5
//                i = 2, j = 4
//                i = 3, j = 3
//                i = 4, j = 2
//                i = 5, j = 1

//        --------------------------------------- Infinite For Loop
        for (;;) {  // No condition means it runs indefinitely

            System.out.println("Infinite loop");
            break;
        }


//        ----------------------------------------------- Reverse Loop (Decrement)

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

//        Output:
//                 5 4 3 2 1



//        ------------------------------------ Enhanced For Loop (For-each)
//        Used for iterating over arrays or collections.
//
//                Example with Arrays

        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }
//        Output:
//                    10
//                    20
//                    30
//                    40
//                    50


//        Key Benefits:
//                No need to manage index.
//                Prevents ArrayIndexOutOfBoundsException.
//                Cannot modify array elements.


//        ---------------------------------------------- Nested For Loops
//        A for loop inside another for loop.
//
//                Example: Multiplication Table

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();  // New line
        }
//        Output:
//            1 2 3
//            2 4 6
//            3 6 9

//        -------------------------------------------- Controlling the For Loop
//            Using break Statement
//            Exits the loop when a condition is met.

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }


//        Output:
//                1
//                2



//        --------------------------------------------------------------- Using continue Statement
//        Skips the current iteration and continues with the next iteration.


        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
//        Output:
//                1
//                2
//                4
//                5



//        ----------------------------------------------- Using Labels with break and continue
//                Labeled break
//                Stops outer loop.


        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer;  // Breaks outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }


//        Output:
//                i = 1, j = 1
//                i = 1, j = 2
//                i = 1, j = 3
//                i = 2, j = 1


//        Labeled continue
//                Skips iteration of outer loop.

        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outer;  // Skips remaining inner loop and moves to next outer iteration
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

//        Output:
//                i = 1, j = 1
//                i = 1, j = 2
//                i = 1, j = 3
//                i = 2, j = 1
//                i = 3, j = 1
//                i = 3, j = 2
//                i = 3, j = 3



    }
}
