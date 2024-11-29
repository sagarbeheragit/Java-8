package search;

/**
 * Time Complexity: O(log N)
 * Auxiliary Space: O(1)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] array = { 2, 3, 4, 10, 40 };
        int target = 40;
        int match = binarySearch(array,target);
        System.out.println("Match found at index = "+match);
    }

    /**
     *
     * @param array
     * @param target
     * @return
     */
    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length -1;
        while ( low <= high) {
            int mid = low + (high - low) / 2;
            if(array[mid] == target) {
                return mid;
            }
            if(array[mid] < target){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return  -1;

    }
}
