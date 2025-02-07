package Arrays;

import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] num = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(num, k));
    }

    private static int findKthLargest(int[] num, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int n : num){
            priorityQueue.add(n);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
