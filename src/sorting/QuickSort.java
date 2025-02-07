package sorting;

import java.util.Arrays;

/**
 * Time = O(n log(n))
 * Space = O(n)
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = { -2, 45, 0, 11, -9 };
        quickSort(array,0,array.length-1);
        System.out.println("Quick Sort -> "+ Arrays.stream(array).boxed().toList());
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);

    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start -1;
        for(int j =start; j < end-1; j++){
            if(array[j] < pivot){
                i++;
                swap(array,i,j);
            }
        }
        i++;
        swap(array,i,end);
        return i;
    }


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
