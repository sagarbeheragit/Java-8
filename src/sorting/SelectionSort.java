package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort();
    }

    /**
     * Find smallest num id and swap with 1st
     * Time = O(n^2)
     * Space = O(1)
     */
    private static void selectionSort() {
        int[] data = { -2, 45, 0, 11, -9 };
        int currentIdx = 0;
        while(currentIdx < data.length-1){
            int smallestId = currentIdx;
            for (int i = currentIdx+1; i<data.length; i++){
                if(data[smallestId] > data[i]){
                    smallestId = i;
                }
            }
            int temp = data[smallestId];
            data[smallestId] = data[currentIdx];
            data[currentIdx] = temp;
            currentIdx ++;
        }
        System.out.println("selectionSort --> "+Arrays.stream(data).boxed().toList());
    }
}
