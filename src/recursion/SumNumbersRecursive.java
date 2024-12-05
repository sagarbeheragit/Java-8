package recursion;

import java.util.List;

/**
 * Write a method sumNumbersRecursive that takes in a list of numbers and returns the sum of all the numbers in the list.
 * All elements will be integers. Solve this recursively.
 * sumNumbersRecursive(List.of(5, 2, 9, 10)); // -> 26
 */
public class SumNumbersRecursive {
    public static void main(String[] args) {
        System.out.println(sumNumbersRecursive(List.of(5, 2, 9, 10)));
        System.out.println(RsumNumbersRecursive(List.of(5, 2, 9, 10)));
    }

    private static int sumNumbersRecursive(List<Integer> integers) {
        int total = 0;
        for(int a : integers){
            total += a;
        }
        return total;
    }

    private static int RsumNumbersRecursive(List<Integer> integers) {
        if(integers.size() == 0){
            return 0;
        }
        return  integers.get(0) + RsumNumbersRecursive(integers.subList(1,integers.size()));

    }
}
