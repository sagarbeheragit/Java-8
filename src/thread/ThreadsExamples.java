package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsExamples {
    public static class ThreadExtend extends Thread{
        @Override
        public void run() {
            System.out.println("1. Running .. Example Extend Thread");
        }
    }

    public static class RunnableImplement implements Runnable{

        @Override
        public void run() {
            System.out.println("2. Running .. Implementing the `Runnable` Interface");
        }
    }

    public static void main(String[] args) {
        ThreadExtend threadExtend = new ThreadExtend();
        threadExtend.start();
        Thread thread = new Thread(new RunnableImplement());
        thread.start();
        Runnable run = () -> System.out.println("3. Running .. Runnable Lamda .. ");
        Thread thread1 = new Thread(run);
        thread1.start();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> System.out.println("4. Running .. ExecutorService submit.."));
        executorService.shutdown();
    }

}
