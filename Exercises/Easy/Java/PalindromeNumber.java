package Exercises.Easy.Java;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int length = num.length() - 1;
        System.out.println("Lenght = " + (length + 1));

        for (int i = 0; i <= length / 2; i++) {
            System.out.println(num.charAt(i) + " == " + num.charAt(length - i) + " ???");
            if (num.charAt(i) != num.charAt(length - i)) {
                return false;
            }
        }
        return true;
    }
}