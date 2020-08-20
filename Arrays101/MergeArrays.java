package Arrays101;

import java.util.Arrays;

public class MergeArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;

        System.out.println("Input 1: " + Arrays.toString(nums1));
        System.out.println("Input 2: " + Arrays.toString(nums2));

        for (int i = n + m - 1; i >= 0; i--) {
            System.out.println("index 1 = " + index1 + "  Index 2 = " + index2 + "  for = " + i);
            if (index2 < 0) {
                break;
            } else if (index1 < 0) {
                nums1[i] = nums2[index2];
                index2--;
            } else if (nums1[index1] < nums2[index2]) {
                nums1[i] = nums2[index2];
                index2--;
            } else {
                nums1[i] = nums1[index1];
                index1--;
            }
        }

        System.out.println("New Input 1: " + Arrays.toString(nums1));
    }
}