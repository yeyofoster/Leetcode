package Exercises.Easy.Java;

public class CountPrimes {
    public static int countPrimes(int n) {
        int countPrimes = 0;
        if (n < 2)
            return 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                countPrimes++;
            }
        }

        return countPrimes;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
