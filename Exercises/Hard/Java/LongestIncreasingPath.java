/*
 * LeetCode
 * 329. Longest Increasing Path in a Matrix
 */

package Exercises.Hard.Java;

import Exercises.Utils.Java.MatrixUtils;

public class LongestIncreasingPath {
    // DIRECTIONS: UP, DOWN, LEFT, RIGHT
    private static final int[][] DIRECTIONS = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

    public static void main(String[] args) {
        // int[][] matrix = {
        // { 9, 9, 4 },
        // { 6, 6, 8 },
        // { 2, 1, 1 }
        // };

        int[][] matrix = {
                { 1, 2, 3 },
                { 6, 5, 4 },
                { 7, 8, 9 }
        };

        String matrixString = MatrixUtils.matrixToString(matrix);
        int result = longestIncreasingPath(matrix);
        System.out.println(String.format("The longest path for matrix: %s \nis: %d", matrixString, result));
    }

    public static int longestIncreasingPath(int[][] matrix) {
        int longestPath = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] cache = new int[m][n];
        if (matrix == null || matrix.length == 0)
            return 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int longest = getLongestPath(matrix, n, m, i, j, cache);
                longestPath = Math.max(longestPath, longest);
            }
        }
        return longestPath;
    }

    private static int getLongestPath(int[][] matrix, int n, int m, int i, int j, int[][] cache) {
        if (cache[i][j] > 0)
            return cache[i][j];
        int max = 0;
        for (int[] direction : DIRECTIONS) {
            int x = direction[0] + i;
            int y = direction[1] + j;

            if (x >= 0 && x < m && y >= 0 && y < n && matrix[i][j] < matrix[x][y]) {
                int longest = getLongestPath(matrix, n, m, x, y, cache);
                max = Math.max(max, longest);
            }
        }
        cache[i][j] = max + 1;
        return cache[i][j];
    }
}
