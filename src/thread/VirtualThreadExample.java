package thread;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i< 10; i++){
                    System.out.println("Running....");
                }
            }
        };

        Thread thread = Thread.ofVirtual().start(runnable); // Start immediately
        Thread thread1 = Thread.ofVirtual().unstarted(runnable); // Don't start
        //thread1.start();
        try {
            thread.join(); // Join the main thread so it finshes first then stops the main thread.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Example of creating 100k Virtual Thread
        List<Thread> vThreadsList = new ArrayList<>();
        int nums = 100_000;
        for(int i=0; i < nums; i++){
            int index = i;
            Thread vThread1 = Thread.ofVirtual().start(()->{
                System.out.println("Thread - "+index);
            });
            vThreadsList.add(vThread1);
        }
        for (int i=0; i < vThreadsList.size(); i++){
            try{
                vThreadsList.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
