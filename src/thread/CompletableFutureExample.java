package thread;

import java.util.concurrent.CompletableFuture;

/**
 * Manually Completing a Future
 */
public class CompletableFutureExample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        // Complete the future manually
        completableFuture.complete("Completed!");

        System.out.println(completableFuture.get()); // Output: Completed!

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() ->{
            return "hello";
        });
        System.out.println(completableFuture1.get());

    }
}

