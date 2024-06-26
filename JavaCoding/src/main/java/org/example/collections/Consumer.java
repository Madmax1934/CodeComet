package org.example.collections;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue)
    {
        this.queue=queue;
    }
    @Override
    public void run() {
        try{
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());

        }catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}
