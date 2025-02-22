package thread;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrintCompletableEx {

    private static Object object = new Object();
    private static IntPredicate evenCon = e -> e % 2 == 0;
    private static IntPredicate oddCon = e -> e % 2 != 0;


    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> EvenOddPrintCompletableEx.print(evenCon));
        CompletableFuture.runAsync(() -> EvenOddPrintCompletableEx.print(oddCon));
        Thread.sleep(1000);
    }

    public static void print(IntPredicate con) {
        IntStream.rangeClosed(1, 10).filter(con).forEach(EvenOddPrintCompletableEx::execute);
    }

    public static void execute(int no) {
        synchronized (object) {
            try {
                System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + no);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
