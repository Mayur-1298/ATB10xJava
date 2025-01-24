public class CLITask1 {
    public static void main(String[] args) {
                String input_name = args[0];
                String input_age= args[1];
                String input_salary = args[2];

        System.out.println(input_name);
        System.out.println((input_age)); //either method works
        System.out.println(Integer.parseInt(input_salary));

    }
}
