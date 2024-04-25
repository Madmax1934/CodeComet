package org.example.multithreading;

//By implementing runnable interface
public class Mythread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("My thread is running through runnable interface..");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Mythread2());
        Thread thread2  = new Thread(new Mythread2());
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.run();
        thread2.run();
    }
}
