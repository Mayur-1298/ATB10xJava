public class WhileLoop {
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
        int i=0;
        while( i<100){
            i++;
              System.out.print(" "+i);
          }
      }

      static void Evennumbers(){
        int i=2;
        while(i<=20){
            if(i%2==0) System.out.print(" "+i);
            i++;
        }
      }

      static void Helloword(){
        int i=0;
        while(i<5) {
            System.out.print("Hello ");
            i++;
        }
      }

      static void SumofNaturalnos(){
        int i=1;
        int sum=0;
        while(i<=10){
             sum = sum+i;
            i++;
        } System.out.println(sum);
      }

      static void Multiplesoffive(){
        int i=1;
        while(i<=10){
            System.out.println("5x"+i+"="+(5*i));
            i++;
        }
      }
}
