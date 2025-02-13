package Forloop;

public class Forloop {
    public static void main(String[] args) {
        System.out.println("Print numbers from 10 to 1");
        for(int i=10; i>0; i--){
            System.out.print(" "+i);
        }

        System.out.println("\n"+"Sum of numbers from 1-100");
        int sum=0;
        for(int i=1; i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
