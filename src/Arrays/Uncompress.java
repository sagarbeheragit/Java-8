package Arrays;


/**
 * Write a method, uncompress, that takes in a string as an argument. The input string will be formatted into multiple groups according to the following pattern:
 * Source.uncompress("2c3a1t"); // -> "ccaaat"
 */
public class Uncompress {
    public static void main(String[] args) {
        System.out.println(uncompress("2c3a1t"));
    }

    private static String uncompress(String s) {
        String result = "";
        String numbers = "0123456789";
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (numbers.contains(String.valueOf(s.charAt(j)))) {
                j += 1;
            }else{
                int num = Integer.parseInt(s.substring(i, j));
                //System.out.println(s.charAt(j));
                result += String.valueOf(s.charAt(j)).repeat(num);
                j += 1;
                i = j;
            }
        }
        return result;
    }

}
