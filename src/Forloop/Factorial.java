package Forloop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long num=sc.nextInt();
        long Factorialvalue=1;
        for(int i=1;i<=num;i++){
             Factorialvalue=Factorialvalue*i;
        }System.out.println("Factorial of given number"+" = "+(Factorialvalue));
        System.out.println("\n"+"Factorial value without for loop"+" = "+ Factorialwithoutloop(num));

    }

    public static long Factorialwithoutloop(long num){
        if(num==0||num==1){
            return 1;
        }else return num*Factorialwithoutloop(num-1);
    }
}
