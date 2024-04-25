package org.example.multithreading.threadpool;

public class Processor implements Runnable{

    private int id;
    public Processor(int id)
    {
        this.id=id;
    }
    @Override
    public void run() {
        System.out.println("Started process "+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Completed process "+id);
    }
}
