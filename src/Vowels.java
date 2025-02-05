import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input_name = sc.nextLine();
        int count_vowels =0, consonants =0;
        for (int i = 0; i < input_name.length(); i++) {
            char ch = Character.toLowerCase(input_name.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count_vowels++;
            } else consonants++;
        }
      System.out.println("Vowel count is " + count_vowels);
        System.out.println("Consonant count is " + consonants);
        sc.close();
    }

}
