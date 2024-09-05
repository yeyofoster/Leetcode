package Exercises.Utils.Java;

import java.util.Arrays;

public class MatrixUtils {
    private MatrixUtils() {}

    public static String matrixToString(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            sb.append("\n");
            sb.append(Arrays.toString(row));
        }
        return sb.toString();
    }
}
