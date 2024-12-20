package thread;

public class MyThreadImpl {
    public static class ThreadRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Running....");
        }
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new ThreadRunnable());
        myThread.start();
    }
}
