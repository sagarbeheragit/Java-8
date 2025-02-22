package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort();
    }

    /**
     * Find smallest num id and swap with 1st
     * 0 index is the smallest first consider
     * Time = O(n^2)
     * Space = O(1)
     * <a href="https://www.programiz.com/dsa/selection-sort">...</a>
     */
    private static void selectionSort() {
        int[] data = { -2, 45, 0, 11, -9, -33 };
        int currentIndx = 0; // Start with 1st element
        while (currentIndx < data.length-1){
            int smallIndx = currentIndx; // Consider the 1st element as smallest
            for(int i = currentIndx + 1; i < data.length; i++){
                if(data[i]< data[smallIndx]){ // Compare 1st with next element i = 0+1
                    smallIndx = i; // If the next element is smaller than assign the current as smallest. Loop through all to find the smallest.
                }
            }
            //After each iteration, minimum is placed in the front of the unsorted list.
            swap(data,smallIndx, currentIndx); //1st iteration -33 is replaced with -2 becomes {-33, 45, 0, 11, -9, -2}
            currentIndx++; // currentIndx becomes 1
        }
        System.out.println("selectionSort --> "+Arrays.stream(data).boxed().toList());
    }
    private static void swap(int[] data, int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] =temp;
    }
}
