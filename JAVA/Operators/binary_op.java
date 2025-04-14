import java.util.*;

public class binary_op{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // Binary Operators

        System.out.print("Entre a one number : " );
        int a = sc.nextInt();
        System.out.print("Entre a seconmd number : ");
        int b = sc.nextInt();

        System.out.println("Addtion = "+(a+b));
        System.out.println("Subtract = "+(a-b));
        System.out.println("Multiplt = "+(a*b));
        System.out.println("Division = "+(a/b));
        System.out.println("Modulo = "+(a%b));

    }
}