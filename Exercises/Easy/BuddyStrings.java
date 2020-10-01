package Exercises.Easy;

public class BuddyStrings {
    public static boolean buddyStrings(String A, String B) {
        int countSwap = 0;

        if (A.length() != B.length())
            return false;

        for (int i = 0; i < A.length(); i++) {
            if (countSwap > 1) {
                System.out.println("B needs more than 1 swap to be the same as A");
                return false;
            }

            if (A.charAt(i) != B.charAt(i)) {
                if (i == A.length() - 1) {
                    System.out.println("Last character are not the same and there is not more character for swap");
                    return false;
                }
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(i) == B.charAt(j)) {
                        countSwap++;
                        char[] auxStr = B.toCharArray();
                        char auxChar = B.charAt(i);
                        auxStr[i] = B.charAt(j);
                        auxStr[j] = auxChar;
                        B = String.valueOf(auxStr);
                        break;
                    }
                }
            }
        }

        if (countSwap == 1) {
            return true;
        } else {
            for (int i = 0; i < A.length(); i++) {
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(i) == A.charAt(j)) {
                        System.out.println("A and B are the same, but you can switch the characters in position " + i
                                + " and " + j + " to get the same");
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
