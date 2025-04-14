// 4. Write a program to swap two numbers using a temporary variable.

public class Q4{
    public static void main(String arg[])
    {
        int a,b,c;
        a = 10;
        b = 20;

       c = a;
       a = b;
       b = c;


        System.out.println(a);
        System.out.println(b);
    }
}