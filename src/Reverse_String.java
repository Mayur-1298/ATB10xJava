import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String user = sc.nextLine().toLowerCase();
        StringBuilder reverse = new StringBuilder();
        for (int i =user.length()-1; i>=0; i--){
            reverse.append(user.charAt(i));

        }
        if(reverse.toString().equals(user)){
            System.out.println("Given word is a palindrome "+ reverse);
        }else
        System.out.println("Not a palindrome "+ reverse);
        sc.close();

    }
}
