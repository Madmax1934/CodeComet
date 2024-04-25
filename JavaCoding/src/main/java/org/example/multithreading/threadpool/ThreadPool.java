package org.example.multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        //Processor processor = new Processor(id);
        /*
        Java ExecutorService
        ---------------------------
The Java ExecutorService is the interface which allows us to execute tasks on threads asynchronously.
The Java ExecutorService interface is present in the java.util.concurrent package. The ExecutorService helps
in maintaining a pool of threads and assigns them tasks. It also provides the facility to queue up tasks
until there is a free thread available if the number of tasks is more than the threads available.
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i=1;i<6;i++)
        {
            executorService.submit(new Processor(i));
        }

        executorService.shutdown();

        executorService.awaitTermination(1, TimeUnit.HOURS);

    }
}
