package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort();
    }

    /**
     * Time = O(n)
     * Space = O(1)
     */
    public static void  bubbleSort(){
        int[] data = { -2, 45, 0, 11, -9 };
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i=0; i<data.length -1; i++){
                if(data[i] > data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    //Collections.swap(Arrays.asList(data), i, i+1);
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.stream(data).boxed().toList());
    }
}
