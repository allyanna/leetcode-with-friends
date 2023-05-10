package Tl;

import java.util.Stack;

//Link: https://leetcode.com/problems/valid-parentheses/
public class Valid_Parentheses {

    public static void main(String[] args) {
        System.out.println(isValid("())"));
    }
    public static boolean isValid(String s) {
        char[] paren = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < paren.length; i++) {
            if (paren[i] == '(') {
                stack.push(')');
            } else if (paren[i] == '[') {
                stack.push(']');
            } else if (paren[i] == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != paren[i]) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
