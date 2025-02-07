package thread;

import java.util.concurrent.*;

public class MyThread {
    public static class ExtendThread extends Thread{

        @Override
        public void run() {
            System.out.println("Thread running");
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable run = () -> {
            System.out.println("Running....");
        };
        Thread thread = new Thread(run, "Thread1");
        thread.start();
        ExtendThread myThread = new ExtendThread();
        myThread.start();
        ExecutorService exec = Executors.newFixedThreadPool(3);
        exec.execute(() -> System.out.println(" Execute..."));
        Future future = exec.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Sagar";
            }
        });
        Runnable runnable = () -> System.out.println(" Task Executed by : "+Thread.currentThread().getName());
        exec.execute(runnable);
        exec.execute(runnable);
        exec.execute(runnable);
        //future.resultNow();
        System.out.println(future.isDone());
        //exec.shutdownNow();
        System.out.println(future.get());
        System.out.println(future.state());
        System.out.println(future.isDone());
        //future.cancel(false);
        exec.shutdownNow();
    }
}
