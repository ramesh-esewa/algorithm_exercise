package string;

import java.util.Stack;

/**
 * @author Ramesh Khanal
 * 10/3/2023
 */
public class validateParenthesesApp {
    public static void main(String[] args) {
        String str = "{}[]";
        System.out.println("Valid parentheses: " + isValid(str));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c=='(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if( stack.isEmpty() || stack.pop() != c) // the pop method removes the character from top
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
