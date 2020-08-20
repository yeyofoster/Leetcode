package Arrays101;

import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] A) {
        // Squares of each element
        System.out.println("Input: " + Arrays.toString(A));
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        System.out.println("Squares: " + Arrays.toString(A));

        // Sorting the array
        quickSort(A, 0, A.length - 1);

        return A;
    }

    public static void quickSort(int[] A, int left, int right) {
        int partition = partition(A, left, right);

        if (left < partition - 1) {
            quickSort(A, left, partition - 1);
        }

        if (right > partition + 1) {
            quickSort(A, partition + 1, right);
        }
    }

    public static int partition(int A[], int left, int right) {
        int pivot = Math.abs(A[right]);

        for (int i = left; i < right; i++) {
            if (Math.abs(A[i]) < pivot) {
                int temp = A[left];
                A[left] = A[i];
                A[i] = temp;
                left++;
            }
        }

        int temp = A[left];
        A[left] = pivot;
        A[right] = temp;

        return left;
    }
}