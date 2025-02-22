package stack;

import java.util.Map;
import java.util.Stack;

/**
 * Write a method, befittingBrackets, that takes in a string as an argument. The method should return a boolean indicating
 * whether or not the string contains correctly matched brackets.
 * You may assume the string contains only characters: ( ) [ ] { }
 * Source.befittingBrackets("(){}[](())"); // -> true
 */
public class BefittingBrackets {
    public static void main(String[] args) {
        String str = "(){}[](()){";
        System.out.println(isvalid(str));
    }

    private static boolean isvalid(String str){

        Map<Character,Character> brackets = Map.of(
                '{','}',
                '(',')',
                '[', ']'
        );
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(brackets.containsKey(ch)){
                stack.push(brackets.get(ch));
            }else{
                if(!stack.isEmpty() && stack.peek() == ch){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
