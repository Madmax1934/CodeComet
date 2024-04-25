package org.example.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Countdownlatch implements Runnable{

    private CountDownLatch latch;

    public Countdownlatch(CountDownLatch latch)
    {
        this.latch = latch;
    }
    @Override
    public void run() {
        System.out.println("Countdown Started..");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        latch.countDown();
    }
}
