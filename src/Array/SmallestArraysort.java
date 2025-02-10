package Array;

import java.util.Arrays;

public class SmallestArraysort {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);
        int Secondsmallestno=numbers[1];
        System.out.println(Secondsmallestno);
    }
}
