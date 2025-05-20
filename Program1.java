import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*********CALCULATOR*********");
        try {
            System.out.println("Please enter the first digit=");
            double a = in.nextDouble();
            System.out.println("Please enter the Second digit=");
            double b = in.nextDouble();
            System.out.println("Please enter the operation=" );
            String op = in.next();

            double ans = calculator(a, b, op);
            System.out.println("Your answer is=" + ans);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static double calculator(double a,double b,String op){
        switch (op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }
}
