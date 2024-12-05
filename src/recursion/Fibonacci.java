package recursion;

import java.util.HashMap;

/**
 * Write a method, fibonacci, that takes in a number argument, n, and returns the n-th number of the Fibonacci sequence.
 * The 0-th number of the sequence is 0.
 * The 1-st number of the sequence is 1.
 * To generate further numbers of the sequence, calculate the sum of previous two numbers.
 * You must solve this recursively.
 * fibonacci(0); // -> 0
 * fibonacci(4); // -> 3
 * fibonacci(5); // -> 5
 * fibonacci(8); // -> 21
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8, new HashMap<>()));
    }

    private static int fibonacci(int n, HashMap<Integer, Integer> memo) {
        if(memo.containsKey(n)) return memo.get(n);
        if(n == 0) return 0;
        if(n == 1) return 1;
        memo.put(n,fibonacci(n-1, memo) + fibonacci(n-2, memo));
        return memo.get(n);
    }
}
