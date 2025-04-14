// 1. Write a program to check whether a given number is even or odd.

import java.util.*;

public class Q1{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre a number : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num +" is Even Number !");
        }
        else
        {
            System.out.println(num +" is Odd Number !");
        }

    }
}
