package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method, intersection, that takes in two Lists, a,b, as arguments. The method should return a new List containing elements that are in both of the two Lists.
 * You may assume that each input List does not contain duplicate elements.
 * List<Integer> a = List.of(4,2,1,6);
 * List<Integer> b = List.of(3,6,9,2,10);
 * Source.intersection(a, b) // -> [2,6]
 */
public class Intersection {
    public static void main(String[] args) {
        List<Integer> a = List.of(4,2,1,6);
        List<Integer> b = List.of(3,6,9,2,10);
        List<Integer> result = intersection(a,b);
        System.out.println(result);

    }
    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        // todo
        List<Integer> result = new ArrayList<>();
        for(Integer num : listA){
            if(listB.contains(num)){
                result.add(num);
            }
        }
        return result;
    }
}
