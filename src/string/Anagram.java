package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Anagram {
    public static void main(String[] args) {
        String string1 = "keep";
        String string2 = "peek";
        //Java 8
        String result1 = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining());
        String result2 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining());
        System.out.println(result2.equals(result1));
        System.out.println(charCount(string1).equals(charCount(string2)));
    }

    private static Map<Character, Integer> charCount(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()){
            if(map.get(ch) == null){
                map.put(ch, 0);
            }
            int current = map.get(ch);
            map.put(ch, current+1);
        }
        return  map;
    }


}
