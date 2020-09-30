package Exercises.Medium;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        String[] subStrings = new String[numRows];
        String output = "";
        for (int i = 0; i < numRows; i++) {
            if (i + 1 != numRows) {
                subStrings[i] = String.valueOf(s.charAt(i));
            } else
                subStrings[i] = "";
            for (int j = (numRows - 1) * 2 - i; j < s.length(); j = (j + 2 * i) * subStrings[i].length()) {
                subStrings[i] += String.valueOf(s.charAt(j));

                if (j + 2 * i < s.length()) {
                    subStrings[i] += String.valueOf(s.charAt(j + 2 * i));
                }
            }
            System.out.println(subStrings[i]);
            output += subStrings[i];
        }
        return output;
    }
}
