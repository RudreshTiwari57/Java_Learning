package exercise;


//Write a Java program to print a pyramid pattern using nested for loops.


public class pyramid_loop {

    public static void main(String[] args)
    {
        int n = 10;
        for(int i=1 ; i<=n;i++)
        {
            for(int j=n-1 ; j>=i;j--)
            {
                System.out.print(" ");
            }

            for(int k=1 ; k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
