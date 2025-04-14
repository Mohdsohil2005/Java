// 6. Write a program to calculate the perimeter of a rectangle given its length and breadth.

import java.util.*;

public class Q6{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre a Length of Rectangle : ");
        float l = sc.nextFloat();

        System.out.print("Entre a Breadth of Rectangle : ");
        float b = sc.nextFloat();

        float perimeter = 2 * ( l + b );
        System.out.print("Perameter of Ractangle is : "+perimeter);
    }
}