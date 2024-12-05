package recursion;

import java.util.List;

/**
 * Write a method sumOfLengths that takes in a list of strings and returns the total length of the strings.
 * You must solve this recursively.
 * sumOfLengths(List.of("goat", "cat", "purple")); // -> 13
 */
public class SumOfLengths {
    public static void main(String[] args) {
        System.out.println(sumOfLengths(List.of("goat", "cat", "purple")));
    }

    private static int sumOfLengths(List<String> strings) {
//        int result = 0;
//        for(String str : strings){
//            result += str.length();
//        }
//        return result;
        if(strings.size() == 0){
            return 0;
        }
        return strings.get(0).length() + sumOfLengths(strings.subList(1,strings.size()));
    }
}
