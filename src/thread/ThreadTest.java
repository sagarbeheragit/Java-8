package thread;

import static java.lang.Thread.sleep;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                while(true){
//                    System.out.println("Running...");
//                }
                for(int i = 0; i < 6; i++){
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(" RUnning ");
                }
            }
        };

        Thread thread = new Thread(runnable,"My Thread");
        thread.setDaemon(true);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }


}
