package yujin.week1;

import java.util.Arrays;

public class Solution {
    public int sumOfDivisors(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        return result;
    }

    public int sumDigits(int n) {
        String[] numbers = String.valueOf(n)
                .split("");

        return Arrays.stream(numbers)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public int[] reverseNumberToArray(long n) {
        int[] numbers = new int[String.valueOf(n).length()];
        int index = 0;
        while (n > 0) {
            numbers[index++] = (int) (n % 10);
            n = n / 10;
        }
        return numbers;
    }
}