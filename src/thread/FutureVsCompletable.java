package thread;

import java.util.List;
import java.util.concurrent.*;

public class FutureVsCompletable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<List<Integer>> listFuture = executorService.submit(() -> List.of(1, 2, 3));
        List<Integer> duplicates = listFuture.get();
        System.out.println(duplicates);
        executorService.shutdown();
        //Completable
       /* CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.get();
        completableFuture.complete("Default value"); // Complete the task manually.*/
        getAsync();

    }
    public static void getAsync(){
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() ->
                System.out.println("Thread : " + Thread.currentThread().getName()));
        try {
            voidCompletableFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
