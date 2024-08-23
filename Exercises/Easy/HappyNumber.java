package Exercises.Easy;

import java.util.HashSet;

/**
 * HappyNumber
 */
public class HappyNumber {
    public static void main(String[] args) {
        final int input = 19;
        boolean result = isHappy(input);
        System.err.println(String.format("\nIs %d a Happy Number?: %b\n", input, result));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<Integer>();
        while (n != 1) {
            seenNumbers.add(n);
            int sumOfSquares = sumOfSquares(n);

            if (seenNumbers.contains(sumOfSquares)) {
                return false;
            } else {
                n = sumOfSquares;
            }
        }
        return true;
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        int currentDigit = 0;

        // Getting digits
        while (n > 0) {
            currentDigit = n % 10;
            sum += currentDigit * currentDigit;
            n = n / 10;
        }
        return sum;
    };
}