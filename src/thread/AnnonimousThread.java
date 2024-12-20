package thread;

public class AnnonimousThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Running..."+name);
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {

                String name = Thread.currentThread().getName();
                System.out.println("Running..." + name);
            }
        };
//        Thread th = new Thread(runnable, "Thread 1");
//        th.start();
//        Thread th2 = new Thread(runnable, "Thread 2");
//        th2.start();
        Thread th1 = new Thread(runnable1, "Thread 1");
        th1.start();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
