package org.example.multithreading.callableandfuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Appn {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting...");
                int duration = new Random().nextInt(4000);
                Thread.sleep(duration);
                System.out.println("Finished!!");
                 return duration;
            }
        });

        executorService.shutdown();

        System.out.println("result is "+future.get());
    }
}
