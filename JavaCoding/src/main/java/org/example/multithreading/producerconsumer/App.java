package org.example.multithreading.producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    public static void producer() throws InterruptedException {

        while(true) {
            Thread.sleep(100);
            queue.put(new Random().nextInt(100));
        }
    }

    public static void consumer() throws InterruptedException {
        while (true) {
            Thread.sleep(100);
            if (new Random().nextInt(10) == 0) {
                int val = queue.take();
                System.out.println("Value taken = "+val+", Queue size = "+queue.size());
            }
        }
    }


}
