// Write a program to check if a student will Pass or Fail using Ternary Operator

import java.util.*;

public class Q1{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        // Ternary Operator

        String result = (marks >=33)? "Pass" : "Fail";
        System.out.println(name+" You are " + result);
    }
}