package Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a method, pairProduct, that takes in a List and a target product as arguments. The function should return a List containing a pair of indices
 * whose elements multiply to the given target. The indices returned must be unique.
 * Be sure to return the indices, not the elements themselves.
 * There is guaranteed to be one such pair whose product is the target.
 * Source.pairProduct(List.of(3, 2, 5, 4, 1), 8); // -> [1, 3]
 */
public class PairProduct {
    public static void main(String[] args) {
        System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
    }

    private static List<Integer> pairProduct(List<Integer> numbers, int target) {
        Map<Integer,Integer> previousNums = new HashMap<>();
        for(int i = 0; i < numbers.size(); i++){
            int num = numbers.get(i);
            int complement = target/num;
            if(previousNums.containsKey(complement)){
                return List.of(previousNums.get(complement), i);
            }
            previousNums.put(num,i);
        }
        return null;
    }
}
