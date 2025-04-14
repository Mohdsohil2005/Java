//2. Write a program to add two numbers entered by the user.

import java.util.*;

public class Q2{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre a first number : ");
        int a = sc.nextInt();

        System.out.print("Entre a second number : ");
        int b = sc.nextInt();
        
        int sum = a + b ;
        System.out.print("Sum is : "+sum);    
    }
}
