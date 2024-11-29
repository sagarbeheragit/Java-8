package stack;

/**
 * Write a method, pairedParentheses, that takes in a string as an argument. The method should return a boolean indicating whether or not the string has well-formed parentheses.
 * You may assume the string contains only alphabetic characters, '(', or ')'.
 * Source.pairedParentheses("(david)((abby))"); // -> true
 */

public class PairedParentheses {
    public static void main(String[] args) {
        String str = "(david)((abby))";
        System.out.println(isValid(str));

    }

    public static boolean isValid(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count += 1;
            } else if (ch == ')') {
                if(count > 0) {
                    count -= 1;
                }else {
                    return  false;
                }
            }
        }
        return count == 0;
    }
}
