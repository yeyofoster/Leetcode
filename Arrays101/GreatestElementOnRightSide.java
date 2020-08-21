package Arrays101;

import java.util.Arrays;

public class GreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        int right = arr.length - 1;
        int left = arr.length - 2;
        int aux = arr[right];
        while (left >= 0) {
            if (arr[left] > aux) {
                int aux2 = aux;
                aux = arr[left];
                arr[left] = aux2;
                left--;
                right--;
            } else {
                arr[left] = aux;
                left--;
                right--;
            }
        }
        arr[arr.length - 1] = -1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}