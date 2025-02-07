package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MostRepeatedChar {
    public static void main(String[] args) {
        String name = "malayalam";
        //Java 8
        List<String> ss = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(e->e.getKey()).stream().toList();
        String result = name.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue()).map(c->c.getKey()).get().toString();
        System.out.println(result);
        System.out.println(ss);
        System.out.println(mostFrequentChar(name));
    }

    private static char mostFrequentChar(String name) {
        HashMap<Character,Integer> map = count(name);
        char mostFreq = '\0';
        System.out.println(map);
        for(char ch: name.toCharArray()){
            if(mostFreq == '\0' || map.get(ch) > map.get(mostFreq)){
                mostFreq = ch;
            }
        }
        return mostFreq;
    }

    private static HashMap<Character, Integer> count(String name) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: name.toCharArray()){
            if(map.get(ch) == null){
                map.put(ch,0);
            }
            int count = map.get(ch);
            map.put(ch, count+1);
        }

        return map;
    }

}
