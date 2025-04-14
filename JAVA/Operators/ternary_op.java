public class ternary_op{
    public static void main(String arg[]){
         
        int number = 4;

        // Ternary Operator

        // variable = condition? statement1 : statement2 ;

        String type = (number % 2 == 0)? "Even" : "Odd";
        System.out.println(type);
    }
}