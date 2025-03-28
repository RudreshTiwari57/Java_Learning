package exercise;

public class over_loading {

    int sum(int a,int b)
    {
        return a+b;
    }

    int sum(int a,int b, int c)
    {
        return a+b+c;
    }

    int sum(int a, int b,int c,int d)
    {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        over_loading ol = new over_loading();
        System.out.println(ol.sum(10,20));
        System.out.println(ol.sum(10,20,30));
        System.out.println(ol.sum(10,20,30,40));
        
    }
}
