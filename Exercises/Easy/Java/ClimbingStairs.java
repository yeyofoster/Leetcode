/*
 * LeetCode
 * 70. Climbing Stairs
 */

package Exercises.Easy.Java;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        int result = climbStairs(n);
        System.out.println(String.format("There are %d ways to climb to %d", result, n));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        int third = first + second;

        for (int i = 3; i <= n; i++) {
            first = second;
            second = third;
            third = first + second;
        }

        return second;
    }
}