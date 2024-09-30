/*
 * LeetCode
 * 509. Fibonacci Number
 */
package Exercises.Easy.Java;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println(String.format("%d is the %d Fibonacci Number", result, n));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int f0 = 0;
        int f1 = 1;
        int nextFib = 0;

        for (int i = 2; i <= n; i++) {
            nextFib = f1 + f0;
            f0 = f1;
            f1 = nextFib;
        }
        return nextFib;
    }
}
