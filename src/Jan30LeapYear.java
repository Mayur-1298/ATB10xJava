import java.util.Scanner;
public class Jan30LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int input = sc.nextInt();
        if(input%4==0 && input%100!=0 ||input%400==0)
            System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");

        sc.close();


    }
}
