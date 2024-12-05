package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a method, fiveSort, that takes in an ArrayList of numbers as an argument. The method should rearrange elements of the
 * ArrayList such that all 5s appear at the end. Your method should perform this operation in-place by mutating the original ArrayList. The method should return the ArrayList.
 *
 * Elements that are not 5 can appear in any order in the output, as long as all 5s are at the end of the array.
 * List<Integer> array = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));
 * Source.fiveSort(array);
 */
public class FiveSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));
        System.out.println(fiveSort(array));
    }

    public static List<Integer> fiveSort(List<Integer> array) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            if (array.get(j) == 5) {
                j -= 1;
            } else if (array.get(i) != 5) {
                i += 1;
            } else {
                Collections.swap(array, i, j);
            }
        }
        return array;
    }
}
