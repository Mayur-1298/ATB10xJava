public class MaxnumberforIP {
    public static void main(String[] args){
                int Inputnum1 = Integer.parseInt(args[0]);
                int Inputnum2 = Integer.parseInt(args[1]);

                int result = Inputnum1 > Inputnum2 ? Inputnum1 : Inputnum2;
        System.out.println(result);
    }
}
