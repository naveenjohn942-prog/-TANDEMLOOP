import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digit=");
        int a =in.nextInt();
        if(a>0&&a%2==0){
            a-=1;
        }
        series(a);
    }

    private static void series(int a) {
        int i = 1;
        for (int count = 0; count < a; count++) {
            System.out.print(i);
            if (count < a - 1) {
                System.out.print(", ");
            }
            i += 2;
        }
    }
}
