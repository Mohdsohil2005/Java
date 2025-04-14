// 9. Write a program to calculate the simple interest for given principal, rate, and time.

public class Q9{
    public static void main(String arg[]){

        float principal = 230;
        float rate = 80;
        float time = 2;

        float S_I = (principal * rate * time)/100;

        System.out.println("Simple Interest is : "+S_I);
    }
}