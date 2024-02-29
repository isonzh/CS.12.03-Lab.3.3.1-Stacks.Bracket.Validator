import java.util.Stack;

public class BracketValidator {

    // Method called checkValidParentheses that returns a boolean indicating whether a string of brackets is valid or not.
    public static boolean checkValidParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (isLeftBracket(Character.toString(c))) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !getReversedBracket(Character.toString(stack.pop())).equals(Character.toString(c))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Private helper method called isLeftBracket that returns a boolean value to indicate whether the bracket is a left (opening) bracket.
    private static boolean isLeftBracket(String bracket) {
        return bracket.charAt(0) == '(' || bracket.charAt(0) == '[' || bracket.charAt(0) == '{';
    }

    // Private helper method called getReversedBracket that returns a String which is the reverse version of the bracket passed to the method.
    private static String getReversedBracket(String bracket) {
        if (bracket.equals("(")) {
            return ")";
        } else if (bracket.equals("[")) {
            return "]";
        } else {
            return "}";
        }
    }
}