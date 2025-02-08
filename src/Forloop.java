public class Forloop {
    public static void main(String[] args) {
        System.out.println("Numbers from 1-100");
        numbers();
        System.out.println("\n"+"\n"+"Even numbers from 1-20");
        Evennumbers();
        System.out.println("\n"+"\n"+"Hello word for 5 times");
        Helloword();
        System.out.println("\n"+"\n"+"Sum of natural numbers from 1-10");
        SumofNaturalnos();
        System.out.println("\n"+"Multiples of 5");
        Multiplesoffive();
    }

    static void numbers(){
        for(int i=0; i<=100; i++){
            System.out.print(" "+i);
        }
    }
    static void Evennumbers(){
        for(int i =1; i<=20 ; i++){
            if(i%2==0) System.out.print(" "+i);
        }
    }

    static void Helloword(){
        for(int i=1; i<=5 ; i++)
            System.out.print("Hello ");
    }

    static void SumofNaturalnos(){
        int sum=0;
        for(int i=1 ; i<=10 ; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }

    static void Multiplesoffive(){
        for(int i=1; i<=10; i++)
            System.out.println("5x"+i+"="+(5*i));
    }
}
