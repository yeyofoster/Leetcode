/*
 * LeetCode.
 * 33. Search in Rotated Sorted Array
 */

package Exercises.Medium.Java;

import java.util.Arrays;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 3;
        int index = search(nums, target);
        System.out.println(String.format("The position of target %d in array %s is at position: %d", target,
                Arrays.toString(nums), index));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (left <= right) {
            mid = ((left + right) / 2);

            // Target is at the middle position.
            if (target == nums[mid]) {
                return mid;
            }
            // Search at the left portion.
            else if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Search at the right portion.
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}