package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "keep";
        String string2 = "peek";
        //Java 8
        String result1 = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining());
        String result2 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining());
        System.out.println(result2.equals(result1));
    }
}
