package Multithreading;
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() ->
        {
            for(int i=0;i<5;i++) {
                System.out.println("Hi "+ Thread.currentThread());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        Thread t2= new Thread(() ->
        {
            for(int i=0;i<5;i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t2.start();
        t1.join();
        t2.join();


    }
}
