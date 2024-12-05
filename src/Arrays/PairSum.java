package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a method, pairSum, that takes in a List and a target sum as arguments. The function should return a List containing a pair
 * of indices whose elements sum to the given target. The indices returned must be unique.
 * Be sure to return the indices, not the elements themselves.
 * There is guaranteed to be one such pair that sums to the target.
 * Source.pairSum(List.of(3, 2, 5, 4, 1), 8); // -> [0, 2]
 */
public class PairSum {
    public static void main(String[] args) {
        System.out.println(pairSum(List.of(3, 2, 5, 4, 1), 8));
    }

    private static List<Integer> pairSum(List<Integer> numbers, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            int complement = target - numbers.get(i);
            if(count.containsKey(complement)){
               return  List.of(count.get(complement),i);
            }
            count.put(Integer.valueOf(numbers.get(i)),Integer.valueOf(i));
        }
        return  null;
    }
}
