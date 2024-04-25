package org.example.multithreading;
//By extending thread class
public class Mythread extends Thread{

    public void run()
    {
        System.out.println("My thread is running with priority: "+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.setPriority(Thread.MIN_PRIORITY);
        mythread.start();

    }
}

