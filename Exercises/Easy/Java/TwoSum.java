package Exercises.Easy.Java;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                System.out.println(nums[i] + " + " + nums[j] + " = " + target + " ????");
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    res[0] = i;
                    res[1] = j;
                    System.out.println(Arrays.toString(res));
                    return res;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}