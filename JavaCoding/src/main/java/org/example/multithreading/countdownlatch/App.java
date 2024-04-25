package org.example.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws InterruptedException {
        /*
        CountDownLatch in Java
The CountDownLatch class is another important class for concurrent execution. It is a synchronization aid
that allows one or more than one thread to wait until a set of operations being performed in another thread
is completed.

It initializes with the count, which we pass to the constructor. The invocation of the countDown() method causes
the await methods to block until the current count reaches zero, after which all waiting threads are released,
and any subsequent invocations of await immediately return. CountDownLatch doesn't require that thread countdown()
to wait for the count to reach zero before proceeding.
It prevents any thread from proceeding past and await until all threads can pass.
         */
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<3;i++)
        {
            executorService.submit(new Countdownlatch(countDownLatch));
        }

        countDownLatch.await();

        System.out.println("Completed..");
    }
}
