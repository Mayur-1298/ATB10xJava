package Array;

import java.util.Arrays;

public class Feb10 {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};


        for (int i = 0; i < numbers.length - 1; i++) {
            int maxindex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[maxindex]) {
                    maxindex = j;
                }
            }
            if(maxindex!=i) {
                int temp = numbers[i];
                numbers[i] = numbers[maxindex];
                numbers[maxindex] = temp;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
