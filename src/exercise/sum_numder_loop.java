package exercise;

//Write a Java program to find the sum of digits of a number using a for loop.


public class sum_numder_loop {
    public static void main(String[] args)
    {
        int number = 234;
        int sum = 0;
        for(;number>0;)
        {
            sum = sum+number%10;
            number = number/10;
        }
        System.out.println(sum);
    }
}
