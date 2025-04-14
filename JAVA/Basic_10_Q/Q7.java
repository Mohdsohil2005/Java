// 7. Write a program to calculate the average of three numbers.

import java.util.*;

public class Q7{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre a First number : ");
        int a = sc.nextInt();

        System.out.print("Entre a Second number : ");
        int b = sc.nextInt();

        System.out.print("Entre a Thard number : ");
        int c = sc.nextInt();

        float avg = ( a + b + c )/3;
        System.out.println("Averag of three number is : "+avg);
    }
}