package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        insertionSort();
    }

    /**
     * Time = O(n)
     * Space = O(1)
     * <a href="https://www.programiz.com/dsa/insertion-sort">...</a>
     * For while loop
     */
    private static void insertionSort() {
        int[] data = {-2, 45, 0, 11, -9};
        //The first element in the array is assumed to be sorted. Thus, I start with 1
        for (int i = 1; i < data.length; i++) { // Outer loop: iterates through the unsorted portion
            int j = i; // j is used to traverse backwards in the sorted portion
            while (j > 0 && data[j] < data[j - 1]) { // Inner loop: compares and swaps elements
                swap(data, j, j - 1); // Swap if the current element is smaller than the previous
                j--; // Move j one position to the left (towards the beginning of the array)
            }
        }

        System.out.println(Arrays.stream(data).boxed().toList());
    }
    private static void swap(int[] data, int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] =temp;
    }
}
