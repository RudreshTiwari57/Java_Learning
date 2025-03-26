package exercise;

public class multiples_of_N {

    public static void main(String[] args)
    {
        int n = 50;
        int i = 1;
        int sum = 0;
        while (i<=50)
        {
            if (i%3==0 && i%5==0)
            {
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
