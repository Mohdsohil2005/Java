// 3. Write a program to find the largest of three numbers.

import java.util.*;

public class Q3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre one number : ");
        int a = sc.nextInt();
        System.out.print("Entre second number : ");
        int b = sc.nextInt();
        System.out.print("Entre therd number : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is grater number");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is grater number");
        }
        else{
            System.out.println(c+ " is grater number");
        }
    }
}
