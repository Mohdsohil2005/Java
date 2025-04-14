// 4. Write a program to check if a character is a vowel or consonant.

import java.util.*;

public class Q4{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre a character : ");
        String ch = sc.nextLine();
        String vowel[] = ['a','e','i','o','u'];

        if(ch == vowel){
            System.out.println(ch+" is a vowel ");
        }
        else{
            System.out.println(ch+ " is a consonant ");
        }
    }
}