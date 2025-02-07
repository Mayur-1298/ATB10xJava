import java.util.Scanner;
public class checkPrimeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputnum = sc.nextInt();
        boolean isPrime=true;

        if(inputnum<=1){
           isPrime=false;
        }else {
            for (int i = 2; i*i <= inputnum; i++) {
                if (inputnum % i == 0) {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println("Prime number");
        }else
        System.out.println("Not a prime number");
        sc.close();
    }
}
