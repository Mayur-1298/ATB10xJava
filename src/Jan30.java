import java.util.Scanner;
public class Jan30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        ChecklargestNo(num1,num2,num3);

        System.out.println("Enter two numbers to check the smallest");
        int num4=sc.nextInt();
        int num5 = sc.nextInt();
        CheckSmallestno(num4,num5);

        System.out.println("Enter three numbers to check the smallest");
        int num6=sc.nextInt();
        int num7 =sc.nextInt();
        int num8 = sc.nextInt();
        CheckSmallestno(num6,num7,num8);
        sc.close();
    }

    public static void ChecklargestNo(int a,int b, int c){
        int result = a>b?((a>c)?a:c):(b>c?b:c);
        System.out.println("\n");
        System.out.println("Largest among the three numbers is "+result);
    }

    public static void CheckSmallestno(int a,int b){
        int result = a<b?a:b;
        System.out.println("Smallest number is "+ result);
    }

    public static void CheckSmallestno(int a, int b, int c){
        int result = (a<b)?((a<c)?a:c):(b<c)?b:c;
        System.out.println("Smallest number is "+result);
    }


}
