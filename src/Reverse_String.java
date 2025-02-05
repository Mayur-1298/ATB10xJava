import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String user = sc.nextLine();
        StringBuilder reverse = new StringBuilder();
        for (int i =user.length()-1; i>=0; i--){
            reverse.append(user.charAt(i));

        }
        System.out.println(reverse);
        sc.close();

    }
}
