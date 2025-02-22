package sorting;

import java.util.Arrays;

/**
 * // run-time complexity = O(n Log n)
 * // space complexity    = O(n)
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] array = {-2, 45, 0, 11, -9, -34, 99, 3, 11, 33, 900};
        mergeSort(array);
        System.out.println("Merge Sort -> "+Arrays.stream(array).boxed().toList());
    }

    private static void mergeSort(int[] array){
           int length = array.length;
       if(length <=1) return;
       int middle = length/2;
       int[] leftArray = new int[middle];
       int[] rightArray = new int[length - middle];
       int l=0, r = 0;
       for(;l<length;l++){
           if(l<middle){
               leftArray[l] = array[l];
           }else{
               rightArray[r] = array[l];
               r++;
           }
       }
       mergeSort(leftArray);
       mergeSort(rightArray);
       merge(leftArray,rightArray,array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftArrLength = leftArray.length;
        int rightArrlength = rightArray.length;
        int i=0,  l=0,  r=0;
        while (l < leftArrLength && r < rightArrlength){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftArrLength) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightArrlength) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
