package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int array1[] = {44, 49, 30, 25, 67, 69};
        int array2[] = {88, 44, 69, 93, 30};
        int intersectionLength = array1.length;
        if (array2.length < array1.length)
            intersectionLength = array2.length;
        int[] intersectionArray = new int[intersectionLength];
        int i = 0;
        for (int a : array1) {
            for (int b : array2) {
                if (a == b) {
                    intersectionArray[i++] = a;
                    break;
                }
            }
        }
        System.out.println("\nIntersection of the array 1 & 2 is :");
        for(int j=0;j<i;j++)
            System.out.print(intersectionArray[j]+" ");
    }
}
