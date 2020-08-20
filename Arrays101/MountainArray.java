package Arrays101;

public class MountainArray {
    public static boolean validMountainArray(int[] A) {
        boolean updown = true; // True = up, False = down
        boolean change = false;

        if (A.length <= 1) {
            return false;
        } else if (A[0] > A[1]) {
            return false;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (updown) {
                if (A[i] > A[i + 1]) {
                    updown = false;
                    change = true;
                } else if (A[i] == A[i + 1]) {
                    return false;
                }
            } else {
                if (A[i] <= A[i + 1]) {
                    return false;
                }
            }
        }
        if (change) {
            return true;
        }
        return false;
    }
}