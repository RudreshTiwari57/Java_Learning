package exercise;

import java.util.Arrays;

public class factorial_methods {

    int factorial(int num)
    {
        int mul = 1;
        for(int i=1;i<=num;i++)
        {
            mul *= i;
        }
        return mul;
    }

    public static void main(String[] args) {
        factorial_methods facmth = new factorial_methods();
        System.out.println(facmth.factorial(5));
    }
}
