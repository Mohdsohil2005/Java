// Write a program to made a income tax caculator

import java.util.*;

public class Q5{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Income : ");
        int income = sc.nextInt();
        int taxt;

        if(income < 500000){
            taxt = 0;
            
        }
        else if(income>= 500000 && income<=1000000 )
        {
            taxt =(int) (income *0.2f);
     
        }
        else{
            taxt =(int) (income *0.3f);
        }
        System.out.println("Your taxt is : "+taxt);
    }
   
}
