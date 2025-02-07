import java.util.Scanner;
public class Jan30Grademarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks to obtain the grade");
        float inputmarks = sc.nextFloat();
        if (inputmarks < 0 || inputmarks > 100){
            System.out.println("Error please enter valid marks(0-100)");
        sc.close();
        return;
        }
            else if (inputmarks >= 90 )
                System.out.println("A+");
            else if (inputmarks >= 80 )
                System.out.println("A");
            else if (inputmarks >= 70 )
                System.out.println("B");
            else if (inputmarks >= 60 )
                System.out.println("C");
            else if (inputmarks >= 50 )
                System.out.println("D");
            else if (inputmarks >= 40 )
                System.out.println("E");
            else
                System.out.println("F");
        sc.close();

    }
}
