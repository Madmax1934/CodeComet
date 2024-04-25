package org.example.multithreading;

public class Processor {
    public int count=0;
    public synchronized void increment(){
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();
        processor.doProcessing();
    }

    private void doProcessing() throws InterruptedException {

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count = "+count);
    }
}

