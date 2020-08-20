package Arrays101;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // Finding duplicates.
        int left = 0;
        int l = nums.length;
        int aux;
        for (int i = 1; i < nums.length; i++) {
            if (nums[left] != nums[i]) {
                left++;
                aux = nums[i];
                nums[left] = nums[i];
                nums[i] = aux;
            } else {
                l--;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Length = " + l);
        return l;
    }
}