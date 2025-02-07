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
     */
    private static void selectionSort() {
        int[] data = { -2, 45, 0, 11, -9, -33 };
        int currentIdx = 0;
        while(currentIdx < data.length -1){
            int smallIndx = currentIdx;
            for(int i = currentIdx +1; i < data.length ; i++){
                if(data[i] < data[smallIndx]){
                    smallIndx = i;
                }
            }
            swap(data,smallIndx,currentIdx);
            currentIdx++;
        }
        System.out.println("selectionSort --> "+Arrays.stream(data).boxed().toList());
    }
    private static void swap(int[] data, int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] =temp;
    }
}
