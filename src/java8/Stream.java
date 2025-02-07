package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> list = List.of("Sagar", "Chikoo");
        List<String> list1 = list.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
        list1.forEach(System.out::println);
    }
}
