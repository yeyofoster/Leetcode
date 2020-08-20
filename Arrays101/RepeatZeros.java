package Arrays101;

import java.util.Arrays;

public class RepeatZeros {
    public static void duplicateZeros(int[] arr) {
        System.out.println("Input: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && (i + 1) < arr.length) {
                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
        System.out.println("New Input: " + Arrays.toString(arr));
    }
}