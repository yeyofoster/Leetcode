/*
 * LeetCode
 * 283. Move Zeroes
 */
package Exercises.Easy.Java;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 5, 0, 0, 7, 0, 0, 0, 12 };
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int notZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[notZeroIndex] = nums[i];
                notZeroIndex++;
            }
        }

        for (int j = notZeroIndex; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
