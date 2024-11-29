package string;

import java.util.Arrays;
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
    }
}
