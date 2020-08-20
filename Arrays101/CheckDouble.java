package Arrays101;

public class CheckDouble {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + " * " + 2 + " = " + arr[j] + " ?");
                if (arr[i] % 2 == 0) {
                    if (arr[j] == arr[i] * 2 || arr[i] / 2 == arr[j]) {
                        System.out.println("Si hay, los valores son: " + i + " y " + j);
                        return true;
                    }
                } else {
                    if (arr[j] == arr[i] * 2 || arr[i] / 2 == arr[j]) {
                        System.out.println("Si hay, los valores son: " + i + " y " + j);
                        return true;
                    }
                }
            }
        }
        System.out.println("Falso");
        return false;
    }
}