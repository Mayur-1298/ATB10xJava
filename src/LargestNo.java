public class LargestNo {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);

               int n2= Integer.parseInt(args[1]);

                int n3 = Integer.parseInt(args[2]);


        int Largestnumber = (n1>=n2) ? ((n1>=n3) ?  n1: n3) : ((n2 >= n3) ? n2:n3);
        System.out.println(Largestnumber);
        if(n1>=n2 && n1>=n3) {
            System.out.println(n1);
        }
             else if (n2>=n3) {
            System.out.println(n2);
        }
            else{
                System.out.println(n3);
        }
    }
}
