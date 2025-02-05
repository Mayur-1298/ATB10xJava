import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String reverse = "";
        for (int i =user.length()-1; i>=0; i--){
            reverse = reverse + user.charAt(i);

        }
        System.out.println(reverse);
        sc.close();

    }
}
