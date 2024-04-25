package Practisedproblems;

import java.util.Stack;

public class Paranthesischecker {
    public static void main(String[] args) {
        String exp = "{([])}";
        Stack<Character> stack = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    System.out.println(false);
                }
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ')' && top != '(') || (c == ']' && top != '[')) {
                    System.out.println(false);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
