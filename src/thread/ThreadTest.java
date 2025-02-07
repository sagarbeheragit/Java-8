package thread;

import static java.lang.Thread.sleep;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
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
        thread.setDaemon(true); // Set the thread as low priority for JVM. So it will run as long as the main thread is running.
        thread.start();
        Thread.sleep(3000); // When main thread stops, it stops the daemon thread also
//        try {
//            thread.join(); // If the daemon is true . this line makes it join the main thread so the main thread waits the daemon to finish.
//        } catch (InterruptedException e) {
//           e.printStackTrace();
//        }
    }


}
