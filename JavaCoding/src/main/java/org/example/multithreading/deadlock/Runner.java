package org.example.multithreading.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private void acquirelocks(Lock lock1, Lock lock2) throws InterruptedException {
        //acquire locks
        while(true)
        {
            boolean gotlock1 = false;
            boolean gotlock2 = false;

            try{
                gotlock1=lock1.tryLock();
                gotlock2 = lock2.tryLock();
            }finally {
                if(gotlock1&&gotlock2)
                {
                    return;
                }
                if(gotlock1)
                    lock1.unlock();
                if(gotlock2)
                    lock2.unlock();
            }

            //locks not acquired
            Thread.sleep(1);
        }


    }
    public void firstThread() throws InterruptedException {
        System.out.println("Running first thread");
        Thread.sleep(1000);
        /*
        lock1.lock();  //deadlock situation , to resolve this situation, we have written acquirelocks() method below
        lock2.lock();

         */
        acquirelocks(lock1,lock2);
        try {
            for (int i = 0; i < 10000; i++) {
                Account.transfer(account1, account2, new Random().nextInt(100));
            }
        }
        finally {
            lock1.unlock();
            lock2.unlock();
        }
    }



    public void seconfThread() throws InterruptedException {
        System.out.println("Running second thread");
        Thread.sleep(1000);
        /*
        lock2.lock();  // deadlock situation
        lock1.lock();

         */
        acquirelocks(lock2,lock1);
        try {
            for (int i = 0; i < 10000; i++) {
                Account.transfer(account2, account1, new Random().nextInt(100));
            }
        }
        finally {
            lock1.lock();
            lock2.lock();
        }
    }

    public void finished()
    {

        System.out.println("Account1 balance: "+account1.getBalance());
        System.out.println("Account2 balance: "+account2.getBalance());
        System.out.println("Total balance = "+(account1.getBalance()+account2.getBalance()));
    }
}
