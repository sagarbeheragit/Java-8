package thread;

public class EvenOddPrintThread implements Runnable{
    static int count = 1;
    Object object;

    public EvenOddPrintThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while(count <= 10){
            if(count %2 == 0 && Thread.currentThread().getName().equals("Even")){
                synchronized (object){
                    System.out.println("Thread Name: "+Thread.currentThread().getName() +" Value : "+count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }
            if(count%2 != 0 && Thread.currentThread().getName().equals("Odd")){
                synchronized (object){
                    System.out.println("Thread Name: "+Thread.currentThread().getName() +" Value : "+count);
                    count++;
                    object.notify();
                }

            }
        }
    }

    public static void main(String[] args) {
        Object object1 = new Object();
        Runnable evenOddPrintThread = new EvenOddPrintThread(object1);
        Runnable evenOddPrintThread1 = new EvenOddPrintThread(object1);
        new Thread(evenOddPrintThread, "Even").start();
        new Thread(evenOddPrintThread1, "Odd").start();
    }
}
