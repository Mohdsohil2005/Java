// Average of three number ( user input )

/*import java.util.*;

public class practis{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a + b + c)/3;
        System.out.println(avg);
    }
}*/


// Area of Square

/*import java.util.*;

public class practis{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float aos = side * side;
        System.out.println(aos);
    }
}*/

// Total bill and add 18% gst

import java.util.*;

public class practis{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("The total bill is : "+total);
        float gst = total + (0.18f * total);
        System.out.println("Total bill with 18% GST : "+gst);
    }
}


// Check Error

/*public class practis{
    public static void main(String arg[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
        int $ = 24;
        System.out.println($);
    }
}*/