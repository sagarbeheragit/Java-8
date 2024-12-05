package recursion;

/**
 * Write a method, factorial, that takes in a number n and returns the factorial of that number.
 * The factorial of n is the product of all the positive numbers less than or equal to n. You must solve this recursively.
 * factorial(3); // -> 6
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int i) {
        if(i == 0 || i == 1){
            return 1;
        }
        return i*factorial(i-1);
    }
}
