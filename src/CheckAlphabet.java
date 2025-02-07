import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your input");
        char input = sc.next().charAt(0);

       char finalinput = Character.toLowerCase(input);
       if(finalinput>='a'&& finalinput<='z') {
           System.out.println(input + " is an Alphabet");
       }
       else {
           System.out.println("Not an Alphabet");
       }
        sc.close();
    }

}
