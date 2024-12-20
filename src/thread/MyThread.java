package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThread {
    public static class ExtendThread extends Thread{

        @Override
        public void run() {
            System.out.println("Thread running");
        }
    }

    public static void main(String[] args) {
        ExtendThread myThread = new ExtendThread();
        myThread.start();
        ExecutorService exec = Executors.newFixedThreadPool(3);
        Future future = exec.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Sagar";
            }
        });
        System.out.println(future.isDone());

        future.cancel(false);
    }
}
