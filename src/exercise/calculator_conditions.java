package exercise;

import java.util.Scanner;
//The issue in your code is with scanner.nextLine() after reading integers using nextInt().
//
//Problem Explanation:
//        scanner.nextInt() reads only the integer value, but it does not consume the newline character (\n) left in the buffer after the user presses Enter.
//        When scanner.nextLine() is called immediately after nextInt(), it reads this leftover newline character instead of waiting for actual user input.

public class calculator_conditions {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int f_input = scanner.nextInt();
        int s_input = scanner.nextInt();
        String opp = scanner.next();

        switch (opp){
            case "+":
                System.out.println(f_input+s_input);
                break;
            case "-":
                System.out.println(f_input-s_input);
                break;
            case "*":
                System.out.println(f_input*s_input);
                break;
            case "/":
                System.out.println(f_input/s_input);
                break;
            default:
                System.out.println("wrong input");
        }

    }
}
