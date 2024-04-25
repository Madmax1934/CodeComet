package Multithreading;

class Increment
{
    int count;
    public synchronized void incr()
    {
         count++;
    }
}
public class SyncDemo {

    public static void main(String[] args) throws InterruptedException {
        Increment c = new Increment();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=1000;i++)
                  c.incr();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=1000;i++)
                  c.incr();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: "+c.count);
    }
}
