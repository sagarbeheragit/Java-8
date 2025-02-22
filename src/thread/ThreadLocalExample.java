package thread;

public class ThreadLocalExample {
    private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(()->0);

    public static void main(String[] args) {
        Runnable runnable = ()->{
            int id = (int) (Math.random() * 100);
            threadId.set(id); //each thread has its own independent copy of a variable, isolated from other threads
            System.out.println("Thread Name : "+Thread.currentThread().getName() + " - Value : "+threadId.get());
        };
        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");
        thread1.start();
        thread2.start();
        //Output:Each thread will print its unique ID without interfering with others.
    }
}
