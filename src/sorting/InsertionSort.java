package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        insertionSort();
    }

    /**
     * Time = O(n)
     * Space = O(1)
     */
    private static void insertionSort() {
        int[] data = {-2, 45, 0, 11, -9};
        for(int i = 1; i < data.length; i++){
            int j = i;
            while (j > 0 && data[j] < data[j-1]){
                int temp = data[j];
                data[j] = data[j-1];
                data[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.stream(data).boxed().toList());
    }
}
