package org.example.collections;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    BlockingQueue queueExample = null;
    public Producer(BlockingQueue bq)
    {
        this.queueExample= bq;
    }

    @Override
    public void run() {
        try{
            queueExample.put(1);
            Thread.sleep(1000);
            queueExample.put(2);
            Thread.sleep(1000);
            queueExample.put(3);
            Thread.sleep(1000);

        }catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}
