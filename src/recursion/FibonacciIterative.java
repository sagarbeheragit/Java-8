package recursion;

public class FibonacciIterative {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
    }

}
