import Exercises.Easy.Java.CountPrimes;

public class Main {
    static final int INPUT = 20;

    public static void main(String[] args) {

        int n = CountPrimes.countPrimes(INPUT);
        System.out.println("Existen " + n + " numeros primos desde 0 hasta " + INPUT);
    }
}