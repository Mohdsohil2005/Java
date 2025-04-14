// 8. Write a program to convert temperature from Celsius to Fahrenheit.

import java.util.*;

public class Q8{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre a Celsius value : ");

        float Celsius = sc.nextFloat();
        float Fahrenheit = (Celsius * 9/5) + 32;
        
        System.out.println(Celsius +"Celsius =" +Fahrenheit +"Fahrenheit");
    }
}