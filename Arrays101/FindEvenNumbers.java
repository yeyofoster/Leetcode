package Arrays101;

/*
Programa que regresa la cantidad de numeros con 
un numero de digitos par que hay en un arreglo de numeros
*/
public class FindEvenNumbers {
    public static int findNumbers(int[] nums) {
        String element;
        int countNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            element = String.valueOf(nums[i]);
            if (element.length() % 2 == 0) {
                countNumbers++;
            }
        }
        return countNumbers;
    }
}