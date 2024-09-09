/*
 * LeetCode
 * 242. Valid Anagram
 */

package Exercises.Easy.Java;

import java.util.HashMap;

/**
 * ValidAnagram
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean result = isAnagram(s, t);
        System.out.println(String.format("'%s' is a valid anagram of '%s'? : %b", s, t, result));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Adding letters from s
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Removing and decreasing indexes from map with t chars.
        for (int j = 0; j < t.length(); j++) {
            if (map.get(t.charAt(j)) == null) {
                return false;
            } else {
                if (map.get(t.charAt(j)) > 1) {
                    map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
                } else {
                    map.remove(t.charAt(j));
                }
            }
        }
        return map.size() == 0;
    }

    public static boolean isAnagramSolutionLeetCode(String s, String t) {
        int[] alphabet = new int[26];
        for (char ch : s.toCharArray()) {
            alphabet[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            alphabet[ch - 'a']--;
        }
        for (int count : alphabet) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}