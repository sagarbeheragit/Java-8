package Arrays;

import java.util.Arrays;

public class SecondMinimum {
    public static void main(String[] args) {
        int array[] = {10,32,34,54,19,29,38,45};
        int min = array[0];
        int secMin = array[1];
        if(secMin < min){
            min = array[1];
            secMin = array[0];
        }

        for(int i=2; i < array.length;i++){
            if(array[i] < min){
                secMin = min;
                min = array[i];
            }else if(array[i] < secMin){
                secMin = array[i];
            }
        }
        System.out.println("Array = "+ Arrays.toString(array));
        System.out.println("Min = "+min);
        System.out.println("2nd Min = "+secMin);

    }
}
