package java_print;

public class while_loop {
    public static void main(String[] args)
    {

//        The while loop in Java is used when we don’t know the
//        exact number of iterations in advance. It executes as long as a specified condition is true.


//        Syntax of while Loop:
//                while (condition) {
//                    // Code to be executed
//                }



//        Breakdown:
//                Condition: Checked before each iteration.
//                Loop Body: Executes if the condition is true.
//                Update: Needs to be managed manually to prevent an infinite loop.



//       ------------------------------------------------------- Basic Example

        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;  // Update statement
        }

//        Output:
//                Iteration: 1
//                Iteration: 2
//                Iteration: 3
//                Iteration: 4
//                Iteration: 5


//        -------------------------------------------------- Infinite While Loop
//        If the condition never becomes false, the loop runs forever.

//        while (true) {
//            System.out.println("This is an infinite loop!");
//        }


//        Use break to stop it!


        int k = 1;
        while (true) {
            System.out.println("Iteration: " + i);
            if (k == 5) break;  // Stops when i = 5
            i++;
        }


//        ------------------------------------- Decrementing While Loop

        int l = 5;
        while (l > 0) {
            System.out.print(l + " ");
            l--;
        }


//        Output:
//                5 4 3 2 1



//        ----------------------------------------------- Using continue in while Loop


        int p = 1;
        while (p <= 5) {
            if (p == 3) {
                p++;  // Update before continue to avoid infinite loop
                continue;  // Skip iteration when i = 3
            }
            System.out.println(p);
            p++;
        }

//        Output:
//                1
//                2
//                4
//                5


//       ------------------------------------------------ Nested While Loops


//        A while loop inside another while loop.



        int t = 1;
        while (t <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.print(t * j + " ");
                j++;
            }
            System.out.println();
            t++;
        }

//        Output:
//                1 2 3
//                2 4 6
//                3 6 9


    }
}
