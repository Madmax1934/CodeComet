package org.example.multithreading;

import java.util.Random;

public class InterruptingThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting..");

//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }

                for(int i=0;i<1E8;i++){
                    if(Thread.currentThread().isInterrupted())
                    {
                        System.out.println("Interrupted!");
                        break;
                    }
                    System.out.println(Math.sin(new Random().nextDouble(90.00)));
                }


            }
        });
        t1.start();
        Thread.sleep(500);
        t1.interrupt();
        t1.join();
        System.out.println("Finished!!");
    }
}
