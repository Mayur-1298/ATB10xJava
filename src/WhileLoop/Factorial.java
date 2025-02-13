package WhileLoop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i = 1, Factorialvalue = 1;
        if (num == 0 || num == 1) {
            System.out.println(num);
        } else {
            while (i <= num) {
                Factorialvalue = Factorialvalue * i;
                i++;
            }
            System.out.println("Factorial value" +" = "+Factorialvalue);
        }
    }
}
