import java.util.Scanner;

public class Programs_positivenegativenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check");
        int input1 = sc.nextInt();
        PositivenegativeCheck(input1);
        EvenOdd(input1);

        System.out.println("\n");
        System.out.println("Enter two numbers");
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        Maxnos(input2, input3 );

        System.out.println("\n");
        System.out.println("Enter an Alphabet");
        char ch = sc.next().toLowerCase().charAt(0);
        Vowels(ch);

        System.out.println("\n");
        System.out.println("Please enter a age to check");
        int age = sc.nextInt();
        Vote(age);

        sc.close();

    }
        public static void PositivenegativeCheck(int a){
             if(a>=0) System.out.println("Number " +a+ " is positive");
             else System.out.println("Number " +a+ " is negative");

        }

        public static void EvenOdd(int b){
        if(b%2==0) System.out.println("Given number is even ");
        else System.out.println("Given number is odd");
        }

        public static void Maxnos(int c, int d){
            int result = c>d ? c:d;
            System.out.println(result+ " Number is greater");
        }

        public static void Vowels(char ch) {


            if (Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    System.out.println(" Given Alphabet is Vowel");
                else System.out.println("Given Alphabet is consonants");
            } else System.out.println("Enter a valid Alphabet");

        }

        public static void Vote(int age){

        String result = age>=18?"Valid age to vote": "Not eligible to vote";
            System.out.println(result);
        }
    }

