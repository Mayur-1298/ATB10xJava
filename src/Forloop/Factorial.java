package Forloop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int Factorialvalue=1;
        for(int i=1;i<=num;i++){
             Factorialvalue=Factorialvalue*i;
        }System.out.println("Factorial of given number"+" = "+(Factorialvalue));
    }
}
