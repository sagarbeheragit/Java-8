package Arrays;

/**
 *  *  Formula for Calculate sum of 1 to N
 *  *  1 + 2+ 3 + 4 + 5 + ...... + N
 *  *  sum = (N * (N+1)) / 2
 */
public class FindMissingNo {
    public static void main(String[] args) {

        int[] array = {2, 4, 1, 6, 7, 5, 3, 9};
        int arraySum = 0;
        for(int v : array)
            arraySum += v;
        int size = 9;
        System.out.println("Array Sum = "+arraySum);
        int expectedSum = (size * (size+1))/2;
        System.out.println(" Expected Sum = "+expectedSum);
        System.out.println("Missing Num is = "+(expectedSum - arraySum));
    }


}
