package Exercises.Easy;

public class ReverseInteger {
    public static int reverse(int x) {
        int[] aux = new int[15];
        Integer res = 0;
        int i = 0;

        while (x != 0) {
            aux[i] = x % 10;
            i++;
            x = x / 10;
        }

        for (int j = 0; j < i; j++) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            res = (res * 10) + aux[j];
        }

        return res;
    }
}