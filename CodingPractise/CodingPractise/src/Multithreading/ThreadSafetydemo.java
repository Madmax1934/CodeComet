package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Incrementer{
    AtomicInteger count = new AtomicInteger();
    public void increment()
    {
        count.incrementAndGet();
    }
}
public class ThreadSafetydemo extends Exception{
    public static void main(String[] args) throws InterruptedException {
        Incrementer inc = new Incrementer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++)
                {
                    inc.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++)
                {
                    inc.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(inc.count);
    }
}
