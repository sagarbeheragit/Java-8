package recursion;

/**
 *
 * Write a method, palindrome, that takes in a string and returns a boolean indicating whether or not the string is the same forwards and backwards.
 * You must solve this recursively.
 * palindrome("pop") # -> true
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("pop"));
        //System.out.println("pop".substring(1,"pop".length()-1));
    }

    private static boolean palindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return palindrome(s.substring(1,s.length()-1));
    }
}
