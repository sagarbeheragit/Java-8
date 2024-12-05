package recursion;

/**
 * Write a method, reverseString, that takes in a string as an argument.
 * The method should return the string with its characters in reverse order. You must do this recursively.
 * reverseString("hello"); // -> "olleh"
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseStringRecursive("hello"));
    }

    private static String reverseString(String s) {
        int j = s.length();
        String result = "";
        while (j > 0 ){
            result += s.substring(j-1, j);
            j--;
        }
        return  result;
    }

    private static String reverseStringRecursive(String s) {
        if(s.length() == 0){
            return "";
        }
        return reverseStringRecursive(s.substring(1)) + s.charAt(0);
    }
}
