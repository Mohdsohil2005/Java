// 2. Write a program to check if a number is positive, negative, or zero.

import java.util.*;

public class Q2{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre a number : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is Positive Number !");
        }
        else if(num < 0){
            System.out.println(num + " is Negative Number !");
        }
        else
        {
            System.out.println(num + " is equla to Zero !");
        }

    }
}
