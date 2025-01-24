public class Marksheet {
    public static void main(String[] args) {
        String nm =  args[0];
        int score = Integer.parseInt(nm) ;

        String marksheet = (score>=40 && score <=59) ? "Grade F" :
                (score >=60 && score <=69) ? "Grade D" :
                        (score >=70 && score <=79) ? "Grade C" :
                                (score >=80 && score <=89) ? "Grade B" :
                                        (score >=90 && score <=99) ? "Grade A" :
                                                "Marks not valid" ;

        System.out.println();
        System.out.println(marksheet);
    }
}
