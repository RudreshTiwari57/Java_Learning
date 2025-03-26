package exercise;
import java.util.Scanner;


//Write a Java program that checks whether a given integer is a palindrome
// (reads the same forward and backward).

public class palindrome_conditions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int number = numb;
        int sum=0;
        while (number>0)
        {
            sum = sum *10 + number%10;
            number = number / 10;
        }
        if(sum==numb){
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }
    }
}
