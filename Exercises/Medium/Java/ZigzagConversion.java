package Exercises.Medium.Java;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        String[] subStrings = new String[numRows];
        String output = "";
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            subStrings[i] = String.valueOf(s.charAt(i));
            for (int j = (numRows - 1) * 2 - i; j < s.length(); j = j + (numRows - 1) * 2) {
                if (i == 0 || i == numRows - 1) {
                    if (j + 2 * i < s.length()) {
                        subStrings[i] += String.valueOf(s.charAt(j + 2 * i));
                    }
                } else {
                    subStrings[i] += String.valueOf(s.charAt(j));
                    if (j + 2 * i < s.length()) {
                        subStrings[i] += String.valueOf(s.charAt(j + 2 * i));
                    }
                }
            }
            System.out.println(subStrings[i]);
            output += subStrings[i];
        }
        return output;
    }
}
