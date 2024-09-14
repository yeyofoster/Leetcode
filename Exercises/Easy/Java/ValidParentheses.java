/*
 * LeetCode 
 * 20. Valid Parentheses
 */
package Exercises.Easy.Java;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()(})";
        boolean result = isValid(s);
        System.out.println(String.format("Is input '%s' a valid parentheses?: %b", s, result));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                char top = stack.isEmpty() ? '-' : stack.peek();
                if (ch == ')' && top == '(') {
                    stack.pop();
                } else if (ch == ']' && top == '[') {
                    stack.pop();
                } else if (ch == '}' && top == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}