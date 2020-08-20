package Arrays101;

import java.util.Arrays;

public class RemoveElements {
    public static int removeElement(int[] nums, int val) {

        int l = nums.length;
        int i = 0;
        int aux;

        System.out.println(Arrays.toString(nums));

        while (i < l) {
            if (nums[i] == val) {
                aux = nums[l - 1];
                nums[l - 1] = nums[i];
                nums[i] = aux;
                l--;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("Length = " + l);
        return l;
    }
}